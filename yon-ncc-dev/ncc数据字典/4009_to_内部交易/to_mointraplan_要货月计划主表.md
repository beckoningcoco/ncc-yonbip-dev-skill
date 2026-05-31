# |<<

**要货月计划主表 (to_mointraplan / nc.vo.to.m5p.entity.MoIntraPlanHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5800.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbillid | 单据标识 | cbillid | char(20) | √ | 主键 (UFID) |
| 2 | vbillcode | 单据号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 3 | cbilltypecode | 单据类型 | cbilltypecode | varchar(20) |  | 单据类型 (BilltypeVO) |
| 4 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 5 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | ccurrencyid | 本位币 | ccurrencyid | varchar(20) |  | 币种 (currtype) |
| 7 | baddplanflag | 追加计划 | baddplanflag | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | fstatusflag | 单据状态 | fstatusflag | int |  | 单据状态 (BillStatus) |  | 1=自由; |