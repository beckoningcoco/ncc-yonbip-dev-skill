# |<<

**审核要点细节 (ssctp_points_result / nc.vo.ssctp.ssccheck.PointsResultVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5656.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_points_result | 主键 | pk_points_result | char(20) | √ | 主键 (UFID) |
| 2 | pk_points | 要点 | pk_points | varchar(20) |  | 审核要点主表 (sscbd_point) |
| 3 | points | 要点描述 | points | varchar(200) |  | 字符串 (String) |
| 4 | points_classification | 要点分类 | points_classification | varchar(20) |  | 审核要点分类表 (sscbd_point_class) |
| 5 | auto_inspection | 是否自动检查 | auto_inspection | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | ruleinfo | 规则信息 | ruleinfo | text(0) |  | BLOB (BLOB) |
| 7 | ispass | 是否通过 | ispass | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | pk_problem | 问题 | pk_problem | varchar(20) |  | 审核问题事项 (sscbd_problem_matter) |