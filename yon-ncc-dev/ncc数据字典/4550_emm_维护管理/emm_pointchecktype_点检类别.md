# |<<

**点检类别 (emm_pointchecktype / nc.vo.emm.pctype.PointCheckTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1818.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pointchecktype | 点检类别PK | pk_pointchecktype | char(20) | √ | 主键 (UFID) |
| 2 | typecode | 编码 | typecode | varchar(40) |  | 字符串 (String) |
| 3 | typename | 名称 | typename | varchar(80) |  | 多语文本 (MultiLangText) |
| 4 | memo | 备注 | memo | varchar(300) |  | 备注 (Memo) |
| 5 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |