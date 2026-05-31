# |<<

**结算价格管理 (nresa_settlprice / nc.vo.nresa.insetprice.settlprice.SettlPriceVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3894.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_settlprice | 结算价格主键 | pk_settlprice | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 业务单元 | pk_org | varchar(20) | √ | 组织 (org) |
| 4 | pk_liabilitycenter | 利润中心 | pk_liabilitycenter | varchar(20) | √ | 利润中心 (profitcenter) |
| 5 | pk_settlpriclass | 结算价格分类 | pk_settlpriclass | varchar(20) |  | 结算价格分类 (settlpriclass) |
| 6 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 7 | pk_measdoc | 计量单位 | pk_measdoc | varchar(20) |  | 计量单位 (measdoc) |
| 8 | pk_material | 物料 | pk_material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 9 | price | 价格 | price | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | startdate | 生效日期 | startdate | char(19) |  | 日期(开始) (UFDateBegin) |
| 11 | enddate | 失效日期 | enddate | char(19) |  | 日期(结束) (UFDateEnd) |
| 12 | pk_original | 原始结算价格 | pk_original | varchar(50) |  | 字符串 (String) |
| 13 | ishisprice | 是否历史价格 | ishisprice | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | versionerrormsg | 版本化错误信息 | versionerrormsg | image |  | BLOB (BLOB) |
| 15 | pk_factor1 | 价格影响因素1 | pk_factor1 | varchar(101) |  | 自定义项 (Custom) |
| 16 | pk_factor2 | 价格影响因素2 | pk_factor2 | varchar(101) |  | 自定义项 (Custom) |
| 17 | pk_factor3 | 价格影响因素3 | pk_factor3 | varchar(101) |  | 自定义项 (Custom) |
| 18 | pk_factor4 | 价格影响因素4 | pk_factor4 | varchar(101) |  | 自定义项 (Custom) |
| 19 | pk_factor5 | 价格影响因素5 | pk_factor5 | varchar(101) |  | 自定义项 (Custom) |
| 20 | pk_factor6 | 价格影响因素6 | pk_factor6 | varchar(101) |  | 自定义项 (Custom) |
| 21 | pk_factor7 | 价格影响因素7 | pk_factor7 | varchar(101) |  | 自定义项 (Custom) |
| 22 | pk_factor8 | 价格影响因素8 | pk_factor8 | varchar(101) |  | 自定义项 (Custom) |
| 23 | pk_factor9 | 价格影响因素9 | pk_factor9 | varchar(101) |  | 自定义项 (Custom) |
| 24 | pk_factor10 | 价格影响因素10 | pk_factor10 | varchar(101) |  | 自定义项 (Custom) |
| 25 | pk_factor11 | 价格影响因素11 | pk_factor11 | varchar(101) |  | 自定义项 (Custom) |
| 26 | pk_factor12 | 价格影响因素12 | pk_factor12 | varchar(101) |  | 自定义项 (Custom) |
| 27 | pk_factor13 | 价格影响因素13 | pk_factor13 | varchar(101) |  | 自定义项 (Custom) |
| 28 | pk_factor14 | 价格影响因素14 | pk_factor14 | varchar(101) |  | 自定义项 (Custom) |
| 29 | pk_factor15 | 价格影响因素15 | pk_factor15 | varchar(101) |  | 自定义项 (Custom) |
| 30 | pk_factor16 | 价格影响因素16 | pk_factor16 | varchar(101) |  | 自定义项 (Custom) |
| 31 | pk_factor17 | 价格影响因素17 | pk_factor17 | varchar(101) |  | 自定义项 (Custom) |
| 32 | pk_factor18 | 价格影响因素18 | pk_factor18 | varchar(101) |  | 自定义项 (Custom) |
| 33 | pk_factor19 | 价格影响因素19 | pk_factor19 | varchar(101) |  | 自定义项 (Custom) |
| 34 | pk_factor20 | 价格影响因素20 | pk_factor20 | varchar(101) |  | 自定义项 (Custom) |
| 35 | pk_factor21 | 价格影响因素21 | pk_factor21 | varchar(101) |  | 自定义项 (Custom) |
| 36 | pk_factor22 | 价格影响因素22 | pk_factor22 | varchar(101) |  | 自定义项 (Custom) |
| 37 | pk_factor23 | 价格影响因素23 | pk_factor23 | varchar(101) |  | 自定义项 (Custom) |
| 38 | pk_factor24 | 价格影响因素24 | pk_factor24 | varchar(101) |  | 自定义项 (Custom) |
| 39 | pk_factor25 | 价格影响因素25 | pk_factor25 | varchar(101) |  | 自定义项 (Custom) |
| 40 | pk_factor26 | 价格影响因素26 | pk_factor26 | varchar(101) |  | 自定义项 (Custom) |
| 41 | pk_factor27 | 价格影响因素27 | pk_factor27 | varchar(101) |  | 自定义项 (Custom) |
| 42 | pk_factor28 | 价格影响因素28 | pk_factor28 | varchar(101) |  | 自定义项 (Custom) |
| 43 | pk_factor29 | 价格影响因素29 | pk_factor29 | varchar(101) |  | 自定义项 (Custom) |
| 44 | pk_factor30 | 价格影响因素30 | pk_factor30 | varchar(101) |  | 自定义项 (Custom) |
| 45 | pk_factor31 | 价格影响因素31 | pk_factor31 | varchar(101) |  | 自定义项 (Custom) |
| 46 | pk_factor32 | 价格影响因素32 | pk_factor32 | varchar(101) |  | 自定义项 (Custom) |
| 47 | pk_factor33 | 价格影响因素33 | pk_factor33 | varchar(101) |  | 自定义项 (Custom) |
| 48 | pk_factor34 | 价格影响因素34 | pk_factor34 | varchar(101) |  | 自定义项 (Custom) |
| 49 | pk_factor35 | 价格影响因素35 | pk_factor35 | varchar(101) |  | 自定义项 (Custom) |
| 50 | pk_factor36 | 价格影响因素36 | pk_factor36 | varchar(101) |  | 自定义项 (Custom) |
| 51 | pk_factor37 | 价格影响因素37 | pk_factor37 | varchar(101) |  | 自定义项 (Custom) |
| 52 | pk_factor38 | 价格影响因素38 | pk_factor38 | varchar(101) |  | 自定义项 (Custom) |
| 53 | pk_factor39 | 价格影响因素39 | pk_factor39 | varchar(101) |  | 自定义项 (Custom) |
| 54 | pk_factor40 | 价格影响因素40 | pk_factor40 | varchar(101) |  | 自定义项 (Custom) |
| 55 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 56 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 57 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 58 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 59 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 60 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 61 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 62 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 63 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 64 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 65 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 66 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 67 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 68 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |