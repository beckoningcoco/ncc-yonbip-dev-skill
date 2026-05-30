# |<<

**医疗执行_部门_标本采集_条形码 (uh_ex_dept_labcoll_bc / com.yonyou.yh.nhis.ex.mt.vo.DeptMTLabItemBCVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6067.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_labcollbc | 标本条形码主键 | pk_labcollbc | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(50) |  | 字符串 (String) |
| 4 | pk_labcoll | 标本采集 | pk_labcoll | varchar(20) |  | 医疗执行_部门_标本采集 (deptmtapplabitem) |
| 5 | barcode | 条形码 | barcode | varchar(50) |  | 字符串 (String) |