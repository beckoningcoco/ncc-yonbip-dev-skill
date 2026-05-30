# |<<

**单据属性检查 (fip_fieldreport / nc.vo.fip.report.FieldReportVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2240.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fieldreport | 实体标识 | pk_fieldreport | varchar(50) | √ | 字符串 (String) |
| 2 | pk_org | 组织 | pk_org | varchar(50) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(50) |  | 字符串 (String) |
| 4 | pk_template | 所属模板 | pk_template | varchar(20) |  | 元数据转换模板 (transtemplate) |
| 5 | fieldcode | 字段编码 | fieldcode | varchar(50) |  | 字符串 (String) |
| 6 | src_billtype | 来源单据 | src_billtype | varchar(50) |  | 字符串 (String) |
| 7 | des_billtype | 目标单据 | des_billtype | varchar(50) |  | 字符串 (String) |
| 8 | station | 位置 | station | varchar(50) |  | 所在位置 (fieldstation) |  | F=影响因素; |