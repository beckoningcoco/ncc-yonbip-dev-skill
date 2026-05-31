# |<<

**凭证最大号 (gl_vouchermaxno / nc.vogl.vouchermaxno.vouchermaxno)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2507.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vouchermaxno | 主键 | pk_vouchermaxno | char(20) | √ | 主键 (UFID) |
| 2 | pk_accountingbook | 主体账簿主键 | pk_accountingbook | char(20) |  | 主键 (UFID) |
| 3 | pk_vouchertype | 凭证类别 | pk_vouchertype | char(20) |  | 主键 (UFID) |
| 4 | year | 年度 | year | char(4) |  | 主键 (UFID) |
| 5 | period | 期间 | period | char(2) |  | 主键 (UFID) |
| 6 | maxno | 凭证最大号 | maxno | int |  | 整数 (Integer) |
| 7 | pk_group | 所属集团 | pk_group | varchar(50) |  | 字符串 (String) |
| 8 | pk_financeorg | 所属财务组织 | pk_financeorg | varchar(50) |  | 字符串 (String) |