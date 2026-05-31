# |<<

**科室医疗文书配置 (bd_dept_need_emr / com.yonyou.yh.nhis.bd.deptemr.vo.DeptEmrVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/790.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deptneedemr | 科室文书配置主键 | pk_deptneedemr | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_org_use | 使用科室 | pk_org_use | varchar(20) |  | 组织_部门 (dept) |
| 5 | pk_emrtemp | 医疗记录模版外键 | pk_emrtemp | varchar(20) |  | 医疗记录模板 (emrtemplate) |
| 6 | min_write_times | 最少书写次数 | min_write_times | int |  | 整数 (Integer) |
| 7 | max_write_times | 最大书写次数 | max_write_times | int |  | 整数 (Integer) |