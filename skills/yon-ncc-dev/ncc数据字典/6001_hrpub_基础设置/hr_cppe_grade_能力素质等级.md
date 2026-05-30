# |<<

**能力素质等级 (hr_cppe_grade / nc.vo.cp.graderule.GradeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2659.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cppe_grade | 能力素质等级主键 | pk_cppe_grade | char(20) | √ | 主键 (UFID) |
| 2 | pk_scorule | 等级组主键 | pk_scorule | char(20) |  | 主键 (UFID) |
| 3 | gradeseq | 等级级别 | gradeseq | int |  | 整数 (Integer) |
| 4 | pk_grade | 等级名称 | pk_grade | varchar(20) |  | 考评等级(自定义档案) (Defdoc-HR022_0xx) |
| 5 | gradedesc | 等级描述 | gradedesc | varchar(400) |  | 字符串 (String) |
| 6 | gradestandard | 评分标准 | gradestandard | varchar(400) |  | 字符串 (String) |
| 7 | remark | 备注 | remark | varchar(400) |  | 字符串 (String) |
| 8 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 9 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |