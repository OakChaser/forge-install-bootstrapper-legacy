# Forge Install Bootstrapper (1.12, 1.12.1)

已有的bangbang93的forge install bootstrapper在1.12和1.12.1没法用，Steve-xmh的改版也没法用，于是我自己瞎写了一个

# Usage

```
java -cp "bootstrapper.jar:forge-installer.jar" app.conicmc.Bootstrap <要安装的目录，里面需包含一个 launcher_profiles.json>
```

例如

```
java -cp "bootstrapper.jar:forge-installer.jar" app.conicmc.Bootstrap /Users/brokendeer/conic-debug
```
