# |<<

**退货原因 (so_returnreason / nc.vo.so.mreturnreason.entity.ReturnReasonVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5432.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_returnreason | 退货原因主键 | pk_returnreason | char(20) | √ | 主键 (UFID) |
| 2 | vreasoncode | 退货原因编码 | vreasoncode | varchar(50) |  | 字符串 (String) |
| 3 | vreasonname | 退货原因名称 | vreasonname | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | freasontype | 退货原因类型 | freasontype | smallint |  | 退货原因类型 (ReturnReasonType) |  | 1=质量退货; |