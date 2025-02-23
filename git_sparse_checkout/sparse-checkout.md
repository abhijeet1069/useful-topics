# Git sparse checkout

```shell

 git clone --filter=blob:none --no-checkout https://github.com/eugenp/tutorials.git
 cd tutorials ## cloned dir in local system
 git sparse-checkout set --cone
 git checkout master
 git sparse-checkout set jaxb ## clones only JAXB folder in repo

```
