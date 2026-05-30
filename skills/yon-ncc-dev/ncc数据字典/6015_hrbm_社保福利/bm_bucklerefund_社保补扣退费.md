# |<<

**社保补扣退费 (bm_bucklerefund / nccloud.dto.hrbm.bucklerefund.BmBuckleRefundVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1221.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bm_bucklerefund | 社保补扣退费主键 | pk_bm_bucklerefund | char(20) | √ | 主键 (UFID) |
| 2 | pk_psnjob | 工作记录 | pk_psnjob | varchar(20) | √ | 工作记录 (hi_psnjob) |
| 3 | bm_period | 社保期间 | bm_period | varchar(20) | √ | 险种期间 (BmPeriodVO) |
| 4 | refund | 社保退款 | refund | decimal(31, 2) | √ | 数值 (UFDouble) |
| 5 | buckle | 社保补扣款 | buckle | decimal(31, 2) | √ | 数值 (UFDouble) |
| 6 | note | 备注 | note | varchar(2000) |  | 字符串 (String) |
| 7 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 8 | pk_org | 所属组织 | pk_org | varchar(20) | √ | 组织 (org) |
| 9 | creator | 创建人 | creator | varchar(20) | √ | 用户 (user) |
| 10 | creationtime | 创建时间 | creationtime | char(19) | √ | 日期时间 (UFDateTime) |
| 11 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 12 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |