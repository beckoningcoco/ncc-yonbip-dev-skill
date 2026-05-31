# |<<

**参照信息 (bd_refinfo / nc.vo.bd.ref.RefInfoVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/953.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_refinfo | 参照信息主键 | pk_refinfo | char(20) | √ | 主键 (UFID) |
| 2 | code | 参照编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 参照名称 | name | varchar(500) |  | 字符串 (String) |
| 4 | reftype | 参照类型 | reftype | int |  | 整数 (Integer) |
| 5 | resid | 参照资源ID | resid | varchar(500) |  | 字符串 (String) |
| 6 | refclass | 参照类名称 | refclass | varchar(50) |  | 字符串 (String) |
| 7 | isspecialref | 特殊参照 | isspecialref | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | isneedpara | 参数参照 | isneedpara | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | wherepart | 参照过滤条件 | wherepart | varchar(500) |  | 字符串 (String) |
| 10 | refpath | 参照路径 | refpath | varchar(200) |  | 字符串 (String) |
| 11 | istreelazyload | 是否懒加载 | istreelazyload | char(1) |  | 字符串 (String) |
| 12 | mobilerefpath | 手机参照路径 | mobilerefpath | varchar(200) |  | 字符串 (String) |
| 13 | residpath | 参照资源路径 | residpath | varchar(101) |  | 自定义项 (Custom) |
| 14 | modulename | 参照所属模块 | modulename | varchar(101) |  | 自定义项 (Custom) |
| 15 | para1 | 自定义参照参数1 | para1 | varchar(101) |  | 自定义项 (Custom) |
| 16 | para2 | 自定义参照参数2 | para2 | varchar(101) |  | 自定义项 (Custom) |
| 17 | para3 | 自定义参照参数3 | para3 | varchar(101) |  | 自定义项 (Custom) |
| 18 | refsystem | 使用系统 | refsystem | varchar(101) |  | 自定义项 (Custom) |
| 19 | reserv1 | 保留字段1 | reserv1 | varchar(101) |  | 自定义项 (Custom) |
| 20 | reserv2 | 保留字段2 | reserv2 | varchar(101) |  | 自定义项 (Custom) |
| 21 | reserv3 | 保留字段3 | reserv3 | varchar(101) |  | 自定义项 (Custom) |
| 22 | metadatatypename | 元数据类型名称 | metadatatypename | varchar(101) |  | 自定义项 (Custom) |