---
url: https://community.yonyou.com/datadict/bipbook/chapter1901/chapter1901.html
title: "ES6与React基础 | YonBIP高级版"
description: "YonBIP高级版电子书"
language: "zh"
captured_at: "2026-05-29T18:08:34.631Z"
---

# ES6与React基础 | YonBIP高级版

[Skip to content](https://community.yonyou.com/datadict/bipbook/chapter1901/chapter1901.html#VPContent)

## ES6与React基础

## 1 前言

众所周知，随着数字化转型的潮流，NC Cloud 底层，确切的说YonBIP和NC Cloud的底层都使用的是React，React到底是什么？能做什么？

React的官方文档给出了一句话解释React是什么：

> 用于构建用户界面的 JavaScript 库

我们需要把这句话拆成两部分：React是一个JavaScript库，用于构建用户界面。这正好解释了上面提到的两个疑问。

## 2 赘述

对于在我们用友来说，大部分开发同事是java开发。现在随着产品的迭代需要对前端部分有所涉猎，甚至有所深入，可能对大部分开发来说不太适应，或者更直白的说，大部分java开发可能在躲前端，能用后端解决绝对不使用前端解决；不能用后端解决，想办法用后端解决。另外可能对于客开来说没有时间去学习前端的技术，这也是我在这几年赋能过程中听到的最多的说辞。站在企业角度：学习应该是个人的事情，企业雇佣员工是要有业绩产出的，当然业绩产出不能全部用金钱来衡量，所以某个技术如果我们不能快速学会的话很快会被会的所取代。站在个人角度：如果能在学习之余把项目交付了或者把产品研发了，顺便得到了应得的报酬。还多学了一门技术，岂不是谁都不能取代我们。何乐而不为？

## 3 言归正传

React文档告诉我们：

> 阅读 React 官方文档需要对使用 JavaScript 语言编程有一定基础。你不需要是一个 JavaScript 编程专家，但同时学习 React 和 JavaScript 编程将会比较困难。

里面有一个关键语句：“对使用 JavaScript 语言编程有一定基础”，同时，文档中也给指明了补充JavaScript基础的方向： [https://developer.mozilla.org/en-US/docs/Learn/Getting\_started\_with\_the\_web/JavaScript\_basics](https://developer.mozilla.org/en-US/docs/Learn/Getting_started_with_the_web/JavaScript_basics)

*Tips: 学习是一件反人类的事情，但不学你会体会到所有人、所有事好像都在与你作对。*

## 4 React生命周期

众所周知：tomcat有生命周期、Springboot有生命周期、hibernate有生命周期，我们所知的好像都有生命周期。

那么：React也有它的生命周期

![](https://community.yonyou.com/datadict/bipbook/assets/react-lifecycle.DubzmCu2.jpg)

对于生命周期的详细讲解，我们可参考：

> 1、 [https://www.cnblogs.com/soyxiaobi/p/9559117.html](https://www.cnblogs.com/soyxiaobi/p/9559117.html)
>
> 2、 [https://www.jianshu.com/p/514fe21b9914](https://www.jianshu.com/p/514fe21b9914)
>
> 3、 [https://zhuanlan.zhihu.com/p/392532496](https://zhuanlan.zhihu.com/p/392532496)

总之，百度上对React生命周期的详细解释很多，大家可以百度上随便搜索阅读。

## 5 state 和 props

有的同学可能注意到了，我们几年前开始赋能到现在好像每次都在提及state和props，就像求学阶段老师总提及的“傅里叶变换，拉氏变换，z变换非常重要”（好像专物理专业课中这几个变换无时无刻不在使用）。是的，state和props对于React来说，就像这几个变换对于物理学来说一样。state和props是React的基础，同样也是核心，其整个生命周期都充斥着这两个对象的身影。而state和props是什么？

- state是React组件的状态对象，就像是人的状态一下，我们把人想象成一个个的React的组件，而这会儿人处于在睡觉的状态还是清醒的状态，是微笑的状态还是悲伤的状态，这是人自己控制的。同样state是React组件内部自己控制的，但也可能会收到props的影响①。
- props是React组件之间交互传递信息的对象，就像其他人告诉:"用友股票今天涨停了，你大赚了一笔。②"这一消息（props），而你呈现出微笑的状态（state）作用到你的脸部（DOM），然后你告诉其他人：“今天赚发了，请你们吃饭”，这一反馈消息，别人也呈现出微笑的状态（state），作用在别人的脸部（DOM）。

> ①：别人告诉你：”用友股票今天涨停了，你大赚了一笔“的时候，你收到这一消息，你自己的状态（state）变成了微笑。
>
> ②：别人告诉你：”用友股票今天涨停了，你大赚了一笔“的时候，可能心里是这样想的：“你得给我一个请我吃饭的反馈吧”。这个反馈体现在React中就是回调方法。而你的反馈正好是：“今天赚发了，请你们吃饭”。

这里我们可以结合 [https://nccdev.yonyou.com/article/detail/447](https://nccdev.yonyou.com/article/detail/447) 里面“双击弹出弹窗，显示双击的树节点数据”部分的讲解

![image-20220323225510023](https://community.yonyou.com/datadict/bipbook/assets/image-20220323225510023.BjCR4Fjr.png)

1. 当前组件想让ModalWrapper组件弹出时，告诉ModalWrapper组件show。
2. 当前组件期待ModalWrapper组件的反馈时，告诉ModalWrapper组件回调方法，等待ModalWrapper组件通过这些回调方法通知当前组件。

## 6 React受控组件

React官方文档中： [https://react.docschina.org/docs/forms.html](https://react.docschina.org/docs/forms.html) 讲解了受控组件。

![image-20220323230245489](https://community.yonyou.com/datadict/bipbook/assets/image-20220323230245489.LmXnkZf_.png)

受控组件是受谁的控制呢？

通过文档我们可以看到，是受state的控制。

进一步我们可参考： [https://nccdev.yonyou.com/article/detail/409](https://nccdev.yonyou.com/article/detail/409)

![image-20220323230329477](https://community.yonyou.com/datadict/bipbook/assets/image-20220323230329477.BZYdASzE.png)

我们知道NCFormControl是一个React组件，当我们把它的value值放入当前组件的state中，并且传给NCFormControl组件value的值也是state里的inputVal时，我们就可以认为当前NCFormControl组件就成为了一个受控组件，当state里的inputVal发生改变时，NCFormControl也会跟随state状态的变化而变化（这种变化体现在DOM上）。

## 7 JSX

React官方文档中： [https://react.docschina.org/docs/introducing-jsx.html](https://react.docschina.org/docs/introducing-jsx.html) 讲到了JSX的概念。

我们在NC Cloud开发过程中，其实无时无刻不在于JSX打交道，我们之前介绍弹窗ModalWrapper的时候里面是这样写的：

![image-20220323231130039](https://community.yonyou.com/datadict/bipbook/assets/image-20220323231130039.tBVGaE2d.png)

这种写法我们就可以认为是JSX写法。

## 8 结语

如果大家看过\*\*“NC Cloud前端基础系列课程的分享”\*\*，看到本次的分享，大家应该知道，基础系列课程的核心是什么了，其实后面我们将要分享的高阶组件的应用核心仍然是React。本次分享主要想让大家勇敢的迈出走向前端、学习前端的第一步，希望读者能有所启发。