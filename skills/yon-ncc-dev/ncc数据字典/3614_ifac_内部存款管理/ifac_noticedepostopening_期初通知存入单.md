# |<<

**期初通知存入单 (ifac_noticedepostopening / nc.vo.ifac.noticedepostopening.NoticeDepostOpeningVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3106.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_noticedepostopening | 期初通知存入单主键 | pk_noticedepostopening | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 资金组织 | pk_org | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 3 | pk_org_v | 资金组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | vbillcode | 单据编号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 6 | depositcode | 存单号 | depositcode | varchar(50) |  | 字符串 (String) |
| 7 | billstate | 单据状态 | billstate | int |  | 单据状态 (Billstate) |  | 1=待确认; |