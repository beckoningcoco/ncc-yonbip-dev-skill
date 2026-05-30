# |<<

**异动类型关联流程 (hr_trnstype_flow / nc.vo.hi.trnstype.TrnstypeFlowVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2701.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_trnstypeflow | 主键 | pk_trnstypeflow | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_trnstype | 所属异动类型 | pk_trnstype | varchar(20) |  | 异动类型 (trnstype) |
| 4 | pk_transtype | 审批流程 | pk_transtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 5 | pk_businesstype | 业务流程 | pk_businesstype | varchar(20) |  | 业务流程 (BusitypeVO) |
| 6 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 7 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 8 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
| 9 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |