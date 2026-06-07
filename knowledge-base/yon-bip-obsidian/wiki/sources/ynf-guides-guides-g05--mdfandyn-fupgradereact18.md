---
title: "React18适配方案"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/guides/g05--mdfandyn-fupgradereact18"
section: "YNF-开发指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 开发指南]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# React18适配方案

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/guides/g05--mdfandyn-fupgradereact18 | 所属：YNF-开发指南

# [](#react18适配方案)React18适配方案

## [](#1-官方升级文档)1. 官方升级文档

- [官方升级文档](https://zh-hans.react.dev/blog/2022/03/08/react-18-upgrade-guide)
- [扫描工具（非官方）](https://docs.yonyoucloud.com/l/1f99e5852106)（没权限找前端框架开发部张昊开，或者下载下面的zip包自行使用）

## [](#2-升级实践指南陆续更新欢迎各位直接贡献场景)2. 升级实践指南（陆续更新，欢迎各位直接贡献场景）

从 React 16 升级到 React 18 引入了多项新特性和改进，为确保应用平稳过渡，需注意以下关键事项。

### [](#21-升级-react-和-react-dom)2.1. 升级 React 和 React DOM

#### [](#211-使用前端框架mdfynf的工程)2.1.1. 使用前端框架（MDF/YNF）的工程

通过前端框架（MDF/YNF）开发的工程无需关心这一步，工作台场景下统一升级了新的版本，可以在业务中台url增加参数?REACT18=true进行调试。

#### [](#212-非前端框架的工程)2.1.2. 非前端框架的工程

React原生开发的工程更新引用的React地址，TNS内置了新的版本，引用示例如下：

<script src="https://xxx.xxx.com/static/ucf/iuap-tns.share-fe/snapshot/static/react/18.3.1/umd/react.production.min.js" />

<script src="https://xxx.xxx.com/static/ucf/iuap-tns.share-fe/snapshot/static/react-dom/18.3.1/umd/react-dom.production.min.js" />

### [](#22-更新客户端渲染-api)2.2. 更新客户端渲染 API

React 18 引入了新的 Root API: `createRoot`，替代了旧的 `ReactDOM.render`方法。 使用 `createRoot` 可以启用并发渲染特性。 示例如下：

// 升级前

import { render } from 'react-dom';

const container = document.getElementById('app');

render(<App tab="home" />, container);

// 升级后

import { createRoot } from 'react-dom/client';

const container = document.getElementById('app');

const root = createRoot(container);

root.render(<App tab="home" />);

同时，卸载组件时，需将 `unmountComponentAtNode `替换为 `root.unmount()`：

// 升级前

unmountComponentAtNode(container);

// 升级后

root.unmount();

### [](#23-自动批处理)2.3. 自动批处理

React 18 默认对所有状态更新进行自动批处理，包括 `promise`、`setTimeout`等异步操作内的更新，从而提升性能。 例如：

setTimeout(() => {

	setCount(c => c + 1);

	setFlag(f => !f);

}, 1000);

在 React 18 中，上述代码中的状态更新将被批处理，从而减少渲染次数。如果需要在特定情况下禁用批处理，可使用 `flushSync`：

import { flushSync } from 'react-dom';

function handleClick() {

 flushSync(() => {

 	setCounter(c => c + 1);

 });

 flushSync(() => {

 	setFlag(f => !f);

 });

}

**这是一个破坏性变更，这个改动可能会影响原本正常的使用场景，因此在测试的时候原本没问题的场景出问题，可以从这个层面分析，检查代码中非react事件中的状态更新代码。**

### [](#24-严格模式的变化)2.4. 严格模式的变化

`React 18`在严格模式下引入了新的检查机制，在开发环境中会自动卸载并重新挂载组件，以帮助调试Effect问题。这可能导致某些Effect代码被执行多次，需要确保Effect处理函数具备幂等性。MDF框架暂未开启严格模式。

### [](#25-废弃的hook以及生命周期方法)2.5. 废弃的Hook以及生命周期方法

以下是被废弃的生命周期方法以及旧 API 容易引发问题的具体例子和替代方案：

#### [](#251-componentwillmount-引发的问题)2.5.1. **`componentWillMount` 引发的问题**

**问题**：在并发模式下（Concurrent Mode），`componentWillMount` 可能被多次调用，导致副作用重复触发。

**示例**：

class MyComponent extends React.Component {

 componentWillMount() {

 // 执行副作用，例如发起网络请求

 fetch('/api/data').then(res => res.json()).then(data => {

 this.setState({ data });

 });

 }

 render() {

 return <div>{this.state?.data}</div>;

 }

}

**问题现象**：

- React 的新并发模式可能会多次调用 `componentWillMount`，导致多次请求同一个接口。

**解决方案**：将副作用逻辑移至 `componentDidMount`：

class MyComponent extends React.Component {

 componentDidMount() {

 fetch('/api/data').then(res => res.json()).then(data => {

 this.setState({ data });

 });

 }

 render() {

 return <div>{this.state?.data}</div>;

 }

}

#### [](#252--componentwillreceiveprops-引发的问题)2.5.2. **`componentWillReceiveProps` 引发的问题**

**问题**：容易导致不必要的状态更新或逻辑错误。

**示例**：

class MyComponent extends React.Component {

 state = { count: this.props.initialCount };

 componentWillReceiveProps(nextProps) {

 if (nextProps.initialCount !== this.props.initialCount) {

 this.setState({ count: nextProps.initialCount });

 }

 }

 render() {

 return <div>{this.state.count}</div>;

 }

}

**问题现象**：

- 如果父组件频繁更新，可能多次触发 `setState`，导致性能问题。
- 并发模式下不保证生命周期调用的顺序，可能引发不一致性。

**解决方案**：

- 使用 `getDerivedStateFromProps` 或 Hook：

class MyComponent extends React.Component {

 static getDerivedStateFromProps(nextProps, prevState) {

 if (nextProps.initialCount !== prevState.count) {

 return { count: nextProps.initialCount };

 }

 return null;

 }

 render() {

 return <div>{this.state.count}</div>;

 }

}

- 使用函数组件和 Hook：

function MyComponent({ initialCount }) {

 const [count, setCount] = React.useState(initialCount);

 React.useEffect(() => {

 setCount(initialCount);

 }, [initialCount]);

 return <div>{count}</div>;

}

#### [](#253-componentwillupdate-引发的问题)2.5.3. **`componentWillUpdate` 引发的问题**

**问题**：由于在更新前执行，容易导致不必要的副作用。

**示例**：

class MyComponent extends React.Component {

 componentWillUpdate(nextProps) {

 if (nextProps.someValue !== this.props.someValue) {

 // 触发副作用，比如更新 DOM

 document.title = `Value: ${nextProps.someValue}`;

 }

 }

 render() {

 return <div>{this.props.someValue}</div>;

 }

}

**问题现象**：

- React 的新渲染机制可能导致不必要的 DOM 更新或不一致性。

**解决方案**：

- 使用 `componentDidUpdate` 或 Hook：

class MyComponent extends React.Component {

 componentDidUpdate(prevProps) {

 if (prevProps.someValue !== this.props.someValue) {

 document.title = `Value: ${this.props.someValue}`;

 }

 }

 render() {

 return <div>{this.props.someValue}</div>;

 }

}

- 使用函数组件和 Hook：

function MyComponent({ someValue }) {

 React.useEffect(() => {

 document.title = `Value: ${someValue}`;

 }, [someValue]);

 return <div>{someValue}</div>;

}

#### [](#254-finddomnode-的问题)2.5.4. **`findDOMNode` 的问题**

**问题**：`findDOMNode` 不安全，因为它依赖于树的结构，而并发模式可能会改变树的结构。

**示例**：

import ReactDOM from 'react-dom';

class MyComponent extends React.Component {

 componentDidMount() {

 const node = ReactDOM.findDOMNode(this);

 node.style.backgroundColor = 'red';

 }

 render() {

 return <div>Example</div>;

 }

}

**问题现象**：

- 如果组件渲染的是 `null` 或 `fragment`，`findDOMNode` 会返回错误的结果。
- 在并发模式下可能导致意外行为。

**解决方案**：
使用 `ref` 替代：

class MyComponent extends React.Component {

 ref = React.createRef();

 componentDidMount() {

 this.ref.current.style.backgroundColor = 'red';

 }

 render() {

 return <div ref={this.ref}>Example</div>;

 }

}

#### [](#255-自动批处理引发的问题)2.5.5. **自动批处理引发的问题**

**问题**：React 18 自动批处理状态更新，如果开发者不了解，可能误解状态更新行为。

**示例**：

import React, { useState } from 'react';

function MyComponent() {

 const [count, setCount] = useState(0);

 const [flag, setFlag] = useState(false);

 const handleClick = () => {

 setTimeout(() => {

 setCount(c => c + 1);

 setFlag(f => !f);

 }, 1000);

 };

 return (

 <div>

 <button onClick={handleClick}>Update</button>

 <p>Count: {count}</p>

 <p>Flag: {flag.toString()}</p>

 </div>

 );

}

**问题现象**：

- React 18 中，上述状态更新被自动批处理，只有一次渲染。
- 如果需要立即生效，可以使用 `flushSync`。

**解决方案**：

import { flushSync } from 'react-dom';

function MyComponent() {

 const [count, setCount] = useState(0);

 const [flag, setFlag] = useState(false);

 const handleClick = () => {

 setTimeout(() => {

 flushSync(() => setCount(c => c + 1));

 flushSync(() => setFlag(f => !f));

 }, 1000);

 };

 return (

 <div>

 <button onClick={handleClick}>Update</button>

 <p>Count: {count}</p>

 <p>Flag: {flag.toString()}</p>

 </div>

 );

}

通过以上具体例子可以更直观地理解问题的本质，并找到合适的解决方案，使代码更安全且兼容 React 18 的并发模式和最佳实践。

### [](#26-新的-hook-和-api)2.6. 新的 Hook 和 API

React 18 添加了以下新的 Hook 和 API：

- `useId`：用于生成在客户端和服务端渲染中唯一的 ID，避免因 ID 不匹配导致的水合问题。
- `useTransition` 和 `startTransition`：用于将非紧急的更新标记为过渡更新，提升应用响应性。
- `useDeferredValue`：用于延迟非紧急的状态更新，防止界面卡顿。
- `useSyncExternalStore`：帮助外部状态管理库与 React 集成，支持并发渲染。
- `useInsertionEffect`：为 CSS-in-JS 库提供在 DOM 变更后、布局 effect 之前注入样式的能力。

### [](#27-服务端渲染-api-更新)2.7. 服务端渲染 API 更新

React 18 改进了服务端渲染 API，引入了 `renderToPipeableStream`（用于 Node.js 环境）和 `renderToReadableStream`（用于现代边缘运行时环境，如 Deno 和 Cloudflare Workers），以支持流式渲染和 Suspense。 旧的 `renderToNodeStream` 已被弃用。

### [](#28-typescript-类型定义更新)2.8. TypeScript 类型定义更新

如果项目使用 TypeScript，请将 `@types/react` 和 `@types/react-dom` 更新到最新版本。 新的类型定义更安全，但可能需要在代码中显式定义 `children` 属性等。

### [](#29-第三方库兼容性)2.9. 第三方库兼容性

某些第三方库可能需要更新以支持 React 18 的新特性，特别是涉及并发渲染的部分。 在升级过程中，建议关注所使用库的更新情况，并进行必要的兼容性测试。

## [](#3-垫片兼容方案)3. 垫片兼容方案

MDF框架在升级react18适配过程中，为了兼容react16升级18场景（某些专属化或其他场景未升级react18的场景）增加了react-dom.polyfill文件，即：个别ReactDOM中api的改动，无需修改代码，保持react16的写法即可，但通过react-dom.polyfill可以转换为react18的写法，示例代码如下，欢迎各位开发提供修改思路和建议：

/**

 * @Description: React垫片文件，解决16和18版本兼容性问题

 * @Author: zhanghaoaq@yonyou.com

 * @Date: 2024-12-02 12:02:04

 * @LastEditTime: 2024-12-05 10:03:02

 * @LastEditors: zhanghaoaq@yonyou.com

 */

const REACT_VERSION = window.ReactDOM.version

if (REACT_VERSION >= '18.0.0') { // 16以上的版本

 window.ReactDOM.render = (view, container) => {

 return window.ReactDOM.createRoot(container).render(view)

 }

 window.ReactDOM.unmountComponentAtNode = (container) => {

 window.ReactDOM.createRoot(container).unmount()

 return true;

 }

} else {

 // nothing

}

## [](#4-性能测试)4. 性能测试

目前无明显场景，待补充

## [](#5-相关资料)5. 相关资料

[React 18 调研.docx](https://docs.yonyoucloud.com/l/522D9a9bD644)