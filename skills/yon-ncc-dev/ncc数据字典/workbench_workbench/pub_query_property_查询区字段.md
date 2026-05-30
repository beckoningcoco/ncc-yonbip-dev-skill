# |<<

**查询区字段 (pub_query_property / nc.vo.platform.appsystemplate.QueryPropertyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4767.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_query_property | 主键 | pk_query_property | char(20) | √ | 主键 (UFID) |
| 2 | onlyleafcanselect | 是否可以选择非叶子节点 | onlyleafcanselect | char(1) |  | 布尔类型 (UFBoolean) |
| 3 | areaid | 区域ID | areaid | varchar(50) |  | 字符串 (String) |
| 4 | label | 名称 | label | varchar(50) |  | 字符串 (String) |
| 5 | defaultshow | 默认显示 | defaultshow | char(1) |  | 布尔类型 (UFBoolean) | Y |
| 6 | code | 编码 | code | varchar(100) |  | 字符串 (String) |
| 7 | metapath | 元数据路径 | metapath | varchar(100) |  | 字符串 (String) |
| 8 | width | 组件长度 | width | int |  | 整数 (Integer) | 1 |
| 9 | visible | 是否可见 | visible | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | disabled | 高级查询默认显示 | disabled | char(1) |  | 布尔类型 (UFBoolean) | Y |
| 11 | required | 是否必输 | required | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | ischeck | 是否自动检查 | ischeck | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | usefunc | 是否使用函数 | usefunc | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | maxlength | 最大长度 | maxlength | int |  | 整数 (Integer) | 20 |
| 15 | resid | 多语 | resid | varchar(50) |  | 字符串 (String) |
| 16 | position | 位置 | position | int |  | 整数 (Integer) |
| 17 | opersign | 操作符 | opersign | varchar(50) |  | 字符串 (String) |
| 18 | opersignname | 操作符名称 | opersignname | varchar(200) |  | 字符串 (String) |
| 19 | defaultvalue | 默认取值 | defaultvalue | varchar(50) |  | 字符串 (String) |
| 20 | showtype | 显示类型 | showtype | int |  | 整数 (Integer) |
| 21 | returntype | 返回类型 | returntype | varchar(50) |  | 字符串 (String) |
| 22 | datatype | 数据类型 | datatype | int |  | 整数 (Integer) |
| 23 | refname | 参照名称 | refname | varchar(50) |  | 字符串 (String) |
| 24 | containlower | 参照是否包含下级 | containlower | char(1) |  | 布尔类型 (UFBoolean) |
| 25 | isquerycondition | 是否查询条件 | isquerycondition | char(1) |  | 布尔类型 (UFBoolean) |
| 26 | isfixedcondition | 是否固定条件 | isfixedcondition | char(1) |  | 布尔类型 (UFBoolean) |
| 27 | isbeyondorg | 参照是否跨集团 | isbeyondorg | char(1) |  | 布尔类型 (UFBoolean) |
| 28 | isnotmeta | 是否非元数据条件 | isnotmeta | char(1) |  | 布尔类型 (UFBoolean) |
| 29 | define1 | 自定义1 | define1 | varchar(50) |  | 字符串 (String) |
| 30 | define2 | 自定义2 | define2 | varchar(50) |  | 字符串 (String) |
| 31 | define3 | 自定义3 | define3 | varchar(50) |  | 字符串 (String) |
| 32 | define4 | 自定义4 | define4 | varchar(50) |  | 字符串 (String) |
| 33 | define5 | 自定义5 | define5 | varchar(50) |  | 字符串 (String) |
| 34 | ismultiselectedenabled | 是否多选 | ismultiselectedenabled | char(1) |  | 布尔类型 (UFBoolean) |
| 35 | refcode | 参照编码 | refcode | varchar(500) |  | 字符串 (String) |
| 36 | metadataproperty | 元数据属性 | metadataproperty | varchar(200) |  | 字符串 (String) |
| 37 | dataval | 数据类型值 | dataval | varchar(1000) |  | 字符串 (String) |
| 38 | itemtype | 组件类型 | itemtype | varchar(50) |  | 字符串 (String) |
| 39 | isuse | 是否使用 | isuse | char(1) |  | 布尔类型 (UFBoolean) |
| 40 | visibleposition | 默认显示顺序 | visibleposition | int |  | 整数 (Integer) |
| 41 | isdefined | 是否自定义项 | isdefined | char(1) |  | 布尔类型 (UFBoolean) | N |
| 42 | classid | classID | classid | varchar(50) |  | 字符串 (String) |
| 43 | proid | 属性ID | proid | varchar(50) |  | 字符串 (String) |
| 44 | tablecode | 表编码 | tablecode | varchar(100) |  | 字符串 (String) |
| 45 | querytablename | 表名称 | querytablename | varchar(100) |  | 字符串 (String) |
| 46 | mobiletitle | 移动标题属性 | mobiletitle | varchar(50) |  | 移动列表 (mobiletitle) |  | 0=空; |