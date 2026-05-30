# |<<

**临床_路径_阶段 (bd_cp_pha / com.yonyou.yh.nhis.bd.cp.vo.CPathPhaVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/418.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cppha | 临床路径阶段主键 | pk_cppha | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_cp | 临床路径 | pk_cp | varchar(20) |  | 临床_路径 (bdcpath) |
| 5 | pk_cpphatype | 阶段类型 | pk_cpphatype | varchar(20) |  | 临床路径阶段类型(自定义档案) (Defdoc-060403) |
| 6 | dt_cpphatype | 阶段类型编码 | dt_cpphatype | varchar(50) |  | 字符串 (String) |
| 7 | code | 阶段编码 | code | varchar(50) |  | 字符串 (String) |
| 8 | name | 阶段名称 | name | varchar(50) |  | 字符串 (String) |
| 9 | days | 天数 | days | int |  | 整数 (Integer) |