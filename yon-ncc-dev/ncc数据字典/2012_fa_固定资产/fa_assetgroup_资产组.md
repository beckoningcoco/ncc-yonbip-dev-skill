# |<<

**资产组 (fa_assetgroup / nc.vo.fa.assetgroup.AssetGroupHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1990.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_assetgroup | 资产组主键 | pk_assetgroup | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | group_code | 资产组编号 | group_code | varchar(40) |  | 字符串 (String) |
| 5 | group_name | 资产组名称 | group_name | varchar(80) |  | 多语文本 (MultiLangText) |
| 6 | group_flag | 是否总部资产 | group_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | pkorg_belong | 总部资产所属财务组织 | pkorg_belong | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 8 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |