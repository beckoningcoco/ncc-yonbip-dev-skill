# |<<

**报账平台业务系统注册 (sscrp_busiclass / nc.vo.sscrp.rpbill.RPBusiclassVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5611.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_busiclass | 主键 | pk_busiclass | char(20) | √ | 主键 (UFID) |
| 2 | module | 所属模块 | module | varchar(50) |  | 字符串 (String) |
| 3 | billtypecode | 单据类型编码 | billtypecode | varchar(50) |  | 字符串 (String) |
| 4 | billtypename | 单据类型名称 | billtypename | varchar(50) |  | 字符串 (String) |
| 5 | classpath | 处理类 | classpath | varchar(500) |  | 字符串 (String) |
| 6 | showflag | 报账平台是否显示 | showflag | char(1) |  | 布尔类型 (UFBoolean) | Y |
| 7 | includesub | 是否包含交易类型 | includesub | char(1) |  | 布尔类型 (UFBoolean) | Y |
| 8 | subcodes | 下级编码 | subcodes | varchar(500) |  | 字符串 (String) |
| 9 | busitype | 菜单类型 | busitype | int |  | 整数 (Integer) | 0 |
| 10 | appid | 应用主键 | appid | varchar(50) |  | 字符串 (String) |
| 11 | showmark | 是否展示角标 | showmark | char(1) |  | 布尔类型 (UFBoolean) | N |