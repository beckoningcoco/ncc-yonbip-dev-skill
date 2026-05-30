# |<<

**表单字段属性 (pub_form_property / nc.vo.platform.appsystemplate.FormPropertyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4729.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_form_property | 主键 | pk_form_property | char(20) | √ | 主键 (UFID) |
| 2 | areaid | 区域ID | areaid | varchar(50) |  | 字符串 (String) |
| 3 | label | 名称 | label | varchar(50) |  | 字符串 (String) |
| 4 | code | 编码 | code | varchar(100) |  | 字符串 (String) |
| 5 | metapath | 元数据路径 | metapath | varchar(100) |  | 字符串 (String) |
| 6 | width | 组件长度 | width | int |  | 整数 (Integer) |
| 7 | refcode | 参照编码 | refcode | varchar(500) |  | 字符串 (String) |
| 8 | isnextrow | 是否布局到下一行 | isnextrow | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | isrevise | 是否可修订 | isrevise | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | istotal | 是否合计 | istotal | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | required | 是否必输 | required | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | disabled | 是否可修改 | disabled | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | visible | 是否可见 | visible | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | maxlength | 最大长度 | maxlength | int |  | 整数 (Integer) |
| 15 | textrows | 多行文本显示行数 | textrows | int |  | 整数 (Integer) |
| 16 | resid | 多语 | resid | varchar(50) |  | 字符串 (String) |
| 17 | position | 位置 | position | int |  | 整数 (Integer) |
| 18 | color | 颜色 | color | varchar(50) |  | 字符串 (String) |
| 19 | datatype | 数据类型 | datatype | int |  | 整数 (Integer) |
| 20 | dataval | 数据类型的值 | dataval | varchar(1000) |  | 字符串 (String) |
| 21 | showformula | 显示公式 | showformula | varchar(500) |  | 字符串 (String) |
| 22 | editformula | 编辑公式 | editformula | varchar(500) |  | 字符串 (String) |
| 23 | validateformula | 验证公式 | validateformula | varchar(500) |  | 字符串 (String) |
| 24 | defaultvar | 默认系统变量 | defaultvar | varchar(50) |  | 字符串 (String) |
| 25 | relatemeta | 编辑元数据关联 | relatemeta | varchar(500) |  | 字符串 (String) |
| 26 | define1 | 自定义1 | define1 | varchar(50) |  | 字符串 (String) |
| 27 | define2 | 自定义2 | define2 | varchar(50) |  | 字符串 (String) |
| 28 | define3 | 自定义3 | define3 | varchar(50) |  | 字符串 (String) |
| 29 | ismultiselectedenabled | 是否多选 | ismultiselectedenabled | char(1) |  | 布尔类型 (UFBoolean) |
| 30 | metadataproperty | 元数据属性 | metadataproperty | varchar(200) |  | 字符串 (String) |
| 31 | itemtype | 组件类型 | itemtype | varchar(50) |  | 字符串 (String) |
| 32 | refname | 参照名称 | refname | varchar(50) |  | 字符串 (String) |
| 33 | metaid | 元数据ID | metaid | varchar(50) |  | 字符串 (String) |
| 34 | iscode | 是否显示属性编码 | iscode | char(1) |  | 布尔类型 (UFBoolean) |
| 35 | colnum | 占用列数 | colnum | varchar(50) |  | 字符串 (String) |
| 36 | defaultvalue | 默认取值 | defaultvalue | varchar(50) |  | 字符串 (String) |
| 37 | isdefined | 是否自定义项 | isdefined | char(1) |  | 布尔类型 (UFBoolean) | N |
| 38 | classid | classID | classid | varchar(50) |  | 字符串 (String) |
| 39 | proid | 属性ID | proid | varchar(50) |  | 字符串 (String) |
| 40 | hyperlinkflag | 是否超链接 | hyperlinkflag | char(1) |  | 布尔类型 (UFBoolean) |
| 41 | onlyleafcanselect | 是否可以选择非叶子节点 | onlyleafcanselect | char(1) |  | 布尔类型 (UFBoolean) |
| 42 | mobiletitle | 移动列表 | mobiletitle | varchar(50) |  | 移动列表 (mobiletitle) |  | 0=空; |