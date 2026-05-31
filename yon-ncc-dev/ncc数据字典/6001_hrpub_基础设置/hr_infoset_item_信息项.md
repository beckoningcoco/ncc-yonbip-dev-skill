# |<<

**信息项 (hr_infoset_item / nc.vo.hr.infoset.InfoItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2681.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_infoset_item | 信息项主键 | pk_infoset_item | char(20) | √ | 主键 (UFID) |
| 2 | pk_infoset | 信息集主键 | pk_infoset | char(20) |  | 主键 (UFID) |
| 3 | item_code | 信息项编码 | item_code | varchar(128) |  | 字符串 (String) |
| 4 | item_name | 信息项名称 | item_name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 5 | meta_data | 元数据全称 | meta_data | varchar(50) |  | 字符串 (String) |
| 6 | data_type | 数据类型 | data_type | int | √ | 数据类型 (data_type) |  | 0=字符; |