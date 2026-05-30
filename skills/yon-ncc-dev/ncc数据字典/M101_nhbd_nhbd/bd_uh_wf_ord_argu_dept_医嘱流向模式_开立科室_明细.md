# |<<

**医嘱流向模式_开立科室_明细 (bd_uh_wf_ord_argu_dept / com.yonyou.yh.nhis.bd.wf.vo.WfOrdArguDeptVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1142.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wfargudept | 模式科室明细主键 | pk_wfargudept | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_org_exec | 执行机构 | pk_org_exec | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 5 | pk_dept | 执行科室 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 6 | flag_maj | 主科室标识 | flag_maj | char(1) |  | 布尔类型 (UFBoolean) |