# |<<

**临床_路径_服务 (bd_cp_srv / com.yonyou.yh.nhis.bd.cp.vo.CPathSrvVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/419.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cpsrv | 临床路径服务主键 | pk_cpsrv | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_cp | 路径 | pk_cp | varchar(20) |  | 临床_路径 (bdcpath) |
| 5 | pk_cppha | 路径阶段 | pk_cppha | varchar(20) |  | 临床_路径_阶段 (cppha) |
| 6 | sortno | 序号 | sortno | int |  | 整数 (Integer) |
| 7 | flag_cateorsrv | 服务分类或项目标志 | flag_cateorsrv | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | pk_srvcate | 服务分类 | pk_srvcate | varchar(50) |  | 字符串 (String) |
| 9 | pk_srv | 服务项目 | pk_srv | varchar(50) |  | 字符串 (String) |
| 10 | code_srv | 服务编码 | code_srv | varchar(50) |  | 字符串 (String) |
| 11 | flag_chose | 必选项 | flag_chose | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | note | 本路径下服务项目描述 | note | varchar(256) |  | 字符串 (String) |