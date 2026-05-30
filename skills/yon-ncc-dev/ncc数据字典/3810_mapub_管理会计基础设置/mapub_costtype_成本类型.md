# |<<

**成本类型 (mapub_costtype / nc.vo.mapub.costtype.entity.CostTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3592.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | ccosttypeid | 成本类型 | ccosttypeid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 业务单元 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | vcosttypecode | 成本类型编码 | vcosttypecode | varchar(40) |  | 字符串 (String) |
| 5 | vcosttypename | 成本类型名称 | vcosttypename | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | bscrapfactor | 是否考虑废品系数 | bscrapfactor | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | bshrinkfactor | 是否考虑损耗系数 | bshrinkfactor | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | pk_elementsystem | 核算要素体系 | pk_elementsystem | varchar(20) |  | 责任会计_要素体系 (elementsystem) |
| 9 | pk_factorchart | 核算要素表 | pk_factorchart | varchar(20) |  | 要素表 (FactorChart) |
| 10 | pk_materialdocview | 要素与物料对照表 | pk_materialdocview | varchar(20) |  | 对照表 (docview) |
| 11 | pk_activitydocview | 要素与作业对照表 | pk_activitydocview | varchar(20) |  | 对照表 (docview) |
| 12 | vmaterialpricesourcenum | 材料价格来源数 | vmaterialpricesourcenum | varchar(500) |  | 字符串 (String) |
| 13 | vcostpricesourcenum | 费用价格来源数 | vcostpricesourcenum | varchar(500) |  | 字符串 (String) |
| 14 | cbeginmonth | 生效日期 | cbeginmonth | char(19) |  | 日期 (UFDate) |
| 15 | cendmonth | 失效日期 | cendmonth | char(19) |  | 日期 (UFDate) |
| 16 | bdefault | 是否默认 | bdefault | char(1) |  | 布尔类型 (UFBoolean) |
| 17 | bcompute | 是否已计算 | bcompute | char(1) |  | 布尔类型 (UFBoolean) |
| 18 | bdistribute | 是否已分配 | bdistribute | char(1) |  | 布尔类型 (UFBoolean) |
| 19 | bcreatetable | 是否已生成库 | bcreatetable | char(1) |  | 布尔类型 (UFBoolean) |
| 20 | vnote | 备注 | vnote | varchar(1024) |  | 字符串 (String) |
| 21 | pk_setofbook | 账簿类型 | pk_setofbook | varchar(20) |  | 账簿_账簿类型 (setofbook) |
| 22 | pk_accbook | 核算账簿 | pk_accbook | varchar(20) |  | 账簿_核算账簿 (accbook) |
| 23 | accounttype | 核算类别 | accounttype | int |  | 核算类别 (AccountTypeEnum) | 2 | 1=核算; |