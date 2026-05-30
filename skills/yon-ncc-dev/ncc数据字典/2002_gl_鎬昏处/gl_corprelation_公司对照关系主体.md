# |<<

**公司对照关系主体 (gl_corprelation / nc.vo.gl.corprelation.corprelation)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2395.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_group | 所属集团 | pk_group | varchar(50) |  | 字符串 (String) |
| 2 | pk_glorgcorp | 录入对账关系的主体账簿 | pk_glorgcorp | char(20) |  | 主键 (UFID) |
| 3 | relationcode | 科目对应关系设置编号 | relationcode | varchar(10) |  | 字符串 (String) |
| 4 | relationname | 科目对应关系设置名称 | relationname | varchar(100) |  | 字符串 (String) |
| 5 | pk_selfglbook | 本方帐簿 | pk_selfglbook | char(20) |  | 主键 (UFID) |
| 6 | pk_selfglorg | 本方主体 | pk_selfglorg | char(20) |  | 主键 (UFID) |
| 7 | pk_otherglbook | 对方帐簿 | pk_otherglbook | char(20) |  | 主键 (UFID) |
| 8 | pk_otherglorg | 对方主体 | pk_otherglorg | char(20) |  | 主键 (UFID) |
| 9 | pk_otherglorgbook | 对方主体帐簿 | pk_otherglorgbook | char(20) |  | 主键 (UFID) |
| 10 | pk_selfglorgbook | 本方主体帐簿 | pk_selfglorgbook | char(20) |  | 主键 (UFID) |
| 11 | pk_contrastrule | 对账规则设置 | pk_contrastrule | char(20) |  | 主键 (UFID) |
| 12 | contrastmethod | 余额对账方式 | contrastmethod | char(20) |  | 主键 (UFID) |
| 13 | isnouse | 是否停用 | isnouse | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | islocalcur | 本币对账 | islocalcur | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | iscur | 原币对账 | iscur | char(1) |  | 布尔类型 (UFBoolean) |
| 16 | includefvall | 辅助项为空即包含所有 | includefvall | char(1) |  | 布尔类型 (UFBoolean) |
| 17 | includeuntally | 包含未记帐 | includeuntally | char(1) |  | 布尔类型 (UFBoolean) |
| 18 | pubflag | 公有标记 | pubflag | char(1) |  | 布尔类型 (UFBoolean) |
| 19 | pk_org | 录入组织 | pk_org | varchar(50) |  | 字符串 (String) |