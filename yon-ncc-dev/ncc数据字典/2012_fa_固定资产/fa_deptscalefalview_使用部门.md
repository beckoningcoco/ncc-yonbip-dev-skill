# |<<

**使用部门 (fa_deptscalefalview / nc.vo.fa.asset.DeptscaleViewVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2017.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deptscale | 主键 | pk_deptscale | char(20) | √ | 主键 (UFID) |
| 2 | pk_dept | 部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 3 | pk_dept_v | 部门版本信息 | pk_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 4 | usescale | 比例 | usescale | decimal(28, 8) |  | 数值 (UFDouble) |
| 5 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 6 | totalscale | 比例总和 | totalscale | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | link_key | 连接值 | link_key | varchar(20) |  | 字符串 (String) |
| 8 | pk_card | 卡片主键 | pk_card | char(20) |  | 主键 (UFID) |