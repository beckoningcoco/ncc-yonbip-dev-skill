# |<<

**医疗服务类型排序 (bd_uh_ctr_table / com.yonyou.nhis.bd.pub2.srvtype.vo.CtrTableVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1021.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_srvctrord | 服务类型排序主键 | pk_srvctrord | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 3 | pk_org | 所属机构 | pk_org | char(20) |  | 主键 (UFID) |
| 4 | name_group | 集团名称 | name_group | varchar(150) |  | 字符串 (String) |
| 5 | name_org | 机构名称 | name_org | varchar(150) |  | 字符串 (String) |
| 6 | name_pvtype | 就诊类型名称 | name_pvtype | varchar(50) |  | 字符串 (String) |
| 7 | code_pvtype | 就诊类型编码 | code_pvtype | varchar(50) |  | 字符串 (String) |
| 8 | pk_pvtype | 就诊类型 | pk_pvtype | char(20) |  | 主键 (UFID) |
| 9 | code_table | 表格编码 | code_table | varchar(50) |  | 字符串 (String) |
| 10 | name_table | 物品标志 | name_table | varchar(50) |  | 字符串 (String) |
| 11 | desc_col | 排序 | desc_col | varchar(200) |  | 字符串 (String) |
| 12 | desc_domain | 排序域 | desc_domain | varchar(50) |  | 字符串 (String) |