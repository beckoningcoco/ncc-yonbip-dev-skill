# |<<

**医疗记录数据组 (bd_emr_dg / com.yonyou.yh.nhis.bd.emr.vo.EmrDgVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/815.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_emrdg | 医疗记录数据组主键 | pk_emrdg | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_emrdgtype | 数据组类型 | pk_emrdgtype | varchar(20) |  | 数据组类型(自定义档案) (Defdoc-060309) |
| 5 | dt_emrdgtype | 数据组类型编码 | dt_emrdgtype | varchar(50) |  | 字符串 (String) |
| 6 | eu_emrdgfmt | 数据组格式分类 | eu_emrdgfmt | int |  | 数据组格式分类 (emrdgfmtenum) |  | 0=多列单记录; |