# |<<

**组织结构_账簿合并体系成员_多版本 (org_bcsmember_v / nc.vo.vorg.BookCombineStruMemberVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4007.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vid | 成员版本主键 | pk_vid | char(20) | √ | 主键 (UFID) |
| 2 | pk_bcsmember | 账簿合并体系成员主键 | pk_bcsmember | varchar(20) | √ | 组织结构_账簿合并体系成员 (bookcombinestrumember) |
| 3 | pk_bcs | 账簿合并体系主键 | pk_bcs | varchar(20) |  | 组织结构_账簿合并体系 (bookcombinestru) |
| 4 | pk_org | 对应组织 | pk_org | varchar(20) |  | 组织_业务单元_报表组织 (reportorg) |
| 5 | pk_fatherorg | 上级组织 | pk_fatherorg | varchar(20) |  | 组织_业务单元_报表组织 (reportorg) |
| 6 | pk_fathermember | 上级成员 | pk_fathermember | varchar(20) |  | 组织结构_账簿合并体系成员_多版本 (bookcombinestrumember_v) |
| 7 | innercode | 内部编码 | innercode | varchar(50) |  | 字符串 (String) |
| 8 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) |  | 0=本级产生; |