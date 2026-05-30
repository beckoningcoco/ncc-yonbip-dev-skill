# |<<

**结算单明细 (po_settlebill_b / nc.vo.pu.m27.entity.SettleBillItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4635.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_settlebill_b | 结算明细 | pk_settlebill_b | char(20) | √ | 主键 (UFID) |
| 2 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 财务组织版本 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | pk_org_v | 财务组织 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 6 | frowtype | 行类型 | frowtype | int |  | 行类型 (行类型) |  | 0=入库单发票匹配; |