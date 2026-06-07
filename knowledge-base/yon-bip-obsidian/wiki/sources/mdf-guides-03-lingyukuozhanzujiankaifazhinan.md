---
title: "领域扩展组件开发指南"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/03-lingyukuozhanzujiankaifazhinan"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 14
---

# 领域扩展组件开发指南

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/03-lingyukuozhanzujiankaifazhinan | 所属：指南

# [](#领域扩展组件开发指南)领域扩展组件开发指南

新版MDF和YNF领域扩展组件通过TNE二方包的方式扩展，目前支持MDF和YNF修改协议实现，由于设计器正在进行模型重构，资源中心暂时无法接入，预计3月份可通过设计器拖拽。

## [](#1-二方包概念)1. 二方包概念

二方包通常是指由项目或公司内部自行开发并维护的软件包。在一个公司的软件开发过程中，不同的团队可能会负责不同的功能模块，而这些团队之间可能会存在代码或功能的复用需求。在这种情况下，一个团队可以将自己开发的代码或功能打包成一个二方包，供其他团队使用。这种二方包的形式有助于提高代码复用率，减少重复劳动，并提高开发效率。

### [](#11-命名规范)1.1. 命名规范

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/mdfheynflingyukuozhanzujiankaifazhinan1.81b68fe5.png)

以财务领域为例：yonbip-fi-extendcomponents-fe

