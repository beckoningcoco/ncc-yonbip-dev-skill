# |<<

**资产统计体系成员含编码名称 (org_assmember / nc.vo.corg.AssetStatStruMemberWithCodeNameVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3999.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_assmember | 资产统计体系成员主键 | pk_assmember | char(20) | √ | 主键 (UFID) |
| 2 | pk_ass | 资产统计体系主键 | pk_ass | varchar(20) |  | 资产统计体系 (assetstatstru) |
| 3 | pk_org | 对应组织 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 4 | pk_fatherorg | 上级组织 | pk_fatherorg | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 5 | pk_fathermember | 上级成员 | pk_fathermember | varchar(20) |  | 资产统计体系成员 (assetstatstrumember) |
| 6 | virtualorg | 虚组织 | virtualorg | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 8 | idx | 排列顺序 | idx | int |  | 整数 (Integer) |
| 9 | innercode | 内部编码 | innercode | varchar(200) |  | 字符串 (String) |
| 10 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 11 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 12 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 13 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |