# |<<

**队列管理_队列定义 (bd_uh_que / nc.vo.nhbd.wf.UhBDQueVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1096.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_que | 队列主键 | pk_que | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | pk_pvques | 所属队列管理台 | pk_pvques | varchar(20) |  | 队列管理台维护 (UhBDQuesVO) |
| 6 | pk_quetype | 队列类型 | pk_quetype | varchar(20) |  | 队列类型(自定义档案) (Defdoc-020007) |
| 7 | dt_quetype | 队列类型编码 | dt_quetype | varchar(50) |  | 字符串 (String) |
| 8 | pk_dept | 队列所属部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 9 | code_que | 队列编码 | code_que | varchar(30) |  | 字符串 (String) |
| 10 | name_que | 队列名称 | name_que | varchar(50) |  | 字符串 (String) |
| 11 | pk_res | 排班资源 | pk_res | varchar(50) |  | 字符串 (String) |
| 12 | pk_schsrv | 排班服务 | pk_schsrv | varchar(50) |  | 字符串 (String) |
| 13 | addr_board | 对应屏幕地址 | addr_board | varchar(256) |  | 字符串 (String) |
| 14 | flag_quesite | 工作点队列标志 | flag_quesite | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | enablestate | 启用标志 | enablestate | char(1) |  | 布尔类型 (UFBoolean) |
| 16 | quan_limit | 申请限制量 | quan_limit | int |  | 整数 (Integer) |
| 17 | pk_pvquerule | 队列分诊规则 | pk_pvquerule | varchar(20) |  | 就诊队列_分诊规则 (uhbdquerule) |
| 18 | maketime | 制单时间 | maketime | char(19) |  | 日期时间 (UFDateTime) |
| 19 | lastmaketime | 最后修改时间 | lastmaketime | char(19) |  | 日期时间 (UFDateTime) |
| 20 | billno | 单据号 | billno | varchar(50) |  | 字符串 (String) |
| 21 | busitype | 业务类型 | busitype | varchar(50) |  | 字符串 (String) |
| 22 | billmaker | 制单人 | billmaker | varchar(20) |  | 用户 (user) |
| 23 | approver | 审批人 | approver | varchar(20) |  | 用户 (user) |
| 24 | approvestatus | 审批状态 | approvestatus | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |