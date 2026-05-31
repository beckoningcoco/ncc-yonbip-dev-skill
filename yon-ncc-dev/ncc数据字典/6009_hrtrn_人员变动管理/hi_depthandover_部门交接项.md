# |<<

**部门交接项 (hi_depthandover / nccloud.dto.hryf.handover.DeptHandoverVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2537.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_depthandover | 主键 | pk_depthandover | char(20) | √ | 主键 (UFID) |
| 2 | checkdate | 审核日期 | checkdate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 3 | handoverdate | 交接日期 | handoverdate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 4 | checker | 审核人 | checker | varchar(20) |  | 用户 (user) |
| 5 | handoverman | 交接人 | handoverman | varchar(200) |  | 字符串 (String) |
| 6 | item | 交接内容 | item | varchar(200) |  | 字符串 (String) |
| 7 | pk_bill | 单据 | pk_bill | varchar(20) |  | 调配/离职申请单 (stapply) |