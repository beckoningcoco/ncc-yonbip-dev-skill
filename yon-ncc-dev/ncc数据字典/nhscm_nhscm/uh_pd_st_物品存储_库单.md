# |<<

**物品存储_库单 (uh_pd_st / com.yonyou.yh.nhis.scm.uhpd.vo.ScmPdStVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6150.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pdst | 物品库单主键 | pk_pdst | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_dept_st | 库单部门 | pk_dept_st | varchar(20) |  | 组织_部门 (dept) |
| 5 | pk_stordoc_st | 仓库 | pk_stordoc_st | varchar(20) |  | 仓库 (stordoc) |
| 6 | pk_sttype | 业务类型 | pk_sttype | varchar(50) |  | 字符串 (String) |
| 7 | dt_sttype | 业务类型编码 | dt_sttype | varchar(50) |  | 字符串 (String) |
| 8 | code | 库单编码 | code | varchar(50) |  | 字符串 (String) |
| 9 | name | 库单名称 | name | varchar(50) |  | 字符串 (String) |
| 10 | direct | 出入库方向 | direct | int |  | 出入库方向 (DirectEnum) |  | 1=入库; |