TNE官方文档：《[前端二方包](https://c2.yonyoucloud.com/iuap-tinper/ucf-wh/lightning-docs/index.html#/best-practice/tnf2nd-intro)-[概念和规范](https://c2.yonyoucloud.com/iuap-tinper/ucf-wh/lightning-docs/index.html#/best-practice/tnf2nd-intro)》

## [](#2-申请二方包)2. 申请二方包

参考TNE二方包管理流程：《[前端二方包-申请流程](https://c2.yonyoucloud.com/iuap-tinper/ucf-wh/lightning-docs/index.html#/best-practice/tnf2nd-gl)》

## [](#3-组件开发)3. 组件开发

### [](#31-安装yds)3.1. 安装YDS

ynpm install -g yds

### [](#32-初始化工程)3.2. 初始化工程

yds init 此资源编码作为仓库名和后面的二方包编码不同注意区分

![](data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAPgAAAAjCAYAAAC5KMfnAAAJAElEQVR4Ae2cvY4UORCAeZZb6TZiM1KSOwQhhJuADolws9MJjUTMJkhEd8shTUTEBmiSQyLg5w0gZt7Fp7Jddrlc5e72eHp7dxyg7na7flyuz6727N2to+MT0//1GPQcuJk5cKtP7M2c2D6vfV4hB2YA/PaCK4Ql+3bTE7THfo5FeADw/U3Cg/VTs3p9pwn8Z5+empebe5N11crNMTHdxk1f4OYZnwA4QI1g03twCNt3d26ZgLvxtfStg7p7rvQY1sdQBnz10Lxc3xWARuDHgq73WzJES/atJ3t9sh9i7ATAXQAfb6Ds/Z1BzoElz6tH5uWnR+YBPZVnbVYnlNP+Hy3R03dMD9VJ7u+8Pg263IIUJ//x5tQ8Pr1rbBlu7UWdmlzSTvzkug8xUfqYY25dp1iogEM5/mD9Rw4tAYyX7ADT2SoGAnZChIPeQ4DoLmnBshVDlJ0SREneLRgAudMJz3RBAf2SHPdtih+9b9389bjtL24FwJ1Rt6tFUEqTwYE5++TlTu+ZFdvdM8DZ+5Id/o7bhfcANF1spD5SG8hS37it/ry/ZOyxbR/bkYDHnbg4CRRkKM9xV6btvgLgEMGzVLoX7XldEqgd8PbJMmYuep9lxb0IuIMufrsOT97tsHOCbNhBRwBOdUOpz8tp+p7fd8CXlVR8fvrz1c2PCriFu+K35SPYuTenZsVk6fe5BbIAsfS9XEqS1oBbfcz/kv3+7uoSuMe+HHsZcFpeJ4dqmjI4TY8n6uIObE/UfRm+vmsPuHCXBqCxPLdXLO0HbGdycPLtZUslekkOEybpM9IflO1XLU96+9y5IQM+AFbqJMJNAR93KJfr6QmQxqR1POIc7ddOa7+7vtr5agA4BD8mji3t+443+c9mayewy3X4SznQCHD305Itr/u3a4d7UgXYAS0Buuu7ZoDv6sj1lI+VS9n/sf3mTfZffl2mX+VYzhuj6+7LgQPeE/y6J/BN8//d5Uej/asZa0PA35ov263Zbr+Zv0OJJrW1XIE1/Vp7S9tL1tUXrhoYliCjwQ3tNf41BBwSnoOFzwA+/4cLAfbhz7w/feZ98ZlCx/XSd/Qe+1H9eC/ppbI19wBfB7AmWQ9BZjbA4bdsODTD36qnBxfBAUi0ewQkf//9w8qvWPQd9ocrbXf3Xy6wDQFNr1EmbU+rDq6b2mxxv2/AH5rn64/m/FnJ1zNzDqXg+rxqV1Bz4dkbUl6+N8/vow8t7C1nUXzy6qO5ePFwfOzUuGB84nU2wHESLeiTf/ZC0HAH5M9xQGgH4UNIHeAlubfm8/an2W6/hgUEZRHYeIjE9Ux9lvxt3dYK/KsC3EEsLywtAB8f78kAhk/KcTam6S/FJbdXD7i8AA6X6PbvyMf+4QoHBwbg2jh8EWw+SNf/+4eN/6bPd1vUmZb9vFKgerlfU5+prl3vNZC19qn2xgA+VeeI/vfPzcXlG/NkIix6HoywqdiaBuB0O5P0T4xLPeDyOIYBPz6x/9OE8B+OKEGN0OGuDQZrQOKAoz6uCwdE2/GeLwr4/E3waYyfaOvEHP21Md/hPOHHxvypxoL0L/WxpRuDImnzOx+erIaSGiCGEpi+Rz0IuPTuxPz24n0so1+dkTKzpHPEeBK/Y3/dXuwjQ+7GERIefbXApCUyAPfu8k06NowZXFH2WNFp27V4gp9M7jK1L/vvx6fEJdPpfQzjpf77+6IdJc+GAR+1gyNYHEYAC9twQrGve6ctAqUdXD+l/9d8CWU72uNXat+D/+OHgzY7CIwLQ7DZEvDjvHyzyWon2yVV/NbzSRbe/WfeXeJ3Lu2LyYjvTkzUGWNhwQuJD+3j5HiSJQDTpEx0+4WFtXFd9Dn1mY7vxBxZaPz4BIBANsYtjlnXycee2kvlXDwl/dT/obikOqO9+QC3YE89aBPgEaHh0MMkOFks5SPg2Bd1a89RR1q6I6TbYMO9Bz1ep7obc5sxWehk7nKfggbA64l75Ms9hJF+70Y9LlnoOwcE7vBuDLE/jkmRC1UD9lOuAmg0Lrk9RY/diSAOqb92DMQXp+9cPFCUAS/pzMce/BVKbFm/Mh4xLrov8wI++c9Oh4AovXfvcsAjoAgmLgYcZJTVrlBNRNklAH7bILT22xWSAXc5uCcJbWGpBVxI0pDAobTLkzxZGKwO+kcYAoAcyqBb2cE1nVm7t5vEw/kb4kVsiQAWdeZjD/GxculYE/2Z3rRvEkP0MZOJ45sPcHQmucondXGl5gAPPeOqR/u5++xnMnWX5Tq2JgIOJXt8VgEXq4xULpToSTzQdu0V4hmTCxIn7LzSyu/bqAzGPiQk0Yfv+O4H7bE/+h79KMmFdzwOkr+kT24P7QpXASpu10F2ZndwXi4nAKIPRZ352IO/gpyoH+3wqxQXQSeObzbA3f+UgZ+ezwm4O0VHWLfhOxlLdCExsOQOwMLPaLQCUHbw7JwAddOFx7c1/Qb3OiEJ1u/NRbJDQRlHvyVdErpkLiRkBjiVw3GNAZzbj7KYjMlVSmSS7AEY0pbIJ+3OZ2l3tjLUloUlnjfAe2sriSX4XtJZiqeLAy68VncyLzVx0X1ZOOB0sA6OAKgFTYKTQuTvv74NpXSQtzs47Yu2oM2B/Pkft2O77/efZCfHPhTwFHx5hxbs7QNwf9jGd6Ij3x4mHcv3DGIKrE8ecuAV9ebvrG6rN38X5TDWhSuFLsCa64z2CrqsfC5r/bF2SKVz7A8R8exCkmVxC/EMoDpbCHFYJFDO20TfAfLRsRHjAmOXx0d94/f6gqjHcvgUPUwWKBnawaEPQgEAUaCH2sk38ddv5O/avRwBPLVB7bi+EXAs0fF0nQJO7CV+0mChz3Qc9H2re9gl0l2oZjJ3k8mTfDd9rWJzWHo41PS5Zj4mAq4FG0HAXbEEBPblfaR2bBv7u7PrH7/fYUFCuGGX5zbHjGesjKZruB2+6dRyNFlgh3XVJIGT6YDXx67dvFCg+X2Nf40AbzfAmkHUy4ypSPY3Ngs2lNLZ9+L+bOqx6oDrsZlvPjjU9LnGvwMEHKC+WrBrJqrLzAfZVcaaAs3va/zqgM9WAh9GgtYkYZfZX278D5vmFVCJUUFiAAAAAElFTkSuQmCC)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/mdfheynflingyukuozhanzujiankaifazhinan3.9a2cebc0.png)

### [](#33-创建二方包)3.3. 创建二方包

cd ./yonbip-fi-extend-fe/packages

yds create yonbip-fi-extendcomponents-fe 

yonbip-fi-extendcomponents-fe是二方包编码

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/mdfheynflingyukuozhanzujiankaifazhinan4.9e3bbc5f.png)

仓库目录结构如图

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/mdfheynflingyukuozhanzujiankaifazhinan5.e64a9ce0.png)

### [](#34-开发组件)3.4. 开发组件

#### [](#341-新组件)3.4.1. 新组件

cd yonbip-fi-extendcomponents-fe\src\components

yds create

执行yds create 创建初始化组件，选择YNF低代码React组件

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/mdfheynflingyukuozhanzujiankaifazhinan6.2ce76ae0.png)

