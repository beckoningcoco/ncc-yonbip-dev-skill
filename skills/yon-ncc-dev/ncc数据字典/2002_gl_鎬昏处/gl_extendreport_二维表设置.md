# |<<

**二维表设置 (gl_extendreport / nc.vo.gl.gl_extendreport.Entity)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2417.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_extendreport | 二维表设置信息标识 | pk_extendreport | char(20) | √ | 二维表设置子表 (gl_extendreport_b) |
| 2 | reportcode | 编码 | reportcode | varchar(20) |  | 字符串 (String) |
| 3 | reportname | 名称 | reportname | varchar(100) |  | 字符串 (String) |
| 4 | rowsummaryflag | 行合计标志 | rowsummaryflag | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | colsummaryflag | 列合计标志 | colsummaryflag | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | applyrange | 使用范围 | applyrange | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | balanceorient | 余额方向 | balanceorient | char(2) |  | 主键 (UFID) |
| 8 | iscontainsub | 是否包含下级 | iscontainsub | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | commentary | 备注 | commentary | varchar(1000) |  | 字符串 (String) |
| 10 | pk_org | 财务组织 | pk_org | char(20) |  | 主键 (UFID) |
| 11 | pk_psndoc | 定义人 | pk_psndoc | char(20) |  | 主键 (UFID) |
| 12 | getdatamethod | 取数方式 | getdatamethod | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | pk_setofbook | 核算账簿 | pk_setofbook | varchar(20) |  | 账簿_账簿类型 (setofbook) |
| 14 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 15 | pk_accountingbook | 账簿类型 | pk_accountingbook | char(20) |  | 主键 (UFID) |
| 16 | issubextend | 是否列示下级 | issubextend | char(1) |  | 布尔类型 (UFBoolean) |
| 17 | subjversion | 科目版本 | subjversion | varchar(10) |  | 字符串 (String) |
| 18 | qryglorgbook | 按照主体账簿查 | qryglorgbook | char(1) |  | 布尔类型 (UFBoolean) |
| 19 | modifier | 修改人 | modifier | char(20) |  | 主键 (UFID) |
| 20 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 21 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
| 22 | creator | 创建人 | creator | char(20) |  | 主键 (UFID) |