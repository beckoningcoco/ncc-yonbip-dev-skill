# |<<

**测量项目 (eom_meas_items / nc.vo.am.measureitems.MeasureitemsVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1841.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_meas_items | 测量项目标识 | pk_meas_items | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | item_code | 编码 | item_code | varchar(40) |  | 字符串 (String) |
| 5 | item_name | 名称 | item_name | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | result_type | 测量结果类型 | result_type | int |  | 测量结果类型 (MeasRsltType) |  | 0=测量类型; |