会生成一个默认的组件，可以根据需求自行编写扩展组件

以上是主要步骤详细开发流程可参考文档
《[前端二方包-开发指南](https://c2.yonyoucloud.com/iuap-tinper/ucf-wh/lightning-docs/index.html#/best-practice/tnf2nd-develop)》

#### [](#342-原组件迁移)3.4.2. 原组件迁移

将原组件迁移到components下，以人力云组件为例：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/mdfheynflingyukuozhanzujiankaifazhinan7.51601859.png)

添加需要的替换配置（作用是将旧的组件库引流到新的组件库上加载资源）

在config中添加原组件的xLibCode作为标识，以人力的组件为示例

路径：yonbip-fi-extend-fe\packages\yonbip-fi-extendcomponents-fe\ynf.config.js

replacePackages: [

 "HrCloudExtComponents"

]

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/mdfheynflingyukuozhanzujiankaifazhinan8.77d5421b.png)

完整流程

ynpm install -g yds

yds init

yds create 二方包libcode

yds create 组件

## [](#4-创建流水线)4. 创建流水线

参考TNE《[前端二方包-发布流程](https://c2.yonyoucloud.com/iuap-tinper/ucf-wh/lightning-docs/index.html#/best-practice/tns2nd-serverless)》 

## [](#5-资源中心注册)5. 资源中心注册

暂未支持，预计3月份支持

## [](#6-设计器使用)6. 设计器使用

### [](#61-mdf单据)6.1. MDF单据

手动修改设计器协议添加如下属性

#### [](#611-新开发组件)6.1.1. 新开发组件

"xLibCode": "yonbip-fi-extendcomponents-fe",// 新开发的组件用二方包编码作为libcode

"cControlType": "demo", // 组件名，不区分大小写，保存时设计器会转成小写

"uitype": "demo",

"controlType": "Demo", // 区分大小写，按文件导出的名称

"packageMode": "pipeline"

#### [](#612-迁移组件)6.1.2. 迁移组件

"xLibCode": "HrCloudExtComponents",// 迁移的组件用原有的xlibcode即可

其他属性同上

### [](#62-ynf单据)6.2. YNF单据

在ynf设计器中拖入文本框组件（任意组件即可，推荐使用文本框组件比较简单）
手动修改设计器协议修改如下属性

"controlType": "HrFloatButton",

 "libCode": "yonbip-fi-extendcomponents-fe",

修改后效果如下

![1735625857636](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/mdfheynflingyukuozhanzujiankaifazhinan13.490face2.png)

## [](#7-多语接入)7. 多语接入

《[YNF项目多语接入](#/guides/20-ynfprojectduoyujieshu)》

## [](#8-常见问题)8. 常见问题

### [](#81-版本以1520为起始版本)8.1. 版本以15.2.0为起始版本

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/mdfheynflingyukuozhanzujiankaifazhinan9.7ec5a46c.png)

### [](#82-本地构建报错)8.2. 本地构建报错

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/mdfheynflingyukuozhanzujiankaifazhinan10.45499ca8.png)

目前没上线，ynf.config要添加以下配置 providerMocks: ['iuap-ap-coresdk-fe']

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/mdfheynflingyukuozhanzujiankaifazhinan11.fe2a3423.png)

### [](#83-流水线报错)8.3. 流水线报错

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/mdfheynflingyukuozhanzujiankaifazhinan12.d1f5b088.png)

流线初始化报这个错，找不到这个包,目前改成前端资源构建可以，二方包流水线有问题

解决方案：package.json添加一下配置

"installKernel": "npm"

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/mdfheynflingyukuozhanzujiankaifazhinan14.a6a593fe.png)

## [](#9-联系人)9. 联系人

- 二方包流水线构建和部署问题   基础前端开发部 刘石磊
- 二方包脚手架构建以及加载问题   基础前端开发部 杜雪
- 二方包开发以及工程配置问题   基础前端开发部 杜志娟