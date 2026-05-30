# |<<

**固定收费项目维护 (bd_uh_daycg_set / com.yonyou.yh.nhis.bd.phcosts.vo.PdCgSetVo)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1022.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_daycgset | 固定收费套主键 | pk_daycgset | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_dept | 对应科室 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 5 | eu_daycgsettype | 固定收费套范围 | eu_daycgsettype | varchar(50) |  | 固定收费套范围 (CostArea) |  | 0=全院范围; |