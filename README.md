# React-Native-mJcore

[![npm version](https://badge.fury.io/js/react-native-mjcore.svg)](https://badge.fury.io/js/react-native-mjcore)

iOS Version（noidfa）: 4.8.0

Android Version: 4.8.2

## 注意

iOS升级覆盖需要重命名 `libJCore.a` 为 `libJCoreM.a`，`info.plist` 中的两处也需要替换，否则无法编译

## 此项目基于[https://github.com/jpush/jcore-react-native](https://github.com/jpush/jcore-react-native)

## 安装

```sh
npm install react-native-mjcore --save
```

## 接口

```js
// 隐私合规同意之后调用
setAuth(boolen);

// 设置国家码，仅Android
setCountryCode({
    code: '86',
});

// 设置是否自动唤醒（默认是开的），仅Android
enableAutoWakeup(boolen)
```
