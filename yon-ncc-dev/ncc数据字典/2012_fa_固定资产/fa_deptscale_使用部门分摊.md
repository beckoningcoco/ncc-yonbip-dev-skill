# |<<

**使用部门分摊 (fa_deptscale / nc.vo.fa.deptscale.DeptScaleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2016.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deptscale | 主键 | pk_deptscale | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | link_key | 连接值 | link_key | varchar(20) |  | 字符串 (String) |
| 4 | pk_dept | 部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 5 | pk_dept_v | 部门版本信息 | pk_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 6 | usescale | 比例 | usescale | decimal(16, 4) |  | 数值 (UFDouble) |
| 7 | totalscale | 比例总和 | totalscale | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |