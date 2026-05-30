# |<<

**费用结算单子实体 (to_feesettle_b / nc.vo.to.m4552.entity.FeeSettleBillItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5790.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbill_bid | 费用结算单明细 | cbill_bid | char(20) | √ | 主键 (UFID) |
| 2 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 5 | frowtypeflag | 行类型 | frowtypeflag | int |  | 行类型 (RowType) |  | 1=跨组织采购; |