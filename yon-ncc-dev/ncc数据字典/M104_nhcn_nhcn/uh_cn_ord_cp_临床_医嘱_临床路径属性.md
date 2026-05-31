# |<<

**临床_医嘱_临床路径属性 (uh_cn_ord_cp / com.yonyou.yh.nhis.cn.ord.v2.vo.CNOrdCPathVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6020.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ordcp | 医嘱临床路径主键 | pk_ordcp | char(20) | √ | 主键 (UFID) |
| 2 | pk_ord | 医嘱 | pk_ord | varchar(20) |  | 临床_医嘱 (cnorder) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 5 | pk_cp | 临床路径 | pk_cp | varchar(20) |  | 临床_路径 (cncpath) |
| 6 | pk_cpphase | 临床路径阶段 | pk_cpphase | varchar(20) |  | 临床_路径_阶段 (cncpathphase) |
| 7 | pk_cpsrv | 临床路径服务 | pk_cpsrv | varchar(20) |  | 临床_路径_服务 (cncpathsrv) |
| 8 | note | 本次临床路径描述 | note | varchar(4000) |  | 字符串 (String) |
| 9 | def1 | 自定义项1 | def1 | varchar(100) |  | 字符串 (String) |
| 10 | def2 | 自定义项2 | def2 | varchar(100) |  | 字符串 (String) |
| 11 | def3 | 自定义项3 | def3 | varchar(100) |  | 字符串 (String) |
| 12 | def4 | 自定义项4 | def4 | varchar(100) |  | 字符串 (String) |
| 13 | def5 | 自定义项5 | def5 | varchar(100) |  | 字符串 (String) |
| 14 | def6 | 自定义项6 | def6 | varchar(100) |  | 字符串 (String) |
| 15 | def7 | 自定义项7 | def7 | varchar(100) |  | 字符串 (String) |
| 16 | def8 | 自定义项8 | def8 | varchar(100) |  | 字符串 (String) |
| 17 | def9 | 自定义项9 | def9 | varchar(100) |  | 字符串 (String) |
| 18 | def10 | 自定义项10 | def10 | varchar(100) |  | 字符串 (String) |