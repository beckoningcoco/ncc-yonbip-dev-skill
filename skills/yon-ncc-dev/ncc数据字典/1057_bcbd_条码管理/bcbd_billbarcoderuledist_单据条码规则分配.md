# |<<

**单据条码规则分配 (bcbd_billbarcoderuledist / nc.vo.bcbd.barcoderuledist.BillBCRuleDistributionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/263.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ruledist | 单据条码规则分配主键 | pk_ruledist | char(20) | √ | 主键 (UFID) |
| 2 | billbarcoderule_v | 单据条码规则 | billbarcoderule_v | varchar(20) | √ | 条码规则 (barcoderule_v) |
| 3 | pk_barcoderule | 条码规则主键 | pk_barcoderule | varchar(20) | √ | 条码规则(多版本) (barcoderule) |
| 4 | pk_module | 模块主键 | pk_module | varchar(20) | √ | 模块信息 (module) |
| 5 | pk_billtype | 单据类型 | pk_billtype | varchar(20) | √ | 单据类型 (BilltypeVO) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 8 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 9 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 11 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |