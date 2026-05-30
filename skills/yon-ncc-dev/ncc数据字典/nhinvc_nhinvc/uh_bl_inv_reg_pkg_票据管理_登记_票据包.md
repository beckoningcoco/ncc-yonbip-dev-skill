# |<<

**票据管理_登记_票据包 (uh_bl_inv_reg_pkg / com.yonyou.yh.nhis.bl.invc.vo.BlInvcRegPkgVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5940.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invregpk | 票据登记票据包主键 | pk_invregpk | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_invreg | 票据登记 | pk_invreg | varchar(20) |  | 票据管理_登记 (blinvcreg) |
| 5 | code_invreg | 票据包编码 | code_invreg | varchar(50) |  | 字符串 (String) |
| 6 | num_begin | 票据包开始号 | num_begin | varchar(50) |  | 字符串 (String) |
| 7 | num_end | 票据包结束号 | num_end | varchar(50) |  | 字符串 (String) |
| 8 | invcn | 票据包总张数 | invcn | int |  | 整数 (Integer) |
| 9 | invcn_iss | 已分发/领用张数 | invcn_iss | int |  | 整数 (Integer) |
| 10 | invcn_iss_able | 可领用张数 | invcn_iss_able | int |  | 整数 (Integer) |
| 11 | num_begin_iss | 可分发/领用号段开始号 | num_begin_iss | varchar(50) |  | 字符串 (String) |
| 12 | falg_iss | 可被领用标志 | falg_iss | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | invcn_ret | 退货总张数 | invcn_ret | int |  | 整数 (Integer) |
| 14 | invcn_canc | 作废总张数 | invcn_canc | int |  | 整数 (Integer) |
| 15 | eu_status | 票据包状态 | eu_status | int |  | 票据包状态 (invcpkgstatus) |  | 0=登记; |