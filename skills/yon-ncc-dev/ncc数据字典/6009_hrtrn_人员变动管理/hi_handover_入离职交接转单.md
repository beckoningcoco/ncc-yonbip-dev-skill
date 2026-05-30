# |<<

**入离职交接转单 (hi_handover / nccloud.dto.hryf.handover.HandoverVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2547.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_handover | 主键 | pk_handover | char(20) | √ | 主键 (UFID) |
| 2 | pk_bill | 单据 | pk_bill | varchar(20) | √ | 调配/离职申请单 (stapply) |
| 3 | pk_handitem | 办理事项 | pk_handitem | varchar(20) |  | 入离职细项 (handitem) |
| 4 | pk_linkman | 联系人 | pk_linkman | varchar(20) |  | 用户 (user) |
| 5 | ischeck | 核查 | ischeck | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | checker | 核查人 | checker | varchar(20) |  | 用户 (user) |
| 7 | checkdate | 核查日期 | checkdate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 8 | setmemo | 描述 | setmemo | varchar(50) |  | 字符串 (String) |
| 9 | memo | 备注 | memo | varchar(50) |  | 字符串 (String) |
| 10 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 11 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_人力资源组织 (hrorg) |
| 12 | pk_psndoc | 人员信息 | pk_psndoc | varchar(20) |  | 人员基本信息 (bd_psndoc) |
| 13 | pk_psnjob | 任职信息 | pk_psnjob | varchar(20) |  | 工作记录 (hi_psnjob) |
| 14 | pk_psndoc_ctrt | 合同信息 | pk_psndoc_ctrt | varchar(20) |  | 合同信息 (hi_psndoc_ctrt) |
| 15 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 16 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 17 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
| 18 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |