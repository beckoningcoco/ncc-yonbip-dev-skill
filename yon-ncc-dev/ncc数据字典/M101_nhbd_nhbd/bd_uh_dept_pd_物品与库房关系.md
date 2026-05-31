# |<<

**物品与库房关系 (bd_uh_dept_pd / com.yonyou.yh.nhis.bd.uhdeptpd.vo.UHDeptPdVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1025.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deptpd | 库房与物品关系主键 | pk_deptpd | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_dept | 库房 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 5 | pk_pd | 物品 | pk_pd | varchar(50) |  | 字符串 (String) |
| 6 | pk_pdcate | 物品分类 | pk_pdcate | varchar(20) |  | 医疗物品分类 (PdCateVO) |
| 7 | unit | 包装单位_基本 | unit | varchar(50) |  | 字符串 (String) |
| 8 | val_pu_bas | 数值_基本 | val_pu_bas | decimal(14, 2) |  | 数值 (UFDouble) |
| 9 | val_pu_max | 最大值_基本 | val_pu_max | decimal(14, 2) |  | 数值 (UFDouble) |
| 10 | val_pu_min | 最小值_基本 | val_pu_min | decimal(14, 2) |  | 数值 (UFDouble) |
| 11 | sortno | 在本部门位置编码 | sortno | varchar(50) |  | 字符串 (String) |
| 12 | flag_stop | 停用 | flag_stop | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | pk_org_v | 组织多版本 | pk_org_v | varchar(20) |  | 组织_业务单元_医卫版本 (hisorg_v) |
| 14 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 15 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 16 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 17 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |