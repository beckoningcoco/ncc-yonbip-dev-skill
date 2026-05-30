# |<<

**质量不合格类型关联检验项目明细 (qc_rejecttype_b / nc.voqc.qc_rejecttype_b.qc_rejecttype_b)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4856.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rejecttype_b | 明细主键 | pk_rejecttype_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_rejecttype | 质量不合格类型主键 | pk_rejecttype | varchar(20) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 质检中心 | pk_org | varchar(20) |  | 组织_业务单元_质检中心 (qccenter) |
| 5 | pk_checkitem | 检验项目 | pk_checkitem | varchar(20) |  | 检验项目 (qc_checkitem) |