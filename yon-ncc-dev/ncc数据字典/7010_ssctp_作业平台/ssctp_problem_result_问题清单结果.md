# |<<

**问题清单结果 (ssctp_problem_result / nc.vo.ssctp.ssccheck.ProblemResultVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5660.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_problem_result | 主键 | pk_problem_result | char(20) | √ | 主键 (UFID) |
| 2 | pk_problem | 问题 | pk_problem | varchar(20) |  | 审核问题事项 (sscbd_problem_matter) |
| 3 | pk_points | 要点 | pk_points | varchar(20) |  | 审核要点主表 (sscbd_point) |
| 4 | priority | 问题优先级 | priority | varchar(50) |  | 字符串 (String) |
| 5 | remarks | 问题备注 | remarks | text(0) |  | BLOB (BLOB) |
| 6 | problem | 问题描述 | problem | varchar(200) |  | 字符串 (String) |
| 7 | actiontype | 动作类型 | actiontype | varchar(50) |  | 动作类型 (actiontype) |  | create=创建; |