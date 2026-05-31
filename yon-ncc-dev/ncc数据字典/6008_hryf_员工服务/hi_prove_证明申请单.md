# |<<

**证明申请单 (hi_prove / nccloud.dto.hryf.prove.ProveVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2551.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_prove | 主键 | pk_prove | char(20) | √ | 主键 (UFID) |
| 2 | bill_code | 单据编码 | bill_code | varchar(50) |  | 字符串 (String) |
| 3 | prove_type | 证明类型 | prove_type | varchar(20) |  | 证明类型(自定义档案) (Defdoc-HRGX0002_0xx) |
| 4 | receive_address | 领取地点 | receive_address | varchar(20) |  | 领取地点(自定义档案) (Defdoc-HRGX0004_0xx) |
| 5 | prove_purpose | 证明用途 | prove_purpose | varchar(20) |  | 证明用途(自定义档案) (Defdoc-HRGX0003_0xx) |
| 6 | remark | 备注 | remark | varchar(200) |  | 字符串 (String) |
| 7 | billmaker | 申请人 | billmaker | varchar(20) |  | 用户 (user) |
| 8 | dealer | 办理人 | dealer | varchar(20) |  | 用户 (user) |
| 9 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_业务单元_人力资源组织 (hrorg) |
| 10 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 11 | apply_data | 申请日期 | apply_data | char(19) |  | 日期时间 (UFDateTime) |
| 12 | pk_billtype | 单据类型 | pk_billtype | varchar(50) | √ | 字符串 (String) |
| 13 | approver | 审批人 | approver | varchar(20) |  | 用户 (user) |
| 14 | approve_time | 审批时间 | approve_time | char(19) |  | 日期时间 (UFDateTime) |
| 15 | approve_note | 审批批语 | approve_note | varchar(50) |  | 字符串 (String) |
| 16 | approve_state | 审批状态 | approve_state | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |