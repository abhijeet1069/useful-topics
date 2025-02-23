import csv
import os

# Also CSV logs are great way to do analysis at log level
# returns column[column_index] as array 
def read_column_from_csv(file_path, column_index):
    column_data = []
    with open(file_path, mode='r') as file:
        csv_reader = csv.reader(file)
        for row in csv_reader:
            if len(row)>column_index:
                column_data.append(row[column_index])
    return column_data

# count frequency of array and return a hasmap
def count_frequency(arr):
    freq_dict = {}
    for element in arr:
        if element in freq_dict:
            freq_dict[element] += 1
        else:
            freq_dict[element] = 1
    return freq_dict

# get files in a folder
def get_file_names(directory_path):
    files = []
    try:
        with os.scandir(directory_path) as entries:
            for entry in entries:
                if entry.is_file():
                    files.append(entry.name)
    except FileNotFoundError:
        print(f"Path {directory_path} not found")
    return files

def main():
    path = "logs"
    column_index = 4
    files = get_file_names(path)
    print(files)
    for file in files:
        data = read_column_from_csv(path+"/"+file,column_index)
        print(f"{file} - {count_frequency(data)}")

main()