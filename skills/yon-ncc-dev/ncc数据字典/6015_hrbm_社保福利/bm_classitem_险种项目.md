# |<<

**险种项目 (bm_classitem / nc.vo.bm.bmclass.BmClassItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1222.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_classitem | 险种项目主键 | pk_classitem | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 人力资源组织 (hrhrorg) |
| 4 | pk_bm_class | 险种主键 | pk_bm_class | varchar(20) |  | 险种 (bmclass) |
| 5 | cyear | 险种年度 | cyear | varchar(50) |  | 字符串 (String) |
| 6 | cperiod | 险种期间 | cperiod | varchar(50) |  | 字符串 (String) |
| 7 | pk_bm_item | 公共项目主键 | pk_bm_item | varchar(20) |  | 公共险种项目 (bmitem) |
| 8 | itemkey | 公共项目字段 | itemkey | varchar(20) |  | 字符串 (String) |
| 9 | name | 名称 | name | varchar(50) |  | 多语文本 (MultiLangText) |
| 10 | vformula | 公式 | vformula | varchar(2500) |  | 字符串 (String) |
| 11 | vformulastr | 公式显示 | vformulastr | varchar(2500) |  | 字符串 (String) |
| 12 | icomputeseq | 计算顺序 | icomputeseq | int |  | 整数 (Integer) |
| 13 | idisplayseq | 显示顺序 | idisplayseq | int |  | 整数 (Integer) | 0 |
| 14 | istransfer | 是否结转 | istransfer | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | destitempk | 结转目标项目主键 | destitempk | varchar(20) |  | 险种项目 (bmclassitem) |
| 16 | destitemcol | 结转目标项目列名 | destitemcol | varchar(5) |  | 字符串 (String) |
| 17 | showflag | 是否显示 | showflag | char(1) |  | 布尔类型 (UFBoolean) |
| 18 | issysformula | 是否系统默认公式 | issysformula | char(1) |  | 布尔类型 (UFBoolean) |
| 19 | round_type | 舍位方式 | round_type | int | √ | 舍位方式 (BmRoundType) | 0 | 8=四舍五入到分; |