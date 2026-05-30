# |<<

**临床_路径_文档 (bd_cp_ecd / com.yonyou.yh.nhis.bd.cp.vo.CPathEcdVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/417.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cpecd | 临床路径文书主键 | pk_cpecd | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_cp | 路径编码 | pk_cp | varchar(20) |  | 临床_路径 (bdcpath) |
| 5 | pk_cppha | 路径阶段 | pk_cppha | varchar(20) |  | 临床_路径_阶段 (cppha) |
| 6 | sortno | 序号 | sortno | int |  | 整数 (Integer) |
| 7 | flag_ecdorcate | 文书或文书分类标志 | flag_ecdorcate | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | pk_ecdcate | 临床文书分类 | pk_ecdcate | varchar(20) |  | 问卷 (uh_qs_form) |
| 9 | pk_ecdtemp | 临床文书 | pk_ecdtemp | varchar(20) |  | 医疗记录模板 (emrtemplate) |
| 10 | flag_chose | 必选项 | flag_chose | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | note | 本路径下文书规范描述 | note | varchar(256) |  | 字符串 (String) |