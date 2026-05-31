# NC65 数据字典索引

> 来源：NCC65 数据字典 CHM，共 **179** 个模块、**5312** 张表
> 用途：开发时快速定位表名和 VO 类
> 详细字段信息（字段编码/字段类型/引用模型等）请查阅完整 MD 文件：`C:\Users\34928\WorkBuddy\20260424104648\ncc65_datadict_md\{模块编码} {模块名称}.md`
> 例如：`C:\Users\34928\WorkBuddy\20260424104648\ncc65_datadict_md\so 销售管理.md`

## 供应链（39 模块，1212 表）

### bc 条码管理（10 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `bc_barcodelabel` | 条码标签 | `bc.barcodelabel.entity.BarcodeLabelHeadVO` |
| `bc_labelassign` | 条形码标签分配 | `bc.labelassign.entity.AssignVO` |
| `bc_log` | 日志表 | `bcsi.entity.Log` |
| `bc_print` | 条码打印清单 | `application.bcprint.entity.BCPrintVO` |
| `bc_sendrule` | 转换规则头 | `bcsi.entity.BcsiRuleHVO` |
| `bc_sendrule_b` | 转换规则明细 | `bcsi.entity.BcsiRuleBVO` |
| `bc_sendrule_m` | 转换xml配置 | `bcsi.entity.BcsiRuleMVO` |
| `bc_sendtype` | 发送类型头 | `bcsi.entity.BcsiTypeHVO` |
| `bc_sendtype_b` | 发送类型明细 | `bcsi.entity.BcsiTypeBVO` |
| `bcbd_abstractmaterial` | 物料（条码） | `bcbd.abstractmaterial.AbstractMaterialVO` |

### bcbd 条码管理（20 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `bcbd_BodyBill` | 单据（条码）子表 | `bcbd.abstractbill.BodyBillVO` |
| `bcbd_SubBodyBill` | 单据（条码）孙表 | `bcbd.abstractbill.SubBodyBillVO` |
| `bcbd_abstractbill` | 单据（条码） | `bcbd.abstractbill.AbstractBillVO` |
| `bcbd_abstractmaterial` | 物料（条码） | `bcbd.abstractmaterial.AbstractMaterialVO` |
| `bcbd_attrclass` | 属性分类 | `bcbd.attrclass.AttrClassVO` |
| `bcbd_attrmap` | 适用对象属性映射 | `bcbd.bartype.AttrMapVO` |
| `bcbd_barappobject` | 条码应用对象 | `bcbd.barappobject.BarAppObjectVO` |
| `bcbd_barappobject_item` | 条码应用对象属性 | `bcbd.barappobject.BarAppObjectItemVO` |
| `bcbd_barcodedict` | 条码字典 | `bcbd.barcodedict.BarCodeDictVO` |
| `bcbd_barcodedict_b` | 条码字典明细 | `bcbd.barcodedict.BarCodeDictBodyVO` |
| `bcbd_barcoderule` | 条码规则 (多版本) | `bcbd.barcoderule.BarCodeRuleVO` |
| `bcbd_barcoderule_v` | 条码规则 | `bcbd.barcoderule.BarCodeRuleVersionVO` |
| `bcbd_barcoderuleitem` | 条码规则定义 | `bcbd.barcoderule.BarCodeRuleItemVO` |
| `bcbd_bartype` | 条码类型 | `bcbd.bartype.BarTypeVO` |
| `bcbd_billbarcoderuledist` | 单据条码规则分配 | `bcbd.barcoderuledist.BillBCRuleDistributionVO` |
| `bcbd_btcheckrule` | 条码类型校验规则 | `bcbd.bartype.BTCheckRuleVO` |
| `bcbd_checkrulelist` | 校验规则表 | `bcbd.bartype.BTRuleListVO` |
| `bcbd_matbarcoderuledist` | 物料条码规则分配 | `bcbd.barcoderuledist.MatBCRuleDistributionVO` |
| `bcbd_referobj` | 适用对象 | `bcbd.bartype.ReferObjVO` |
| `bcbd_strategyreg` | 条码策略注册 | `bcbd.strategyreg.StrategyRegVO` |

### credit 销售信用（16 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `accountcheckmessage` | 超账期检查提示信息 | `credit.accountcheck.entity.AccountCheckMessage` |
| `creditcheckmessage` | 信用检查提示信息 | `credit.creditcheck.entity.CreditCheckMessage` |
| `creditqueryinfo` | 单据信用查询 | `credit.billcreditquery.BillCreditQueryVO` |
| `so_accountmny` | 应收余额表 | `credit.engrossmaintain.entity.AccountMnyVO` |
| `so_accountmny_d` | 应收日发生表 | `credit.engrossmaintain.entity.AccountMnyDVO` |
| `so_accountmny_m` | 应收月余额表 | `credit.engrossmaintain.entity.AccountMnyMVO` |
| `so_accountmny_p` | 应收过程表 | `credit.engrossmaintain.entity.AccountMnyPVO` |
| `so_creditamount` | 信用额度 | `credit.creditamount.entity.CreditAmountVO` |
| `so_creditaudit` | 信用额度审批单主实体 | `credit.creditaudit.entity.CreditAuditHVO` |
| `so_creditaudit_b` | 信用额度审批单子实体 | `credit.creditaudit.entity.CreditAuditBVO` |
| `so_limitlevel` | 信用等级额度实体 | `credit.limitlevel.entity.LimitLevelVO` |
| `so_limittype` | 额度类型表 | `credit.limittype.entity.LimitTypeHVO` |
| `so_limittype_btype` | 额度类型子表-订单类型 | `credit.limittype.entity.LimitTypeBtypeVO` |
| `so_limittype_ctype` | 额度类型子表-渠道类型 | `credit.limittype.entity.LimitTypeCtypeVO` |
| `so_limittype_prc` | 额度类型子表-产品线 | `credit.limittype.entity.LimitTypePrcVO` |
| `so_limittypeview` | 额度设置显示VO | `credit.limittype.entity.display.LimitTypeViewVO` |

### ct 合同管理（36 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `ct_ap` | 其他付合同 | `ct.ap.entity.CtApVO` |
| `ct_ap_b` | 合同基本 | `ct.ap.entity.CtApBVO` |
| `ct_ap_change` | 变更历史 | `ct.ap.entity.CtApChangeVO` |
| `ct_ap_exec` | 执行过程 | `ct.ap.entity.CtApExecVO` |
| `ct_ap_exp` | 合同费用 | `ct.ap.entity.CtApExpVO` |
| `ct_ap_memora` | 合同大事记 | `ct.ap.entity.CtApMemoraVO` |
| `ct_ap_term` | 合同条款 | `ct.ap.entity.CtApTermVO` |
| `ct_ar` | 其他收合同 | `ct.ar.entity.CtArVO` |
| `ct_ar_b` | 合同基本 | `ct.ar.entity.CtArBVO` |
| `ct_ar_change` | 变更历史 | `ct.ar.entity.CtArChangeVO` |
| `ct_ar_exec` | 执行过程 | `ct.ar.entity.CtArExecVO` |
| `ct_ar_exp` | 合同费用 | `ct.ar.entity.CtArExpVO` |
| `ct_ar_memora` | 合同大事记 | `ct.ar.entity.CtArMemoraVO` |
| `ct_ar_term` | 合同条款 | `ct.ar.entity.CtArTermVO` |
| `ct_business` | 合同交易类型 | `ct.business.entity.BusinessSetVO` |
| `ct_payplan` | 付款计划 | `ct.purdaily.entity.PayPlanVO` |
| `ct_price` | 合同价格信息主表 | `ct.price.entity.CtPriceHeaderVO` |
| `ct_price_b` | 合同价格信息子表 | `ct.price.entity.CtPriceBodyVO` |
| `ct_pu` | 采购合同 | `ct.purdaily.entity.CtPuVO` |
| `ct_pu_b` | 合同基本 | `ct.purdaily.entity.CtPuBVO` |
| `ct_pu_change` | 变更历史 | `ct.purdaily.entity.CtPuChangeVO` |
| `ct_pu_exec` | 执行过程 | `ct.purdaily.entity.CtPuExecVO` |
| `ct_pu_exp` | 合同费用 | `ct.purdaily.entity.CtPuExpVO` |
| `ct_pu_memora` | 合同大事记 | `ct.purdaily.entity.CtPuMemoraVO` |
| `ct_pu_payment` | 合同付款协议 | `ct.purdaily.entity.CtPaymentVO` |
| `ct_pu_term` | 合同条款 | `ct.purdaily.entity.CtPuTermVO` |
| `ct_recvplan` | 收款计划 | `ct.saledaily.entity.RecvPlanVO` |
| `ct_sale` | 销售合同 | `ct.saledaily.entity.CtSaleVO` |
| `ct_sale_b` | 合同基本 | `ct.saledaily.entity.CtSaleBVO` |
| `ct_sale_change` | 变更历史 | `ct.saledaily.entity.CtSaleChangeVO` |
| `ct_sale_exec` | 执行过程 | `ct.saledaily.entity.CtSaleExecVO` |
| `ct_sale_exp` | 合同费用 | `ct.saledaily.entity.CtSaleExpVO` |
| `ct_sale_memora` | 合同大事记 | `ct.saledaily.entity.CtSaleMemoraVO` |
| `ct_sale_payterm` | 合同收款协议 | `ct.saledaily.entity.CtSalePayTermVO` |
| `ct_sale_term` | 合同条款 | `ct.saledaily.entity.CtSaleTermVO` |
| `ct_scope` | 合同控制范围 | `ct.purdaily.entity.CtScopeVo` |

### dm 运输管理（31 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `deliverystatus` | 运输状态 | `dm.m4802.entity.DelivStatusVO.SourceBillDeliveryStatus` |
| `dm_apinvoice` | 应付运费发票主实体 | `dm.m4812.entity.ApInvoiceHVO` |
| `dm_apinvoice_b` | 应付运费发票子实体 | `dm.m4812.entity.ApInvoiceBVO` |
| `dm_apsettldetail` | 应付运费明细实体 | `dm.apsettle.Entity.ApSettleDetailVO` |
| `dm_apsettle` | 应付运费结算单主实体 | `dm.apsettle.entity.ApSettleHVO` |
| `dm_apsettle_b` | 应付费用项子实体 | `dm.apsettle.entity.ApSettleBVO` |
| `dm_apsettle_f` | 应付结算组织费用项子实体 | `dm.apsettle.entity.ApSettleFVO` |
| `dm_arinvoice` | 应收运费发票主实体 | `dm.m4814.entity.ArInvoiceHVO` |
| `dm_arinvoice_b` | 应收运费发票子实体 | `dm.m4814.entity.ArInvoiceBVO` |
| `dm_batrange` | 批量分级主实体 | `dm.policy.entity.BatchRangeHVO` |
| `dm_batrange_b` | 批量分级子实体 | `dm.policy.entity.BatchRangeBVO` |
| `dm_delivapply` | 运输申请单主表 | `dm.m4802.entity.DelivapplyHVO` |
| `dm_delivapply_b` | 运输申请单子表 | `dm.m4802.entity.DelivapplyBVO` |
| `dm_delivbill` | 运输单主表 | `dm.m4804.entity.DelivBillHVO` |
| `dm_delivbill_b` | 运输单子表 | `dm.m4804.entity.DelivBillBVO` |
| `dm_delivstatus` | 运输状态 | `dm.delivstatus.entity.DelivStatusVO` |
| `dm_delivtype` | 运输单据交易类型 | `dm.m4804trantype.entity.M4804TranTypeVO` |
| `dm_feeplcy` | 应付运费策略定义主实体 | `dm.policy.entity.FeePlcyHVO` |
| `dm_feeplcy_fee` | 费用项子实体 | `dm.policy.entity.FeePlcyFeeVO` |
| `dm_feeplcy_prc` | 价格项子实体 | `dm.policy.entity.FeePlcyPrcVO` |
| `dm_feetariff` | 应付运费价格表维护实体 | `dm.tariff.entity.FeeTariffDetailVO` |
| `dm_feetariff_bat` | 批量价格表 | `dm.tariff.entity.FeeTariffBatVO` |
| `dm_feetariffdef` | 应付运费价格表主实体 | `dm.tariffdef.entity.FeeTariffDefHVO` |
| `dm_feetariffdef_b` | 应付运费价格表子实体 | `dm.tariffdef.entity.FeeTariffDefBVO` |
| `dm_formular` | 运费取数函数 | `dm.formula.entity.FormularVO` |
| `dm_func` | 运费业务函数 | `dm.func.entity.FuncVO` |
| `dm_m4812trantype` | 应付运费发票交易类型属性 | `dm.m4812trantype.entity.M4812TranTypeVO` |
| `dm_missionbill_b` | 任务单子表 | `dm.m4806.entity.MissionBillBVO` |
| `dm_missionbill_h` | 任务单主表 | `dm.m4806.entity.MissionBillHVO` |
| `dm_packbill` | 运输包装单 | `dm.m4804.entity.DelivBillPackVO` |
| `dm_verifydetail` | 核销明细 | `dm.m4812.entity.ApVerifyDetailVO` |

### ebpur 电子采购公共（183 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `EC_SUMINNER_FILE` | 组内汇总附件 | `ebpur.suminnergroup.SumInnerFileVO` |
| `ec_adaptmarclass` | 适用物料类别 | `ebpur.suparea.AdaptMarClassVO` |
| `ec_among_groups` | 组间汇总 | `ebpur.sumamonggroups.SumAmongGroupsVO` |
| `ec_among_item` | 组间汇总得分明细 | `ebpur.sumamonggroups.SumamongItemVO` |
| `ec_among_score` | 组间汇总得分 | `ebpur.sumamonggroups.SumAmongScoreVO` |
| `ec_area_purorg` | 所属采购组织 | `ebpur.suparea.BelongPurOrgVO` |
| `ec_areadivision` | 区域划分 | `ebpur.suparea.AreaDivisionVO` |
| `ec_assistinfo_b` | 其他条款 | `ebpur.pricetempdef.AssistInfoVO` |
| `ec_bidconfig_b` | 投标设置 | `ebpur.release.BidConfigVO` |
| `ec_biddoccategory` | 标书分类 | `ebpur.biddoccategory.BidDocCategoryVO` |
| `ec_biddocitype_b` | 评分标书分类 | `ebpur.evalset.BiddocTypeVO` |
| `ec_bidsub` | 标段 | `ebpur.purpreproj.BidSubVO` |
| `ec_catalog` | 采购目录 | `ebpur.catalog4pur.CatalogVO` |
| `ec_catalog_orgctrl` | 产品分类控制组织信息 | `ebpur.catalog4pur.CatalogOrgctrl` |
| `ec_catalog_prod` | 采购目录产品分类信息 | `ebpur.catalog4pur.CatalogProdVO` |
| `ec_com_score` | 综合评分法 | `ebpur.evalset.ComScoreVO` |
| `ec_commpleapply_b` | 补货申请审批产品信息 | `ebpur.commpleapplymgr.CommpleApplyProdItemVO` |
| `ec_commpleapply_h` | 补货申请审批 | `ebpur.commpleapplymgr.CommpleApplyVO` |
| `ec_conrepo_b` | 合同协议报价产品信息 | `ebpur.contractrepo.ConRepProdInfoVO` |
| `ec_conrepo_h` | 合同协议报价主实体 | `ebpur.contractrepo.ContractRepoVO` |
| `ec_conrepo_pub_b` | 合同协议报价发布范围 | `ebpur.contractrepo.IssuedDomainVO` |
| `ec_conrepo_record_b` | 合同协议报价执行变化量纪录实体 | `ebpur.contractrepo.RecordVO` |
| `ec_contmd_b` | 产品信息 | `ebpur.contractmodify.ContractMdProdVO` |
| `ec_contmd_h` | 合同协议报价变更主实体 | `ebpur.contractmodify.ContractModifyVO` |
| `ec_contractclass` | 合同分类 | `ebpur.contractclass.ContractClassVO` |
| `ec_controlpsnitem_b` | 监督人子实体 | `ebpur.release.ControlPsnItemVO` |
| `ec_cpinfomod_b` | 合同价格信息表调整子表 | `ebpur.cpinfomod.CpInfoModItemVO` |
| `ec_cpinfomod_h` | 合同价格信息表调整主表 | `ebpur.cpinfomod.CpInfoModVO` |
| `ec_cpmod_b` | 采购合同调价申请产品信息 | `ebpur.cpmod.CpmodItemVO` |
| `ec_cpmod_h` | 采购合同调价申请 | `ebpur.cpmod.CpmodVO` |
| `ec_decipub_dept_b` | 部门信息 | `ebpur.decisionpub.DecisionPubDeptItemVO` |
| `ec_decision_h` | 采购决策信息主实体 | `ebpur.decision.DecisionVO` |
| `ec_decision_pub_h` | 采购决策发布公告 | `ebpur.decisionpub.DecisionPubVO` |
| `ec_ebvpinfo` | 门户信息发布 | `ebpur.infopub.EbvpInfoVO` |
| `ec_eval_comp` | 汇总-综合评分法 | `ebpur.suminnergroup.CompEvalVO` |
| `ec_eval_expert` | 评委名单 | `ebpur.evalset.EvalExpertVO` |
| `ec_eval_file` | 评分文件 | `ebpur.evalset.EvalSetFileVO` |
| `ec_eval_lowest` | 汇总-最低价中选法 | `ebpur.suminnergroup.LowestEvalVO` |
| `ec_eval_set` | 评分设置 | `ebpur.evalset.EvalSetVO` |
| `ec_eval_std_b` | 评分项目 | `ebpur.evalstandard.EvalStandardItemVO` |
| `ec_eval_std_h` | 评分标准 | `ebpur.evalstandard.EvalStandardVO` |
| `ec_eval_sum_supp` | 供应商得分 | `ebpur.suminnergroup.EvalSumSuppVO` |
| `ec_eval_summary` | 组内汇总得分 | `ebpur.suminnergroup.EvalInnerSummaryVO` |
| `ec_eval_sup` | 评估供应商 | `ebpur.evalpub.EvalPubSupplierVO` |
| `ec_eval_supplyfile` | 供应商文件 | `ebpur.evalset.EvalReplyFileVO` |
| `ec_evalcol_b` | 汇总明细 | `ebpur.evalcollect.EvalCollectItemVO` |
| `ec_evalcol_h` | 评估结果汇总 | `ebpur.evalcollect.EvalCollectVO` |
| `ec_evalcol_item` | 汇总指标明细 | `ebpur.evalcollect.EvalColItemSetVO` |
| `ec_evalergroup_b` | 人员信息 | `ebpur.evalergroup.EvalerGroupItemVO` |
| `ec_evalergroup_h` | 评估人员组 | `ebpur.evalergroup.EvalerGroupVO` |
| `ec_evalfill_b` | 评估指标填制 | `ebpur.evalfill.EvalFillItemVO` |
| `ec_evalfill_h` | 评估表填制 | `ebpur.evalfill.EvalFillVO` |
| `ec_evalitemset_b` | 考核项目-评估指标 | `ebpur.evalitemset.EvalItemSetItemVO` |
| `ec_evalitemset_h` | 考核项目 | `ebpur.evalitemset.EvalItemSetVO` |
| `ec_evalpub_h` | 评估表发布 | `ebpur.evalpub.EvalPubVO` |
| `ec_evalpub_item` | 评估指标 | `ebpur.evalpub.EvalPubItemVO` |
| `ec_evalpub_itemper` | 指标填制人员信息 | `ebpur.evalpub.EvalPubItemPersonVO` |
| `ec_evalpub_per` | 填制人员信息 | `ebpur.evalpub.EvalPubPersonVO` |
| `ec_evalsample_b` | 考察评估样表指标 | `ebpur.evalsample.EvalSampleItemVO` |
| `ec_evalsample_h` | 考察评估样表 | `ebpur.evalsample.EvalSampleVO` |
| `ec_evaltemplet_b` | 评标模板子表 | `ebpur.evaltemplet.EvalTempletItemVO` |
| `ec_evaltemplet_h` | 评标模板 | `ebpur.evaltemplet.EvalTempletVO` |
| `ec_exarank` | 考核等级划分表头 | `ebpur.exarank.ExaRankVO` |
| `ec_exarank_b` | 考核等级划分 | `ebpur.exarank.ExaRankItemVO` |
| `ec_expertbasdoc_b` | 专家基本档案子表 | `ebpur.expertbasdoc.ExpertBasDocItemVO` |
| `ec_expertbasdoc_h` | 专家基本档案 | `ebpur.expertbasdoc.ExpertBasDocVO` |
| `ec_fetchexpert_b` | 专家列表 | `ebpur.fetchexpert.FetchExpertItemVO` |
| `ec_fetchexpert_h` | 确定专家 | `ebpur.fetchexpert.FetchExpertVO` |
| `ec_file_manager` | 附件文件 | `ecpubapp.filemanager.FileVO` |
| `ec_infopub_h` | 信息发布 | `ebpur.infopub.InfoPubVO` |
| `ec_infopubatt` | 信息发布附件信息 | `ebpur.infopub.InfoPubAttVO` |
| `ec_major_type` | 专业分类 | `ebpur.majortype.MajorTypeVO` |
| `ec_marbascls_pur_b` | 物料基本分类电子采购资质要求明细 | `ebpur.marbasclspur.MaterialBasClsPurQualifyVO` |
| `ec_marbascls_pur_h` | 物料基本分类电子采购信息 | `ebpur.marbasclspur.MaterialBasClsPurVO` |
| `ec_meeting_file_b` | 纪要文件信息子实体 | `ebpur.meeting.MeetingFileItemVO` |
| `ec_meeting_h` | 会议信息主实体 | `ebpur.meeting.MeetingVO` |
| `ec_muc_affili` | 评分/竞价室归属 | `ebpur.mucpub.MucAffiliationVO` |
| `ec_muc_conv_log` | 交流记录 | `ebpur.mucpub.MucConversationLogVO` |
| `ec_muc_member` | 评分/竞价室成员 | `ebpur.mucpub.MucMemberVO` |
| `ec_muc_room` | 评分室/竞价室 | `ebpur.mucpub.MucRoomVO` |
| `ec_muc_room_prop` | 评分/竞价室属性 | `ebpur.mucpub.MucRoomPropVO` |
| `ec_muc_service` | MUC服务 | `ebpur.mucpub.MucServiceVO` |
| `ec_muc_service_prop` | 服务属性 | `ebpur.mucpub.MucServicePropVO` |
| `ec_onlie_eval` | 在线评分室 | `ebpur.onlineeval.OnlineEvalVO` |
| `ec_onlinequote_h` | 竞价设置 | `ebpur.onlinequote.OnlineQuoteVO` |
| `ec_other_score` | 其他评分法 | `ebpur.evalset.OtherScoreVO` |
| `ec_plan_accept_b` | 采购计划受理子表 | `ebpur.planaccept.PlanAcceptItemVO` |
| `ec_plan_accept_h` | 采购计划受理 | `ebpur.planaccept.PlanAcceptVO` |
| `ec_planaccept_supp` | 采购计划受理_推荐供应商 | `ebpur.planaccept.PlanacceptSuppVO` |
| `ec_preflownode` | 预置流程环节 | `ebpur.preflownode.PreFlowNodeVO` |
| `ec_preprjeval` | 评分表 | `ebpur.purpreproj.PrePrjEvalVO` |
| `ec_preprjevalgrp` | 谈判/评标/询价小组 | `ebpur.purpreproj.PrePrjEvalGrpVO` |
| `ec_preprjprod` | 需求信息 | `ebpur.purpreproj.PrePrjProdVO` |
| `ec_preprjpurflow` | 采购环节 | `ebpur.purpreproj.PrePrjPurFlowVO` |
| `ec_preprjsup` | 供应商列表 | `ebpur.purpreproj.PrePrjSupVO` |
| `ec_preprjsyndic` | 评审小组 | `ebpur.purpreproj.PrePrjSysdic` |
| `ec_prequal` | 资格预审 | `ebpur.release.PrequalVO` |
| `ec_presrcflow_b` | 寻源流程环节 | `ebpur.presourceflow.PreSrcFlowNodeVO` |
| `ec_presrcflow_h` | 寻源流程设置 | `ebpur.presourceflow.PreSrcFlowVO` |
| `ec_presuppaffix` | 资格预审供应商应答附件 | `ebpur.release.PreSuppAffVO` |
| `ec_presupreply` | 资格预审供应商应答 | `ebpur.release.PreSuppReplyVO` |
| `ec_pricedata_b` | 报价数据明细 | `ebpur.pricedata.PriceDataItemVO` |
| `ec_pricedata_h` | 报价数据 | `ebpur.pricedata.PriceDataVO` |
| `ec_pricetempdef_b` | 报价模板格式定义 | `ebpur.pricetempdef.PriceTempDefItemVO` |
| `ec_pricetempdef_h` | 报价模板格式 | `ebpur.pricetempdef.PriceTempDefVO` |
| `ec_pricetplt_b` | 价格模版明细信息 | `ebpur.release.PriceTpltItemVO` |
| `ec_pricetplt_h` | 价格模板信息 | `ebpur.release.PriceTpltVO` |
| `ec_prodpricerepo` | 供应商产品价格库 | `ebpur.prodpricerepo.ProdPriceRepoVO` |
| `ec_proj_version` | 采购方案版本信息 | `ebpur.purproject.ProjVersionVO` |
| `ec_project_audit` | 采购方案评审 | `ebpur.purproject.PurProjectAuditVO` |
| `ec_pubgroup_h` | 公告群组 | `ebpur.infopubgroup.InfoPubGroupVO` |
| `ec_pubgrouppsn_b` | 公告群组-人员 | `ebpur.infopubgroup.PubGroupPsnVO` |
| `ec_pubgroupsupp_b` | 公告群组-供应商 | `ebpur.infopubgroup.PubGroupSuppVO` |
| `ec_pubtosup_b` | 发布对象授权供应商 | `ebpur.infopub.InfoPubSupVO` |
| `ec_pubtouser_b` | 发布对象授权用户 | `ebpur.infopub.InfoPubUserVO` |
| `ec_pur_apply_b` | 采购申请受理产品信息 | `ebpur.purapply.PurApplyItemVO` |
| `ec_pur_apply_h` | 采购申请受理 | `ebpur.purapply.PurApplyVO` |
| `ec_pur_project_h` | 采购方案单据 | `ebpur.purproject.PurProjectVO` |
| `ec_pur_subsection` | 采购方案标段 | `ebpur.purproject.PurSubSectionItemVO` |
| `ec_purapply_supp` | 采购申请受理_推荐供应商 | `ebpur.purapply.PurApplyReSuppVO` |
| `ec_purcont_alter_b` | 变更历史 | `ebpur.purcontract.PurContractAlterItemVO` |
| `ec_purcont_cls_b` | 采购协议合同合同条款 | `ebpur.purcontract.PurContractClauseItemVO` |
| `ec_purcont_ctrl_b` | 采购协议合同控制范围 | `ebpur.purcontract.PurContractCtrlItemVO` |
| `ec_purcont_prod_b` | 采购协议合同产品信息 | `ebpur.purcontract.PurContractProdItemVO` |
| `ec_purcontract_h` | 采购协议合同 | `ebpur.purcontract.PurContractVO` |
| `ec_purorder_b` | 采购订单产品信息 | `ebpur.purorder.PurOrderItemVO` |
| `ec_purorder_h` | 采购订单 | `ebpur.purorder.PurOrderVO` |
| `ec_purpost` | 招标岗 | `ebpur.purpost.PurPostVO` |
| `ec_purpost_psn` | 人员表 | `ebpur.purpost.PurPostPsnVO` |
| `ec_purpreproj_h` | 采购预案 | `ebpur.purpreproj.PurPreProjVO` |
| `ec_purproj_beorg` | 所含采购组织 | `ebpur.purproject.PurProjBelongOrgVO` |
| `ec_purproj_file` | 采购方案文件信息 | `ebpur.purproject.PurprojectFileItemVO` |
| `ec_purproj_judge` | 谈判/评标/询价小组明细 | `ebpur.purproject.PurProjJudgeItemVO` |
| `ec_purproj_quarea` | 报价区域设置 | `ebpur.purproject.PurProjQuoteAreaItemVO` |
| `ec_purproj_step` | 采购环节明细 | `ebpur.purproject.PurProjStepItemVO` |
| `ec_purproj_supp` | 采购方案供应商明细 | `ebpur.purproject.PurProjSuppItemVO` |
| `ec_purproj_syndOpt` | 评审意见 | `ebpur.purproject.PurProjSyndicOptionItemVO` |
| `ec_purproj_syndic` | 评审小组明细 | `ebpur.purproject.PurProjSyndicItemVO` |
| `ec_purproj_weight` | 评分表 | `ebpur.purproject.PurProjWeightItemVO` |
| `ec_purproject_req` | 需求信息明细 | `ebpur.purproject.PurProjectReqItemVO` |
| `ec_qualifitype` | 资质分类 | `ebpur.qualifitype.QualifiTypeVO` |
| `ec_quoteindex_b` | 竞价轮次 | `ebpur.onlinequote.OnlineQuoteIndexItemVO` |
| `ec_quotesupp_b` | 竞价供应商 | `ebpur.onlinequote.OnlineQuoteSuppItemVO` |
| `ec_release_file_b` | 采购文件信息子实体 | `ebpur.release.ReleaseFileItemVO` |
| `ec_release_h` | 发布类环节信息主实体 | `ebpur.release.ReleaseVO` |
| `ec_release_supp_b` | 供应商看板信息 | `ebpur.purproject.ReleaseSuppItemVO` |
| `ec_release_supp_bd` | 供应商状态变更明细 | `ebpur.purproject.ReleaseSuppItemDetailVO` |
| `ec_releaseqa_h` | 澄清答疑 | `ebpur.release.ReleaseQAVO` |
| `ec_releasereply_h` | 响应审批 | `ebpur.release.ReleaseReplyVO` |
| `ec_reply_file_b` | 响应文件 | `ebpur.release.ReplyFileItemVO` |
| `ec_reply_h` | 响应处理 | `ebpur.release.ReplyVO` |
| `ec_reply_other_b` | 其他条款 | `ebpur.release.ReplyOtherItemVO` |
| `ec_selfprdef` | 自定义报价模板属性 | `ebpur.selfprdef.SelfPrDefVO` |
| `ec_split_h` | 分标分量 | `ebpur.decisionsplit.SplitVO` |
| `ec_split_supp_b` | 供应商数据 | `ebpur.decisionsplit.SplitSuppItemVO` |
| `ec_splitpkorg_h` | 分标分量采购组织 | `ebpur.splitpkorg.SplitPkorgVO` |
| `ec_step_exec_item` | 环节执行明细 | `ebpur.purproject.PurProjStepExecItemVO` |
| `ec_sum_file` | 组间汇总附件 | `ebpur.sumamonggroups.SumamongGroupsFileVO` |
| `ec_suparea` | 区域体系设置 | `ebpur.suparea.SupAreaVO` |
| `ec_supas_prod_b` | 合格评定产品分类 | `ebpur.supassess.SupAssProdVO` |
| `ec_supas_qa_b` | 合格评定资质分类 | `ebpur.supassess.SupAssQaVO` |
| `ec_supassess_h` | 供应商合格评定 | `ebpur.supassess.SupAssessVO` |
| `ec_supbankacc` | 银行账号 | `ebpur.supinfocheck.SupBankAccVO` |
| `ec_supcheckprod` | 供应商提供产品分类信息 | `ebpur.supinfocheck.SupInfoProdVO` |
| `ec_supcheckqa` | 供应商资质信息 | `ebpur.supinfocheck.SupInfoQaVO` |
| `ec_supdocext_h` | 供应商档案扩展 | `ebpur.supplierext.SupplierDocExtVO` |
| `ec_supextqaattachment_s` | 资质分类附件信息 | `ebpur.supplierext.SupExtQAAttchmentsVO` |
| `ec_supinfocheck_file_b` | 供应商附件 | `ebpur.supinfocheck.SupInfoCheckFileItemVO` |
| `ec_supinfocheck_h` | 供应商信息审查表 | `ebpur.supinfocheck.SupInfoCheckVO` |
| `ec_supinfoqaattachment_s` | 资质分类附件信息 | `ebpur.supinfocheck.QAAttachmentsVO` |
| `ec_suplinkman` | 联系人 | `ebpur.supinfocheck.SupInfoLinkManVO` |
| `ec_supplierext_file_b` | 供应商附件 | `ebpur.supplierext.SupplierextFileItemVO` |
| `ec_supplierquest` | 邀请供应商 | `ebpur.supplierrequest.SupplierRequestVO` |
| `ec_supplygrade` | 查看供应商得分 | `ebpur.decision.SupplyGradeVO` |
| `ec_supplyprice` | 查看供应商报价 | `ebpur.decision.SupplyPriceVO` |
| `ec_suppqa` | 供应商资质 | `ebpur.supplierext.SupplierQAVO` |
| `ec_supprodcate` | 供应商可供产品目录 | `ebpur.supplierext.SupplierProdCateVO` |
| `ec_supreview_b` | 供应商考察项目 | `ebpur.supreview.SupReviewItemVO` |
| `ec_supreview_h` | 供应商考察 | `ebpur.supreview.SupReviewVO` |
| `ec_unseal_h` | 开启信息主实体 | `ebpur.unseal.UnSealVO` |
| `ec_unseal_psn_b` | 开启监督人信息子实体 | `ebpur.unseal.UnSealPsnItemVO` |
| `ec_unseal_reg_b` | 开启登记表信息子实体 | `ebpur.unseal.UnSealRegItemVO` |
| `ec_vote_score` | 投票法 | `ebpur.evalset.VoteScoreVO` |

### ebvp 供应商门户（20 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `ec_Web_send_notice` | 我的发货通知 | `ebvp.ordersendnotice.WebMySendNoticeVO` |
| `ec_web_arr_plan` | 到货计划 | `ebvp.execorder.WebArrPlanVO` |
| `ec_web_balance` | 结算单主表 | `ebvp.ecbalance.WebBanlanceVO` |
| `ec_web_balance_b` | 结算单子表 | `ebvp.ecbalance.WebBalanceItemVO` |
| `ec_web_ct_b` | 合同明细 | `ebvp.purcontract.WebContractItemVO` |
| `ec_web_ct_clausal` | 合同条款 | `ebvp.purcontract.WebContractClausalVO` |
| `ec_web_ct_fee` | 合同费用 | `ebvp.purcontract.WebContractFeeVO` |
| `ec_web_ct_h` | 合同主表 | `ebvp.purcontract.WebContractVO` |
| `ec_web_ctrpt_h` | 合同协议报价主表 | `ebvp.contractmaintain.WebCtreptVO` |
| `ec_web_ctrptz_b` | 合同协议子表 | `ebvp.contractmaintain.WebCtreptItemVO` |
| `ec_web_goods_arr` | 到货单 | `ebvp.goodsarrive.WebGoodsArriveVO` |
| `ec_web_goods_arr_b` | 到货单明细 | `ebvp.goodsarrive.WebGoodsArrItemVO` |
| `ec_web_invoice_b` | 发票子表 | `ebvp.invoice.WebInvoiceItemVO` |
| `ec_web_invoice_h` | 发票主表 | `ebvp.invoice.WebInvoiceVO` |
| `ec_web_order` | 门户订单主实体 | `ebvp.execorder.WebPurOrderVO` |
| `ec_web_order_b` | 门户订单子表 | `ebvp.execorder.WebOrderItemVO` |
| `ec_web_payment_b` | 付款单子表 | `ebvp.purpayment.WebPaymentItemVO` |
| `ec_web_payment_h` | 付款单主表 | `ebvp.purpayment.WebPaymentVO` |
| `ec_web_storage_b` | 入库单子表 | `ebvp.storage.WebStorageItemVO` |
| `ec_web_storage_h` | 入库单主表 | `ebvp.storage.WebStorageVO` |

### ebvsc 采购计划排程（17 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `ebvsc_schedule` | 采购排程计划表维护 | `ebvsc.purschemgr.ScheduleVO` |
| `ebvsc_timecell_b` | 排程计划审批明细 | `ebvsc.purscheapprove.ScheApproveItemVO` |
| `ebvsc_timecell_b` | 时格明细信息 | `ebvsc.schetimecell.TimeCellItemVO` |
| `ebvsc_timecell_h` | 时格主信息 | `ebvsc.schetimecell.TimeCellVO` |
| `ec_materialrela_b` | 物料关联 | `ebvsc.pssupmatrule.MaterialRelaVO` |
| `ec_planscopeset_b` | 要货计划调整幅度设置子实体 | `ebvsc.planscopeset.PlanScopesetItemVO` |
| `ec_planscopeset_h` | 要货计划调整幅度设置 | `ebvsc.planscopeset.PlanScopesetVO` |
| `ec_pssupmatrule_h` | 供应商物料排程规则设置 | `ebvsc.pssupmatrule.PssupMatRuleVO` |
| `ec_pssuppassrule_h` | 排程计划表供应商设置 | `ebvsc.pssuppassrule.PssuppassRuleVO` |
| `ec_pstemp_def` | 排程模板定义 | `ebvsc.pstemplatedef.PsTemplateDefVO` |
| `ec_pstemp_mate` | 物料明细 | `ebvsc.pstemplatedef.PsTemplateMateVO` |
| `ec_pstemp_psn` | 采购员 | `ebvsc.pstemplatedef.PsTemplatePsnVO` |
| `ec_purscherule` | 采购排程计划表规则 | `ebvsc.purscherule.PurScheRuleVO` |
| `ec_scheapprove` | 排程计划审批 | `ebvsc.purscheapprove.PurScheApproveVO` |
| `ec_scheordermgr_b` | 排程结果明细 | `ebvsc.scheordermgr.ScheOrderMgrItemVO` |
| `ec_scheordermgr_h` | 排程结果查询与确认 | `ebvsc.scheordermgr.ScheOrderMgrVO` |
| `ec_supprela_b` | 供应商关联 | `ebvsc.pssuppassrule.SuppRelaVO` |

### ecapppub 电子商务后台应用公共项目（24 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `ec_transtypeext` | 扩展交易类型 | `ecpubapp.tools.TransTypeExtVO` |
| `ecapppub_associatedattr` | 关联属性 | `ecapppub.plan.entity.AssociatedAttrVO` |
| `ecapppub_bdimension` | 体维度 | `com.yonyou.vo.ecapppub.plan.entity.BdimensionVO` |
| `ecapppub_billconfig` | 单据配置 | `com.yonyou.ec.plan.entity.BillTplConfigVO` |
| `ecapppub_dimension` | 计划维度 | `ecapppub.plan.entity.DimensionVO` |
| `ecapppub_dimvalueset` | 维度值集 | `com.yonyou.vo.ecapppub.plan.entity.DimvaluesetVO` |
| `ecapppub_eventtype` | 事件类型 | `com.yonyou.vo.uapec.event.entity.EventTypeVO` |
| `ecapppub_execbill` | 执行单据 | `com.yonyou.vo.ecapppub.plan.entity.ExecBillVO` |
| `ecapppub_hdimension` | 头维度 | `com.yonyou.vo.ecapppub.plan.entity.HdimensionVO` |
| `ecapppub_history` | 状态历史 | `com.yonyou.vo.uapec.event.entity.HistoryVO` |
| `ecapppub_initalerttool` | 后台任务部署初始化工具 | `ecapppub.initalerttool.entity.InitAlertToolVO` |
| `ecapppub_inittoolstep` | 初始化向导步骤 | `ecapppub.inittoolstep.entity.InitToolStepVO` |
| `ecapppub_plancycle` | 计划周期 | `ecapppub.plan.entity.plancycle.PlancycleVO` |
| `ecapppub_plantemplate` | 计划模板 | `com.yonyou.vo.ecapppub.plan.entity.PlantemplateVO` |
| `ecapppub_queryconfig` | 查询配置 | `com.yonyou.ec.plan.entity.QueryTplConfigVO` |
| `ecapppub_state` | 状态 | `com.yonyou.event.state.entity.StateVO` |
| `ecapppub_task` | 数据交换任务 | `com.yonyou.vo.ecapppub.exchange.entity.TaskVO` |
| `ecapppub_taskevent` | 交换任务事件 | `com.yonyou.vo.ecapppub.exchange.entity.TaskEventVO` |
| `ecapppub_tempassign` | 门户模板分配 | `ecapppub.tempassign.entity.TempAssignVO` |
| `ecapppub_trantype` | 执行单据交易类型 | `com.yonyou.vo.ecapppub.plan.entity.TranTypeVO` |
| `ecapppub_webmenu` | 门户菜单 | `ecapppub.webmenu.entity.WebMenuVO` |
| `uapec_event` | 事件 | `com.yonyou.vo.uapec.event.entity.EventVO` |
| `uapec_eventhandler` | 事件监听 | `com.yonyou.vo.uapec.event.entity.EventHandlerVO` |
| `uapec_eventmsgsendconfig` | 事件消息发送方式 | `com.yonyou.vo.uapec.event.entity.EventMsgSendConfig` |

### esbd 电子销售基础档案（24 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `ecapppub_menu` | 门户菜单 | `com.yonyou.ec.vo.rbac.menu.entity.ECMenuVO` |
| `ecapppub_module` | 模块 | `com.yonyou.ec.vo.rbac.function.entity.ECModuleVO` |
| `ecapppub_resource` | 菜单资源 | `com.yonyou.ec.vo.rbac.function.entity.ECResourceVO` |
| `esbd_dealer` | 经销商 | `esbd.dealer.entity.DealerVO` |
| `esbd_imagetype` | 图片类型 | `eso.product.entity.ImageTypeVO` |
| `esbd_invoicetitle` | 发票抬头 | `esbd.dealer.entity.InvoiceTitleVO` |
| `esbd_prodsearchkey` | 商品搜索字段信息 | `eso.product.entity.ProdsearchkeyVO` |
| `esbd_productattr` | 商品属性 | `esbd.productattr.entity.ProductAttrVO` |
| `esbd_productimage` | 商品图片 | `eso.product.entity.ProductImageVO` |
| `esbd_report` | 报表发布主表 | `esbd.report.entity.ReportVO` |
| `esbd_reportincomepara` | 报表参数POJO | `esbd.report.entity.ReportIncomeParaVO` |
| `esbd_reportresultpara` | 报表结果POJO | `esbd.report.entity.ReportResultParaVO` |
| `eso_category` | 商品分类 | `eso.category.entity.CategoryVO` |
| `eso_material` | 商品物料 | `eso.product.entity.MaterialVO` |
| `eso_mcategory` | 商品主分类附表 | `eso.product.entity.MCategoryVO` |
| `eso_mparameter` | 商品参数 | `eso.producttype.entity.MParameterVO` |
| `eso_product` | 商品信息 | `eso.product.entity.ProductVO` |
| `eso_productpara` | 商品规格参数表 | `eso.product.entity.ProductParaVO` |
| `eso_producttype` | 商品类型 | `eso.producttype.entity.ProductTypeHVO` |
| `eso_resource` | 商品图片表 | `eso.product.entity.ResourceVO` |
| `eso_sresource` | 商品静态资源表 | `eso.product.entity.SresourceVO` |
| `opc_mc3trantype` | 标准订单交易类型 | `opc.mc3trantype.entity.Mc3TranTypeVO` |
| `opc_outorder` | 标准订单主表 | `opc.mc3.entity.OutOrderHVO` |
| `opc_outorder_b` | 标准订单附表 | `opc.mc3.entity.OutOrderBVO` |

### eso 电子销售（34 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `eso_atp` | 可销量计划 | `eso.atp.ATPVO` |
| `eso_atp_b` | 商品可销量 | `eso.atp.ATPBVO` |
| `eso_available` | 可用量 | `eso.available.entity.AvailableVO` |
| `eso_billtypemap` | 交易类型对照 | `eso.businessrule.entity.BillTypeMapVO` |
| `eso_bulletin` | 公告 | `eso.bulletin.entity.BulletinVO` |
| `eso_bulletintype` | 公告分类 | `eso.bulletin.entity.BulletinTypeVO` |
| `eso_bullresource` | 公告图片表 | `eso.bulletin.entity.ResourceVO` |
| `eso_bullsresource` | 公告静态资源表 | `eso.bulletin.entity.BulletinSresourceVO` |
| `eso_catalogue` | 商品允销目录 | `eso.catalogue.entity.CatalogueVO` |
| `eso_dailysale` | 日累计量 | `eso.dailysale.entity.DailySaleVO` |
| `eso_execinfo` | 订单执行信息 | `eso.order.entity.ExecInfoVO` |
| `eso_favorite` | 收藏夹 | `eso.favorite.entity.FavoriteVO` |
| `eso_invflow` | 可销量流水 | `eso.invflow.entity.InvFlowVO` |
| `eso_mcustomer` | 公告授权 | `eso.bulletin.entity.MCustomerVO` |
| `eso_onhand` | 可销量结存表 | `eso.onhand.entity.OnHandVO` |
| `eso_onsale` | 展销商品 | `eso.onsale.entity.ProductOnSaleVO` |
| `eso_onsaletypedef` | 展销类型 | `eso.onsaletypedef.entity.SaleTypeVO` |
| `eso_order` | 网上订单头 | `eso.order.entity.OrderHVO` |
| `eso_order_b` | 网上订单体 | `eso.order.entity.OrderBVO` |
| `eso_orderhistory` | 网上订单历史头 | `eso.order.entity.OrderHistoryHVO` |
| `eso_orderhistory_b` | 网上订单历史体 | `eso.order.entity.OrderHistoryBVO` |
| `eso_orderscheme` | 网上订单方案 | `eso.order.entity.OrderSchemeVO` |
| `eso_paybank` | 网上支付方式 | `eso.paybank.entity.PayBankVO` |
| `eso_paymentbill` | 支付单 | `eso.paymentbill.entity.PaymentBillVO` |
| `eso_portaluser` | portalusers | `eso.portaluser.entity.PortalUserVO` |
| `eso_price` | 商品价目表 | `eso.price.entity.PriceVO` |
| `eso_pubproduct` | 公网商品定义 | `eso.pubproduct.entity.PubProductVO` |
| `eso_saleorgmap` | 电子销售组织对照 | `eso.businessrule.entity.SaleOrgMapVO` |
| `eso_salerank` | 销售排行主表 | `eso.salerank.entity.SaleRankHVO` |
| `eso_salerank_b` | 销售排行子表 | `eso.salerank.entity.SaleRankBVO` |
| `eso_shopcart` | 购物车 | `eso.shopcart.entity.ShopCartVO` |
| `eso_srhistory` | 销售排行历史主表 | `eso.salerank.entity.SRHistoryHVO` |
| `eso_srhistory_b` | 销售排行历史子表 | `eso.salerank.entity.SRHistoryBVO` |
| `eso_synctime` | 同步时间 | `nc.voeso.synctime.Entity.SynctimeVO` |

### ia 存货核算（59 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `bd_billtype` | 出入库类型 | `ia.pub.transtype.TranstypeVO` |
| `ia_account` | 月末结账表 | `ia.monthaccount.entity.MonthAccountVO` |
| `ia_adjcalcrange` | 核算维度调整单 | `ia.invalmethod.entity.calcrange.AdjCalcRangeHeadVO` |
| `ia_adjcalcrange_b` | 核算维度调整单子表 | `ia.invalmethod.entity.calcrange.AdjCalcRangeItemVO` |
| `ia_assistantledger` | 计价辅助表 | `ia.assistantledger.entity.AssistantLedgerVO` |
| `ia_beginvariances` | 录入期初差异 | `ia.beginvariance.entity.BeginVarianceVO` |
| `ia_bizrely` | 业务依赖 | `ia.rely.BizRelyVO` |
| `ia_calcrange` | 计算维度表 | `ia.pub.entity.CalcRangeVO` |
| `ia_calcrangelog` | 计算维度调整日志 | `ia.invalmethod.entity.CalcRangeLogVO` |
| `ia_cyclerely` | 循环依赖 | `ia.rely.CycleRelyVO` |
| `ia_datarepairlog` | 数据修正日志 | `ia.monthaccount.entity.DataRepairLogVO` |
| `ia_detailledger` | 单据明细实体 | `ia.detailledger.entity.DetailLedgerVO` |
| `ia_differencerate` | 标准差异率 | `ia.differencerate.entity.DifferenceRateVO` |
| `ia_generalnab` | 存货总账 | `ia.generalnab.GeneralnabVO` |
| `ia_goodsledger` | 发出商品明细账 | `ia.goodsledger.entity.GoodsLedgerVO` |
| `ia_goodsmonthnab` | 发出商品月结存表 | `ia.monthaccount.entity.GoodsMonthnabVO` |
| `ia_goodsnab` | 发出商品总账 | `ia.goodsnab.entity.GoodsNABVO` |
| `ia_hisdetailledger` | 历史单据明细实体 | `ia.detailledger.entity.HisDetailLedgerVO` |
| `ia_i0bill` | 录入期初单据 | `ia.mi0.entity.I0HeadVO` |
| `ia_i0bill_b` | 录入期初单据明细 | `ia.mi0.entity.I0ItemVO` |
| `ia_i2bill` | 采购入库单 | `ia.mi2.entity.I2HeadVO` |
| `ia_i2bill_b` | 采购入库单明细 | `ia.mi2.entity.I2ItemVO` |
| `ia_i3bill` | 产成品入库单 | `ia.mi3.entity.I3HeadVO` |
| `ia_i3bill_b` | 产成品入库单明细 | `ia.mi3.entity.I3ItemVO` |
| `ia_i4bill` | 其他入库单 | `ia.mi4.entity.I4HeadVO` |
| `ia_i4bill_b` | 其他入库单明细 | `ia.mi4.entity.I4ItemVO` |
| `ia_i5bill` | 销售成本结转单 | `ia.mi5.entity.I5HeadVO` |
| `ia_i5bill_b` | 销售成本结转单明细 | `ia.mi5.entity.I5ItemVO` |
| `ia_i6bill` | 材料出库单 | `ia.mi6.entity.I6HeadVO` |
| `ia_i6bill_b` | 材料出库单明细 | `ia.mi6.entity.I6ItemVO` |
| `ia_i7bill` | 其他出库单 | `ia.mi7.entity.I7HeadVO` |
| `ia_i7bill_b` | 其他出库单明细 | `ia.mi7.entity.I7ItemVO` |
| `ia_i8bill` | 报废单 | `ia.mi8.entity.I8HeadVO` |
| `ia_i8bill_b` | 报废单明细 | `ia.mi8.entity.I8ItemVO` |
| `ia_i9bill` | 入库调整单 | `ia.mi9.entity.I9HeadVO` |
| `ia_i9bill_b` | 入库调整单明细 | `ia.mi9.entity.I9ItemVO` |
| `ia_iabill` | 出库调整单 | `ia.mia.entity.IAHeadVO` |
| `ia_iabill_b` | 出库调整单明细 | `ia.mia.entity.IAItemVO` |
| `ia_ibbill` | 计划价调整单 | `ia.mib.entity.IBHeadVO` |
| `ia_ibbill_b` | 计划价调整单明细 | `ia.mib.entity.IBItemVO` |
| `ia_idbill` | 委托加工入库单 | `ia.mid.entity.IDHeadVO` |
| `ia_idbill_b` | 委托加工入库单明细 | `ia.mid.entity.IDItemVO` |
| `ia_iebill` | 差异结转单 | `ia.mie.entity.IEHeadVO` |
| `ia_iebill_b` | 差异结转单明细 | `ia.mie.entity.IEItemVO` |
| `ia_ifbill` | 跌价提取单 | `ia.mif.entity.IFHeadVO` |
| `ia_ifbill_b` | 跌价提取单明细 | `ia.mif.entity.IFItemVO` |
| `ia_igbill` | 损益调整单 | `ia.mig.entity.IGHeadVO` |
| `ia_igbill_b` | 损益调整单明细 | `ia.mig.entity.IGItemVO` |
| `ia_iibill` | 调拨入库单 | `ia.mii.entity.IIHeadVO` |
| `ia_iibill_b` | 调拨入库单明细 | `ia.mii.entity.IIItemVO` |
| `ia_ijbill` | 调拨出库单 | `ia.mij.entity.IJHeadVO` |
| `ia_ijbill_b` | 调拨出库单明细 | `ia.mij.entity.IJItemVO` |
| `ia_monthnab` | 存货总账月结存 | `ia.monthaccount.entity.MonthnabVO` |
| `ia_period` | 期间结存标志记录 | `ia.monthaccount.entity.PeriodVO` |
| `ia_periodnab` | 期间结存 | `ia.monthaccount.entity.PeriodnabVO` |
| `ia_planedprice` | 计划价批量调整单 | `ia.m2801.entity.PlanedPriceHeadVO` |
| `ia_planedprice_b` | 计划价批量调整单明细 | `ia.m2801.entity.PlanedPriceItemVO` |
| `ia_pricemodelog` | 计价方式调整记录 | `ia.invalmethod.entity.PriceModeLogVO` |
| `ia_relyorder` | 依赖顺序 | `ia.rely.RelyOrderVO` |

### ic 库存管理（152 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `ic_GeneralRefInHeadVO` | 参照入库单表头 | `ic.m4a.entity.GeneralRefInHeadVO` |
| `ic_TransNumBodyVO` | 转库存量表体 | `ic.m4k.entity.TransNumBodyVO` |
| `ic_TransNumHeadVO` | 转库存量 | `ic.m4k.entity.TransNumHeadVO` |
| `ic_adjustbal_b` | 主辅计量平衡表体 | `ic.m52.entity.AdjustBalBodyVO` |
| `ic_adjustbal_h` | 主辅计量平衡表头 | `ic.m52.entity.AdjustBalHeadVO` |
| `ic_adjusterr_b` | 调差单表体 | `ic.m51.entity.AdjustErrBodyVO` |
| `ic_adjusterr_h` | 调差单表头 | `ic.m51.entity.AdjustErrHeadVO` |
| `ic_assembly_b` | 组装单表体 | `ic.m4l.entity.AssemblyBillBodyVO` |
| `ic_assembly_h` | 组装单表头 | `ic.m4l.entity.AssemblyBillHeadVO` |
| `ic_assetin_b` | 设备入库单表体 | `ic.m4401.entity.AssetInBodyVO` |
| `ic_assetin_h` | 设备入库单表头 | `ic.m4401.entity.AssetInHeadVO` |
| `ic_assetin_l` | 设备入库单货位单品表 | `ic.m4401.entity.AssetInLocationVO` |
| `ic_assetout_b` | 设备出库单表体 | `ic.m4451.entity.AssetOutBodyVO` |
| `ic_assetout_h` | 设备出库单表头 | `ic.m4451.entity.AssetOutHeadVO` |
| `ic_assetout_l` | 设备出库单货位单品表 | `ic.m4451.entity.AssetOutLocationVO` |
| `ic_atp` | 可用量 | `ic.atp.entity.AtpVO` |
| `ic_atp_f` | 可用量缓存 | `ic.atp.entity.AtpFVO` |
| `ic_atp_lock` | 可用量锁 | `ic.atp.entity.AtpDimVO` |
| `ic_atpdate` | 可用量合并日期记录 | `ic.atp.entity.AtpDateVO` |
| `ic_barcodedict_b` | 条形码字典明细 | `ic.barcodedict.BarCodeDictBodyVO` |
| `ic_barcodedict_h` | 条形码字典 | `ic.barcodedict.BarCodeDictHeadVO` |
| `ic_barcodeparse` | 条形码解析 | `ic.barcodeparse.BarCodeParseVO` |
| `ic_barcoderight` | 序列号业务权限设置 | `ic.barcoderight.BarcodeRightVO` |
| `ic_barcoderule_b` | 条形码规则定义表体 | `ic.barcoderule.BarCodeRuleBodyVO` |
| `ic_barcoderule_h` | 条形码规则定义 | `ic.barcoderule.BarCodeRuleHeadVO` |
| `ic_borrowin_b` | 库存借入单表体 | `ic.m49.entity.BorrowInBodyVO` |
| `ic_borrowin_h` | 库存借入单表头 | `ic.m49.entity.BorrowInHeadVO` |
| `ic_borrowin_l` | 库存借入单单品表 | `ic.m49.entity.BorrowInLocationVO` |
| `ic_borrowout_b` | 库存借出单表体 | `ic.m4h.entity.BorrowOutBodyVO` |
| `ic_borrowout_h` | 库存借出单表头 | `ic.m4h.entity.BorrowOutHeadVO` |
| `ic_borrowout_l` | 库存借出单单品表 | `ic.m4h.entity.BorrowOutLocationVO` |
| `ic_boxbarcode` | 条码解析聚合VO | `ic.barcodeparse.BarCodeGroupHeadVO` |
| `ic_defaultspace` | 默认或固定货位 | `ic.mstorectl.DefaultSpaceVO` |
| `ic_discardin_b` | 生产报废入库单表体 | `ic.m4x.entity.DiscardInBodyVO` |
| `ic_discardin_h` | 生产报废入库单表头 | `ic.m4x.entity.DiscardInHeadVO` |
| `ic_discardin_l` | 生产报废入库单货位单品表 | `ic.m4x.entity.DiscardInLocationVO` |
| `ic_discardout_b` | 报废单表体 | `ic.m4o.entity.DiscardOutBodyVO` |
| `ic_discardout_h` | 报废单表头 | `ic.m4o.entity.DiscardOutHeadVO` |
| `ic_discardout_l` | 报废单货位单品表 | `ic.m4o.entity.DiscardOutLocationVO` |
| `ic_finprodin_b` | 产成品入库单表体 | `ic.m46.entity.FinProdInBodyVO` |
| `ic_finprodin_h` | 产成品入库单表头 | `ic.m46.entity.FinProdInHeadVO` |
| `ic_finprodin_l` | 产成品入库单货位单品表 | `ic.m46.entity.FinProdInLocationVO` |
| `ic_flow` | 库存流水 | `ic.flowaccount.entity.FlowAccountVO` |
| `ic_flowaccount_his` | 库存流水历史 | `ic.flowaccount.entity.FlowAccountHisVO` |
| `ic_flowdetail` | 库存流水货位单品明细 | `ic.flowaccount.entity.FlowAccountDetailVO` |
| `ic_flowdetail_his` | 库存流水货位单品明细历史 | `ic.flowaccount.entity.FlowAccountDetailHisVO` |
| `ic_generalin_b` | 普通入库单表体 | `ic.m4a.entity.GeneralInBodyVO` |
| `ic_generalin_h` | 普通入库单表头 | `ic.m4a.entity.GeneralInHeadVO` |
| `ic_generalin_l` | 普通入库单货位单品表 | `ic.m4a.entity.GeneralInLocationVO` |
| `ic_generalout_b` | 普通出库单表体 | `ic.m4i.entity.GeneralOutBodyVO` |
| `ic_generalout_h` | 普通出库单表头 | `ic.m4i.entity.GeneralOutHeadVO` |
| `ic_generalout_l` | 普通出库单货位单品表 | `ic.m4i.entity.GeneralOutLocationVO` |
| `ic_handreserve` | 现存量预留明细 | `ic.reserve.entity.OnhandReserveVO` |
| `ic_invcount_b` | 盘点单子实体 | `ic.m4r.entity.InvCountBodyVO` |
| `ic_invcount_h` | 盘点单主实体 | `ic.m4r.entity.InvCountHeaderVO` |
| `ic_invcount_sn` | 盘点单子实体明细 | `ic.m4r.entity.InvCountBodySNVO` |
| `ic_invfreeze` | 库存冻结、解冻 | `ic.m4z.entity.FreezeThawVO` |
| `ic_locadjust_b` | 库存货位调整单表体 | `ic.m4q.entity.LocAdjustBodyVO` |
| `ic_locadjust_h` | 库存货位调整单表头 | `ic.m4q.entity.LocAdjustHeadVO` |
| `ic_locadjust_l` | 货位调整单品 | `ic.m4q.entity.LocAdjustLocationVO` |
| `ic_material_b` | 材料出库单表体 | `ic.m4d.entity.MaterialOutBodyVO` |
| `ic_material_h` | 材料出库单表头 | `ic.m4d.entity.MaterialOutHeadVO` |
| `ic_material_l` | 材料出库单货位单品表 | `ic.m4d.entity.MaterialOutLocationVO` |
| `ic_memo` | 业务备查簿 | `module.ic_memo.BusiMemo` |
| `ic_memosetup` | 业务备查簿设置 | `module.ic_memosetup.MemoSetup` |
| `ic_month_exec` | 月结执行 | `ic.mobalance.entity.MonthExecVO` |
| `ic_month_hand` | 库存区间结存 | `ic.mobalance.entity.MonthHandVO` |
| `ic_month_handsign` | 库存签字区间结存 | `ic.mobalance.entity.MonthHandSignVO` |
| `ic_month_record` | 库存月发生 | `ic.mobalance.entity.MonthRecordVO` |
| `ic_month_recordsign` | 库存签字月发生 | `ic.mobalance.entity.MonthRecordSignVO` |
| `ic_month_scheme` | 月结计算方案 | `ic.mobalance.entity.MonthSchemeVO` |
| `ic_numctl` | 仓库物料存量 | `ic.ic002.NumctlVO` |
| `ic_onhanddate` | 结存日期 | `ic.onhand.init.OnhandDate` |
| `ic_onhanddim` | 现存量维度 | `ic.onhand.entity.OnhandDimVO` |
| `ic_onhandinit` | 现存量期初 | `ic.onhand.init.OnhandInitNumVO` |
| `ic_onhandnum` | 现存量 | `ic.onhand.entity.OnhandNumVO` |
| `ic_onhandsn` | 单品存量 | `ic.onhand.entity.OnhandSNVO` |
| `ic_onhandsninit` | 单品存量期初 | `ic.onhand.init.OnhandSNInitVO` |
| `ic_onroadin_b` | 在途入库处理查询表体实体 | `ic.onroadin.OnroadInCondBodyVO` |
| `ic_onroadin_h` | 在途入库处理查询表头实体 | `ic.onroadin.OnroadInCondHeadVO` |
| `ic_openbal_b` | 期初余额表体 | `ic.m40.entity.InitializtionInBodyVO` |
| `ic_openbal_h` | 期初余额表头 | `ic.m40.entity.InitializtionInHeadVO` |
| `ic_openbal_l` | 期初余额单品表 | `ic.m40.entity.InitializtionInLocationVO` |
| `ic_openscrap_b` | 期初废品表体 | `ic.m43.entity.OpenScrapBodyVO` |
| `ic_openscrap_h` | 期初废品表头 | `ic.m43.entity.OpenScrapHeadVO` |
| `ic_openscrap_l` | 期初废品单品表 | `ic.m43.entity.OpenScrapLocationVO` |
| `ic_packbill_b` | 装箱单 | `ic.m4w.entity.PackBillBodyVO` |
| `ic_packbill_h` | 装箱单表头 | `ic.m4w.entity.PackBillHeadVO` |
| `ic_pickbill_b` | 拣货单表体 | `ic.m4v.entity.PickBillBodyVO` |
| `ic_pickbill_h` | 拣货单表头 | `ic.m4v.entity.PickBillHeadVO` |
| `ic_pickbillquery_b` | 拣货查询出库单条件表体 | `ic.m4v.entity.PickBillQueryCondBodyVO` |
| `ic_pickbillquery_h` | 拣货查询出库单条件表头 | `ic.m4v.entity.PickBillQueryCondHeadVO` |
| `ic_prereserve` | 预计入预留明细 | `ic.reserve.entity.PreReserveVO` |
| `ic_purchasein_b` | 采购入库单表体 | `ic.m45.entity.PurchaseInBodyVO` |
| `ic_purchasein_h` | 采购入库单表头 | `ic.m45.entity.PurchaseInHeadVO` |
| `ic_purchasein_l` | 采购入库单货位单品表 | `ic.m45.entity.PurchaseInLocationVO` |
| `ic_ratio_h` | 配比出库表头 | `ic.m4d.entity.RatioOutHeadVO` |
| `ic_ratioout_b` | 配比出库表体 | `ic.m4d.entity.RatioOutBodyVO` |
| `ic_refin_b` | 参照入库单表体 | `ic.m4a.entity.GeneralRefInBodyVO` |
| `ic_reserve` | 预留 | `ic.reserve.entity.ReserveVO` |
| `ic_resexec` | 预留出入库执行名细 | `ic.reserve.entity.ReserveExecVO` |
| `ic_returnin_b` | 库存借出还回表体 | `ic.m4b.entity.ReturnInBodyVO` |
| `ic_returnin_h` | 库存借出还回单表头 | `ic.m4b.entity.ReturnInHeadVO` |
| `ic_returnin_l` | 库存借出还回单品 | `ic.m4b.entity.ReturnInLocationVO` |
| `ic_returnout_b` | 库存借入还回单表体 | `ic.m4j.entity.ReturnOutBodyVO` |
| `ic_returnout_h` | 库存借入还回单表头 | `ic.m4j.entity.ReturnOutHeadVO` |
| `ic_returnout_l` | 库存借入还回单品 | `ic.m4j.entity.ReturnOutLocationVO` |
| `ic_saleout_b` | 销售出库单表体 | `ic.m4c.entity.SaleOutBodyVO` |
| `ic_saleout_h` | 销售出库单表头 | `ic.m4c.entity.SaleOutHeadVO` |
| `ic_saleout_l` | 销售出库单货位单品表 | `ic.m4c.entity.SaleOutLocationVO` |
| `ic_sapply_b` | 出库申请单表体 | `ic.m4455.entity.SapplyBillBodyVO` |
| `ic_sapply_h` | 出库申请单表头 | `ic.m4455.entity.SapplyBillHeadVO` |
| `ic_stateadjust` | 库存状态调整 | `ic.m4460.entity.StateAdjustVO` |
| `ic_storeadmin` | 库管员管理物料 | `ic.mstoreadmin.StoreadminVO` |
| `ic_storectl` | 物料存放规则 | `ic.mstorectl.StorectlVO` |
| `ic_storestate` | 库存状态 | `ic.storestate.StoreStateVO` |
| `ic_subcontin_b` | 委托加工入库表体 | `ic.m47.entity.SubcontInBodyVO` |
| `ic_subcontin_h` | 委托加工入库 | `ic.m47.entity.SubcontInHeadVO` |
| `ic_subcontin_l` | 委托加工入库单品表 | `ic.m47.entity.SubcontInLocationVO` |
| `ic_supply` | 预留供给 | `ic.reserve.entity.SupplyVO` |
| `ic_teardown_b` | 拆卸单表体 | `ic.m4m.entity.TeardownBillBodyVO` |
| `ic_teardown_h` | 拆卸单表头 | `ic.m4m.entity.TeardownBillHeadVO` |
| `ic_transconfig` | 转储配置 | `ic.flowaccount.entity.FlowTransConfigVO` |
| `ic_transform_b` | 库存形态转换单表体 | `ic.m4n.entity.TransformBodyVO` |
| `ic_transform_h` | 库存形态转换单表头 | `ic.m4n.entity.TransformHeadVO` |
| `ic_transform_l` | 库存形态转换单品表 | `ic.m4n.entity.TransformLocationVO` |
| `ic_transin_b` | 调拨入库单表体 | `ic.m4e.entity.TransInBodyVO` |
| `ic_transin_h` | 调拨入库单表头 | `ic.m4e.entity.TransInHeadVO` |
| `ic_transin_l` | 调拨入库单货位单品表 | `ic.m4e.entity.TransInLocationVO` |
| `ic_translog` | 流水帐转储日志 | `ic.flowaccount.entity.FlowTransLogVO` |
| `ic_transout_b` | 调拨出库单表体 | `ic.m4y.entity.TransOutBodyVO` |
| `ic_transout_h` | 调拨出库单表头 | `ic.m4y.entity.TransOutHeadVO` |
| `ic_transout_l` | 调拨出库单货位单品表 | `ic.m4y.entity.TransOutLocationVO` |
| `ic_transtype` | 库存交易类型 | `ic.transtype.TransTypeExtendVO` |
| `ic_transtypetostate` | 出入库类型与库存状态关系 | `ic.transtypetostate.TransTypeToStateVO` |
| `ic_vmi_condition` | VMI汇总条件 | `ic.m50.entity.VmiSumConditionVO` |
| `ic_vmi_matchdetail` | 消耗汇总匹配明细 | `ic.m50.entity.VmiMatchDetailVO` |
| `ic_vmi_outdetail` | VMI汇总表体 | `ic.m50.entity.VmiSumBodyVO` |
| `ic_vmi_sum` | VMI汇总表头 | `ic.m50.entity.VmiSumHeaderVO` |
| `ic_vmirule_bbr` | 消耗汇总规则表体汇总单据范围 | `ic.vmirule.entity.VmiRuleBodyBillRangeVO` |
| `ic_vmirule_bor` | 消耗汇总规则表体汇总组织范围 | `ic.vmirule.entity.VmiRuleBodyOrgRangeVO` |
| `ic_vmirule_h` | 消耗汇总规则表头 | `ic.vmirule.entity.VmiRuleHeadVO` |
| `ic_wastage_b` | 签收途损表体 | `ic.m4453.entity.WastageBodyVO` |
| `ic_wastage_h` | 库存签收途损表头 | `ic.m4453.entity.WastageHeadVO` |
| `ic_wasterprocess_b` | 废品处理单表体 | `ic.m4p.entity.WasterProcessBodyVO` |
| `ic_wasterprocess_h` | 废品处理单表头 | `ic.m4p.entity.WasterProcessHeadVO` |
| `ic_wasterprocess_l` | 废品单货位单品表 | `ic.m4p.entity.WasterProcessLocationVO` |
| `ic_whstrans_b` | 转库单表体 | `ic.m4k.entity.WhsTransBillBodyVO` |
| `ic_whstrans_h` | 转库单表头 | `ic.m4k.entity.WhsTransBillHeaderVO` |
| `ic_whstrans_l` | 转库单货位单品表 | `ic.m4k.entity.WhsTransBillLocationVO` |
| `scm_qualitylevel_b` | 质量等级 | `scmf.qc.qualitylevel.entity.QualityLevelItemVO` |
| `scm_qualitylevel_h` | 质量等级组 | `scmf.qc.qualitylevel.entity.QualityLevelHeadVO` |

### invp 库存计划（19 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `invp_balance` | 需求供给平衡明细 | `invp.plan.entity.BalanceDetailVO` |
| `invp_balance_result` | 需求汇总平衡计算结果 | `invp.result.entity.BalanceResultVO` |
| `invp_balancerule` | 平衡供给规则 | `invp.balance.entity.BalanceRuleHeadVO` |
| `invp_balancerule_b` | 平衡供给规则子表 | `invp.balance.entity.BalanceRuleBodyVO` |
| `invp_forecast` | 需求预测 | `invp.forecast.entity.ForecastHeadVO` |
| `invp_forecast_b` | 需求预测明细 | `invp.forecast.entity.ForecastBodyVO` |
| `invp_gatherrule` | 需求合并依据 | `invp.balance.entity.GatherRuleVO` |
| `invp_log` | 库存计划计算日志 | `invp.plan.entity.LogHeadVO` |
| `invp_log_b` | 库存计划计算日志明细 | `invp.plan.entity.LogBodyVO` |
| `invp_param001` | 库存计划参数001 | `invp.pub.Entity.Invp001VO` |
| `invp_param002` | 库存计划参数002 | `invp.pub.entity.Invp002VO` |
| `invp_plan` | 库存计划 | `invp.plan.entity.PlanHeadVO` |
| `invp_plan_b` | 库存计划明细 | `invp.plan.entity.PlanBodyVO` |
| `invp_po` | 计划订单 | `invp.po.entity.PoVO` |
| `invp_require` | 需求明细 | `invp.plan.entity.RequireVO` |
| `invp_scheme` | 库存计划方案 | `invp.plan.entity.PlanSchemeMainVO` |
| `invp_scheme_inv` | 库存计划物料范围 | `invp.plan.entity.PlanSchemeInvVO` |
| `invp_scheme_org` | 库存组织范围 | `invp.plan.entity.PlanSchemeOrgVO` |
| `invp_supply` | 供给明细 | `invp.plan.entity.SupplyVO` |

### me 营销费用管理（23 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `me_allotset` | 营销费用归集分摊规则主实体 | `me.allotset.entity.AllotSetHVO` |
| `me_allotset_b` | 营销费用归集分摊规则子实体 | `me.allotset.entity.AllotSetBVO` |
| `me_billelement` | 归集数据核算要素 | `me.collectorder.entity.BillElement` |
| `me_collectrule` | 营销费用归集设置 | `me.collectrule.entity.CollectRuleVO` |
| `me_combine` | 营销费用归集单主实体 | `me.collectorder.entity.CombineHVO` |
| `me_combine_allot` | 营销费用归集单分摊实体 | `me.collectorder.entity.CombineAllotVO` |
| `me_combine_b` | 营销费用归集单归集子实体 | `me.collectorder.entity.CombineBVO` |
| `me_facrelset` | 营销费用归集要素对照设置 | `me.facrelationset.entity.FacRelSetVO` |
| `me_feeapply` | 客户费用申请 | `me.m4641.entity.BillHeadVO` |
| `me_feeapply_b` | 客户费用申请明细 | `me.m4641.entity.BillItemVO` |
| `me_m4640trantype` | 营销费用归集单交易类型 | `me.m4640trantype.entity.M4640TranTypeVO` |
| `me_m4641trantype` | 客户费用申请交易类型 | `me.m4641trantype.entity.M4641TranTypeVO` |
| `me_matterref` | 助促销品费用申请单 | `me.matterapp.entity.MatterAppRef` |
| `me_promotsale` | 助促销品出库核算表 | `me.salesaccount.entity.PromotSalesVO` |
| `me_promtapply` | 助促销品申请 | `me.m4642.entity.BillHeadVO` |
| `me_promtapply_b` | 助促销品申请明细 | `me.m4642.entity.BillItemVO` |
| `me_pushref` | 助促销品信息 | `me.matterapp.entity.PushSaleRef` |
| `me_pushsale` | 费用申请单助促销品申请实体 | `me.matterapp.entity.PushsaleVO` |
| `me_saleorderpro` | 销售订单收入还原 | `me.collectorder.entity.SaleOrderProVO` |
| `me_saleoutpro` | 销售出库收益表 | `me.collectorder.entity.SaleOutProVO` |
| `me_settleallot` | 返利分摊明细 | `me.collectorder.entity.SettleAllotVO` |
| `so_lrgcashmar` | 赠品兑付物料范围设置主实体 | `me.lrgcashmar.entity.LrgCashMarHVO` |
| `so_lrgcashmar_b` | 赠品兑付物料范围设置子实体 | `me.lrgcashmar.entity.LrgCashMarBVO` |

### mmdp 需求管理（8 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `dp_kmd` | 关键料驱动生产 | `mmdp.kmd.entity.KeyMaterialDrivenVO` |
| `dp_kmd_b` | 关键料驱动生产明细 | `mmdp.kmd.entity.KeyMaterialDrivenBVO` |
| `mm_aid` | 实际独立需求 | `mmdp.aid.entity.AIDVO` |
| `mm_aidsynFeature` | 实际独立需求同步下游特征 | `mmdp.aid.entity.AidSynFeatureVO` |
| `mm_demandtrack` | 需求跟踪处理 | `mmdp.dt.entity.DemandTrackVO` |
| `mm_dttreenode` | 需求跟踪处理树节点 | `mmdp.dt.entity.DTTreeNodeVO` |
| `mm_masterdemand` | 主需求维护 | `mmdp.md.entity.MasterDemandVO` |
| `mm_pid` | 计划独立需求 | `mmdp.pid.entity.PIDVO` |

### mmecn 工程变更（16 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `mm_eca` | 工程变更分析表头 | `ecn.eco.eca.entity.EcaVO` |
| `mm_eca_b` | 工程变更分析产品分析子表 | `ecn.eco.eca.entity.EcaItemVO` |
| `mm_ecaanalyzeres` | 工程变更分析结果 | `ecn.eco.eca.param.ECOAnalyzeRes` |
| `mm_ecaobjdef` | 工程变更分析对象定义 | `ecn.eco.eca.entity.ECAObjDefVO` |
| `mm_ecaoption` | 工程变更分析选项 | `ecn.eco.eca.entity.ECAOptionVO` |
| `mm_ecaoption_anaobj` | 工程变更分析选项分析对象明细 | `ecn.eco.eca.entity.ECAOptionAnaObjVO` |
| `mm_ecnreason` | 工程变更原因 | `ecn.ecnreason.entity.EcnreasonVO` |
| `mm_eco` | 工程变更单 | `ecn.eco.entity.EcoVO` |
| `mm_eco_b` | 工程变更单明细 | `ecn.eco.entity.EcoItemVO` |
| `mm_eco_g` | 工程变更单BOM材料 | `ecn.eco.entity.EcoBomItemVO` |
| `mm_ecobatchchange` | 工程变更批量变更表头 | `ecn.eco.entity.EcoBatchChangeVO` |
| `mm_ecohandle` | 工程变更现场更新 | `ecn.eco.entity.EcohandleVO` |
| `mm_ecr` | 工程变更申请 | `ecn.ecr.entity.EcrVO` |
| `mm_ecr_b` | 工程变更申请表体 | `ecn.ecr.entity.EcrItemVO` |
| `pd_ecn` | 工艺变更单 | `ecn.eco.routing.entity.EcnVO` |
| `pd_ecn_b` | 工艺变更单明细 | `ecn.eco.routing.entity.EcnItemVO` |

### mmmps 主生产计划（7 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `mm_mps` | 主生产计划 | `mmmps.mps.entity.MpsHeadVO` |
| `mm_mps_b` | 主生产计划子表 | `mmmps.mps.entity.MpsItemVO` |
| `mm_mps_revise` | 主生产计划修订版本 | `mmmps.mps.entity.MpsReviseHeadVO` |
| `mm_mps_revise_b` | 主生产计划修订版本子表 | `mmmps.mps.entity.MpsReviseItemVO` |
| `mm_rccp` | 粗能力计划 | `mmpps.rccp1304.RCCPHeadVO` |
| `mm_rccp_b` | 粗能力计划子表（来源表） | `mmpps.rccp1304.RCCPItemVO` |
| `mm_resourcelist` | 资源清单 | `mmpps.rccp1302.ResourceListVO` |

### mmpac 生产任务管理公共（76 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `mm_adjust` | 生产订单单产品挪料 | `mmpac.adjust.Entity.AdjustHeadVO` |
| `mm_barcodecon` | 条码工作台 | `mmpac.barcodem.barcodeconsole.entity.BarcodeConsoleHeadVO` |
| `mm_barcodecon_scanred` | 扫描记录 | `mmpac.barcodem.barcodeconsole.entity.BarcodeConsoleScanredVO` |
| `mm_batch_prod` | 批次对照表 | `mmpac.batchass.prod.entity.BatProdVO` |
| `mm_batchbind` | 批次关联 | `mmpac.batchass.pick.entity.BatchBindVO` |
| `mm_batchbind_b` | 批次关联明细 | `mmpac.batchass.pick.entity.BatchBindItemVO` |
| `mm_dmo` | 离散生产订单 | `mmpac.dmo.entity.DmoVO` |
| `mm_dmo_procedure` | 工序计划 | `mmpac.dmo.entity.DmoProcedureVO` |
| `mm_dmo_procedure_v` | 工序计划 | `mmpac.dmo.entity.DmoProcedureVerVO` |
| `mm_dmo_serialno` | 离散生产订单序列号 | `mmpac.dmo.entity.DmoSerialNoVO` |
| `mm_dmo_v` | 离散订单版本 | `mmpac.dmo.entity.DmoVerVO` |
| `mm_dmosrc` | 离散生产订单来源 | `mmpac.dmo.entity.DmoSrcVO` |
| `mm_dmotranstype` | 离散生产订单交易类型 | `mmpac.dmo.entity.transtype.DmoTransTypeVO` |
| `mm_energy` | 能源产耗 | `mmpac.wr.entity.EnergyVO` |
| `mm_handtake` | 交接单 | `mmpac.handtake.entity.HandTakeHVO` |
| `mm_handtake_b` | 交接单明细 | `mmpac.handtake.entity.HandTakeBVO` |
| `mm_maba` | 物料平衡分析 | `mmpac.pac0424.MaBAVO` |
| `mm_mo` | 流程生产订单明细 | `mmpac.pmo.pac0002.entity.PMOItemVO` |
| `mm_mo_planoutput` | 计划产出明细 | `mmpac.pmo.pac0002.entity.PMOPlanOutputVO` |
| `mm_mo_rc` | 流程生产订单工序计划明细 | `mmpac.pmo.pac0002.entity.PMOItemVO_RC` |
| `mm_mo_taskdetail` | 任务分解明细 | `mmpac.pmo.pac0002.entity.PMOTaskDetailVO` |
| `mm_mobatchtrace_c` | 批次追溯条件 | `mmpac.batchass.trace.param.BatchTraceCondVO` |
| `mm_mobttree` | 批次追溯树 | `mmpac.batchass.trace.param.BatchTraceTreeVO` |
| `mm_moexchange` | 生产订单挪料 | `mmpac.pac0206.MoExchangeVO` |
| `mm_mos` | 配套变更建议 | `mmpac.mo.mos.entity.MosVO` |
| `mm_motrantype` | 流程生产订单交易类型 | `mmpac.pmo.pac0002.entity.PMOTransTypeVO` |
| `mm_pickm` | 备料计划 | `mmpac.pickm.entity.PickmHeadVO` |
| `mm_pickm_b` | 备料计划明细 | `mmpac.pickm.entity.PickmItemVO` |
| `mm_pickmquery` | 备料计划统计 | `mmpac.pickm.pickms.entity.PickmQueryVO` |
| `mm_pickmquery_b` | 备料计划统计明细 | `mmpac.pickm.pickms.entity.PickmQueryItems` |
| `mm_pickmtranstype` | 备料计划交易类型 | `mmpac.pickm.entity.PickmTransTypeVO` |
| `mm_pmo` | 流程生产订单 | `mmpac.pmo.pac0002.entity.PMOHeadVO` |
| `mm_pmo_item_v` | 流程生产订单明细版本 | `mmpac.pmo.pac0002.entity.PMOItemVerVO` |
| `mm_pmo_planoutput_v` | 计划产出明细版本 | `mmpac.pmo.pac0002.entity.PMOPlanOutputVerVO` |
| `mm_pmo_procedure` | 工序计划明细 | `mmpac.pmo.pac0002.entity.PMOProcedureVO` |
| `mm_pmo_procedure_v` | 工序计划明细版本 | `mmpac.pmo.pac0002.entity.PMOProcedureVerVO` |
| `mm_pmo_rc` | 流程生产订单 | `mmpac.pmo.pac0002.entity.PMOHeadVO_RC` |
| `mm_pmo_serialno` | 序列号明细 | `mmpac.pmo.pac0002.entity.PMOSerialNoVO` |
| `mm_pmo_v` | 流程生产订单版本 | `mmpac.pmo.pac0002.entity.PMOHeadVerVO` |
| `mm_pmosrc` | 流程生产订单来源 | `mmpac.pmo.pac0002.entity.PMOSrcVO` |
| `mm_procon` | 生产工作台 | `mmpac.proconsole.entity.ProConVO` |
| `mm_procon_bfinstock` | 报废入库单 | `mmpac.proconsole.entity.ProConBfInStockVO` |
| `mm_procon_handover` | 交接单移交 | `mmpac.proconsole.entity.ProConHandoverVO` |
| `mm_procon_instock` | 产成品入库单 | `mmpac.proconsole.entity.ProConInStockVO` |
| `mm_procon_outstock` | 材料出库单 | `mmpac.proconsole.entity.ProConOutStockVO` |
| `mm_procon_pickm` | 备料计划 | `mmpac.proconsole.entity.ProConPickmVO` |
| `mm_procon_procedure` | 工序计划 | `mmpac.proconsole.entity.ProConProcedureVO` |
| `mm_procon_receive` | 交接单接收 | `mmpac.proconsole.entity.ProConReceiveVO` |
| `mm_procon_wr` | 生产报告 | `mmpac.proconsole.entity.ProConWrVO` |
| `mm_putplan` | 投放计划 | `mmpac.putplan.entity.PutPlanVO` |
| `mm_putplan_b` | 投放计划明细 | `mmpac.putplan.entity.PutPlanPickmVO` |
| `mm_reqpickm` | 备料申请单 | `mmpac.reqpickm.entity.ReqPickmHeadVO` |
| `mm_reqpickm_b` | 备料申请明细表 | `mmpac.reqpickm.entity.ReqPickmItemVO` |
| `mm_reqpickm_c` | 备料申请汇总条件 | `mmpac.reqpickm.entity.ReqPickmCondVO` |
| `mm_reqpickm_com` | 备料申请计算 | `mmpac.reqpickm.entity.ReqPickmComVO` |
| `mm_reqpickm_s` | 备料申请汇总表 | `mmpac.reqpickm.entity.ReqPickmSumVO` |
| `mm_ta` | 作业申报 | `mmpac.apply.task.entity.TaskAHVO` |
| `mm_ta_b` | 作业申报体 | `mmpac.apply.task.entity.TaskABVO` |
| `mm_wr` | 生产报告 | `mmpac.wr.entity.WrVO` |
| `mm_wr` | 生产报告 | `mmpac.wr.entity.WrChangeVO` |
| `mm_wr_change` | 生产报告交换表体 | `mmpac.wr.entity.WrChangeItemVO` |
| `mm_wr_pick` | 生产报告消耗信息 | `mmpac.wr.entity.WrPickVO` |
| `mm_wr_product` | 生产报告产出信息 | `mmpac.wr.entity.WrItemVO` |
| `mm_wr_quality` | 生产报告质量信息 | `mmpac.wr.entity.WrQualityVO` |
| `mm_wr_serialno` | 生产报告序列号信息 | `mmpac.wr.entity.WrSerialNoVO` |
| `mm_wrs` | 生产报告统计 | `mmpac.wr.wrs.entity.WrsBodyVO` |
| `mm_wrs_q` | 生产报告统计条件 | `mmpac.wr.wrs.entity.WrsHeadVO` |
| `mm_wrtranstype` | 生产报告交易类型 | `mmpac.wr.entity.WrTransTypeVO` |
| `mmpac_batchtrace` | 批次追溯 | `mmpac.batchass.trace.entity.BatchTraceHeadVO` |
| `mmpac_batchtrace_b` | 批次追溯明细 | `mmpac.batchass.trace.entity.BatchTraceBodyVO` |
| `mmpac_dmotrace` | 多级离散生产订单追踪 | `mmpac.dmo.dmot.entity.DmoTraceVO` |
| `mmpac_dmotracetee` | 多级离散生产订单追踪树节点 | `mmpac.dmo.dmot.entity.DmoTraceTreeVO` |
| `mmpac_rbatchtrace` | 反向批次追溯 | `mmpac.batchass.rtrace.entity.RBatchTraceHeadVO` |
| `mmpac_rbatchtrace_b` | 反向批次追溯明细 | `mmpac.batchass.rtrace.entity.RBatchTraceBodyVO` |
| `pac_Entity` | 流程订单追踪树节点 | `mmpac.pmotrace.pac0402.entity.PmoTreeVO` |
| `pmo_tracedata` | 流程生产订单追踪拉平数据 | `mmpac.pmotrace.pac0402.entity.PmoTreeQueryVO` |

### mmpps 生产计划公共（38 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `mm_calcbmrt` | BOM/工艺匹配规则快照 | `mmpps.calc.entity.vermatch.BomMatchRtVO` |
| `mm_calcbom` | 物料清单快照 | `mmpps.bomsnap.entity.BomSnapVO` |
| `mm_calcbomitem` | 物料清单明细快照 | `mmpps.bomsnap.entity.BomItemSnapVO` |
| `mm_calcbomloss` | 物料清单子项阶梯损耗快照 | `mmpps.bomsnap.entity.BomLossSnapVO` |
| `mm_calcbomoutput` | 物料清单多产出快照 | `mmpps.bomsnap.entity.BomOutputSnapVO` |
| `mm_calcbomuseorg` | 物料清单使用组织快照 | `mmpps.bomsnap.entity.BomUseOrgSnapVO` |
| `mm_calcdemand` | 需求来源明细 | `mmpps.calc.entity.calculate.DemandVO` |
| `mm_calclog` | 运算日志 | `mmpps.calc.entity.log.LogVO` |
| `mm_calclog_b` | 运算日志明细 | `mmpps.calc.entity.log.LogItemVO` |
| `mm_calcmatch` | 需求供给匹配 | `mmpps.calc.entity.calculate.MatchVO` |
| `mm_calcmatch` | 供需匹配 | `mmpps.plo.sd.entity.PWBSmatchItems` |
| `mm_calcmaterial` | 物料范围 | `mmpps.calc.entity.calculate.MaterialVO` |
| `mm_calcpdemand` | 父项需求来源明细 | `mmpps.calc.entity.calculate.PDemandVO` |
| `mm_calcrealsubs` | 实际替代快照 | `mmpps.calc.entity.realsubs.RealSubsVO` |
| `mm_calcrp` | 重排建议 | `mmpps.calc.entity.rp.RescheduleVO` |
| `mm_calcsum` | 汇总表 | `mmpps.calc.entity.calculate.SumVO` |
| `mm_calcsum` | 运算清单 | `mmpps.plo.sd.entity.PWBSsnumItems` |
| `mm_calcsupply` | 供给来源 | `mmpps.calc.entity.calculate.SupplyVO` |
| `mm_demandscope` | 需求范围 | `mmpps.calc.entity.demandscope.DemandScopeVO` |
| `mm_mpssubs` | MPS计划订单替代 | `mmpps.replace.entity.MpsSubsVO` |
| `mm_mrpsubs` | MRP计划订单替代 | `mmpps.replace.entity.MrpSubsVO` |
| `mm_plo` | 计划订单 | `mmpps.mps0202.PoVO` |
| `mm_plo` | 计划来源反查表头 | `mmpps.planbusi.sr.entity.PoSrcReverseHeadVO` |
| `mm_plo` | 计划员工作台 | `mmpps.plo.sd.entity.PWBVO` |
| `mm_plocombinescheme` | 合并方案 | `mmpps.plo.entity.PloCombineSchemeVO` |
| `mm_plosource` | 计划订单来源表 | `mmpps.plo.entity.PloSourceVO` |
| `mm_posrcreverse_b` | 计划来源反查表体 | `mmpps.planbusi.sr.entity.PoSrcReverseItemVO` |
| `mm_ps` | 计划方案 | `mmpps.calc.entity.schema.SchemaVO` |
| `mm_ps_material` | 计划方案物料明细 | `mmpps.calc.entity.schema.SchemaItemVO` |
| `mm_sdbdemand` | 需求明细 | `mmpps.lotreg.entity.SdbDemandVO` |
| `mm_sdbicbook` | 入库单预定表 | `mmpps.lotreg.entity.SdbICBookVO` |
| `mm_sdblotreg` | 供需预定表 | `mmpps.lotreg.entity.SdbLotRegVO` |
| `mm_sdbmatch` | 匹配明细 | `mmpps.lotreg.entity.SdbMatchVO` |
| `mm_sdbsort` | 供需预定排序 | `mmpps.lotreg.entity.SdbSortVO` |
| `mm_sdbsupply` | 供给范围 | `mmpps.lotreg.entity.SdbSupplyVO` |
| `mm_supplyanalysis` | 供给查询需求 | `mmpps.planbusi.sa.entity.SupplyAnalysisHeadVO` |
| `mm_supplyanalysis_b` | 供给查询需求子表 | `mmpps.planbusi.sa.entity.SupplyAnalysisItemVO` |
| `pwb_ploexe` | 计划订单执行子表 | `mmpps.plo.sd.entity.PWBPloExeItems` |

### mmpsc 工序委外管理（18 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `mm_pscorder` | 工序委外订单 | `mmpsc.pscorder.entity.PscorderHeadVO` |
| `mm_pscorder_b` | 工序委外订单明细 | `mmpsc.pscorder.entity.PscorderBodyVO` |
| `mm_pscorder_trantype` | 工序委外订单交易类型 | `mmpsc.pscorder.entity.PscorderTransTypeVO` |
| `mm_pscplan` | 工序委外计划 | `mmpsc.pscplan.entity.PscPlanVO` |
| `mm_pscprice` | 工序委外价目表 | `mmpsc.pscprice.entity.PscPriceVO` |
| `mm_pscrecive` | 半成品收货单 | `mmpsc.pscrecive.entity.PscreciveHeadVO` |
| `mm_pscrecive_b` | 收货单明细 | `mmpsc.pscrecive.entity.PscreciveItemVO` |
| `mm_pscrecive_qc` | 收货单质检信息 | `mmpsc.pscrecive.entity.PscreciveQcVO` |
| `mm_pscrecive_trantype` | 收货单交易类型 | `mmpsc.pscrecive.entity.PscReciveTransTypeVO` |
| `mm_pscsend` | 半成品发货单 | `mmpsc.pscsend.entity.PscsendHeadVO` |
| `mm_pscsend_b` | 半成品发货单明细 | `mmpsc.pscsend.entity.PscsendItemVO` |
| `mm_pscsend_transtype` | 半成品发货单交易类型 | `mmpsc.pscsend.entity.PscsendTransTypeVO` |
| `mm_pscsettle` | 加工费结算单 | `mmpsc.pscsettle.entity.SettleHeadVO` |
| `mm_pscsettle_b` | 加工费结算单明细 | `mmpsc.pscsettle.entity.SettleItemVO` |
| `mm_pscverify` | 工序委外材料核销 | `mmpsc.pscrecive.verify.entity.VerifyHeadVO` |
| `mm_pscverify_b` | 工序委外材料核销明细 | `mmpsc.pscrecive.verify.entity.VerifyItemVO` |
| `mm_showpscrecive` | 收货单 | `mmpsc.pscrecive.entity.ShowPscreciveHeadVO` |
| `mm_showpscrecive_b` | 收货单展示明细 | `mmpsc.pscrecive.entity.ShowPscreciveItemVO` |

### mmpsm 排产管理（9 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `mm_capadjustdoc` | 产能调节单 | `mmpps.psm0006.CapAdjustDocVO` |
| `mm_ganttscheme` | 甘特图设置方案 | `mmpps.psm0010.GanttSchemeVO` |
| `mm_mpsm` | 主排产表头 | `psm.mpsm.entity.MPSMVO` |
| `mm_mpsm_pm` | 排产对象信息 | `psm.mpsm.entity.MPSMPMVO` |
| `mm_mpsm_wkg` | 能力信息 | `psm.mpsm.entity.MPSMWkgVO` |
| `mmpsm_analog` | 模拟订单 | `mmpps.psm0010.AnalogVO` |
| `mmpsm_exception` | 异常检查 | `mmpps.psm0010.ScheduleExceptionInfoVO` |
| `mmpsm_schedulemps` | 排产主生产计划 | `mmpps.psm0010.ScheduleMpsVO` |
| `mmpsm_schedulepo` | 排产计划订单 | `mmpps.psm0010.SchedulePoVO` |

### mmpub 生产制造公共（10 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `mm_realsubs` | 实际替代表 | `mmpub.replace.entity.RealsubsVO` |
| `mm_saanalysis` | 齐套分析对象 | `mmpub.setanalysis.entity.SaAnalysisVO` |
| `mm_sademand` | 相关需求 | `mmpub.setanalysis.entity.SaDemandVO` |
| `mm_salog` | 齐套分析日志 | `mmpub.setanalysis.entity.SaLogVO` |
| `mm_samatch` | 需求供给匹配 | `mmpub.setanalysis.entity.SaMatchVO` |
| `mm_samaterial` | 物料范围 | `mmpub.setanalysis.entity.SaMaterialVO` |
| `mm_saoption` | 分析选项 | `mmpub.setanalysis.entity.SaOptionVO` |
| `mm_sashortage` | 缺货明细 | `mmpub.setanalysis.entity.SaShortageVO` |
| `mm_sastore` | 仓库 | `mmpub.setanalysis.entity.SaStoreVO` |
| `mm_sasupply` | 供给来源 | `mmpub.setanalysis.entity.SaSupplyVO` |

### mmsfc 车间管理（14 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `mm_dispatchlist` | 派工单 | `mmsfc.dispatchlist.entity.DispatchlistHeadVO` |
| `mm_dispatchlist_b` | 派工单明细 | `mmsfc.dispatchlist.entity.DispatchlistItemVO` |
| `mm_dispatchlist_transtype` | 派工单交易类型 | `mmsfc.dispatchlist.entity.DispatchlistTransTypeVO` |
| `mm_dispatchpickm` | 派工单用料明细 | `mmsfc.dispatchlist.entity.DispatchPickmVO` |
| `mm_operationrep` | 工序完工报告 | `mmsfc.operationrep.entity.OprepVO` |
| `mm_operationrep_b` | 工序完工报告明细 | `mmsfc.operationrep.entity.OprepItemVO` |
| `mm_operationrep_qc` | 工序完工报告质量等级 | `mmsfc.operationrep.entity.OprepQcVO` |
| `mm_oprep_bf` | 工序完工报告倒冲 | `mmsfc.operationrep.backflush.entity.BfVO` |
| `mm_oprep_bf_b` | 工序完工报告倒冲明细 | `mmsfc.operationrep.backflush.entity.BfItemVO` |
| `mm_oprep_renew` | 工序完工报告返工补投 | `mmsfc.operationrep.renew.entity.OprepRenewVO` |
| `mm_oprep_renew_b` | 工序完工报告返工补投明细 | `mmsfc.operationrep.renew.entity.OprepRenewItemVO` |
| `mm_opreptranstype` | 工序完工报告交易类型 | `mmsfc.operationrep.entity.OprepTransTypeVO` |
| `mm_transfer` | 工序转移 | `mmsfc.transfer.entity.TransferHeadVO` |
| `mm_transfer_b` | 工序转移明细 | `mmsfc.transfer.entity.TransferItemVO` |

### mmsop 销售运营计划（7 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `mm_pdfamrate` | 产品簇生产比例 | `mmsop.productfamilyrate.entity.ProductFamilyRateVO` |
| `mm_pdfamrate_b` | 产品簇生产比例明细 | `mmsop.productfamilyrate.entity.ProductFamilyRateDetailVO` |
| `mm_plandecomp` | 生产计划分解 | `mmsop.ppm.plandecomp.entity.PlanDecompVO` |
| `mm_sop` | 销售运营计划 | `mmsop.sop.entity.SOPVO` |
| `mm_sop_b` | 销售运营计划明细 | `mmsop.sop.entity.SOPDetailVO` |
| `mm_sopdecomp` | 销售运营计划分解信息 | `mmsop.sop.entity.SOPDecompVO` |
| `mm_taskreleaseset` | 释放配置 | `mmsop.ppm.releaseset.entity.TaskReleaseSetVO` |

### mpp 采购计划（2 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `po_plan` | 采购计划 | `mpp.m2t.entity.PoPlanHeaderVO` |
| `po_plan_b` | 采购计划明细 | `mpp.m2t.entity.PoPlanItemVO` |

### opc B2B订单中心（8 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `opc_cpohistory` | 预订单历史主表 | `opc.mc1.entity.CPOHistoryHVO` |
| `opc_cpohistory_b` | 预订单历史子表 | `opc.mc1.entity.CPOHistoryBVO` |
| `opc_customerpo` | 预订单主表 | `opc.mc1.entity.CustomerPOHVO` |
| `opc_customerpo_b` | 预订单子表 | `opc.mc1.entity.CustomerPOBVO` |
| `opc_mc1trantype` | 预订单交易类型 | `opc.mc1trantype.entity.Mc1TranTypeVO` |
| `opc_profit` | 销售毛利预估 | `opc.entry.ProfitVO` |
| `opcexec_asn` | 预先发货通知头 | `opcexec.asn.entity.ASNHVO` |
| `opcexec_asn_b` | 预先发货通知体 | `opcexec.asn.entity.ASNBVO` |

### price 销售价格（27 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `prm_adjdiscount` | 基准折扣调整单主实体 | `price.adjustdiscount.entity.AdjustDiscountHeaderVO` |
| `prm_adjdiscount_b` | 基准折扣调整单子实体 | `price.adjustdiscount.entity.AdjustDiscountItemVO` |
| `prm_adjpricetype` | 价格调整单交易类型 | `price.adjustprice.m4311trantype.entity.M4311TranTypeVO` |
| `prm_adjpromote` | 促销价格调整单 | `price.adjustpromote.entity.AdjustPromoteHeaderVO` |
| `prm_adjpromote_b` | 促销价格调整单明细 | `price.adjustpromote.entity.AdjustPromoteItemVO` |
| `prm_adjustprice` | 价格调整单 | `price.adjustprice.entity.AdjustPriceHVO` |
| `prm_adjustprice_b` | 价格调整单明细 | `price.adjustprice.entity.AdjustPriceBVO` |
| `prm_basediscount` | 基准折扣表明细 | `price.discount.entity.BaseDiscountDetailVO` |
| `prm_batchlevel` | 批量分级 | `price.batchlevel.entity.BatchlevelVO` |
| `prm_conditionsrc` | 条件来源 | `price.pricecondition.entity.PriceCondSourceVO` |
| `prm_discountdef` | 基准折扣定义 | `price.discount.entity.BaseDiscountDefVO` |
| `prm_m4313trantype` | 促销价格调整单交易类型 | `price.adjustpromote.trantype.M4313TranTypeVO` |
| `prm_policymatch` | 定价策略匹配 | `price.pricepolicymatch.entity.PricePolicyMatchVO` |
| `prm_pplimitexe` | 限量促销执行量实体 | `price.pplimitexe.PPLimitExeVO` |
| `prm_pricecondition` | 定价条件 | `price.pricecondition.entity.PriceConditionVO` |
| `prm_priceform` | 价格组成主实体 | `price.pub.entity.PriceFormHVO` |
| `prm_priceform_b` | 价格组成子实体 | `price.pub.entity.PriceFormBVO` |
| `prm_priceform_b_p` | 价格组成中间子实体 | `price.pub.entity.PriceFormTempBVO` |
| `prm_priceform_p` | 价格组成中间实体 | `price.pub.entity.PriceFormTempHVO` |
| `prm_pricepolicy` | 定价策略 | `price.pricepolicy.entity.PricePolicyVO` |
| `prm_priceprocess` | 定价过程主实体 | `price.priceprocess.entity.PriceProcessHVO` |
| `prm_priceprocess_b` | 定价过程子实体 | `price.priceprocess.entity.PriceProcessBVO` |
| `prm_pricetype` | 价格项 | `price.pricetype.entity.PriceTypeVO` |
| `prm_promoteprice` | 促销价格实体 | `price.promoteprice.PromotePriceVO` |
| `prm_tariff` | 价目表维护 | `price.tariff.entity.tariffdetail.TariffDetailVO` |
| `prm_tariffdef` | 价目表定义 | `price.tariff.entity.tariffdef.TariffDefHVO` |
| `prm_tariffrefitem` | 价目表引用价格项 | `price.tariff.entity.tariffdef.TariffDefBVO` |

### pu 采购管理（49 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `po_arriveorder` | 到货单主表 | `pu.m23.entity.ArriveHeaderVO` |
| `po_arriveorder_b` | 到货单明细表 | `pu.m23.entity.ArriveItemVO` |
| `po_arriveorder_bb` | 到货单质检明细表 | `pu.m23.entity.ArriveBbVO` |
| `po_buyrtrantype` | 请购单交易类型 | `pu.m20trantype.entity.BuyrTranTypeVO` |
| `po_costfactor` | 采购成本要素 | `pu.costfactor.entity.CostfactorHeaderVO` |
| `po_costfactor_b` | 采购成本要素表体 | `pu.costfactor.entity.CostfactorItemVO` |
| `po_initialest` | 期初暂估单 | `pu.m4t.entity.InitialEstHeaderVO` |
| `po_initialest_b` | 期初暂估单明细 | `pu.m4t.entity.InitialEstItemVO` |
| `po_invctrantype` | 采购发票交易类型 | `pu.m25trantype.entity.InvcTranTypeVO` |
| `po_invoice` | 采购发票主表 | `pu.m25.entity.InvoiceHeaderVO` |
| `po_invoice_b` | 采购发票子表 | `pu.m25.entity.InvoiceItemVO` |
| `po_invoice_settle` | 付款计划 | `pu.m25.entity.InvoiceSettleItemVO` |
| `po_order` | 采购订单 | `pu.m21.entity.OrderHeaderVO` |
| `po_order_b` | 采购订单明细 | `pu.m21.entity.OrderItemVO` |
| `po_order_bb` | 采购订单在途状态 | `pu.m21.entity.StatusOnWayItemVO` |
| `po_order_bb1` | 到货计划 | `pu.m21.entity.OrderReceivePlanVO` |
| `po_order_bb_vo` | 采购订单在途状态VO | `pu.m21.entity.OrderOnwayItemVO` |
| `po_order_payment` | 付款账期 | `pu.m21.entity.OrderPaymentVO` |
| `po_order_payplan` | 付款计划 | `pu.m21.entity.PayPlanVO` |
| `po_order_price` | 采购询价 | `pu.m21.entity.OrderPriceVO` |
| `po_order_price_b` | 采购询价明细 | `pu.m21.entity.OrderPriceItemVO` |
| `po_order_vo` | 采购订单在途VO | `pu.m21.entity.OrderOnwayHeaderVO` |
| `po_position` | 岗位设置 | `pu.position.entity.PositionHeaderVO` |
| `po_position_b` | 岗位设置子表 | `pu.position.entity.PositionItemVO` |
| `po_position_t` | 岗位设置附表 | `pu.position.entity.PositionTVO` |
| `po_potrantype` | 采购订单交易类型 | `pu.m21transtype.entity.PoTransTypeVO` |
| `po_praybill` | 请购单主表 | `pu.m20.entity.PraybillHeaderVO` |
| `po_praybill_b` | 请购单子表 | `pu.m20.entity.PraybillItemVO` |
| `po_praypriceinfo` | 价格论证表 | `pu.m20.entity.PrayPriceInfoVO` |
| `po_pricesettle` | 价格结算单 | `pu.m24.entity.PricestlHeaderVO` |
| `po_pricesettle_b` | 价格结算单子表 | `pu.m24.entity.PricestlItemVO` |
| `po_pricesettle_bb` | 价格结算单子子表 | `pu.m24.entity.PricestlItemBVO` |
| `po_purchaseinfi` | 采购入财务头 | `pu.m4201.entity.PurchaseinFIHeaderVO` |
| `po_purchaseinfi_b` | 采购入财务体 | `pu.m4201.entity.PurchaseinFIItemVO` |
| `po_purchaseinfi_fd` | 暂估费用分摊明细 | `pu.m4201.entity.PurchaseinFIFDVO` |
| `po_purchaseinfi_fee` | 采购入费用暂估明细 | `pu.m4201.entity.PurchaseinFIFeeVO` |
| `po_rule_invoicestock` | 自动结算之发票入库单 | `pu.m27.entity.InvoiceStockOptionableVO` |
| `po_rule_rbinvoice` | 自动结算之红蓝发票 | `pu.m27.entity.RBInvoiceOptionableVO` |
| `po_rule_rbstock` | 自动结算之红蓝入库单 | `pu.m27.entity.RBStockOptionableVO` |
| `po_settle_feeallot` | 结算费用分摊明细 | `pu.m27.entity.SettleFeeAllotDetailVO` |
| `po_settlebill` | 结算单头 | `pu.m27.entity.SettleBillHeaderVO` |
| `po_settlebill_b` | 结算单明细 | `pu.m27.entity.SettleBillItemVO` |
| `po_storereq` | 物资需求申请单 | `pu.m422x.entity.StoreReqAppHeaderVO` |
| `po_storereq_b` | 物资需求申请单明细 | `pu.m422x.entity.StoreReqAppItemVO` |
| `po_subcontinfi` | 委托加工入财务 | `pu.m4203.entity.SubcontinFIHeaderVO` |
| `po_subcontinfi_b` | 委托加工入财务明细 | `pu.m4203.entity.SubcontinFIItemVO` |
| `po_vmifi` | 消耗汇总财务 | `pu.m4202.entity.VmiFIHeaderVO` |
| `po_vmifi_fd` | 消耗汇总费用暂估分摊明细 | `pu.est.entity.m50.VmiFIFDVO` |
| `po_vmifi_fee` | 消耗汇总费用暂估明细 | `pu.m4202.entity.VmiFIFeeVO` |

### purp 采购价格（17 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `purp_account` | 邮箱账户设置 | `pp.account.entity.AccountVO` |
| `purp_askbill` | 询报价单 | `pp.m29.entity.AskBillHeaderVO` |
| `purp_askbill_b` | 询报价单明细 | `pp.m29.entity.AskBillItemVO` |
| `purp_askbill_transtype` | 询报价单交易类型 | `pp.m29.entity.AskBillTransTypeVO` |
| `purp_discount_b1` | 折扣梯度 | `pp.pub.discount.entity.DiscountGradsItemVO` |
| `purp_discount_b2` | 单品折扣 | `pp.pub.discount.entity.DiscountSingleItemVO` |
| `purp_discount_b3` | 组合折扣 | `pp.pub.discount.entity.DiscountCompagesItemVO` |
| `purp_discount_b4` | 适用组织 | `pp.pub.discount.entity.DiscountApplyOrgItemVO` |
| `purp_discount_h` | 采购折扣 | `pp.pub.discount.entity.DiscountHeaderVO` |
| `purp_priceaudit` | 价格审批单 | `pp.m28.entity.PriceAuditHeaderVO` |
| `purp_priceaudit_b` | 价格审批单明细 | `pp.m28.entity.PriceAuditItemVO` |
| `purp_priceaudit_transtype` | 价格审批单交易类型 | `pp.m28.entity.PriceAuditTransTypeVO` |
| `purp_qpscheme` | 优质优价方案主表 | `pp.hqhp.qpschm.entity.QPSchmHeaderVO` |
| `purp_qpscheme_b` | 优质优价方案子表 | `pp.hqhp.qpschm.entity.QPSchmItemVO` |
| `purp_qpstandard` | 优质优价标准主表 | `pp.hqhp.qpstandard.entity.QPStandardHeaderVO` |
| `purp_qpstandard_b` | 优质优价标准子表 | `pp.hqhp.qpstandard.entity.QPStandardItemVO` |
| `purp_supplierprice` | 供应商价目表 | `pp.supplierprice.entity.SupplierPriceVO` |

### sc 委外加工（9 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `sc_adjustbill` | 委外调整单 | `sc.m62.entity.AdjustHeaderVO` |
| `sc_adjustbill_b` | 委外调整单明细 | `sc.m62.entity.AdjustItemVO` |
| `sc_issue` | 委外订单发料表 | `sc.m61.entity.SCOrderIssueVO` |
| `sc_order` | 委外订单 | `sc.m61.entity.SCOrderHeaderVO` |
| `sc_order_b` | 委外订单明细 | `sc.m61.entity.SCOrderItemVO` |
| `sc_ordertranstype` | 委外订单交易类型 | `sc.m61.entity.SCOrderTranstypeVO` |
| `sc_verify` | 材料核销关系 | `sc.m66.entity.VerifyHeadVO` |
| `sc_verify_b` | 材料核销关系明细 | `sc.m66.entity.VerifyItemVO` |
| `sc_verifyrule` | 自动核销规则 | `类名称` |

### scmpub 供应链基础设置（50 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `ic_barcodeparse` | 条形码解析 | `ic.barcodeparse.BarCodeParseVO` |
| `dcm_chnlmngtype` | 渠道管理分类 | `scmf.dcm.chnlmngtype.entity.ChnlMngTypeVO` |
| `dcm_chnlnode` | 分销渠道节点主实体 | `scmf.dcm.chnlnode.entity.ChnlNodeHVO` |
| `dcm_chnlnodeaddr` | 分销渠道节点子实体 | `scmf.dcm.chnlnode.entity.ChnlNodeAddrBVO` |
| `dcm_chnlsellerrel` | 渠道节点与助销员关系定义 | `scmf.dcm.chnlsellerrel.entity.ChnlSellerRelVO` |
| `dcm_helpsellclass` | 助销员分类 | `scmf.dcm.helpsellclass.entity.HelpSellClassVO` |
| `dcm_helpseller` | 助销员 | `scmf.dcm.helpseller.entity.HelpSellerVO` |
| `dm_carrier` | 承运商定义 | `scmf.dm.carrier.entity.CarrierVO` |
| `dm_driver` | 司机定义 | `scmf.dm.driver.entity.DriverVO` |
| `dm_prepaidinvoice` | 代垫运费发票主表 | `scmf.dm.m4816.entity.PrePaidInvoiceHVO` |
| `dm_prepaidinvoice_b` | 代垫运费发票子表 | `scmf.dm.m4816.entity.PrePaidInvoiceBVO` |
| `dm_route` | 运输路线 | `scmf.dm.route.entity.RouteHVO` |
| `dm_routeaddr` | 运输线路地址 | `scmf.dm.route.entity.RouteBVO` |
| `dm_vehicle` | 车辆定义 | `scmf.dm.vehicle.entity.VehicleVO` |
| `dm_vehicletype` | 车型定义 | `scmf.dm.vehicletype.entity.VehicleTypeVO` |
| `ic_packingtype` | 包装分类档案 | `scmf.ic.mpackingtype.PackingTypeVO` |
| `ic_packtype` | 包装箱类型 | `scmf.ic.mpacktype.PackTypeVO` |
| `ic_wholepack` | 整箱定义 | `scmf.ic.mwholepack.WholePackVO` |
| `scm_backreason` | 退货理由设置 | `scmf.pu.backreason.entity.BackReasonVO` |
| `scm_batchcode` | 批次档案 | `scmf.ic.mbatchcode.BatchcodeVO` |
| `scm_batchcode_rule` | 物料批次号规则 | `scmf.ic.batchcoderule.BatchcodeRuleVO` |
| `scm_cenpurule` | 集采控制规则 | `scmf.pu.cenpurule.entity.CenPuRuleHeadVO` |
| `scm_cenpurule_b` | 集采控制规则子表 | `scmf.pu.cenpurule.entity.CenPuRuleItemVO` |
| `scm_coopsetup` | 协同设置主表 | `scmf.coop.entity.CoopHeaderVO` |
| `scm_coopsetup_b` | 销售协同明细 | `scmf.coop.entity.CoopBodyVO` |
| `scm_goldtax` | 金税主实体 | `scmpub.goldtax.GoldTaxHeadVO` |
| `scm_goldtax_b` | 金税子实体 | `scmpub.goldtax.GoldTaxBodyVO` |
| `scm_invsourcelist` | 内部货源定义 | `scmf.pu.invsource.entity.InvSourceVO` |
| `scm_martrantype` | 物料对应订单交易类型设置 | `scmf.pu.ordertranstype.entity.OrderTransTypeVO` |
| `scm_promottype` | 促销类型定义实体 | `scmf.promottype.entity.PromotTypeVO` |
| `scm_smconfig` | 暂存摘要配置 | `scmpub.tempsave.SummaryConfigHeadVO` |
| `scm_smconfig_b` | 暂存摘要配置明细 | `scmpub.tempsave.SummaryConfigBodyVO` |
| `scm_tempsave` | 暂存数据 | `scmpub.tempsave.TempSaveVO` |
| `scmpub_sourcetype` | 询源补货单据类型 | `scmf.sourcing.entity.SourBillTypeVO` |
| `so_arsub` | 销售费用单主表实体 | `so.m35.entity.ArsubHVO` |
| `so_arsub_b` | 销售费用单子表实体 | `so.m35.entity.ArsubBVO` |
| `so_arsub_detail` | 冲抵明细实体 | `so.m35.entity.ArsubDetailVO` |
| `so_m35trantype` | 销售费用单类型 | `so.m35trantype.entity.M35TranTypeVO` |
| `sr_marcombine` | 物料组合主实体 | `scmf.marcombine.entity.MarCombineHVO` |
| `sr_marcombine_b` | 物料组合子实体 | `scmf.marcombine.entity.MarCombineBVO` |
| `sr_target` | 指标设置主实体 | `scmf.sr.target.entity.TargetHVO` |
| `sr_target_item` | 指标项 | `scmf.sr.target.entity.TargetItemBVO` |
| `sr_target_mar` | 物料维度 | `scmf.sr.target.entity.TargetMarBVO` |
| `sr_target_org` | 销售组织范围子实体 | `scmf.sr.target.entity.TargetOrgBVO` |
| `sr_target_period` | 指标周期列表 | `scmf.sr.target.entity.TargetPeriodBVO` |
| `sr_targetadj` | 指标调整单主实体 | `scmf.sr.targetadj.entity.TargetAdjHVO` |
| `sr_targetadj_b` | 指标调整单子实体 | `scmf.sr.targetadj.entity.TargetAdjBVO` |
| `sr_targetbill` | 销售指标维护主实体 | `scmf.sr.targetbill.entity.TargetBillHVO` |
| `sr_targetbill_b` | 销售指标维护子实体 | `scmf.sr.targetbill.entity.TargetBillBVO` |
| `vrm_vendormater` | 供应商物料关系 | `scmf.vrm.vm.entity.VendorMaterBVO` |

### sn 序列号管理（6 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `sn_assign` | 序列号规则分配 | `sn.assign.entity.SnAssignVO` |
| `sn_ref` | 序列号档案使用记录 | `sn.refdoc.entity.SnRefDocVO` |
| `sn_serialno` | 序列号档案 | `sn.doc.entity.SerialNoVO` |
| `sn_serialno_return` | 序列号回退表 | `sn.snreturn.entity.SerialRtnNoVO` |
| `sn_snflow` | 序列号流水记录表 | `sn.snrule.entity.SnFlowVO` |
| `sn_snrule` | 序列号规则 | `sn.snrule.entity.SnRuleVO` |

### so 销售管理（47 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `so_balance` | 订单收款核销主实体 | `so.m30.sobalance.entity.SoBalanceHVO` |
| `so_balance_b` | 订单收款核销子实体 | `so.m30.sobalance.entity.SoBalanceBVO` |
| `so_buylargess` | 买赠设置 | `so.mbuylargess.entity.BuyLargessHVO` |
| `so_buylargess_b` | 买赠子表 | `so.mbuylargess.entity.BuyLargessBVO` |
| `so_custmatrel` | 客户物料关系主实体 | `so.custmatrel.entity.CustMatRelHVO` |
| `so_custmatrel_b` | 客户物料关系子实体 | `so.custmatrel.entity.CustMatRelBVO` |
| `so_delivery` | 发货单主实体 | `so.m4331.entity.DeliveryHVO` |
| `so_delivery_b` | 发货单子实体 | `so.m4331.entity.DeliveryBVO` |
| `so_delivery_check` | 发货单质检实体 | `so.m4331.entity.DeliveryCheckVO` |
| `so_depmatrel` | 部门物料关系主实体 | `so.depmatrel.entity.DepMatRelHVO` |
| `so_depmatrel_b` | 部门物料关系子实体 | `so.depmatrel.entity.DepMatRelBVO` |
| `so_execinfo` | 单据执行情况 | `so.pub.execinfo.ExecInfoReportVO` |
| `so_execreport` | 销售订单执行情况 | `so.m3m.entity.OrderExecRptVO` |
| `so_m30trantype` | 销售订单交易类型 | `so.m30trantype.entity.M30TranTypeVO` |
| `so_m32trantype` | 销售发票交易类型 | `so.m32trantype.entity.M32TranTypeVO` |
| `so_m38trantype` | 预订单交易类型 | `so.m38trantype.entity.M38TranTypeVO` |
| `so_m4331trantype` | 发货单交易类型 | `so.m4331trantype.entity.M4331trantypeVO` |
| `so_mb_orderanaly` | 销售订单移动报表分析实体 | `so.report.analy.entity.SaleOrderAnalyVO` |
| `so_orderhistory` | 销售订单修订主表 | `so.m30.revise.entity.SaleOrderHistoryHVO` |
| `so_orderhistory_b` | 销售订单修订附表 | `so.m30.revise.entity.SaleOrderHistoryBVO` |
| `so_outrushexeinfo` | 销售出库对冲执行情况 | `so.m33.m4c.linkqryoutrush.entity.OutRushExeInfoVO` |
| `so_preorder` | 预订单主实体 | `so.m38.entity.PreOrderHVO` |
| `so_preorder_b` | 预订单子实体 | `so.m38.entity.PreOrderBVO` |
| `so_profit` | 销售毛利预估 | `so.pub.entry.ProfitVO` |
| `so_recvplan` | 销售模块收款计划 | `so.pub.entry.RecvPlanVO` |
| `so_returnassign` | 退货政策分配 | `so.mreturnassign.entity.ReturnAssignVO` |
| `so_returncndtn` | 退货条件 | `so.mreturncondition.entity.ReturnConditionVO` |
| `so_returnpolicy` | 退货政策设置 | `so.mreturnpolicy.entity.ReturnPolicyVO` |
| `so_returnreason` | 退货原因 | `so.mreturnreason.entity.ReturnReasonVO` |
| `so_saleinvoice` | 销售发票主实体 | `so.m32.entity.SaleInvoiceHVO` |
| `so_saleinvoice_b` | 销售发票子实体 | `so.m32.entity.SaleInvoiceBVO` |
| `so_saleorder` | 销售订单主实体 | `so.m30.entity.SaleOrderHVO` |
| `so_saleorder_b` | 销售订单子实体 | `so.m30.entity.SaleOrderBVO` |
| `so_salequotation` | 报价单主实体 | `so.salequotation.entity.SalequotationHVO` |
| `so_salequotation_b` | 报价单子实体 | `so.salequotation.entity.SalequotationBVO` |
| `so_salequotationtype` | 报价单交易类型 | `so.m4310trantype.entity.M4310TranTypeVO` |
| `so_squareinv` | 销售发票待结算单主实体 | `so.m33.m32.entity.SquareInvHVO` |
| `so_squareinv_b` | 销售发票待结算单子实体 | `so.m33.m32.entity.SquareInvBVO` |
| `so_squareinv_d` | 销售发票结算单明细实体 | `so.m33.m32.entity.SquareInvDetailVO` |
| `so_squareout` | 销售出库待结算单主实体 | `so.m33.m4c.entity.SquareOutHVO` |
| `so_squareout_b` | 销售出库待结算单子实体 | `so.m33.m4c.entity.SquareOutBVO` |
| `so_squareout_d` | 销售出库结算单明细实体 | `so.m33.m4c.entity.SquareOutDetailVO` |
| `so_squarewas` | 途损待结算单主实体 | `so.m33.m4453.entity.SquareWasHVO` |
| `so_squarewas_b` | 途损待结算单子实体 | `so.m33.m4453.entity.SquareWasBVO` |
| `so_squarewas_d` | 途损结算单明细实体 | `so.m33.m4453.entity.SquareDetailWasVO` |
| `so_tranmatrel` | 订单类型物料关系主实体 | `so.tranmatrel.entity.TranMatRelHVO` |
| `so_tranmatrel_b` | 订单类型物料关系子实体 | `so.tranmatrel.entity.TranMatRelBVO` |

### sr 返利管理（29 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `sr_formula` | 返利取数函数 | `sr.formula.entity.FormulaVO` |
| `sr_m4620trantype` | 返利政策交易类型 | `sr.policy.trantype.M4620TranTypeVO` |
| `sr_plcy` | 返利政策主实体 | `sr.policy.entity.PlcyHVO` |
| `sr_plcy_bal_r` | 结算方式范围修订子实体 | `sr.policy.revise.entity.PlcyBaltypeReviseVO` |
| `sr_plcy_baltype` | 结算方式范围子实体 | `sr.policy.entity.PlcyBaltypeVO` |
| `sr_plcy_cal_r` | 计算规则修订子实体 | `sr.policy.revise.entity.PlcyCalruleReviseVO` |
| `sr_plcy_cald_r` | 计算规则明细修订实体 | `sr.policy.revise.entity.PlcyCaldetReviseVO` |
| `sr_plcy_caldet` | 计算规则明细实体 | `sr.policy.entity.PlcyCaldetVO` |
| `sr_plcy_calrule` | 计算规则子实体 | `sr.policy.entity.PlcyCalruleVO` |
| `sr_plcy_cust` | 客户范围子实体 | `sr.policy.entity.PlcyCustVO` |
| `sr_plcy_cust_r` | 客户范围修订子实体 | `sr.policy.revise.entity.PlcyCustReviseVO` |
| `sr_plcy_item_r` | 价格项范围修订子实体 | `sr.policy.revise.entity.PlcyPrcitemReviseVO` |
| `sr_plcy_mar` | 物料维度子实体 | `sr.policy.entity.PlcyMarVO` |
| `sr_plcy_mar_r` | 物料维度修订子实体 | `sr.policy.revise.entity.PlcyMarReviseVO` |
| `sr_plcy_ord_r` | 订单类型范围修订子实体 | `sr.policy.revise.entity.PlcyOrdtypeReviseVO` |
| `sr_plcy_ordtype` | 订单类型范围子实体 | `sr.policy.entity.PlcyOrdtypeVO` |
| `sr_plcy_org` | 销售组织范围子实体 | `sr.policy.entity.PlcyOrgVO` |
| `sr_plcy_org_r` | 销售组织范围修订子实体 | `sr.policy.revise.entity.PlcyOrgReviseVO` |
| `sr_plcy_period` | 返利期间子实体 | `sr.policy.entity.PlcyPeriodVO` |
| `sr_plcy_period_r` | 返利期间修订子实体 | `sr.policy.revise.entity.PlcyPeriodReviseVO` |
| `sr_plcy_prcitem` | 价格项范围子实体 | `sr.policy.entity.PlcyPrcitemVO` |
| `sr_plcy_prm_r` | 促销类型范围修订子实体 | `sr.policy.revise.entity.PlcyPromotTypeReviseVO` |
| `sr_plcy_prmtype` | 促销类型范围子实体 | `sr.policy.entity.PlcyPromotTypeVO` |
| `sr_plcy_r` | 返利政策修订主实体 | `sr.policy.revise.entity.PlcyReviseHVO` |
| `sr_plcy_rece_r` | 收款单类型范围修订子实体 | `sr.policy.revise.entity.PlcyRecetypeReviseVO` |
| `sr_plcy_recetype` | 收款单类型范围子实体 | `sr.policy.entity.PlcyRecetypeVO` |
| `sr_settle` | 返利结算单主实体 | `sr.settle.entity.SettleHVO` |
| `sr_settle_b` | 返利结算单子实体 | `sr.settle.entity.SettleBVO` |
| `sr_settle_exe` | 结算执行明细实体 | `sr.settle.entity.SettleExeVO` |

### srmem 供应商评估管理（22 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `srmem_ea` | 评估申请单 | `srmem.ea.Entity.SrmEaHeadVO` |
| `srmem_ea_eg` | 评估组 | `srmem.ea.Entity.SrmEgVO` |
| `srmem_ea_ei` | 评估指标 | `srmem.ea.Entity.SrmEiVO` |
| `srmem_ea_eo` | 参与评估组织 | `srmem.ea.Entity.SrmEoVO` |
| `srmem_ea_transtype` | 评估申请单交易类型 | `srmem.ea.entity.SrmEaTransTypeVO` |
| `srmem_ea_va` | 评估对象 | `srmem.ea.Entity.SrmVaVO` |
| `srmem_er` | 评估报告 | `srmem.er.Entity.SrmErHeadVO` |
| `srmem_er_eo` | 参与评估组织 | `srmem.er.Entity.SrmEoVO` |
| `srmem_er_va` | 评估对象 | `srmem.er.Entity.SrmVaVO` |
| `srmem_estimateorg` | 评估组 | `srmem.estimateorg.entity.EstimateOrgVO` |
| `srmem_estimator` | 评估人 | `srmem.estimator.entity.EstimatorVO` |
| `srmem_estplan` | 评估方案 | `srmem.estimateplan.entity.EstPlanVO` |
| `srmem_estplan_b` | 评估指标 | `srmem.estimateplan.entity.EstPlanBVO` |
| `srmem_estplan_g` | 评估组 | `srmem.estimateplan.entity.EstPlanGVO` |
| `srmem_estplan_o` | 参与评估组织 | `srmem.estimateplan.entity.EstPlanOVO` |
| `srmem_estplantype` | 评估方案分类 | `srmem.estplantype.entity.EstPlanTypeVO` |
| `srmem_et` | 评估表 | `srmem.et.Entity.SrmEtHeadVO` |
| `srmem_et_va` | 评估对象 | `srmem.et.Entity.SrmVaVO` |
| `srmem_indicator_b` | 评估指标明细 | `srmem.indicator.entity.IndicatorBVO` |
| `srmem_indicator_h` | 评估指标 | `srmem.indicator.entity.IndicatorHVO` |
| `srmem_indicator_s` | 分段评分标准 | `srmem.indicator.entity.IndicatorSVO` |
| `srmem_indicatortype` | 评估指标分类 | `srmem.indicatortype.entity.IndicatorTypeVO` |

### srmpub 供应商基础设置（1 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `srmpub_registerorg` | 供应商可注册组织 | `srmpub.registerorg.Entity.RegisterOrgVO` |

### srmsm 供应商状态管理（29 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `srmsm_blacklistapply` | 供应商黑名单申请 | `srmsm.blacklistapply.entity.BlackListApplyVO` |
| `srmsm_complaint` | 供应商投诉建议处理单 | `srmsm.complaint.entity.ComplaintVO` |
| `srmsm_complaint_cf` | 投诉建议方附件 | `srmsm.complaint.entity.ComplaintCFVO` |
| `srmsm_complaint_m` | 物料信息 | `srmsm.complaint.entity.ComplaintMVO` |
| `srmsm_complaint_rf` | 响应方附件 | `srmsm.complaint.entity.ComplaintRFVO` |
| `srmsm_complainttype` | 供应商投诉建议分类 | `srmsm.complainttype.entity.ComplaintTypeVO` |
| `srmsm_custbank_f` | 供应商银行账号 | `srmsm.supplierenterpf.entity.CustbankFVO` |
| `srmsm_invitesupplier` | 邀请供应商 | `srmsm.invitesupplier.entity.InviteSupplierVO` |
| `srmsm_provideprdscatalog` | 供货目录 | `srmsm.ppc.entity.ProvidePrdsCatalogVO` |
| `srmsm_suplinkman_f` | 供应商联系人 | `srmsm.supplierenterpf.entity.SupLinkmanFVO` |
| `srmsm_supplierbaschgpf` | 供应商基本信息变更申请 | `srmsm.supplierbaschgpf.entity.SupplierBasChgPFVO` |
| `srmsm_supplierbaschgpf_a` | 供货能力分类 | `srmsm.supplierbaschgpf.entity.SupplierBasChgPFAVO` |
| `srmsm_supplierbaschgpf_b` | 银行账号 | `srmsm.supplierbaschgpf.entity.SupplierBasChgPFBVO` |
| `srmsm_supplierbaschgpf_i` | 资料 | `srmsm.supplierbaschgpf.entity.SupplierBasChgPFIVO` |
| `srmsm_supplierbaschgpf_p` | 产品 | `srmsm.supplierbaschgpf.entity.SupplierBasChgPFPVO` |
| `srmsm_supplierbaschgpf_q` | 资质 | `srmsm.supplierbaschgpf.entity.SupplierBasChgPFQVO` |
| `srmsm_supplierenterpf` | 供应商准入申请 | `srmsm.supplierenterpf.entity.SupplierEnterPFVO` |
| `srmsm_supplierext_a` | 供货能力分类 | `bd.supplierext.entity.SupplierExtAVO` |
| `srmsm_supplierext_af` | 供货能力分类 | `srmsm.supplierenterpf.entity.SupplierExtAVO` |
| `srmsm_supplierext_h` | 供应商扩展信息 | `bd.supplierext.entity.SupplierExtHVO` |
| `srmsm_supplierext_i` | 资料 | `bd.supplierext.entity.SupplierExtIVO` |
| `srmsm_supplierext_if` | 资料 | `srmsm.supplierenterpf.entity.SupplierExtIVO` |
| `srmsm_supplierext_p` | 产品 | `bd.supplierext.entity.SupplierExtPVO` |
| `srmsm_supplierext_pf` | 产品 | `srmsm.supplierenterpf.entity.SupplierExtPVO` |
| `srmsm_supplierext_q` | 资质 | `bd.supplierext.entity.SupplierExtQVO` |
| `srmsm_supplierext_qf` | 资质 | `srmsm.supplierenterpf.entity.SupplierExtQVO` |
| `srmsm_suppliermagchgpf` | 供应商管理信息变更申请 | `srmsm.suppliermagchgpf.entity.SupplierMagChgPFVO` |
| `srmsm_suppliermagchgpf_b` | 供应商采购信息 | `srmsm.suppliermagchgpf.entity.SupplierMagChgPFBVO` |
| `srmsm_suprdsabilitycls` | 供货能力分类 | `srmsm.spac.entity.SupPrdsAbilityClsVO` |

### to 内部交易（45 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `to_allot` | 分货单主实体 | `to.m5j.entity.AllotHeadVO` |
| `to_allot_b` | 分货单子实体 | `to.m5j.entity.AllotItemVO` |
| `to_apply` | 调入申请主实体 | `to.m5a.entity.TransInHeadVO` |
| `to_apply_b` | 调入申请子实体 | `to.m5a.entity.TransInBodyVO` |
| `to_bill` | 调拨订单主实体 | `to.m5x.entity.BillHeaderVO` |
| `to_bill_b` | 调拨订单子实体 | `to.m5x.entity.BillItemVO` |
| `to_billhistory` | 调拨订单修订主实体 | `to.m5x.entity.BillHistoryHeadVO` |
| `to_billhistory_b` | 调拨订单修订子实体 | `to.m5x.entity.BillHistoryItemVO` |
| `to_businessinfo` | 内部交易信息主表 | `to.businessinfo.entity.BusinessinfoHVO` |
| `to_businessinfo_b` | 内部交易信息子表 | `to.businessinfo.entity.BusinessinfoBVO` |
| `to_businessinfo_bb` | 内部交易信息子子表 | `to.businessinfo.entity.BusinessinfoBBVO` |
| `to_feesettle` | 费用结算单主实体 | `to.m4552.entity.FeeSettleBillHeaderVO` |
| `to_feesettle_b` | 费用结算单子实体 | `to.m4552.entity.FeeSettleBillItemVO` |
| `to_feesettle_bb` | 费用结算单子子实体 | `to.m4552.entity.FeeSettleBillLineVO` |
| `to_fori9puin` | 费用结算采购入 | `to.m4552.entity.ForI9PuInHeaderVO` |
| `to_fori9puin_b` | 费用结算采购入明细 | `to.m4552.entity.ForI9PuInItemVO` |
| `to_fori9transin` | 费用结算调拨入 | `to.m4552.entity.ForI9TransInHeaderVO` |
| `to_fori9transin_b` | 费用结算调拨入明细 | `to.m4552.entity.ForI9TransInItemVO` |
| `to_goldentax` | 结算清单金税发票主实体 | `to.m4551.entity.GoldenTaxHeaderVO` |
| `to_goldentax_b` | 结算清单金税发票子实体 | `to.m4551.entity.GoldenTaxItemVO` |
| `to_m5atrantype` | 调入申请交易类型 | `to.m5atrantype.entity.M5aTranTypeVO` |
| `to_m5xtrantype` | 调拨订单交易类型 | `to.m5xtrantype.entity.M5xTranTypeVO` |
| `to_mointraplan` | 要货月计划主表 | `to.m5p.entity.MoIntraPlanHeadVO` |
| `to_mointraplan_b` | 要货月计划子表 | `to.m5p.entity.MoIntraPlanBodyVO` |
| `to_presettlein` | 待结算调入单主实体 | `to.m5n.entity.PreSettleInHeaderVO` |
| `to_presettlein_b` | 待结算调入单子实体 | `to.m5n.entity.PreSettleInItemVO` |
| `to_presettlein_bb` | 待结算调入单子子实体 | `to.m5n.entity.PreSettleInLineVO` |
| `to_presettleout` | 待结算调出单主实体 | `to.m5m.entity.PreSettleOutHeaderVO` |
| `to_presettleout_b` | 待结算调出单子实体 | `to.m5m.entity.PreSettleOutItemVO` |
| `to_presettleout_bb` | 待结算调出单子子实体 | `to.m5m.entity.PreSettleOutLineVO` |
| `to_settlein` | 转财务调入主实体 | `to.m5f.entity.STranFinInHeadVO` |
| `to_settlein_b` | 转财务调入子实体 | `to.m5f.entity.STranFinInItemVO` |
| `to_settlelist` | 结算清单主实体 | `to.m5f.entity.SettleListHeaderVO` |
| `to_settlelist_b` | 结算清单子实体 | `to.m5f.entity.SettleListItemVO` |
| `to_settlelist_bb` | 结算清单子子实体 | `to.m5f.entity.SettleListLineVO` |
| `to_settleout` | 转财务调出主实体 | `to.m5f.entity.STranFinOutHeadVO` |
| `to_settleout_b` | 转财务调出子实体 | `to.m5f.entity.STranFinOutItemVO` |
| `to_settlepath` | 结算路径主表 | `to.settlepath.entity.SettlePathHVO` |
| `to_settlepath_b` | 结算路径子表 | `to.settlepath.entity.SettlePathBVO` |
| `to_settlerule` | 结算规则主表 | `to.settlerule.entity.SettleRuleHVO` |
| `to_settlerule_b` | 结算规则子表 | `to.settlerule.entity.SettleRuleBVO` |
| `to_transpresettlein` | 转财务待结算调入主实体 | `to.m5n.entity.TransPreSettleInHeaderVO` |
| `to_transpresettlein_b` | 转财务待结算调入子实体 | `to.m5n.entity.TransPreSettleInItemVO` |
| `to_transpresettleout` | 转财务待结算调出主实体 | `to.m5m.entity.TransPreSettleOutHeaderVO` |
| `to_transpresettleout_b` | 转财务待结算调出子实体 | `to.m5m.entity.TransPreSettleOutItemVO` |

## 财务管理（40 模块，1605 表）

### arap 应收应付（61 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `ap_estipayablebill` | 暂估应付单 | `arap.estipayable.EstiPayableBillVO` |
| `ap_estipayableitem` | 暂估应付单行 | `arap.estipayable.EstiPayableBillItemVO` |
| `ap_payablebill` | 供应商应付单 | `arap.payable.PayableBillVO` |
| `ap_payableitem` | 供应商应付单行 | `arap.payable.PayableBillItemVO` |
| `ap_paybill` | 供应商付款单 | `arap.pay.PayBillVO` |
| `ap_payitem` | 供应商付款单行 | `arap.pay.PayBillItemVO` |
| `ar_estirecbill` | 未确认应收单 | `arap.estireceivable.EstiReceivableBillVO` |
| `ar_estirecitem` | 未确认应收单行 | `arap.estireceivable.EstiReceivableBillItemVO` |
| `ar_gatherbill` | 客户收款单 | `arap.gathering.GatheringBillVO` |
| `ar_gatheritem` | 客户收款单行 | `arap.gathering.GatheringBillItemVO` |
| `ar_recbill` | 客户应收单 | `arap.receivable.ReceivableBillVO` |
| `ar_recitem` | 客户应收单行 | `arap.receivable.ReceivableBillItemVO` |
| `arap_agiotage` | 汇兑损益记录表 | `arap.agiotage.AgiotageMainVO` |
| `arap_agiotage_d` | 汇兑损益子表 | `arap.agiotage.AgiotageChildVO` |
| `arap_apglbrbill` | 应收对账过滤条件 | `nc.bs.arap.bill.brdeal.BRConditionVO` |
| `arap_arglbrbill` | 应付对账单据 | `nc.bs.arap.bill.brdeal.BRConditionVO` |
| `arap_badaccdstl` | 坏账计提主表 | `arap.badacc.BadAccDstlVO` |
| `arap_badaccdstl_b` | 坏账计提辅表 | `arap.badacc.BadAccDstlDetailVO` |
| `arap_baddebts_occh` | 坏账发生主表 | `arap.baddebts.BaddebtsOcchVO` |
| `arap_baddebts_occu` | 坏账发生明细表 | `arap.baddebts.BaddebtsOccuVO` |
| `arap_baddebts_rece` | 坏账收回明细表 | `arap.baddebts.BaddebtsReceVO` |
| `arap_baddebts_rech` | 坏账收回主表 | `arap.baddebts.BaddebtsRechVO` |
| `arap_balance` | 月余额发生表 | `arap.tally.BalanceVO` |
| `arap_balancelog` | 月余额汇总日志 | `arap.tally.BalanceLogVO` |
| `arap_bcmap` | 协同信息 | `arap.billconfer.BcMapVO` |
| `arap_billconfer` | 单据协同设置 | `arap.billconfer.BillconferVO` |
| `arap_billmap` | 业务数据映射表 | `arap.pfflow.ArapBillMapVO` |
| `arap_billtype` | 收付单据类型 | `arap.djlx.DjLXVO` |
| `arap_busidata` | 收付业务数据 | `arap.agiotage.ArapBusiDataVO` |
| `arap_debtstransfer` | 并账明细表 | `arap.debttransfer.DebtTransferVO` |
| `arap_deffieldmapping` | 自定义字段对照表 | `arap.tally.DefFieldMappingVO` |
| `arap_detaillinkquery` | 明细联查 | `arap.comreport.DetailLinkQueryVO` |
| `arap_dstlcase` | 坏账计提方案主表 | `arap.badacc.DstlCaseParentVO` |
| `arap_dstlcase_b` | 坏账计提方案子表 | `arap.badacc.DstlCaseChildVO` |
| `arap_dstlcase_b_b` | 计提方案辅辅表 | `arap.badacc.DstlCaseGrandChildVO` |
| `arap_dstlcasefactor` | 方案对应计提因素表 | `arap.badacc.DstlCaseFactorVO` |
| `arap_dstlcaserate` | 坏账计提方案比率表 | `arap.badacc.DstlCaseRateVO` |
| `arap_dstlfactor` | 坏帐计提因素表 | `nc.voarap.dstlfactor.arap_dstlfactor` |
| `arap_dstlfactorvalue` | 坏帐计提方案因素值 | `arap.dstlfactorvalue.Entity` |
| `arap_estitally` | 暂估明细 | `arap.tally.EstiTallyVO` |
| `arap_estitally_agr` | 暂估明细协议 | `arap.tally.EstiTallyAgrVO` |
| `arap_estitally_all` | 暂估明细全信息 | `arap.tally.EstiTallyAllVO` |
| `arap_notice` | 催款语气主表 | `arap.reminder.ArapNoticeVO` |
| `arap_notice_b` | 催款语气子表 | `arap.reminder.ArapNoticeItemVO` |
| `arap_qryobject` | 报表查询对象设置 | `arap.query.QueryObjSuperVO` |
| `arap_qryobjfield` | 月余额表优化字段 | `arap.perfbal.QryObjFieldVO` |
| `arap_qryobjval` | 月余额表优化字段值 | `arap.perfbal.QryObjValVO` |
| `arap_recstatement` | 应收对账单 | `arap.tally.RecStatementVO` |
| `arap_recstatementitem` | 应收对账单行 | `arap.tally.RecStatementItemVO` |
| `arap_tally` | 常用字段 | `arap.tally.TallyVO` |
| `arap_tally_agr` | 收付款协议 | `arap.tally.TallyAgrVO` |
| `arap_tally_all` | 其他字段 | `arap.tally.TallyAllVO` |
| `arap_termitem` | 收付款协议表 | `arap.termitem.TermVO` |
| `arap_transfer_h` | 并账主表 | `arap.debttransfer.DebtTransferMainVO` |
| `arap_verify` | 核销主表 | `arap.verify.VerifyMainVO` |
| `arap_verify_fa` | 核销方案表 | `arap.verify.VerifyfaVO` |
| `arap_verifydetail` | 核销明细表 | `arap.verify.VerifyDetailVO` |
| `arapgoldentax` | 金税主实体 | `arap.goldentax.GoldTaxHeadVO` |
| `arapgoldentax_b` | 金税子实体 | `arap.goldentax.GoldTaxBodyVO` |
| `reminderbill` | 催款单表头 | `arap.reminder.ReminderBillVO` |
| `reminderitem` | 催款单表体 | `arap.reminder.ReminderItemVO` |

### batm 资金分析（38 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `batm_DepositFinancing` | 存款融资统计表 | `batm.DepositFinancingVO` |
| `batm_DepositReceipt` | 定期存单-到期日 | `batm.ifacvo.DepositReceiptVO` |
| `batm_LocuContract` | 押汇合同 | `batm.lcmvo.LocuContractVO` |
| `batm_bankaccdetail` | 银行现金账户账明细表 | `batm.cmpvo.BankAccDetailVO` |
| `batm_bankprotocol` | 银行授信及使用 | `batm.ccvo.BankprotocolVO` |
| `batm_bankprotocolcctype` | 银行授信类别列表 | `batm.ccvo.BankprotocolCctypeVO` |
| `batm_base` | batm_base | `batm.Base` |
| `batm_billacc_dailysum` | 票据帐日发生额余额 | `batm.fbmvo.BillAccDailySumVO` |
| `batm_billacc_detail` | 票据帐明细表 | `batm.fbmvo.BillAccDetailVO` |
| `batm_contract` | 贷款合同综合表 | `batm.cdmvo.ContractCreditVO` |
| `batm_contractexpiry` | 银行贷款-按到期日统计 | `batm.cdmvo.ContractExpiryVO` |
| `batm_dailydeposit` | 银行存款日发生额余额 | `batm.ifacvo.DailydepositVO` |
| `batm_dailyofcashbank` | 现金和银行活期存款日发生额余额 | `batm.cmpvo.DailyOfCashBankVO` |
| `batm_daystype` | 到期日日期类型表 | `batm.cdmvo.DaysTypeVO` |
| `batm_dcform` | 存款、融资形式 | `batm.batm_dcform.batm_dcform` |
| `batm_dctype` | 存贷类型 | `batm.Dctype` |
| `batm_deposit` | 定期通知存款 | `batm.ifacvo.DepositVO` |
| `batm_deposittype` | 存款形式 | `batm.ifacvo.DeposittypeVO` |
| `batm_detail_counter` | 票据明细表 | `batm.fbmvo.DetailCounterVO` |
| `batm_financing` | 融资事项统计表 | `batm.FinancingVO` |
| `batm_financing_variety` | 融资品种 | `batm.FinancingVarietyVO` |
| `batm_financing_way` | 融资方式 | `batm.FinancingWayVO` |
| `batm_guacontract` | 担保合同 | `batm.fbmvo.GuacontractVO` |
| `batm_guacontractdays` | 担保合同日期 | `batm.fbmvo.GuacontractDaysVO` |
| `batm_lcm_lcstatus` | 信用证状态 | `batm.LcstatusVO` |
| `batm_openregister` | 开证登记 | `batm.lcmvo.OpenregisterVO` |
| `batm_payrcpt` | 贷款放款记录 | `batm.cdmvo.PayrcptVO` |
| `batm_receiveregister` | 收证登记 | `batm.lcmvo.ReceiveregisterVO` |
| `batm_repayplan` | 贷款还款计划 | `batm.cdmvo.BatmRepayPlanVO` |
| `batm_repayrcpt` | 贷款还款记录 | `batm.cdmvo.BatmRepayrcptVO` |
| `batm_tradefinsort` | 信用证融资形式名称 | `batm.lcmvo.batm_tradefinsortVO` |
| `fvm_accconfig` | 监控账户设置 | `batm.config.AccountConfigVO` |
| `fvm_bankaccassign` | 银行账户子户分配 | `batm.config.BankaccAssignVO` |
| `fvm_ebankbalance` | 银行账户余额信息 | `batm.ebankbalance.EBankBalanceVO` |
| `fvm_ebankdzd` | 银行对账单信息 | `batm.ebankbalance.FvmEBankDzdVO` |
| `fvm_orgconfig` | 监控组织设置 | `batm.config.OrgConfigVO` |
| `fvm_permission_org` | 监控组织 | `batm.permissionconfig.PermissionOrgVO` |
| `fvm_permission_role` | 监控角色 | `batm.permissionconfig.PermissionRoleVO` |

### bgm 保函管理（9 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `bgm_category` | 保函种类 | `bgm.pub.category.CategoryVO` |
| `bgm_openaccept` | 开函申请受理 | `bgm.open.openaccept.OpenAcceptVO` |
| `bgm_openapply` | 开函申请 | `bgm.open.openapply.OpenapplyVO` |
| `bgm_openmodify` | 开函修改 | `bgm.open.openmodify.OpenModifyVO` |
| `bgm_openmodify_b` | 开函修改明细 | `bgm.open.openmodify.OpenModifyBVO` |
| `bgm_openregister` | 开函登记 | `bgm.open.openregister.OpenRegisterVO` |
| `bgm_openreport` | 开函台账 | `bgm.open.openreport.OpenReportVO` |
| `bgm_receiveregister` | 收函登记 | `bgm.receive.receiveregister.ReceiveRegisterVO` |
| `bgm_receivereport` | 收函台账 | `bgm.receivereport.ReceiveReportVO` |

### cc 银行授信管理（14 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `cc_bankprotocol` | 银行授信协议 | `cc.protocol.BankProtocolVO` |
| `cc_bankprotocol` | 集团授信协议 | `cc.grpprotocol.GroupProtocolVO` |
| `cc_bankprotocolvers` | 银行授信协议版本表 | `cc.protocol.BankProtocolVersVO` |
| `cc_cctype` | 银行授信协议授信类别 | `cc.protocol.CCTypeVO` |
| `cc_cctype` | 集团授信协议授信类别 | `cc.grpprotocol.GroupCCTypeVO` |
| `cc_cctypevers` | 授信类别版本表 | `cc.protocol.CCTypeVersVO` |
| `cc_creditbank` | 银行授信协议贷款银行 | `cc.protocol.CreditBankVO` |
| `cc_creditbank` | 集团授信协议贷款银行 | `cc.grpprotocol.GroupCreditBankVO` |
| `cc_creditbankvers` | 贷款银行版本表 | `cc.protocol.CreditBankVersVO` |
| `cc_execadj` | 授信执行情况调整单 | `cc.execadj.ExecAdjVO` |
| `cc_execdetail` | 授信执行明细表 | `cc.execdetail.ExecDetailVO` |
| `cc_quotaorg` | 银行授信协议授信额度使用单位 | `cc.protocol.QuotaOrgVO` |
| `cc_quotaorg` | 集团授信协议授信额度使用单位 | `cc.grpprotocol.GroupQuotaOrgVO` |
| `cc_quotaorgvers` | 授信额度使用单位版本表 | `cc.protocol.QuotaOrgVersVO` |

### cdm 银行贷款管理（86 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `cdm_Entity` | 借款单位按融资机构查询实体子表 | `pub.report.UnitbybankBVO` |
| `cdm_apply` | 银行贷款合同申请 | `cdm.applybankcredit.ApplyBankCreditVO` |
| `cdm_apply` | 委托贷款合同申请 | `cdm.applyconsigncredit.ApplyConsignCreditVO` |
| `cdm_apply` | 委托借款合同申请 | `cdm.applyconsigndebit.ApplyConsignDebitVO` |
| `cdm_apply` | 内部贷款合同申请 | `icdm.applyinnercredit.ApplyInnerCreditVO` |
| `cdm_apply` | 内部借款合同申请 | `icdm.applyinnerdebit.ApplyInnerDebitVO` |
| `cdm_apply` | 合同申请 | `pub.apply.ApplyVO` |
| `cdm_applypay` | 放款申请 | `icdm.innerapplypay.ApplyPayVO` |
| `cdm_applypay_b` | 放款申请子表 | `icdm.innerapplypay.ApplyPaySubVO` |
| `cdm_contiabill` | 银行贷款管理合同利息清单 | `cdm.contractiabill.BankContIABillVO` |
| `cdm_contiabill` | 合同利息清单 | `pub.contractiabill.ContIABillVO` |
| `cdm_contiabill` | 成员单位合同利息清单 | `icdm.finacontiabill.FinaContIABillVO` |
| `cdm_contiabill` | 资金组织合同利息清单 | `icdm.fundcontiabill.FundContIABillVO` |
| `cdm_contiabill_b` | 银行贷款管理合同利息清单子表 | `cdm.contractiabill.ContBankIABillBVO` |
| `cdm_contiabill_b` | 合同利息清单子表 | `pub.contractiabill.ContIABillBVO` |
| `cdm_contiabill_b` | 成员单位合同利息清单子表 | `icdm.finacontiabill.FinaContIABillBVO` |
| `cdm_contiabill_b` | 资金组织合同利息清单子表 | `icdm.fundcontiabill.FundContIABillBVO` |
| `cdm_contract` | 银行贷款合同 | `cdm.contractbankcredit.ContractBankCreditVO` |
| `cdm_contract` | 委托贷款合同 | `cdm.contractconsigncredit.ContractConsignCreditVO` |
| `cdm_contract` | 委托借款合同 | `cdm.contractconsigndebit.ContractConsignDebitVO` |
| `cdm_contract` | 合同计息处理 | `pub.contractiadeal.ContractIADealVO` |
| `cdm_contract` | 内部贷款合同 | `icdm.contractinnercredit.ContractInnerCreditVO` |
| `cdm_contract` | 内部借款合同 | `icdm.contractinnerdebit.ContractInnerDebitVO` |
| `cdm_contract` | 信贷合同 | `pub.contract.ContractVO` |
| `cdm_contract` | 借款单位按照融资机构查询实体主表 | `pub.report.UnitbybankVO` |
| `cdm_contract_exec` | 银行贷款合同合同执行情况 | `cdm.contractbankcredit.ContractBankCreditExecVO` |
| `cdm_contract_exec` | 委托贷款合同合同执行情况 | `cdm.contractconsigncredit.ContractConsignCreditExecVO` |
| `cdm_contract_exec` | 委托借款合同合同执行情况 | `cdm.contractconsigndebit.ContractConsignDebitExecVO` |
| `cdm_contract_exec` | 内部贷款合同合同执行情况 | `icdm.contractinnercredit.ContractInnerCreditExecVO` |
| `cdm_contract_exec` | 内部借款合同合同执行情况 | `icdm.contractinnerdebit.ContractInnerDebitExecVO` |
| `cdm_contract_exec` | 合同执行情况 | `pub.contract.ContractExecVO` |
| `cdm_contract_v` | 信贷合同版本 | `pub.contractversion.ContractVersionVO` |
| `cdm_contracttype` | 合同类型 | `pub.contracttype.ContractType` |
| `cdm_handlingfees` | 手续费回单 | `cdm.handlingfeesreceipt.HandlingFeesReceiptVO` |
| `cdm_handlingfees_b` | 手续费回单字表 | `cdm.handlingfeesreceipt.HandlingFeesReceiptBVO` |
| `cdm_interestadjust` | 内部利息调整 | `icdm.interestadjust.InnerInterestAdjVO` |
| `cdm_interestadjust` | 利息调整 | `cdm.interestadjust.InterestAdjustVO` |
| `cdm_payplan` | 银行贷款合同放款计划 | `cdm.contractbankcredit.ContractBankCreditPayPlanVO` |
| `cdm_payplan` | 委托贷款合同放款计划 | `cdm.contractconsigncredit.ContractConsignCreditPayPlanVO` |
| `cdm_payplan` | 委托借款合同放款计划 | `cdm.contractconsigndebit.ContractConsignDebitPayPlanVO` |
| `cdm_payplan` | 内部贷款合同放款计划 | `icdm.contractinnercredit.ContractInnerCreditPayPlanVO` |
| `cdm_payplan` | 内部借款合同放款计划 | `icdm.contractinnerdebit.ContractInnerDebitPayPlanVO` |
| `cdm_payplan` | 放款计划 | `pub.contract.ContractPayPlanVO` |
| `cdm_payplan` | 信贷放款计划 | `pub.contract.edit.ContractPayPlanEditVO` |
| `cdm_payplan_v` | 放款计划版本 | `pub.contractversion.ContractPayPlanVersionVO` |
| `cdm_payrcpt` | 内部放款单 | `icdm.innerpay.InnerPayVO` |
| `cdm_payrcpt` | 内部放款回单 | `icdm.innerpayrcpt.InnerPayReceiptVO` |
| `cdm_payrcpt` | 委托贷款合同放款回单 | `cdm.compayreceipt.BankPayReceiptCreditVO` |
| `cdm_payrcpt` | 委托借款合同放款回单 | `cdm.compayreceipt.BankPayReceiptLoanVO` |
| `cdm_payrcpt` | 银行贷款合同放款回单 | `cdm.payrcptbankcredit.BankPayReceiptVO` |
| `cdm_payrcpt` | 放款回单 | `pub.payreceipt.PayReceiptVO` |
| `cdm_payrcpt_b` | 内部放款单子表 | `icdm.innerpay.InnerPaySubVO` |
| `cdm_payrcpt_b` | 内部放款回单子表 | `icdm.innerpayrcpt.InnerPayReceiptSubVO` |
| `cdm_payrcpt_b` | 委托贷款合同放款回单子表 | `cdm.compayreceipt.BankPayReceiptCreditSubVO` |
| `cdm_payrcpt_b` | 委托借款合同放款回单子表 | `cdm.compayreceipt.BankPayReceiptLoanSubVO` |
| `cdm_payrcpt_b` | 银行贷款合同放款回单子表 | `cdm.payrcptbankcredit.BankPayReceiptSubVO` |
| `cdm_payrcpt_b` | 放款回单子表 | `pub.payreceipt.PayReceiptSubVO` |
| `cdm_payrcpt_bv` | 放款回单子表版本 | `pub.payreceipt.PayReceiptSubVersionVO` |
| `cdm_payrcptv` | 放款回单版本 | `pub.payreceipt.PayReceiptVersionVO` |
| `cdm_repayplan` | 银行贷款合同还款计划 | `cdm.contractbankcredit.ContractBankCreditRepayPlanVO` |
| `cdm_repayplan` | 委托贷款合同还款计划 | `cdm.contractconsigncredit.ContractConsignCreditRepayPlanVO` |
| `cdm_repayplan` | 委托借款合同还款计划 | `cdm.contractconsigndebit.ContractConsignDebitRepayPlanVO` |
| `cdm_repayplan` | 内部贷款合同还款计划 | `icdm.contractinnercredit.ContractInnerCreditRepayPlanVO` |
| `cdm_repayplan` | 内部借款合同还款计划 | `icdm.contractinnerdebit.ContractInnerDebitRepayPlanVO` |
| `cdm_repayplan` | 还款计划 | `pub.contract.ContractRepayPlanVO` |
| `cdm_repayplan` | 信贷还款计划 | `pub.contract.edit.ContractRepayEditPlanVO` |
| `cdm_repayplan_v` | 还款计划版本 | `pub.contractversion.ContractRepayPlanVersionVO` |
| `cdm_repayrcpt` | 合同还款 | `icdm.innerrepay.InnerRePayVO` |
| `cdm_repayrcpt` | 还款申请 | `icdm.innerrepayapply.InnerRePayApplyVO` |
| `cdm_repayrcpt` | 还款回单 | `icdm.innerrepayreceipt.InnerRePayReceiptVO` |
| `cdm_repayrcpt` | 还款回单 | `pub.repay.RepayReceiptVO` |
| `cdm_repayrcpt` | 银行贷款合同还款回单 | `cdm.repayreceiptbankcredit.RePayReceiptBankCreditVO` |
| `cdm_repayrcpt` | 委托贷款合同还款回单 | `cdm.repayreceiptconsigncredit.RePayReceiptConsignCreditVO` |
| `cdm_repayrcpt` | 委托借款合同还款回单 | `cdm.repayreceiptconsigndebit.RePayReceiptConsignDebitVO` |
| `cdm_repayrcpt_b` | 合同还款子表 | `icdm.innerrepay.InnerRepayBVO` |
| `cdm_repayrcpt_b` | 还款申请子表 | `icdm.innerrepayapply.InnerRepayApplyBVO` |
| `cdm_repayrcpt_b` | 还款回单子表 | `icdm.innerrepayreceipt.InnerRepayReceiptBVO` |
| `cdm_repayrcpt_b` | 还款回单子表 | `pub.repay.RepayReceiptBVO` |
| `cdm_repayrcpt_b` | 银行贷款合同还款回单子表 | `cdm.repayreceiptbankcredit.RePayReceiptBankCreditBVO` |
| `cdm_repayrcpt_b` | 委托贷款合同还款回单子表 | `cdm.repayreceiptconsigncredit.RePayReceiptConsignCreditBVO` |
| `cdm_repayrcpt_b` | 委托借款合同还款回单子表 | `cdm.repayreceiptconsigndebit.RePayReceiptConsignDebitBVO` |
| `icc_cctype` | 内部授信协议授信类别 | `icc.innerprotocol.ICCTypeVO` |
| `icc_cctypevers` | 内部授信协议授信类别版本表 | `icc.innerprotocol.ICCTypeVersVO` |
| `icc_execdetail` | 授信执行明细表 | `icc.execdetail.ExecDetailVO` |
| `icc_innerprotocol` | 内部授信协议 | `icc.innerprotocol.InnerProtocolVO` |
| `icc_innerprotocolvers` | 内部授信协议版本表 | `icc.innerprotocol.InnerProtocolVersVO` |

### cm 成本管理（85 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `bd_defdoc` | 成本对象生产订单 (自定义档案) | `bd.defdoc.DefdocVO` |
| `cm_ActCostBody` | 作业成本报表表体 | `cm.actcostreport.ActCostReportBodyVO` |
| `cm_ActCostHead` | 作业成本报表表头 | `cm.actcostreport.ActCostReportHeadVO` |
| `cm_Entity` | cm_meascostItem | `cm.meascostcontrast.MeasCostItemVO` |
| `cm_ServiceAllocVO` | 辅助服务分配数据 | `cm.servicealloc.AllocServiceVO` |
| `cm_account` | 期末结账表 | `cm.accountsettle.entity.AccountSettleVO` |
| `cm_actcost` | 作业成本表主表 | `cm.allocate.entity.activitycost.ActivityCostHeadVO` |
| `cm_actcost_b` | 作业成本表子表 | `cm.allocate.entity.activitycost.ActivityCostItemVO` |
| `cm_actnum` | 作业统计单 | `cm.activitynum.entity.ActivityNumHeadVO` |
| `cm_actnum_b` | 作业统计单明细 | `cm.activitynum.entity.ActivityNumItemVO` |
| `cm_alcrecord` | 费用分配关系 | `cm.allocate.entity.record.AllocateRecordHeadVO` |
| `cm_alcrecord_b` | 费用分配关系明细 | `cm.allocate.entity.record.AllocateRecordItemVO` |
| `cm_alcrecord_c` | 汇总记录表 | `cm.allocate.entity.record.AllocateRecordCollectVO` |
| `cm_algebraresult` | 代数法分配结果 | `cm.servicealloc.AlgebraResultVO` |
| `cm_allocdef` | 分配事务定义 | `cm.allocdef.entity.AllocdefHeadVO` |
| `cm_allocdef_c` | 分配事务定义_成本中心 | `cm.allocdef.entity.CostCenterItemVO` |
| `cm_allocdef_f` | 分配事务定义_核算要素 | `cm.allocdef.entity.CelementItemVO` |
| `cm_allocseq` | 费用分配事务顺序 | `cm.allocate.entity.AllocateSequenceVO` |
| `cm_allocstatus` | 分配事务执行状态 | `cm.allocate.entity.AllocateStatusVO` |
| `cm_appronum` | 约当产量表 | `cm.costdataclose.entity.AppronumVO` |
| `cm_autocostcalculation` | 全自动成本月结 | `cm.autocostcalculation.entity.AutoCostCalculationVO` |
| `cm_charge` | 联查结果表 | `cm.chargequery.LinkQueryChargeVO` |
| `cm_checkdef` | 成本资料关帐检查定义 | `cm.costdataclose.entity.SelfCheckDefVO` |
| `cm_clsdetail` | 分项成本明细 | `cm.bd.bd0105.ClsdetailHeadVO` |
| `cm_clsdetail_b` | 分项成本明细子表 | `cm.bd.bd0105.ClsdetailItemVO` |
| `cm_costobject` | 成本对象 | `cm.costobject.entity.CostObjectVO` |
| `cm_costrangeset` | 全成本计算物料范围设置 | `cm.costrangeset.entity.CostRangeSetVO` |
| `cm_costtrandef` | 成本结转定义 | `cm.costtrandef.entity.CostTranDefVO` |
| `cm_costtranprint` | 成本结转打印 | `cm.pc.pc0410.CostTranPrintVO` |
| `cm_costtranseq` | 跨组织成本结转顺序 | `cm.costtranseq.CostTranSeqVO` |
| `cm_ctrevert` | 成本还原主实体 | `cm.costrevert.CtRevertHeadVO` |
| `cm_ctrevert` | 成本还原检查错误信息 | `cm.costrevert.CtRevertCheckErrorVO` |
| `cm_ctrevert_b` | 成本还原明细实体 | `cm.costrevert.CtRevertItemVO` |
| `cm_ctrevertlevel` | 成本还原层次 | `cm.costrevert.CtRevertLevelVO` |
| `cm_ctrevertratio` | 成本还原比率 | `cm.costrevert.revertradio.CtRevertRatioHeadVO` |
| `cm_ctrevertratio_b` | 成本还原比率明细 | `cm.costrevert.revertradio.CtRevertRatioItemVO` |
| `cm_cyclinenode` | 循环节点 | `cm.costlevel.entity.CyclineNodeVO` |
| `cm_dataclose` | 成本资料关帐记录 | `cm.beginaccount.entity.DataCloseVO` |
| `cm_equivrate` | 约当系数 | `cm.equivrate.entity.EquivrateHeadVO` |
| `cm_equivrate_b` | 约当系数明细 | `cm.equivrate.entity.EquivrateItemVO` |
| `cm_erroinfo` | 取数未成功原因 | `cm.fetchdata.entity.PullDataErroInfoVO` |
| `cm_fetchinfo` | 是否取过数的-取数信息 | `cm.fetchdata.entity.PullDataStateVO` |
| `cm_fetchmap` | 取数设置VO对照 | `cm.bd.bd0112.FetchsetExchangeVO` |
| `cm_fetchset` | 取数设置 | `cm.fetchset.entity.FetchSetHeadVO` |
| `cm_fetchset_b` | 取数设置明细 | `cm.fetchset.entity.FetchSetItemVO` |
| `cm_genvoucher` | 凭证生成明细 | `cm.pc.pc0416.VoucherSrcVO` |
| `cm_iastuff` | 其他出入库消耗单 | `cm.iastuff.entity.IastuffHeadVO` |
| `cm_iastuff_b` | 其他出入库消耗单明细 | `cm.iastuff.entity.IastuffItemVO` |
| `cm_inprocess` | 在产品盘点单 | `cm.inprocess.entity.InprocessHeadVO` |
| `cm_inprocess_b` | 在产品盘点单明细 | `cm.inprocess.entity.InprocessItemVO` |
| `cm_inprocost` | 期初在产余额 | `cm.inprocost.entity.InproCostHeadVO` |
| `cm_inprocost_b` | 期初在产余额明细 | `cm.inprocost.entity.InproCostItemVO` |
| `cm_inprostuff` | 在产材料盘点单 | `cm.inprostuff.entity.InproStuffHeadVO` |
| `cm_inprostuff_b` | 在产材料盘点单明细 | `cm.inprostuff.entity.InproStuffItemVO` |
| `cm_lastadjust` | 上期在产成本调整单 | `cm.lastadjust.entity.LastadjustHeadVO` |
| `cm_lastadjust_b` | 上期在产成本调整单明细 | `cm.lastadjust.entity.LastadjustItemVO` |
| `cm_layratiodef` | 逐层还原比率 | `cm.layratiodef.entity.LayRatioDefHeadVO` |
| `cm_layratiodef_b` | 逐层还原比率明细 | `cm.layratiodef.entity.LayRatioDefItemVO` |
| `cm_planresult` | 计划价法分配结果 | `cm.servicealloc.PlanResultVO` |
| `cm_prodcost` | 完工成本 | `cm.pc.pc0410.ProdcostHeadVO` |
| `cm_prodcost_b` | 完工成本子表 | `cm.pc.pc0410.ProdcostItemVO` |
| `cm_product` | 完工单 | `cm.product.entity.ProductHeadVO` |
| `cm_product_b` | 完工单明细 | `cm.product.entity.ProductItemVO` |
| `cm_product_bs` | 完工产品取数明细 | `cm.product.entity.ProductFetchVO` |
| `cm_quancostgain` | 量本利分析 | `cm.report.ca1708.QuancostgainVO` |
| `cm_querycondition` | 成本查询条件 | `cm.report.QueryConditionVO` |
| `cm_revertbg` | 期初成本还原数据 | `cm.revertbg.entity.RevertBgHeadVO` |
| `cm_revertbg_b` | 期初成本还原数据明细 | `cm.revertbg.entity.RevertBgItemVO` |
| `cm_scrap` | 废品盘点单 | `cm.bill.bill0314.ScrapHeadVO` |
| `cm_scrap_b` | 废品盘点单子表 | `cm.bill.bill0314.ScrapItemVO` |
| `cm_scraprecl` | 废品回收单主表 | `cm.bill.bill0316.ScrapReclHeadVO` |
| `cm_scraprecl_b` | 废品回收单子表 | `cm.bill.bill0316.ScrapReclItemVO` |
| `cm_servicestatus` | 辅助服务分配状态表 | `cm.servicealloc.CMServiceStatusVO` |
| `cm_servicestatusitem` | 辅助服务分配状态 | `cm.servicealloc.CMServiceStatusItemVO` |
| `cm_stuff` | 物料消耗单 | `cm.stuff.entity.StuffHeadVO` |
| `cm_stuff_b` | 物料消耗单明细 | `cm.stuff.entity.StuffItemVO` |
| `cm_stuffshift` | 非仓储物料转移单 | `cm.stuffshift.entity.StuffShiftHeadVO` |
| `cm_stuffshift_b` | 非仓储物料转移单明细 | `cm.stuffshift.entity.StuffShiftItemVO` |
| `cm_subitemcost` | 产成品其他入库分项成本 | `cm.subitemcost.entity.SubitemcostHeadVO` |
| `cm_subitemcost_b` | 产成品其他入库分项成本明细 | `cm.subitemcost.entity.SubitemcostItemVO` |
| `cm_tranlevel` | 成本结转层次 | `cm.tranlevel.TranLevelVO` |
| `cm_tranlevelcal` | 结转层次计算 | `cm.tranlevel.TranLevelCalVO` |
| `cm_tranlevelcheck` | 成本结转层次-检查 | `cm.tranlevel.TranLevelCheckVO` |
| `cm_unitedeputydetachdef` | 联副产品分离方法定义 | `cm.unitedeputydetachdef.entity.UniteDeputyDetachDefVO` |
| `cm_voucher` | 凭证生成状态 | `cm.pc.pc0416.VoucherStatusVO` |

### cmp 现金管理（78 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `cmp_accountagiotage` | 汇兑损益单 | `cmp.accountagiotage.AccountAgiotageVO` |
| `cmp_apply` | 付款申请 | `cmp.apply.ApplyVO` |
| `cmp_apply` | 付款申请管理 | `cmp.apply.ApplyManagerVO` |
| `cmp_apply_b` | 付款申请明细 | `cmp.apply.ApplyBVO` |
| `cmp_apply_b` | 付款申请管理明细 | `cmp.apply.ApplyManagerBVO` |
| `cmp_applybilltype` | 付款申请交易类型 | `cmp.apply.ApplyBillTypeVO` |
| `cmp_applytransfer` | 付款申请 | `cmp.apply.ApplyTransferVO` |
| `cmp_balancereport` | 资金余额汇总查询 | `cmp.balancereport.balancereport` |
| `cmp_balancesequence` | 资金余额序时汇总查询 | `cmp.balancesequence.balancesequence` |
| `cmp_bankaccdetail` | 银行账户账明细表 | `cmp.bankaccbook.BankAccDetailVO` |
| `cmp_bankaccexsign` | 银行账户超额签核 | `cmp.bankaccexsign.AccexsignVO` |
| `cmp_bankaccrule` | 银行账户规则控制 | `cmp.bankaccrule.BankaccRuleVO` |
| `cmp_bankaccrule_b` | 银行账户规则控制子表 | `cmp.bankaccrule.BankaccRuleBVO` |
| `cmp_bankdailybook` | 银行存款日记账 | `cmp.bankdailybook.bankdailybook` |
| `cmp_bankdailyreport` | 银行存款日报表 | `cmp.bankdailyreport` |
| `cmp_billconfer` | 单据协同设置 | `billconfer.BillconferVO` |
| `cmp_billtype` | 单据类型财务扩展 | `cmp.djlx.DjLXVO` |
| `cmp_billtypereg` | 业务单据类型注册表 | `cmp.settlement.BillRegVO` |
| `cmp_cashaccrule` | 现金账户控制规则 | `cmp.cashaccrule.CashaccRuleVO` |
| `cmp_cashdailybook` | 现金存款日记账 | `cmp.cashdailybook.cashdailybook` |
| `cmp_cashdailyreport` | 现金存款日报表 | `cmp.cashdailyreport.cashdailyreport` |
| `cmp_cashdeposit` | 现金缴存单 | `cmp.cash.CashDepositVO` |
| `cmp_cashdraw` | 现金支取单 | `cmp.cash.CashDrawVO` |
| `cmp_changebill` | 划账结算单 | `cmp.bill.ChangeBillVO` |
| `cmp_changebill_commonuse` | 划账结算单常用单据 | `cmp.commonusebill.CommonUseChangeBillVO` |
| `cmp_changebilldetail` | 划账结算单明细 | `cmp.bill.ChangeBillDetailVO` |
| `cmp_changebilldetail_cu` | 划账结算单明细常用单据 | `cmp.commonusebill.CommonUseChangeBillDetailVO` |
| `cmp_contrastclass` | 银行对账外部接口类注册 | `cmp.contrastclass.contrastclass` |
| `cmp_curexchange` | 外币兑换 | `cmp.curexchange.CurExchangeVO` |
| `cmp_detail` | 结算信息明细 | `cmp.settlement.SettlementBodyVO` |
| `cmp_detailReport` | 明细账 | `cmp.DetailReport.detailReport` |
| `cmp_funddailyreport` | 资金形态日报表 | `cmp.funddailyreport.funddailyreport` |
| `cmp_fundform` | 资金流查询（资金形态） | `cmp.fundform.fundform` |
| `cmp_id_ntb` | 预算注册 | `cmp.ntbregister.ntbregister` |
| `cmp_informer` | 到账通知 | `cmp.informer.InformerVO` |
| `cmp_informermapping` | 到账通知对应关系 | `cmp.informer.InformerMappingVO` |
| `cmp_informerrelease` | 到账通知认领 | `cmp.informer.InformerReleaseVO` |
| `cmp_initdata` | 期初余额 | `cmp.originalbalance.OriginalBalanceVO` |
| `cmp_note_ebm` | 票据购置子表 | `cmp.note.gz.NoteGzBVO` |
| `cmp_note_ebm` | 票据管理 | `cmp.note.NOTEEBMVO` |
| `cmp_note_ebm` | 票据管理b | `cmp.note.NOTEEBM_BVO` |
| `cmp_note_gzb` | 票据购置 | `cmp.note.gz.NoteGzVO` |
| `cmp_noteproperty` | 票据类型属性 | `cmp.note.NoteSettingVO` |
| `cmp_occur_mensal` | 预处理发生额月发生表 | `nc.vocmp.cmp_occur_mensal.cmp_occur_mensal` |
| `cmp_occur_yearly` | 预处理发生日发生表 | `component.occur_yearly` |
| `cmp_occurdaily` | 预处理发生日发生表 | `nc.vocmp.prereporttally.occurdaily` |
| `cmp_outerface` | CMP外部接口表 | `sxsp.init.CMPOuterfaceVO` |
| `cmp_param` | 结账参数实体 | `cmp.settleaccount.SettleAccountParamVO` |
| `cmp_paybill` | 付款结算单 | `cmp.bill.BillVO` |
| `cmp_paybill_commonuse` | 付款结算单常用单据 | `cmp.commonusebill.CommonUseBillVO` |
| `cmp_paybilldetail` | 付款结算单明细 | `cmp.bill.BillDetailVO` |
| `cmp_paybilldetail_commonuse` | 付款结算单明细常用单据 | `cmp.commonusebill.CommonUseBillDetailVO` |
| `cmp_payment` | 网银支付单 | `cmp.payment.PaymentCrumbVO` |
| `cmp_recbill` | 收款结算单 | `cmp.bill.RecBillVO` |
| `cmp_recbill_commonuse` | 收款结算单常用单据 | `cmp.commonusebill.CommonUseRecBillVO` |
| `cmp_recbilldetail` | 收款结算单明细 | `cmp.bill.RecBillDetailVO` |
| `cmp_recbilldetail_commonuse` | 收款结算单明细常用单据 | `cmp.commonusebill.CommonUseRecBillDetailVO` |
| `cmp_settlechange` | 单位支付信息变更 | `cmp.settlechange.SettleChangeVO` |
| `cmp_settledetailrpt` | 结算明细查询 | `nc.ui.cmp.report.busireport.SettleDetailReportUI` |
| `cmp_settlement` | 结算信息 | `cmp.settlement.SettlementHeadVO` |
| `cmp_signdaily` | 预处理签字确认日发生表 | `nc.vocmp.cmp_signdaily.signdaily` |
| `cmp_signmensal` | 预处理签字确认月发生表 | `nc.vocmp.cmp_signmensal.signmensal` |
| `cmp_signyearly` | 预处理签字确认年发生表 | `nc.vocmp.cmp_signyearly.signyearly` |
| `cmp_sumupreport` | 汇总表 | `cmp.sumupreport.sumupreport` |
| `cmp_syscode` | 来源系统 | `cmp.syscode.cmp_syscode` |
| `cmp_tallydaily` | 预处理记账日发生表 | `nc.vocmp.cmp_tallydaily.cmp_tallydaily` |
| `cmp_tallymensal` | 预处理记账月发生表 | `nc.vocmp.tallymensal` |
| `cmp_tallyyearly` | 预处理记账年发生表 | `nc.vocmp.cmp_tallyyearly.cmp_tallyyearly` |
| `cmp_trade` | 资金流查询 (内外交易) | `cmp.trade.trade` |
| `cmp_transformbill` | 划账结算 | `cmp.bill.TransformBillVO` |
| `gl_accountlink` | 对账账户关联实体 | `cmp.cb.AccountlinkVO` |
| `gl_accountstart` | 对账账户启用实体 | `cmp.accountstart.AccountStart` |
| `gl_balanceadjust` | 余额调节表审核 | `cmp.cb.BalanceAdjustResultVO` |
| `gl_bankreceipt` | 银行对账单 | `cmp.cb.BankReceiptVO` |
| `gl_contrast` | 对账记录 | `cmp.contrast.contrast` |
| `gl_contrastaccount` | 对账账户实体 | `cmp.cb.ContrastVO` |
| `gl_corpreceipt` | 期初单位日记账 | `cmp.corpreceipt.corpreceipt` |
| `gl_power_contrastacc` | 对账账户权限 | `cmp.contrastacc.contrastacc` |

### cmsg 渠道补货协同（9 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `cmsg_ch11trantype` | 渠道要货单交易类型 | `cmsg.ch11trantype.entity.CH11TranTypeVO` |
| `cmsg_chorder` | 渠道要货单 | `cmsg.chorder.entity.CHOrderVO` |
| `cmsg_chorder_b` | 渠道要货单行 | `cmsg.chorder.entity.CHOrderBVO` |
| `cmsg_distribute` | 配送单主表 | `cmsg.distribute.entity.DistributeHVO` |
| `cmsg_distribute_b` | 配送单子表 | `cmsg.distribute.entity.DistributeBVO` |
| `cmsg_districonfig` | 代配送设置 | `cmsg.districonfig.entity.DistriConfigVO` |
| `cmsg_distritrantype` | 配送单交易类型 | `cmsg.distritran.entity.DistriTranTypeVO` |
| `cmsg_o2odistribution` | o2o配送单主表 | `cmsg.o2odistribution.entity.O2ODistributionHVO` |
| `cmsg_o2odistribution_b` | o2o配送单子表 | `cmsg.o2odistribution.entity.O2ODistributionBVO` |

### cof 客户要货计划（7 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `cof_custvalueset` | 客户维度值集 | `cof.plantemplate.entity.CustvaluesetVO` |
| `cof_mrpbilldemand` | MRP单据需求 | `cof.mrp.entity.MRPBillDemandVO` |
| `cof_orderplan` | 要货计划 | `cof.orderplan.entity.OrderplanVO` |
| `cof_orderplan_b` | 要货计划行 | `cof.orderplan.entity.OrderplanBVO` |
| `cof_orderplanbtp` | 要货计划单体时格 | `cof.orderplan.entity.OrderplanBTPVO` |
| `cof_orderplanexec` | 执行情况 | `cof.orderplan.entity.OrderplanExecVO` |
| `cof_planexecdoc` | 执行单据信息 | `cof.orderplan.entity.PlanExecDocVO` |

### erm 费用管理（41 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `er_accrued` | 费用预提单 | `erm.accruedexpense.AccruedVO` |
| `er_accrued_detail` | 预提明细 | `erm.accruedexpense.AccruedDetailVO` |
| `er_accrued_verify` | 预提核销明细 | `erm.accruedexpense.AccruedVerifyVO` |
| `er_accrued_verify` | 报销核销预提明细 | `erm.accruedexpense.AccruedVerifyVO` |
| `er_billcontrast` | 单据对照表 | `erm.billcontrast.BillcontrastVO` |
| `er_busitem` | 报销单业务行 | `ep.bx.BXBusItemVO` |
| `er_busitem` | 借款单业务行 | `ep.bx.JKBusItemVO` |
| `er_bxcontrast` | 冲销对照行 | `ep.bx.BxcontrastVO` |
| `er_bxcontrast` | 冲款对照行 | `ep.bx.BxcontrastVO` |
| `er_bxzb` | 报销管理 | `ep.bx.BXExtHeaderVO` |
| `er_bxzb` | 报销单 | `ep.bx.BXHeaderVO` |
| `er_costshare` | 费用结转单 | `erm.costshare.CostShareVO` |
| `er_cshare_detail` | 费用分摊明细 | `erm.costshare.CShareDetailVO` |
| `er_cshare_detail` | 事前费用分摊明细 | `erm.costshare.CShareDetailVO` |
| `er_cshare_month` | 费用结转单跨期分摊实体 | `erm.costshare.ext.CShareMonthVO` |
| `er_djlx` | 报销单据类型 | `er.djlx.DjLXVO` |
| `er_expamtdetail` | 费用待摊摊销信息明细 | `erm.expamortize.ExpamtDetailVO` |
| `er_expamtinfo` | 费用待摊摊销信息 | `erm.expamortize.ExpamtinfoVO` |
| `er_expamtproc` | 费用摊销过程记录 | `erm.expamortize.ExpamtprocVO` |
| `er_expenseaccount` | 费用明细帐 | `erm.expenseaccount.ExpenseAccountVO` |
| `er_expensebal` | 费用帐汇总表 | `erm.expenseaccount.ExpenseBalVO` |
| `er_expensetype` | 费用类型 | `er.expensetype.ExpenseTypeVO` |
| `er_extendconfig` | 费用单据扩展配置 | `erm.extendconfig.ErmExtendConfigVO` |
| `er_fieldcontrast` | 费用单据间字段对照 | `erm.fieldcontrast.FieldcontrastVO` |
| `er_indauthorize` | 授权代理设置 | `er.indauthorize.IndAuthorizeVO` |
| `er_init` | 费用管理期初 | `erm.erminit.ErminitVO` |
| `er_jkzb` | 借款单 | `ep.bx.JKHeaderVO` |
| `er_mtapp_bill` | 费用申请单 | `erm.matterapp.MatterAppVO` |
| `er_mtapp_billpf` | 费用申请单业务单据执行情况总表 | `erm.matterappctrl.MtappbillpfVO` |
| `er_mtapp_cbill` | 费用申请单控制单据 | `erm.mactrlschema.MtappCtrlbillVO` |
| `er_mtapp_cfield` | 费用申请单控制维度 | `erm.mactrlschema.MtappCtrlfieldVO` |
| `er_mtapp_detail` | 费用申请单明细 | `erm.matterapp.MtAppDetailVO` |
| `er_mtapp_month` | 费用申请单跨期分摊实体 | `erm.matterapp.ext.MtappMonthExtVO` |
| `er_mtapp_pf` | 费用申请单执行情况 | `erm.matterappctrl.MtapppfVO` |
| `er_reimdimension` | 报销标准维度 | `er.reimrule.ReimRuleDimVO` |
| `er_reimruler` | 报销标准 | `er.reimrule.ReimRulerVO` |
| `er_reimtype` | 报销类型 | `er.reimtype.ReimTypeVO` |
| `er_sharerule` | 费用分摊规则 | `erm.sharerule.ShareruleVO` |
| `er_sruledata` | 费用分摊规则数据 | `erm.sharerule.ShareruleDataVO` |
| `er_sruleobj` | 费用分摊规则对象 | `erm.sharerule.ShareruleObjVO` |
| `erm_detaillinkquery` | 明细联查 | `ep.bx.BxDetailLinkQueryVO` |

### eur 欧盟报表（28 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `eur_Entity` | 报告生成查询 | `eur.vat.pub.VatReportQueryVO` |
| `eur_checkmessage` | 校验报告 | `eur.vat.monthreport.VatcheckMessageVO` |
| `eur_mnarrivestat_b` | 跨境到达统计报告表体 | `ic.icreport.vo.mnarrivestat.MNArriveStatBodyVO` |
| `eur_mnarrivestat_h` | 跨境到达统计报告表头 | `ic.icreport.vo.mnarrivestat.MNArriveStatHeadVO` |
| `eur_mnsendstat_b` | 跨境发出统计报告表体 | `ic.icreport.vo.mnsendstat.MNSendStatBodyVO` |
| `eur_mnsendstat_h` | 跨境发出统计报告表头 | `ic.icreport.vo.mnsendstat.MNSendStatHeadVO` |
| `eur_mtreport` | 月报表 | `eur.vat.monthreport.VatmtReportVO` |
| `eur_mtreportsub` | 月报表明细 | `eur.vat.monthreport.VatmtReportsubVO` |
| `eur_salereport` | 销售清单 | `eur.vat.salereport.VatSaleReportVO` |
| `eur_salereportsub` | 销售清单明细 | `eur.vat.salereport.VatSaleReportSubVO` |
| `eur_validtrule` | 校验规则设置 | `eur.vat.validaterule.ValidateRuleVO` |
| `eur_validtrulesub` | 校验规则子表 | `eur.vat.validaterule.ValidateRuleSubVO` |
| `eur_vataccasoa` | 增值税科目设置 | `eur.vat.accasoaset.VatAccasoaVO` |
| `eur_vataccasoasub` | 增值税科目对 | `eur.vat.accasoaset.VatAccasoasubVO` |
| `eur_vatlinksum` | 联查汇总 | `eur.vat.monthreport.VatLinkSumVO` |
| `eur_vatmatchamount` | 匹配计税金额组 | `eur.vat.monthreport.VatMatchAmountVO` |
| `eur_vatmatchtax` | 匹配税金组 | `eur.vat.monthreport.VatMatchTaxVO` |
| `eur_vatnomatchamount` | 未匹配计税金额组 | `eur.vat.monthreport.VatNoMatchAmountVO` |
| `eur_vatnomatchtax` | 未匹配税金组 | `eur.vat.monthreport.VatNoMatchTaxVO` |
| `eur_vatrelation` | 组号匹配关系 | `eur.vat.relation.VatRelationVO` |
| `eur_vatrelationsub` | 匹配关系子实体 | `eur.vat.relation.VatRelationsubVO` |
| `eur_yearreport` | 年纳税报表 | `eur.vat.yearreport.VatYearReportVO` |
| `eur_yearreportsub` | 年纳税报表明细 | `eur.vat.yearreport.VatYearReportSubVO` |
| `gl_freevalue` | 辅助核算内容表 | `gl.aggvoucher.FreeValueVO` |
| `gl_rtdetail` | 实时凭证分录 | `gl.aggvoucher.MDDetail` |
| `gl_rtvoucher` | 实时凭证主体 | `gl.aggvoucher.MDVoucher` |
| `gl_vatdetail` | 税务明细 | `eur.vat.monthreport.VatDetailVO` |
| `gl_vatdetail` | 增值税信息表 | `gl.vatdetail.VatDetailVO` |

### fa 固定资产（71 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `fa_Profit_b` | 盘盈明细 | `fa.profit.ProfitBVO` |
| `fa_accbookinfo` | 账簿信息 | `fa.accbookinfo.AccbookHeadVO` |
| `fa_accbookinfo_b` | 账簿信息明细 | `fa.accbookinfo.AccbookBodyVO` |
| `fa_alter` | 变动单 | `fa.alter.AlterHeadVO` |
| `fa_alter_b` | 明细 | `fa.alter.AlterBodyVO` |
| `fa_altersheet` | 变动单明细 | `fa.alter.AlterSheetVO` |
| `fa_assetcombin` | 资产合并单 | `fa.assetcombin.AssetCombinHeadVO` |
| `fa_assetcombin_b` | 资产合并子表 | `fa.assetcombin.AssetCombinBodyVO` |
| `fa_assetgroup` | 资产组 | `fa.assetgroup.AssetGroupHeadVO` |
| `fa_assetgroup_b` | 资产组子表 | `fa.assetgroup.AssetGroupBodyVO` |
| `fa_assetgrouprate` | 资产组分摊表 | `fa.assetgroup.AssetGroupRateVO` |
| `fa_assetsplit` | 资产拆分单 | `fa.assetsplit.AssetSplitHeadVO` |
| `fa_assetsplit_b` | 资产拆分子表 | `fa.assetsplit.AssetSplitBodyVO` |
| `fa_card` | 资产卡片 | `fa.asset.AssetVO` |
| `fa_card` | 资产卡片 (实体) | `fa.assetcard.CardVO` |
| `fa_cardhistory` | 多账簿历史 | `fa.assetcard.CardhistoryVO` |
| `fa_category` | 资产类别 | `fa.category.CategoryVO` |
| `fa_closebook` | 月末结账 | `fa.closebook.CloseBookVO` |
| `fa_color` | 账簿颜色 | `fa.option.ColorVO` |
| `fa_depgather` | 折旧分摊汇总主表 | `fa.dep.gather.GatherHVO` |
| `fa_depgather_b` | 折旧分摊汇总子表 | `fa.dep.gather.GatherBVO` |
| `fa_depgathersheet` | 折旧分摊汇总明细 | `fa.dep.gather.GatherSheetVO` |
| `fa_deployin` | 资产调入单 | `fa.deployin.DeployInHeadVO` |
| `fa_deployin_b` | 明细 | `fa.deployin.DeployInBodyVO` |
| `fa_deployout` | 资产调出单 | `fa.deployout.DeployOutHeadVO` |
| `fa_deployout_b` | 明细 | `fa.deployout.DeployOutBodyVO` |
| `fa_depmethod` | 折旧方法 | `fa.depmethod.DepmethodVO` |
| `fa_depprogram` | 模拟折旧设置 | `fa.depprogram.DepProgramHeadVO` |
| `fa_depprogram_b` | 模拟折旧设置表体 | `fa.depprogram.DepProgramBodyVO` |
| `fa_deptscale` | 使用部门分摊 | `fa.deptscale.DeptScaleVO` |
| `fa_deptscalefalview` | 使用部门 | `fa.asset.DeptscaleViewVO` |
| `fa_evaluate` | 评估单 | `fa.evaluate.EvaluateHeadVO` |
| `fa_evaluate_b` | 评估单子表 | `fa.evaluate.EvaluateBodyVO` |
| `fa_expense` | 费用 | `fa.assetcard.ExpenseVO` |
| `fa_expenseview` | 费用 | `fa.asset.ExpenseViewVO` |
| `fa_gatheritem` | 汇总项目 | `fa.option.GatheritemVO` |
| `fa_initaccbook` | 账簿初始化 | `fa.initaccbook.InitAccbookHeadVO` |
| `fa_initaccbook_b` | 账簿初始化明细 | `fa.initaccbook.InitAccbookBodyVO` |
| `fa_insurance` | 保险 | `fa.assetcard.InsuranceVO` |
| `fa_insuranceview` | 保险 | `fa.asset.InsuranceViewVO` |
| `fa_inventory` | 固定资产盘点单 | `fa.inventory.InventoryHVO` |
| `fa_inventory_b` | 盘点单明细 | `fa.inventory.InventoryBVO` |
| `fa_log` | 日志 | `fa.log.LogVO` |
| `fa_logalter` | 变动 | `fa.assetcard.LogalterVO` |
| `fa_logalterview` | 变动记录 | `fa.asset.LogalterViewVO` |
| `fa_logdeployview` | 调拨 | `fa.asset.LogdeployViewVO` |
| `fa_logdepview` | 折旧 | `fa.asset.LogdepViewVO` |
| `fa_logdevalue` | 减值 | `fa.assetcard.LogdevalueVO` |
| `fa_logdevalueview` | 减值 | `fa.asset.LogdevalueViewVO` |
| `fa_logevaluate` | 评估 | `fa.assetcard.LogevaluateVO` |
| `fa_logevaluateview` | 评估 | `fa.asset.LogevaluateViewVO` |
| `fa_logreduceview` | 减少 | `fa.asset.LogreduceViewVO` |
| `fa_newasset` | 资产审批 | `fa.newasset.NewAssetHeadVO` |
| `fa_newasset_b` | 资产审批明细 | `fa.newasset.NewAssetBodyVO` |
| `fa_option` | 折旧属性设置 | `fa.option.OptionVO` |
| `fa_predevaluate` | 资产减值单 | `fa.predevaluate.PredevaluateHeadVO` |
| `fa_predevaluate_b` | 资产减值单子表 | `fa.predevaluate.PredevaluateBodyVO` |
| `fa_profit` | 固定资产盘盈单 | `fa.profit.ProfitHVO` |
| `fa_reduce` | 减少单 | `fa.reduce.ReduceHeadVO` |
| `fa_reduce_b` | 减少明细 | `fa.reduce.ReduceBodyVO` |
| `fa_rent` | 租金 | `fa.assetcard.RentVO` |
| `fa_rentview` | 租金 | `fa.asset.RentViewVO` |
| `fa_simulatedep` | 模拟折旧主表 | `fa.simulatedep.SimulateDepHVO` |
| `fa_simulatedep_b` | 模拟折旧子表 | `fa.simulatedep.SimulateDepBVO` |
| `fa_subequip` | 附属设备 | `fa.assetcard.SubequipVO` |
| `fa_subequipview` | 附属设备 | `fa.asset.SubequipViewVO` |
| `fa_transasset` | 转固单 | `fa.transasset.TransassetHeadVO` |
| `fa_transasset_b` | 转固单明细 | `fa.transasset.TransassetBodyVO` |
| `fa_usedaydeporg` | 启用日折旧组织 | `fa.usedaydeporg.UsedaydeporgVO` |
| `fa_usingstatus` | 使用状况 | `fa.usingstatus.UsingStatusVO` |
| `fa_voucherstyle` | 制单方式 | `fa.option.VoucherstyleVO` |

### fbm 商业汇票（56 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `cfbm_innerback` | 内部领用办理表 | `cfbm.innerback.InnerBackVO` |
| `cfbm_innerback_b` | 内部领用办理明细 | `cfbm.innerback.InnerBackBVO` |
| `cfbm_innerbackapply` | 内部领用 | `cfbm.innerbackapply.InnerBackApplyVO` |
| `cfbm_innerbackapply_b` | 内部领用明细 | `cfbm.innerbackapply.InnerBackApplyBVO` |
| `cfbm_innerkeep` | 内部托管办理 | `cfbm.innerkeep.InnerKeepVO` |
| `cfbm_innerkeep_b` | 内部托管办理明细 | `cfbm.innerkeep.InnerKeepBVO` |
| `cfbm_innerkeepapply` | 内部托管申请表 | `cfbm.innerkeepapply.InnerKeepApplyVO` |
| `cfbm_innerkeepapply_b` | 内部托管申请字表 | `cfbm.innerkeepapply.InnerKeepApplyBVO` |
| `cfbm_innertrans` | 内部转让办理 | `cfbm.innertrans.InnerTransVO` |
| `cfbm_innertrans_b` | 内部转让办理明细 | `cfbm.innertrans.InnerTransBVO` |
| `cfbm_innertransapply` | 内部转让申请 | `cfbm.innertransapply.InnerTransApplyVO` |
| `cfbm_innertransapply_b` | 内部转让申请明细 | `cfbm.innertransapply.InnerTransApplyBVO` |
| `cfbm_reckon` | 清算单 | `cfbm.reckon.ReckonVO` |
| `cfbm_reckon_b` | 清算单明细 | `cfbm.reckon.ReckonBVO` |
| `cfbm_reckon_detail` | 待清算记录表 | `cfbm.reckondetail.ReckonDetailVO` |
| `cfbm_reckonback` | 清算回单 | `cfbm.reckonback.ReckonBackVO` |
| `cfbm_reckonback_b` | 清算回单明细 | `cfbm.reckonback.ReckonBackBVO` |
| `cfbm_redeploy` | 票据调剂 | `cfbm.redeploy.FbRedeployVO` |
| `cfbm_redeploy_b` | 票据调剂明细 | `cfbm.redeploy.FbRedeployBVO` |
| `cfbm_redeployback` | 票据调剂回单 | `cfbm.redeployback.FbRedeployBackVO` |
| `cfbm_redeployback_b` | 调剂回单明细 | `cfbm.redeployback.FbRedeployBackBVO` |
| `cfbm_sign_accept` | 开票申请受理表 | `cfbm.signaccept.SignAcceptVO` |
| `cfbm_sign_apply` | 开票申请表 | `cfbm.signapply.SignApplyVO` |
| `fbm_PreConcertLog` | 预定日志 | `fbm.preconcert.PreConcertLogVO` |
| `fbm_accept` | 票据付款回单 | `cfbm.acceptback.AcceptBackVO` |
| `fbm_accept` | 票据付款 | `fbm.accept.AcceptVO` |
| `fbm_action` | 票据动作 | `fbm.pub.action.ActionVO` |
| `fbm_billacc_dailysum` | 票据帐日发生额 | `fbm.billacc.BillAccDailyVO` |
| `fbm_billacc_detail` | 票据帐明细 | `fbm.billacc.BillAccDetailVO` |
| `fbm_billacclock` | 票据帐锁表 | `fbm.billacc.BillAccLockVO` |
| `fbm_booklog` | 预订记录 | `fbm.booklog.BookLogVO` |
| `fbm_buyerdiscount` | 应付票据贴现回单 | `cfbm.buyerdisback.BuyerDisBackVO` |
| `fbm_buyerdiscount` | 应付票据贴现 | `fbm.buyerdiscount.BuyerDiscountVO` |
| `fbm_consignbank` | 银行托收 | `fbm.consignbank.ConsignBankVO` |
| `fbm_counterbook` | 票据台帐 | `fbm.report.counterbook.CounterBookVO` |
| `fbm_counterbook_b` | 票据台帐子表 | `fbm.report.counterbook.CounterBookBVO` |
| `fbm_discount` | 票据贴现 | `fbm.discount.DiscountVO` |
| `fbm_discountcalculate` | 贴现试算 | `fbm.discountcalculate.DiscalculateVO` |
| `fbm_discountcalculate_b` | 贴现试算子表 | `fbm.discountcalculate.DiscalculateBVO` |
| `fbm_endore` | 票据背书 | `fbm.endore.EndoreVO` |
| `fbm_illegal` | 非法票据登记 | `fbm.illegal.IllegalVO` |
| `fbm_impawn` | 票据质押 | `fbm.impawn.ImpawnVO` |
| `fbm_outer` | 票据外部关联 | `fbm.outer.OuterVO` |
| `fbm_paybill` | 付票登记 | `fbm.paybill.PayBillVO` |
| `fbm_preturn` | 应付票据退票 | `fbm.preturn.PReturnVO` |
| `fbm_preturn_b` | 应付票据退票子表 | `fbm.preturn.PReturnBVO` |
| `fbm_register` | 票据签发回单 | `cfbm.signback.SignBackVO` |
| `fbm_register` | 票据到期分析 | `fbm.billacc.EndAnalysisRptHVO` |
| `fbm_register` | 票据到期分析子表 | `fbm.billacc.EndAnalysisRptBVO` |
| `fbm_register` | 票据登记 | `fbm.register.RegisterVO` |
| `fbm_return` | 票据退票 | `fbm.returnbill.ReturnVO` |
| `fbm_return_b` | 票据退票子表 | `fbm.returnbill.ReturnBVO` |
| `fbm_rreturn` | 应收票据退票表 | `fbm.rreturn.RReturnVO` |
| `fbm_rreturn_b` | 应收票据退票子表 | `fbm.rreturn.RReturnBVO` |
| `fbm_storage` | 票据托管 | `fbm.storage.StorageVO` |
| `fbm_storage_b` | 托管子表 | `fbm.storage.StorageBVO` |

### fct 收付款合同管理（15 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `fct_ap` | 付款合同 | `fct.ap.entity.CtApVO` |
| `fct_ap_b` | 合同基本 | `fct.ap.entity.CtApBVO` |
| `fct_ap_change` | 变更历史 | `fct.ap.entity.CtApChangeVO` |
| `fct_ap_exec` | 执行过程 | `fct.ap.entity.CtApExecVO` |
| `fct_ap_memora` | 合同大事记 | `fct.ap.entity.CtApMemoraVO` |
| `fct_ap_plan` | 付款计划 | `fct.ap.entity.CtApPlanVO` |
| `fct_ap_term` | 合同条款 | `fct.ap.entity.CtApTermVO` |
| `fct_ar` | 收款合同 | `fct.ar.entity.CtArVO` |
| `fct_ar_b` | 合同基本 | `fct.ar.entity.CtArBVO` |
| `fct_ar_change` | 变更历史 | `fct.ar.entity.CtArChangeVO` |
| `fct_ar_exec` | 执行过程 | `fct.ar.entity.CtArExecVO` |
| `fct_ar_memora` | 合同大事记 | `fct.ar.entity.CtArMemoraVO` |
| `fct_ar_plan` | 收款计划 | `fct.ar.entity.CtArPlanVO` |
| `fct_ar_term` | 合同条款 | `fct.ar.entity.CtArTermVO` |
| `fct_business` | 合同交易类型 | `fct.business.entity.BusinessSetVO` |

### fip 会计平台（35 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `fip_billfactor` | 单据影响因素关联 | `fip.billfactor.BillFactorVO` |
| `fip_billitem` | 单据项目 | `fip.billitem.BillItemVO` |
| `fip_billregister` | 单据类型服务注册 | `fip.billregister.BillRegisterVO` |
| `fip_classdefine` | 分类定义 | `fip.classdef.ClassDefineVO` |
| `fip_classdefrep` | 分类检查报告 | `fip.report.ClassDefReportVO` |
| `fip_classfactor` | 影响因素关联定义 | `fip.classdef.ClassFactorVO` |
| `fip_classmainprop` | 分类主属性定义 | `fip.classdef.ClassMainPropVO` |
| `fip_config` | 会计平台转换配置 | `fip.config.ConfigVO` |
| `fip_ctrlscheme` | 控制方案关联实体 | `fip.ctrl.ControlSchemeVO` |
| `fip_docgroup` | 档案组合关系 | `fip.docgroup.FipDocGroupVO` |
| `fip_docmap` | 档案转换 | `fip.docmap.DocMapVO` |
| `fip_docmap_b` | 转换映射内容 | `fip.docmap.DocMapBodyVO` |
| `fip_docmapimport` | 档案对照引入 | `fip.docmap.DocmapImportVO` |
| `fip_docview` | 对照表 | `fip.docview.DocViewListVO` |
| `fip_docview_b` | 对照表内容 | `fip.docview.DocViewVO` |
| `fip_entityattcfg` | 元数据属性分类设置 | `fip.attconfig.EntityAttributeConfigVO` |
| `fip_factor` | 影响因素 | `fip.impacfactor.ImpacFactorVO` |
| `fip_messagelog` | 消息日志 | `fip.messagelogs.MessageLogVO` |
| `fip_operatinglog` | 处理状态 | `fip.operatinglogs.OperatingLogVO` |
| `fip_orgrule` | 规则型入账设置 | `fip.orgrule.OrgRuleVO` |
| `fip_pfxxsysconf` | 外部系统配置 | `fip.pfxxsysconf.PfxxSysConfVO` |
| `fip_pfxxsysconforg` | 外部系统配置组织 | `fip.pfxxsysconf.PfxxSysConfOrgVO` |
| `fip_relation` | 关联关系 | `fip.relation.FipRelationVO` |
| `fip_ruleregister` | 转换规则类型 | `fip.config.RuleRegisterVO` |
| `fip_rulerelation` | 规则关联关系 | `fip.rulerelation.RuleRelationVO` |
| `fip_srcdocgroup` | 来源档案类型组合 | `fip.docview.SrcDocGroupVO` |
| `fip_sumrelation` | 汇总关联 | `fip.sumrelation.SumRelationVO` |
| `fip_templatecell` | 模板单元 | `fip.transtemplate.TemplateCellVO` |
| `fip_templatecell` | 模板内容 | `fip.transtemplate.TemplateCellVO` |
| `fip_templaterow` | 模板定义 | `fip.transtemplate.TemplateRowVO` |
| `fip_templaterow` | 模板定义镜像 | `fip.transtemplate.TemplateRowVO` |
| `fip_templaterow` | 模板分组 | `fip.transtemplate.TemplateRowVO` |
| `fip_templaterow` | 模板分组1 | `fip.transtemplate.TemplateRowVO` |
| `fip_transtemplate` | 单据属性检查 | `fip.report.FieldReportVO` |
| `fip_transtemplate` | 元数据转换模板 | `fip.transtemplate.TransTemplateVO` |

### fipub 财务基础设置（17 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `fi_dimfree` | 辅助维度设置 | `fipub.freevalue.DimFreeVO` |
| `fi_freemap` | 辅助映射设置表 | `fipub.freevalue.FreeMapVO` |
| `fipub_Accasoasub` | 限制科目设置 | `fipub.vouchertyperule.AccasoaSubVO` |
| `fipub_RuleBind` | 规则绑定明细 | `fipub.crosscheckrule.RuleBindVO` |
| `fipub_RuleHead` | 交叉校验规则 | `fipub.crosscheckrule.RuleHeadVO` |
| `fipub_RuleItem` | 规则子项 | `fipub.crosscheckrule.RuleItemVO` |
| `fipub_VouchertypeRule` | 凭证类别约束规则 | `fipub.vouchertyperule.VouchertypeRuleVO` |
| `fipub_freeused` | 档案使用数 | `fipub.freevalueset.FreeUsedVO` |
| `fipub_freevalue` | 辅助核算内容表 | `nc.vofipub.freevalue.freevalue` |
| `fipub_queryobj` | 报表查询对象 | `fipub.report.QueryObjVO` |
| `fipub_reportinforeg` | 报表信息注册 | `fipub.report.ReportInfoRegVO` |
| `fipub_reportinitialize` | 报表初始化主表 | `fipub.report.ReportInitializeVO` |
| `fipub_reportinitialize_b` | 报表初始化辅表 | `fipub.report.ReportInitializeItemVO` |
| `fipub_summary` | 常用摘要 | `fipub.summary.SummaryVO` |
| `fipub_timecontrol` | 账龄期间设置 | `fipub.timecontrol.TimeCtrlVO` |
| `fipub_timecontrol_b` | 账龄期间设置明细 | `fipub.timecontrol.TimeCtrlDetail` |
| `gl_docfree1` | 辅助项目 | `gl.assItem.assItem` |

### ftpub 外贸基础（10 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `ftpub_adjaccount` | 调账申请主实体 | `ftpub.adjaccount.Entity.AdjAccountHVO` |
| `ftpub_adjaccount_b` | 调账申请子实体 | `ftpub.adjaccount.Entity.AdjAccountBVO` |
| `ftpub_cooperate` | 进出口协同设置 | `ftpub.coop.entity.CooperateVO` |
| `ftpub_custconsign` | 报关报检委托书 | `ftpub.custconsign.entity.CustConsignHVO` |
| `ftpub_custconsign_b` | 报关报检委托书子实体 | `ftpub.custconsign.entity.CustConsignBVO` |
| `ftpub_doclist` | 单证清单实体 | `ftpub.doclist.Entity.DocListVO` |
| `ftpub_effectperiod` | 起效时点实体 | `ftpub.effectperiod.entity.EffectPeriodVO` |
| `ftpub_portdoc` | 港口档案实体 | `ftpub.portdoc.entity.PortDocVO` |
| `ftpub_recostitem` | 收支项目实体 | `ftpub.recostitem.entity.RecostItemVO` |
| `ftpub_trademode` | 贸易方式实体 | `ftpub.trademode.entity.TradeModeVO` |

### fts 资金结算（32 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `fts_acclock` | 内部账户实时余额表 | `fts.account.AccLockVO` |
| `fts_account_dailydetail` | 内部账户日发生额 | `fts.account.AccDailyDetailVO` |
| `fts_account_deldetail` | 内部账户明细删除表 | `fts.account.AccDetailDelVO` |
| `fts_account_detail` | 内部账户明细 | `fts.account.AccDetailVO` |
| `fts_busicurraccount` | 业务流水账 | `fts.busicurraccount.BusiCurrAccVO` |
| `fts_calendarlog` | 受理日期设置 | `fts.workdate.CalendarlogSuperVO` |
| `fts_cashgather_b` | 现金缴存单子实体 | `fts.cashgather.CashGatherBVO` |
| `fts_cashgather_h` | 现金缴存办理单 | `fts.cashgather.CashGatherVO` |
| `fts_cashgather_receipt` | 现金缴存回单 | `fts.cashgather.receipt.CashGatherReceiptVO` |
| `fts_cashpay_b` | 现金支取办理单子实体 | `fts.cashpay.CashPayBVO` |
| `fts_cashpay_h` | 现金支取办理单 | `fts.cashpay.CashPayVO` |
| `fts_cashpay_receipt` | 现金支取回单 | `fts.cashpay.receipt.CashPayReceiptVO` |
| `fts_currex` | 外币兑换单 | `fts.currex.CurrExVO` |
| `fts_currex_rcpt` | 外币兑换回单 | `fts.currex.rcpt.CurrExRcptVO` |
| `fts_gathering` | 委托收款书主实体 | `fts.commissiongathering.GatheringVO` |
| `fts_gatheringfinance` | 委收财务信息实体 | `fts.commissiongathering.GatherFinanceVO` |
| `fts_gatheringfund` | 委收资金信息实体 | `fts.commissiongathering.GatherFundVO` |
| `fts_gatheringreceipt` | 委托收款回单 | `fts.commission.receipt.GatheringReceiptVO` |
| `fts_innertransfer_b` | 内部转账单明细 | `fts.innertransfer.InnerTransferBVO` |
| `fts_innertransfer_h` | 内部转账单主实体 | `fts.innertransfer.InnerTransferVO` |
| `fts_intranrcpt_h` | 内部转帐回单主实体 | `fts.innertransfer.receipt.InnerTransferRcptVO` |
| `fts_payinfochange` | 支付信息变更单 | `fts.payinfochange.PayInfoChangeVO` |
| `fts_payment` | 委托付款书主实体 | `fts.commissionpayment.PaymentVO` |
| `fts_paymentfinance` | 委付财务信息实体 | `fts.commissionpayment.PayFinanceVO` |
| `fts_paymentfund` | 委付资金信息实体 | `fts.commissionpayment.PayFundVO` |
| `fts_paymentreceipt` | 委托付款书回单 | `fts.commission.receipt.PaymentReceiptVO` |
| `fts_spegather_b` | 特转收款单子实体 | `fts.spegather.SpeGatherBVO` |
| `fts_spegather_h` | 特转收款单 | `fts.spegather.SpeGatherVO` |
| `fts_spegather_receipt` | 特转收款单回单 | `fts.spegather.receipt.SpeGatherReceiptVO` |
| `fts_spepay_b` | 特转付款单子实体 | `fts.spepay.SpePayBVO` |
| `fts_spepay_h` | 特转付款单 | `fts.spepay.SpePayVO` |
| `fts_spepay_receipt` | 特转支付回单 | `fts.spepay.receipt.SpePayReceiptVO` |

### gfc 合并账簿（34 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `gfc_accbookrelation` | 核算账簿组合对 | `gfc.accbookrelation.AccbookRelationVO` |
| `gfc_accurrcurrtype` | 发生币种 | `gfc.accurrcurrtype.AccurrcurrtypeVO` |
| `gfc_applycope` | 适用范围 | `gfc.template.ApplyCopeVO` |
| `gfc_balance` | gfc_balance | `gfc.vouchereffect.BalanceVO` |
| `gfc_cashflowcase` | 现金流量发生项 | `gfc.cashflow.CashflowcaseVO` |
| `gfc_combinapplycope` | 模板适用范围 | `gfc.combineaccount.ApplyCopeVO` |
| `gfc_combineaccount` | 合并账簿 | `gfc.combineaccount.CombineAccountVO` |
| `gfc_commvoucher` | 常用凭证 | `gfc.voucher.GFCCommVoucherVO` |
| `gfc_conbineentity` | 合并主体 | `gfc.combineaccount.CombinEntityVO` |
| `gfc_corddetail` | 记录明细 | `gfc.excuterecord.CordDetailVO` |
| `gfc_detail` | 凭证分录 | `gfc.voucher.DetailVO` |
| `gfc_draftaccrule` | 科目规则 | `gfc.hbdraft.DraftAccRuleVO` |
| `gfc_draftorg` | 核算账簿顺序 | `gfc.hbdraft.DraftOrgVO` |
| `gfc_draftset` | 工作底稿设置 | `gfc.hbdraft.DraftSetVO` |
| `gfc_evalaccdetail` | 备查簿明细 | `gfc.valueaccount.EvalAccDetailVO` |
| `gfc_evalaccount` | 子公司公允价值备查簿 | `gfc.valueaccount.EvalAccountVO` |
| `gfc_excuterecord` | 执行记录 | `gfc.excuterecord.ExcuteRecordVO` |
| `gfc_ibqscashflow` | 现金流量项目设置 | `gfc.setting.IbqsCashflowVO` |
| `gfc_ibqsdes` | 对方组织设置 | `gfc.setting.IbqsDesVO` |
| `gfc_ibqssrc` | 本方组织设置 | `gfc.setting.IbqsSrcVO` |
| `gfc_ibqssubj` | 科目规则设置 | `gfc.setting.IbqsSubjVO` |
| `gfc_initbuild` | 期初建账 | `gfc.init.InitBuildVO` |
| `gfc_innerbusset` | 内部交易查询设置 | `gfc.setting.InnerBusSetVO` |
| `gfc_offsetaschme` | 调整抵销方案 | `gfc.offsetscheme.OffsetSchmeVO` |
| `gfc_offsetresult` | 抵销模板执行结果 | `gfc.offsetresult.OffsetResultVO` |
| `gfc_origcashflowcase` | 原始现金流量发生项 | `gfc.origcashflowcase.OrigCashFlowCaseVO` |
| `gfc_origdetail` | 原始凭证分录 | `gfc.origvoucher.OrigdetailVO` |
| `gfc_origvoucher` | 原始凭证 | `gfc.origvoucher.OrigvoucherVO` |
| `gfc_relatetmp` | 关联模板 | `gfc.offsetscheme.RelateTmpVO` |
| `gfc_syssettle` | 结账 | `gfc.settle.SysSettleVO` |
| `gfc_tempdetail` | 模板分录 | `gfc.template.TempDetailVO` |
| `gfc_tempdetailfeild` | 模板分录字段 | `gfc.template.TempDetailFeildVO` |
| `gfc_template` | 调整抵销模板 | `gfc.template.TemplateVO` |
| `gfc_voucher` | 凭证 | `gfc.voucher.VoucherVO` |

### gl 总账（170 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `fi_dimfree` | 辅助维度设置 | `fipub.freevalue.DimFreeVO` |
| `fi_freemap` | 辅助映射设置表 | `fipub.freevalue.FreeMapVO` |
| `gl_ContrastData` | 对帐数据 | `gl.contrast.data.ContrastDataVO` |
| `gl_ContrastReportCreateVO` | 对账报告生成列表VO | `gl.contrast.report.create.ContrastReportCreateVO` |
| `gl_DefaultCombineScheme` | 默认合并方案设置 | `voucher.fip.DefaultCombineScheme` |
| `gl_ReconcileRuleSub` | 协同业务规则明细 | `gl.reconcile.rule.ReconcileRuleSubVO` |
| `gl_ResultDetailTabVO` | 余额对账明细VO | `gl.contrast.result.ResultDetailTabVO` |
| `gl_ResultOccurSubVO` | 总额对账发生明细 | `gl.contrast.result.ResultOccurSubVO` |
| `gl_ResultOccurTabDetailVO` | 发生对账明细VO | `gl.contrast.result.ResultOccurTabDetailVO` |
| `gl_ResultQryVO` | 对账结果查询对象 | `nc.vogl.ResultQryVO.ResultQryVO` |
| `gl_SubjRowDataVO` | 科目行数据VO | `gl.contrast.report.subjdata.SubjRowDataVO` |
| `gl_VerifyDetail` | 核销余额 | `gl.verifydetail.Entity` |
| `gl_accountgroupone` | 科目组1 | `gl.vouchkrule.AccountGroupOneVO` |
| `gl_accountgrouptwo` | 科目组2 | `gl.vouchkrule.AccountGroupTwoVO` |
| `gl_accountrule` | 科目关系规则 | `gl.vouchkrule.AccountRuleVO` |
| `gl_amorcycle` | 周期凭证周期主体 | `gl.amortize.setting.AmorCycleVO` |
| `gl_amorcycledetail` | 摊销周期明细 | `gl.amortize.setting.AmorCycleDetailVO` |
| `gl_amordetail` | 周期凭证定义明细 | `gl.amortize.setting.AmorDetailVO` |
| `gl_amortize` | 周期凭证定义主体 | `gl.amortize.setting.AmortizeVO` |
| `gl_appdetail` | 分摊对象明细 | `gl.apportion.AppdetailVO` |
| `gl_appitem` | 分摊对象 | `gl.apportion.AppitemVO` |
| `gl_apportionrule` | 分摊规则 | `gl.apportion.ApportionRuleVO` |
| `gl_autocontrast` | 自动对账VO | `gl.contrast.detailcontrat.AutoContrastRuleVO` |
| `gl_balance` | 凭证余额 | `gl.balance.balance` |
| `gl_braccasoa` | 会计科目子表 | `gl.busirecon.setting.BRAccasoaVO` |
| `gl_brdealclass` | 业务系统对账注册 | `gl.busirecon.dealclass.BRDealClassVO` |
| `gl_brdimslity` | 对账维度 | `gl.busirecon.setting.BRdimslityVO` |
| `gl_brrelation` | 对照关系 | `gl.busirecon.setting.BRRelationVO` |
| `gl_brsetting` | 业务对账设置 | `gl.busirecon.setting.BRSettingVO` |
| `gl_busrelation` | 现金流量业务规则对应表 | `gl.busrule.busrelation` |
| `gl_busrule` | 现金流量业务规则 | `gl.busrule.busrule` |
| `gl_busruledetail` | 现金流量规则明细 | `gl.busrule.busruledetail` |
| `gl_cashflowadjust` | 现金流量调整 | `gl.cashflowcase.CashflowAdjustVO` |
| `gl_cashflowadjustsub` | 现金流量调整子表 | `gl.cashflowcase.CashflowAdjustsubVO` |
| `gl_cashflowcase` | 现金流量发生项 | `gl.cashflow.cashflowcase` |
| `gl_cfitemrelation` | 现金流量项目对照关系设置 | `gl.reconcile.cfitemrelation.CFItemRelationVO` |
| `gl_closeaccbook` | 关账表 | `gl.closeaccbook.CloseaccbookVO` |
| `gl_combinscheme` | 凭证生成合并规则 | `voucher.fip.CombinschemeVO` |
| `gl_commnvclass` | 常用类 | `gl.commonvoucher.commonclass` |
| `gl_commondetail` | 常用分录 | `gl.commonvoucher.commondetail` |
| `gl_commonvoucher` | 常用凭证 | `gl.commonvoucher.commonvoucher` |
| `gl_contrastcheck` | 内部交易对账检查结果 | `gl.contrast.init.ContrastInitCheckVO` |
| `gl_contrastinit` | 对账期初余额表 | `gl.contrast.init.ContrastInitVO` |
| `gl_contrastinitsub` | 对账期初余额明细表 | `gl.contrast.init.ContrastInitSubVO` |
| `gl_contrastreport` | 对账报告 | `gl.contrast.report.ContrastReportVO` |
| `gl_contrastreport` | 对账报告查询VO | `nc.vogl.ContrastReportQryVO.contrastreport` |
| `gl_contrastreportsub` | 对帐报告明细 | `gl.contrast.report.ContrastReportSubVO` |
| `gl_contrastrule` | 内部交易规则 | `gl.contrast.rule.ContrastRuleVO` |
| `gl_contrastrulearea` | 内部交易规则明细范围 | `gl.contrast.rule.ContrastRuleAreaVO` |
| `gl_contrastruleass` | 内部交易规则辅助核算 | `gl.contrast.rule.ContrastRuleAssVO` |
| `gl_contrastrulestartset` | 内部交易规则启用设置 | `gl.contrast.rule.ContrastRuleStartSetVO` |
| `gl_contrastrulesub` | 内部交易明细科目对 | `gl.contrast.rule.ContrastRuleSubjVO` |
| `gl_controlrule` | 控制规则 | `nc.itf.gl.fip.ControlRuleVO` |
| `gl_convertlog` | 折算记录 | `gl.convertlog.convertlog` |
| `gl_convertlogs` | 折算日志 | `gl.convertlogs.convertlogs` |
| `gl_convertrate` | 折算规则汇率信息 | `gl.soblink.convertrate` |
| `gl_convertref` | 折算科目对照关系 | `gl.soblink.convertref` |
| `gl_convertreg` | 折算类记录 | `gl.convertreg.convertreg` |
| `gl_convertrule` | 折算规则 | `gl.soblink.convertrule` |
| `gl_corpcontrast` | 公司对账记录主体 | `gl.contrast.result.CorpContrastVO` |
| `gl_corpcontrastsub` | 对账明细 | `gl.contrast.result.CorpContrastSubVO` |
| `gl_corprelation` | 公司对照关系主体 | `gl.corprelation.corprelation` |
| `gl_corprelationsub` | 公司对照关系明细 | `gl.corprelation.corprelationsub` |
| `gl_credithaveacct` | 贷方必有 | `gl.vouchkrule.CreditHaveAcctVO` |
| `gl_crepcreatdetailvo` | 对账报告生成明细VO | `gl.contrast.report.create.ContrastReportCreateDetailVO` |
| `gl_debithaveacct` | 借方必有 | `gl.vouchkrule.DebitHaveAcctVO` |
| `gl_detail` | 凭证权限 | `gl.aggvoucher.DetailPermVO` |
| `gl_detail` | 分录 | `gl.voucher.DetailVO` |
| `gl_detail` | 凭证明细 | `gl.voucherdetail.VoucherDetailVO` |
| `gl_detailcontrastvo` | 明细对账VO | `gl.contrast.DetailContrastVO` |
| `gl_distranslog` | 分布系统传输日志 | `gl.distribution.DistransLogVO` |
| `gl_distransrule` | 分布系统传输规则 | `gl.voucher.distribution.DistransRuleVO` |
| `gl_docfree1` | 辅助项目 | `gl.assItem.assItem` |
| `gl_docmap` | 档案对照明细 | `gl.docmaptemplete.docmap` |
| `gl_docmaptemplet` | 基础档案对照 | `gl.map.DocmaptempletVO` |
| `gl_docmaptemplete` | 基础档案对照模版 | `gl.docmaptemplete.docmaptemplete` |
| `gl_dtlfreevalue` | 分录自定义项 | `gl.gl_uiconfig.Entity` |
| `gl_exceptorg` | 例外组织 | `gl.vouchkrule.ExceptOrgVO` |
| `gl_expaccount` | 例外科目 | `voucher.fip.Expaccount` |
| `gl_extendreport` | 二维表设置 | `gl.gl_extendreport.Entity` |
| `gl_extendreport_b` | 二维表设置子表 | `gl.gl_extendreport.Entity` |
| `gl_extendreport_prop` | 二维表设置属性 | `gl.gl_extendreport.Entity` |
| `gl_extendreport_rule` | 二维表设置规则 | `gl.gl_extendreport.Entity` |
| `gl_extendreportit` | 设置信息项目表 | `gl.glextendreport_item.extendreportit` |
| `gl_fireportset` | 财务报表设置 | `gl.fireport.FiReportSetVO` |
| `gl_freequeryobj` | 账表查询对象 | `gl.freereport.FreeQueryObjVO` |
| `gl_freerepinit` | 账表初始化 | `gl.freereport.FreeReportInitVO` |
| `gl_freevalue` | 辅助核算内容表 | `gl.aggvoucher.FreeValueVO` |
| `gl_inflfacjoin` | 影响因素关联 | `gl.reconcile.inflfacjoin.InflFacJoinVO` |
| `gl_influecefactor` | 总账影响因素 | `gl.reconcile.influecefactor.InflueceFactorVO` |
| `gl_initbuild` | 期初 | `gl.init.initbuild` |
| `gl_lastpagedata` | 最后一页数据 | `gl.lastPageDate.lastpagedata` |
| `gl_modelsetdetail` | 协同模版分录设置 | `gl.reconcilemodule.modelsetdetail` |
| `gl_modelsetvoucher` | 协同模版凭证设置 | `gl.reconcilemodule.modelsetvoucher` |
| `gl_multibook_b1` | 多栏账统计 | `gl.multbook.gl_multbook_b1` |
| `gl_multibook_b2` | 多栏账分析 | `gl.multbook.gl_multbook_b2` |
| `gl_multibook_f` | 多栏账定义 | `gl.multbookformate.Entity` |
| `gl_multibook_h` | 多栏账 | `gl.multbook.gl_multbook_h` |
| `gl_mutex` | 互斥设置 | `gl.mutex.mutex` |
| `gl_mutexstatus` | 互斥设置子表 | `gl.mutex.mutexstatus` |
| `gl_notrecaccrelation` | 对方科目对照关系设置 | `gl.reconcile.notrecaccrelation.NotRecAccRelationVO` |
| `gl_notrecaccrelsp` | 对方科目个性对照关系设置 | `gl.reconcile.notrecaccrelation.NotRecAccRelSPVO` |
| `gl_ntb_id` | 预算控制 | `gl.ntb_id.ntb_id` |
| `gl_othertemp` | 对方凭证临时表 | `gl.reconcile.othertemp.OtherTempVO` |
| `gl_primeBill` | 原始单据 | `gl.primeBill.primeBill` |
| `gl_printItem` | 打印 | `gl.print.printItem` |
| `gl_printPageNo` | 打印页号 | `gl.printPageNo.printPageNo` |
| `gl_printdealclass` | 打印处理类 | `gl.printdealclass.printdealclass` |
| `gl_printjobuser` | 打印任务 | `gl.printperm.printjobuser` |
| `gl_querycondition` | 查询条件 | `gl.queryCondition.querycondition` |
| `gl_querymode` | 我的账簿子表 | `gl.myBook.querymode` |
| `gl_receiptlog` | 分布式回执消息日志 | `gl.distribution.ReceiptLogVO` |
| `gl_receivelog` | 分布式接收日志 | `gl.distribution.ReceiveLogVO` |
| `gl_reconcile` | 协同定义主体 | `gl.reconcile.reconcile` |
| `gl_reconcilecenter` | 协同中心VO | `gl.reconcile.center.ReconcileCenterVO` |
| `gl_reconcilecf` | 协同现金流量设置 | `gl.reconcilemodule.reconcilecf` |
| `gl_reconcilemeg` | 协同消息设置 | `gl.reconcile.rule.ReconcileMegVO` |
| `gl_reconcileoccur` | 协同发生 | `gl.reconcile.occur.ReconcileOccurVO` |
| `gl_reconcileoccur` | 协同发生 | `gl.reconcile.occur.ReconcileOccurVO` |
| `gl_reconcilerule` | 协同业务规则 | `gl.reconcile.rule.ReconcileRuleVO` |
| `gl_reconcilesub` | 协同定义明细 | `gl.reconcile.reconcilesub` |
| `gl_reconcilesubj` | 协同科目 | `gl.reconcilesubj.reconcilesubj` |
| `gl_reconcileunit` | 协同单位 | `gl.reconcileunit.reconcileunit` |
| `gl_reconcileunitsub` | 协同单位子表 | `gl.reconcileunit.reconcileunitsub` |
| `gl_reconconfsoa` | 辅助核算内容 | `gl.reconcile.rule.ReconcileSoaSubVO` |
| `gl_reconoccursub` | 协同发生明细 | `gl.reconcile.occur.ReconOccurSubVO` |
| `gl_reconoccursub` | 协同发生明细 | `gl.reconcile.occur.ReconOccurSubVO` |
| `gl_recothertmp` | 对方凭证VO | `gl.reconcile.othertmp.RecOtherTmpVO` |
| `gl_result` | 总额对账余额明细VO | `gl.contrast.result.ResultBalanceSubVO` |
| `gl_resultlisttabvo` | 对账结果查询列表VO | `gl.contrast.result.ResultListTabVO` |
| `gl_rtdetail` | 实时凭证分录 | `gl.aggvoucher.MDDetail` |
| `gl_rtvoucher` | 实时凭证主体 | `gl.aggvoucher.MDVoucher` |
| `gl_soblink` | 折算账簿关联定义 | `gl.soblink.soblink` |
| `gl_styleandquery` | 我的账簿 | `gl.myBook.styleandquery` |
| `gl_subrel_ass` | 附表分析科目设置 | `gl.subrelass.subrelass` |
| `gl_subrelation` | 现金流量科目对应规则 | `gl.subjrelation.subrelationvo` |
| `gl_subtoass` | 现金流量辅助项对应规则 | `gl.subjrelation.subjtovo` |
| `gl_sumcontrast` | 汇总对账VO | `gl.contrast.SumContrastVO` |
| `gl_syssettled` | 期末结账 | `gl.syssettle.syssettle` |
| `gl_transfer` | 自定义转账定义主体 | `gl.transfer.TransferdefVO` |
| `gl_transferdetail` | 自定义转账定义明细 | `gl.transfer.TransferSubVO` |
| `gl_transferhistory` | 转账执行历史数据表 | `gl.transferHistory.transferhistory` |
| `gl_transfersort` | 转账分类定义 | `gl.transferSort.transfersort` |
| `gl_transperm` | 转帐分类定义权限设置信息表 | `gl.gl_transperm.transperm` |
| `gl_transperm` | 转帐分类定义权限设置信息表 | `gl.gl_transperm.transperm` |
| `gl_transprodef` | 自定义转账方案定义 | `gl.transprodef.transprodef` |
| `gl_transproject` | 自定义转账方案档案定义 | `gl.transprodef.transproject` |
| `gl_transrate` | 汇兑损益定义主体 | `gl.transrate.TransrateVoucherVO` |
| `gl_transratedetail` | 汇兑损益分录 | `gl.transrate.TransrateDetailVO` |
| `gl_transselfdef` | 自定义转账本方定义 | `gl.transselfdef.transselfdef` |
| `gl_uiconfig` | 凭证定制 | `gl.gl_uiconfig.Entity` |
| `gl_vatdetail` | 税务明细 | `gl.vatdetail.VatDetailVO` |
| `gl_vchfreevalue` | 凭证自定义项 | `gl.gl_uiconfig.Entity` |
| `gl_verify_log` | 核销记录 | `gl.verifylog.verifylog` |
| `gl_verifyobj` | 核销对象 | `gl.verifyobj.Entity` |
| `gl_verifyobj_b` | 核销对象科目辅助项 | `gl.verifyobj.verifysubjass` |
| `gl_verrate` | 坏账比率 | `gl.verRate.Entity` |
| `gl_voucher` | 凭证主体权限 | `nc.vogl.voucherPerm.voucherPerm` |
| `gl_voucher` | 凭证 | `gl.voucher.VoucherVO` |
| `gl_voucherhaveacct` | 凭证必有 | `gl.vouchkrule.VoucherHaveAcctVO` |
| `gl_vouchermaxno` | 凭证最大号 | `nc.vogl.vouchermaxno.vouchermaxno` |
| `gl_vouchermode` | vouchermode | `vouchermode.vouchermode` |
| `gl_vouchernoSuppl` | 凭证补号 | `nc.vogl.vouchermaxno.vouchernoSuppl` |
| `gl_vouchernothaveacct` | 凭证必无 | `gl.vouchkrule.VoucherNotHaveAcctVO` |
| `gl_voucheruser` | 凭证用户 | `gl.voucher.VoucherUserVO` |
| `gl_vouchkrule` | 凭证校验规则 | `gl.vouchkrule.VoucherCheckRuleVO` |
| `gl_vouruleexceptacct` | 现金银行科目控制 | `gl.vouchkrule.VouRuleExceptAcctVO` |
| `gl_vouruleotheracct` | 对方 | `gl.vouchkrule.VoucherRuleOtherAcctVO` |
| `gl_vouruleselfacct` | 本方 | `gl.vouchkrule.VoucherRuleSelfAcctVO` |
| `gl_voutyperule` | 凭证类别约束 | `gl.vouchkrule.VouTypeRuleVO` |

### gpm 担保管理（11 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `gpm_guacontract` | 担保合同 | `gpm.guarantee.guacontract.GuaContractVO` |
| `gpm_guacontract_v` | 担保合同版本 | `gpm.guarantee.guacontract.GuaContractVersionVO` |
| `gpm_guacontractquote` | 担保债务 | `gpm.guarantee.guacontractquote.GuaContractQuoteVO` |
| `gpm_guaproperty` | 担保物权 | `gpm.guarantee.prop.GuaPropertyVO` |
| `gpm_guapropertyquote` | 担保物权引用 | `gpm.guarantee.prop.GuapropertyQuoteVO` |
| `gpm_guarantyinfo` | 抵押信息 | `gpm.guarantee.guacontract.GuarantyInfo` |
| `gpm_guarantyinfo_v` | 抵押信息版本 | `gpm.guarantee.guacontract.GuarantyInfoVersion` |
| `gpm_pledgeinfo` | 质押信息 | `gpm.guarantee.guacontract.PledgeInfo` |
| `gpm_pledgeinfo_v` | 质押信息版本 | `gpm.guarantee.guacontract.PledgeInfoVersion` |
| `gpm_warrantyinfo` | 保证信息 | `gpm.guarantee.guacontract.WarrantyInfo` |
| `gpm_warrantyinfo_v` | 保证信息版本 | `gpm.guarantee.guacontract.WarrantyInfoVersion` |

### ifac 内部存款管理（76 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `fac_accinterestobj` | 账户计息对象 | `fac.interestobj.AccInterestObjVO` |
| `fac_aggregateadj_h` | 积数调整 | `fac.aggregate.AggregateAdjVO` |
| `fac_centerinterestmanage` | 银行定期通知利息管理 | `fac.centerinterestmanage.CenterinterestmanageVO` |
| `fac_centerjournal` | 银行定期（通知）存款台账 | `fac.centerjournal.CenterJournalVO` |
| `fac_demandintcal` | 活期计息 | `fac.ia.DemandIntCalVO` |
| `fac_demandintlist` | 活期存款利息清单 | `fac.demandintlist.DemandIntListVO` |
| `fac_demandintlist_b` | 活期存款利息清单明细 | `fac.demandintlist.DemandIntListBVO` |
| `fac_demandintlistsummary` | 活期存款利息清单汇总 | `fac.demandintlistsummary.DemandIntListSummaryVO` |
| `fac_depositreceipt` | 银行定期存单 | `fac.depositreceipt.DepositReceiptVO` |
| `fac_depositreceipt` | 通知存单 | `fac.depositreceipt.NoticeDepositVO` |
| `fac_depositreceipt` | 定期（通知）到期转存处理 | `fac.redepositprocess.ReDepositProcessVO` |
| `fac_depositreceiptver` | 定期存单版本表 | `fac.depositreceipt.DepositReceiptVerVO` |
| `fac_depositvarieties` | 定期品种设置 | `fac.depositvarieties.DepositVarietiesVO` |
| `fac_depositvarieties` | 通知品种设置 | `fac.noticevarieties.NoticeVarietiesVO` |
| `fac_fixdepositprocess` | 银行定期存入回单 | `fac.fixdepositprocess.FixDepositProcessVO` |
| `fac_fixdepostopening` | 期初定期存入单 | `fac.fixdepostopening.FixDepostOpeningVO` |
| `fac_fixeddatewithdraw` | 定期支取单 | `fac.fixeddatewithdraw.FixedDateWithdrawVO` |
| `fac_fixredeposit` | 定期存款转存单 | `fac.fixredeposit.FixReDepositVO` |
| `fac_intaccountinfo` | 计息对象账户信息 | `fac.interestobj.IntAccountInfoVO` |
| `fac_interestbill` | 银行定期（通知）利息清单 | `fac.centerinterestbill.CenterInterestBillVO` |
| `fac_interestbill` | 定期通知利息清单 | `fac.interestbill.InterestBillVO` |
| `fac_interestbilldetail` | 银行定期（通知）利息清单明细 | `fac.centerinterestbill.CenterInterestBillDetailVO` |
| `fac_interestbilldetail` | 定期通知利息清单明细 | `fac.interestbill.InterestBillDetailVO` |
| `fac_interestobjver` | 计息对象版本信息 | `fac.interestobj.InterestObjVerVO` |
| `fac_jstz_b` | 积数调整子实体 | `fac.aggregate.JsAdjustmentBVO` |
| `fac_noticedepositprocess` | 通知存入单 | `fac.noticedepositprocess.NoticeDepositProcessVO` |
| `fac_noticedepostopening` | 期初通知存入单 | `fac.noticedepostopening.NoticeDepostOpeningVO` |
| `fac_noticeredeposit` | 通知存款转存单 | `fac.noticeredeposit.NoticeReDepositVO` |
| `fac_noticewithdraw` | 通知支取单 | `fac.noticewithdraw.NoticeWithdrawVO` |
| `ifac_DepositReceipt` | 定期存单 | `ifac.depositreceipt.DepositReceiptVO` |
| `ifac_DepositReceipt` | 通知存单 | `ifac.depositreceipt.NoticeDepositVO` |
| `ifac_DepositReceipt` | 定期（通知）到期转存处理 | `ifac.redepositprocess.ReDepositProcessVO` |
| `ifac_DepositVarieties` | 定期品种设置 | `ifac.depositvarieties.DepositVarietiesVO` |
| `ifac_DepositVarieties` | 通知品种设置 | `ifac.noticevarieties.NoticeVarietiesVO` |
| `ifac_FixDepositProcess` | 定期存入单 | `ifac.fixdepositprocess.FixDepositProcessVO` |
| `ifac_FixReDeposit` | 定期存款转存单 | `ifac.fixredeposit.FixReDepositVO` |
| `ifac_FixReDepositRcpt` | 定期存款转存回单 | `ifac.fixredepositrcpt.FixReDepositRcptVO` |
| `ifac_InterestBill` | 中心定期（通知）利息清单 | `ifac.centerinterestbill.CenterInterestBillVO` |
| `ifac_InterestBill` | 定期通知利息清单 | `ifac.interestbill.InterestBillVO` |
| `ifac_InterestBill` | 单位定期通知利息清单 | `ifac.memberinterestbill.MemberInterestBillVO` |
| `ifac_InterestBillDetail` | 中心定期（通知）利息清单明细 | `ifac.centerinterestbill.CenterInterestBillDetailVO` |
| `ifac_InterestBillDetail` | 定期通知利息清单明细 | `ifac.interestbill.InterestBillDetailVO` |
| `ifac_InterestBillDetail` | 单位定期通知利息清单明细 | `ifac.memberinterestbill.MemberInterestBillDetailVO` |
| `ifac_NoticeDepositProcess` | 通知存入单 | `ifac.notice.depositprocess.NoticeDepositProcessVO` |
| `ifac_NoticeReDeposit` | 通知存款转存单 | `ifac.noticeredeposit.NoticeReDepositVO` |
| `ifac_NoticeReDepositRcpt` | 通知存款转存单回单 | `ifac.noticeredepositrcpt.NoticeReDepositRcptVO` |
| `ifac_accinterestobj` | 账户计息对象 | `ifac.interestobj.AccInterestObjVO` |
| `ifac_aggregateadj_h` | 积数调整 | `ifac.aggregate.AggregateAdjVO` |
| `ifac_centerinterestmanage` | 定期通知利息管理 | `ifac.centerinterestmanage.CenterinterestmanageVO` |
| `ifac_centerjournal` | 中心定期（通知）存款台账 | `ifac.centerjournal.CenterJournalVO` |
| `ifac_demandintcal` | 活期计息 | `ifac.ia.DemandIntCalVO` |
| `ifac_demandintlist` | 活期存款利息清单 | `ifac.demandintlist.DemandIntListVO` |
| `ifac_demandintlist_b` | 活期存款利息清单明细 | `ifac.demandintlist.DemandIntListBVO` |
| `ifac_demandintlistsummary` | 活期存款利息清单汇总 | `ifac.demandintlistsummary.DemandIntListSummaryVO` |
| `ifac_demandintrcpt` | 活期存款利息回单 | `ifac.demandintrcpt.DemandIntRcptVO` |
| `ifac_demandintrcpt_b` | 活期存款利息回单明细 | `ifac.demandintrcpt.DemandIntRcptBVO` |
| `ifac_depositreceiptver` | 定期存单版本表 | `ifac.depositreceipt.DepositReceiptVerVO` |
| `ifac_fixdepositapply` | 定期存入申请 | `ifac.fixdepositapply.FixDepositApplyVO` |
| `ifac_fixdepositreceipt` | 定期存入回单 | `ifac.fixdepositreceipt.FixDepositReceiptVO` |
| `ifac_fixdepostopening` | 期初定期存入单 | `ifac.fixdepostopening.FixDepostOpeningVO` |
| `ifac_fixedDateWithdraw` | 定期支取单 | `ifac.fixeddatewithdraw.FixedDateWithdrawVO` |
| `ifac_fixedDateWithdrawApply` | 定期支取申请单 | `ifac.fixeddatewithdrawapply.FixedDateWithdrawApplyVO` |
| `ifac_fixeddatewithdrawreceipt` | 定期支取回单 | `ifac.fixeddatewithdrawreceipt.FixedDateWithdrawReceiptVO` |
| `ifac_intaccountinfo` | 计息对象账户信息 | `ifac.interestobj.IntAccountInfoVO` |
| `ifac_interestmanage` | 单位定期通知利息管理 | `ifac.memberinterestmanage.MemberinterestmanageVO` |
| `ifac_interestobjver` | 计息对象版本信息 | `ifac.interestobj.InterestObjVerVO` |
| `ifac_jstz_b` | 积数调整子实体 | `ifac.aggregate.JsAdjustmentBVO` |
| `ifac_memberdeposit` | 单位定期存单 | `ifac.depositreceipt.MemberDepositReceiptVO` |
| `ifac_memberdeposit` | 单位通知存单 | `ifac.depositreceipt.MemberNoticeDepositVO` |
| `ifac_memberjournal` | 单位定期（通知）台账 | `ifac.memberjournal.MemberJournalVO` |
| `ifac_noticeWithdraw` | 通知支取单 | `ifac.noticewithdraw.NoticeWithdrawVO` |
| `ifac_noticeWithdrawApply` | 通知支取申请单 | `ifac.noticewithdrawapply.NoticeWithdrawApplyVO` |
| `ifac_noticedepositapply` | 通知存入申请 | `ifac.noticedepositapply.NoticeDepositApplyVO` |
| `ifac_noticedepositreceipt` | 通知存入回单 | `ifac.noticedepositreceipt.NoticeDepositReceiptVO` |
| `ifac_noticedepostopening` | 期初通知存入单 | `ifac.noticedepostopening.NoticeDepostOpeningVO` |
| `ifac_noticewithdrawrcpt` | 通知支取回单 | `ifac.noticewithdrawrcpt.NoticeWithdrawRcptVO` |

### lcm 信用证管理（34 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `lcm_apply` | 开证申请 | `lcm.open.apply.OpenApplyVO` |
| `lcm_apply_b` | 开证申请合同信息 | `lcm.open.apply.ApplyBVO` |
| `lcm_arrival` | 到单承付 | `lcm.open.arrival.InvoiceArrivalVO` |
| `lcm_arrival_b` | 到单信息 | `lcm.open.arrival.ArrivalInfoVO` |
| `lcm_collectionnotice` | 通知收款 | `lcm.receive.collectionnotice.CollectionNoticeVO` |
| `lcm_collectionnotice_b` | 收款信息子表 | `lcm.receive.collectionnotice.CollectionNoticeBVO` |
| `lcm_contract_exec` | 合同执行情况 | `lcm.docucontract.DocuContractExecVO` |
| `lcm_docuapply` | 押汇申请 | `lcm.docuapply.DocuApplyVO` |
| `lcm_docucontract` | 押汇合同 | `lcm.docucontract.DocuContractVO` |
| `lcm_docucontract_v` | 押汇合同版本 | `lcm.docucontractv.DocuContractVersionVO` |
| `lcm_docupay` | 押汇合同放款 | `lcm.paydocubills.DocuPayVO` |
| `lcm_docupay_b` | 押汇合同放款子表 | `lcm.paydocubills.DocuPayBVO` |
| `lcm_docupay_v` | 押汇合同放款版本 | `lcm.paydocubillsv.DocuPayVersionVO` |
| `lcm_docupayb_v` | 押汇合同放款子表版本 | `lcm.paydocubillsv.DocuPayBVersionVO` |
| `lcm_docurepay` | 押汇合同还款 | `lcm.repaydocubills.DocuRePayVO` |
| `lcm_docurepay_b` | 押汇合同还款子表 | `lcm.repaydocubills.DocuRePayBVO` |
| `lcm_openmodify` | 开证修改 | `lcm.open.modify.OpenModifyVO` |
| `lcm_openmodify_b` | 开证修改子表信息 | `lcm.open.modify.OpenModifyBVO` |
| `lcm_openregister` | 开证登记 | `lcm.open.register.OpenRegisterVO` |
| `lcm_openregister_b` | 开证登记合同信息 | `lcm.open.register.ContractVO` |
| `lcm_openregversion` | 开证登记版本 | `lcm.open.regversion.OpenRegVeisionVO` |
| `lcm_payment` | 付款登记单 | `lcm.open.payment.InvoicePaymentVO` |
| `lcm_payment_b` | 付款信息 | `lcm.open.payment.PaymentInfoVO` |
| `lcm_payplan` | 放款计划 | `lcm.docucontract.DocuContractPayPlanVO` |
| `lcm_payplan_v` | 放款计划版本 | `lcm.docucontractv.DocuPayPlanVersionVO` |
| `lcm_receivemodify` | 收证修改 | `lcm.receive.receivemodify.ReceiveModifyVO` |
| `lcm_receivemodify_b` | 收证修改子表信息 | `lcm.receive.receivemodify.ReceiveModifyBVO` |
| `lcm_receiveregister` | 收证登记 | `lcm.receive.receiveregister.ReceiveRegisterVO` |
| `lcm_receiveregister_b` | 收证登记合同信息 | `lcm.receive.receiveregister.ReceiveRegisterBVO` |
| `lcm_receivevesion` | 收证登记版本 | `lcm.receive.receivesion.ReceiveVesionVO` |
| `lcm_repayplan` | 还款计划 | `lcm.docucontract.DocuContractRepayPlanVO` |
| `lcm_repayplan_v` | 还款计划版本 | `lcm.docucontractv.DocuRepayPlanVersionVO` |
| `lcm_submissionregister` | 交单登记 | `lcm.receive.submissionregister.SubmissionRegisterVO` |
| `lcm_submissionregister_b` | 交单登记子表 | `lcm.receive.submissionregister.SubmissionRegisterBVO` |

### mapub 管理会计基础设置（13 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `cm_allocfac` | 分配系数 | `mapub.allocfac.entity.AllocfacHeadVO` |
| `cm_allocfac_b` | 分配系数明细 | `mapub.allocfac.entity.AllocfacItemVO` |
| `cm_driver` | 成本动因 | `mapub.driver.entity.DriverVO` |
| `mapub_acquirepricelog` | 取价错误日志 | `mapub.acquirepricelog.entity.AcquirePriceLogVO` |
| `mapub_coprodcoef` | 联产品相对系数 | `mapub.coprodcoef.entity.CoprodcoefHeadVO` |
| `mapub_coprodcoef_b` | 联产品相对系数明细 | `mapub.coprodcoef.entity.CoprodcoefItemVO` |
| `mapub_costtype` | 成本类型 | `mapub.costtype.entity.CostTypeVO` |
| `mapub_materialPriceSources` | 物料价格来源 | `mapub.materialpricebase.entity.MaterialPriceSourcesHeadVO` |
| `mapub_materialPriceSources_b` | 物料价格来源明细 | `mapub.materialpricebase.entity.MaterialPriceSourcesBodyVO` |
| `mapub_materialpricebase` | 物料价格库 | `mapub.materialpricebase.entity.MaterialPriceBaseHeadVO` |
| `mapub_materialpricebase_b` | 物料价格库明细 | `mapub.materialpricebase.entity.MaterialPriceBaseBodyVO` |
| `mapub_materialpullprice` | 物料取价 | `mapub.materialpricebase.entity.MaterialPullPriceHeadVO` |
| `mapub_materialpullprice_b` | 物料取价明细 | `mapub.materialpricebase.entity.MaterialPullPriceBodyVO` |

### obm 银企直联（25 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `ebank_balance` | 银行账户余额表 | `obm.ebankbalanceqry.EbankBalanceQryVO` |
| `ebank_confirmpay_b` | 支付确认单子实体 | `obm.ebankconfirmpay.ConfirmPayBVO` |
| `ebank_confirmpay_h` | 支付确认单 | `obm.ebankconfirmpay.ConfirmPayHVO` |
| `ebank_credittrans` | 贷记转账指令 | `obm.europ.ebankcredittrans.EbankCreditLogVO` |
| `ebank_dfgz_b` | 工资指令明细 | `obm.payroll.DfgzBVO` |
| `ebank_dfgz_h` | 工资指令主体 | `obm.payroll.DfgzHVO` |
| `ebank_dfgz_packlog` | 工资指令包概要信息 | `obm.payroll.DfgzPackLogVO` |
| `ebank_dirdebit` | 借记转账指令 | `obm.europ.ebankdirdebit.EbankDebitLogVO` |
| `ebank_download` | 自动下载设置子表 | `obm.ebankdownload.EbankDownLoadVO` |
| `ebank_download_h` | 自动下载设置主表 | `obm.ebankdownload.EbankDownLoadHVO` |
| `ebank_downloadcfg` | 数据下载设置 | `obm.ebankdownloadcfg.EbankDownloadcfgVO` |
| `ebank_dzd` | 银行对账单管理 | `obm.ebankdzd.EbankDzdVO` |
| `ebank_europ_xml` | 欧洲银行指令xml表 | `obm.europ.xml.EuropxmlVO` |
| `ebank_europ_xmlyur` | 欧洲银行指令xml关联指令表 | `obm.europ.xml.EuropxmlBVO` |
| `ebank_log` | 支付指令 (废弃) | `obm.ebanklog.EbankLogVO` |
| `ebank_logyurrefrel` | 指令支付参考号关系表 | `obm.ebanklog.LogYurrefRelationVO` |
| `ebank_palog` | 自动下载日志查询 | `obm.ebankautodownlog.EbankAutoDownLogVO` |
| `ebank_paycfg` | 落地文件设置 | `obm.ebankfileconfig.EbankFileConfigVO` |
| `ebank_paylog` | 支付指令 | `obm.ebankpaylog.EBankPayLogVO` |
| `ebank_paylog_h` | 支付指令主信息 | `obm.ebankpaylog.EBankPayLogHVO` |
| `ebank_payrevsal` | 取消直接借记指令 | `obm.europ.ebankpayrevsal.EbankPayRevsalLogVO` |
| `ebank_pmtconfirm` | 支付确认单 | `obm.pmtconfirm.PmtconfirmVO` |
| `ebank_quota` | 账户收付限额设置 | `obm.ebankquotaconfig.EbankQuotaConfigVO` |
| `ebank_srvconf` | 网银服务器配置主表 | `obm.serverconfig.ServerConfigHeadVO` |
| `ebank_srvconf_b` | 网银服务器配置子表 | `obm.serverconfig.ServerConfigItemVO` |

### pbm 预算管理（13 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `pm_budget` | 项目成本预算 | `pbm.budget.BudgetHeadVO` |
| `pm_budget_exe` | 预算执行单明细 | `pbm.budgetexe.BudgetExeBodyVO` |
| `pm_budgetadd` | 项目预算调整 | `pbm.budgetadd.BudgetAddHeadVO` |
| `pm_budgetadd_b` | 项目预算追加明细 | `pbm.budgetadd.BudgetAddBodyVO` |
| `pm_budgetbegining` | 预算执行期初 | `pbm.budgetbegining.BudgetBeginingHeadVO` |
| `pm_budgetbegining_b` | 预算执行期初子表 | `pbm.budgetbegining.BudgetBeginingBodyVO` |
| `pm_budgetcbs` | CBS预算明细 | `pbm.budget.BudgetCBSBodyVO` |
| `pm_budgetfactor` | 核算要素预算明细 | `pbm.budget.BudgetFactorBodyVO` |
| `pm_mater_stock_log` | 项目物资备料日志表 | `pbm.materialstocklog.MaterialStockLogVO` |
| `pm_procostcard` | 项目费用记录卡 | `pbm.procostcard.ProCostCardHeadVO` |
| `pm_procostcard_b` | 项目费用记录卡子表 | `pbm.procostcard.ProCostCardBodyVO` |
| `pmbd_budgetctrl` | 预算控制设置 | `pbm.budgetctrl.BudgetCtrlHeadVO` |
| `pmbd_budgetctrl_b` | 预算控制设置子表 | `pbm.budgetctrl.BudgetCtrlBodyVO` |

### pca 项目成本会计（55 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `bd_defdoc` | 机械类型 (自定义档案) | `bd.defdoc.DefdocVO` |
| `pca_accrualbill` | 费用预提单 | `pca.pcaccrualbill.PCAAccrualBillVO` |
| `pca_accrualdetail` | 费用预提明细 | `pca.pcaccrualbill.PCAAccrualDetailVO` |
| `pca_assetdetail` | 转资产明细 | `pca.finalaccount.AssetDetailVO` |
| `pca_balance` | 项目成本余额表 | `pca.balanceaccount.PCBalanceVO` |
| `pca_bizvaluecount` | 业务量统计 | `pca.bizvalueacount.BizvalueBillVO` |
| `pca_bvfreeattri` | 业务量统计单自定义属性 | `pca.bizvalueacount.BvFreeAttriVO` |
| `pca_cbsassetnature` | CBS资产属性 | `pca.cbsassetnature.CBSAssetNatureVO` |
| `pca_cbscvtcostdetail` | CBS转成本 | `pca.costconvert.PCACbsCvtCostDetailVO` |
| `pca_cbsfixeddetail` | CBS成本转资明细 | `pca.cvtfixedasset.PCACbsFixedDetailVO` |
| `pca_cbstoassetcard` | CBS成本与资产卡片关系 | `pca.cbstoassetcard.PCACbsToAassetcardVO` |
| `pca_cobill` | 待摊数据 | `pca.codata.CoBillVO` |
| `pca_codynbill` | 动因数据 | `pca.codata.CodynBillVO` |
| `pca_codynfac` | 成本动因 | `pca.costalloc.CodynFacVO` |
| `pca_codynfacdetail` | 动因取值条件明细 | `pca.costalloc.CodynFacDetailVO` |
| `pca_codynreceiverule` | 动因比例接收方 | `pca.costalloc.CodynReceiveRuleVO` |
| `pca_coexception` | 分摊异常 | `pca.costalloc.CoExceptionVO` |
| `pca_copath` | 分摊路径 | `pca.codata.CoPathVO` |
| `pca_corule` | 分摊规则 | `pca.costalloc.CoRuleVO` |
| `pca_coruleassign` | 分摊规则分配 | `pca.costalloc.CoruleAssignVO` |
| `pca_coruleclass` | 分摊规则分类 | `pca.costalloc.CoRuleClassVO` |
| `pca_coruleexestatus` | 规则执行状态 | `pca.costalloc.CoruleexestatusVO` |
| `pca_corusult` | 分摊结果 | `pca.codata.CoRusultVO` |
| `pca_costassetaccount` | 项目成本资产明细账 | `pca.cvtfixedasset.PCACostAssetAccountVO` |
| `pca_costbill` | 项目成本单 | `pca.pcbill.PcCostBillVO` |
| `pca_costconvert` | 成本结转单 | `pca.costconvert.PCACostConvertVO` |
| `pca_costcvtdetail` | 成本结转明细 | `pca.costconvert.PCACostCvtDetailVO` |
| `pca_costdetail` | 项目成本单明细 | `pca.pcbill.PcCostDetailVO` |
| `pca_costtmpbill` | 项目成本实时单据 | `pca.pcbill.CostTmpBillVO` |
| `pca_costtmpdetail` | 项目成本明细实时单据 | `pca.pcbill.CostTmpDetailVO` |
| `pca_costtoassetdetail` | 成本转资产明细 | `pca.costtoassetdetail.PCACostToAssetDetailVO` |
| `pca_cvtfixedasset` | 成本转固单 | `pca.cvtfixedasset.PCACvtFixedassetVO` |
| `pca_cvtfixeddetail` | 转固单明细 | `pca.cvtfixedasset.PCACvtFixedDetailVO` |
| `pca_factorcbsdetail` | 核算要素+CBS | `pca.finalaccount.FactorCBSDetailVO` |
| `pca_factordetail` | 核算要素明细 | `pca.finalaccount.FactorDetailVO` |
| `pca_finalacc` | 项目成本决算单 | `pca.finalaccount.FinalAccBillVO` |
| `pca_finalcostcvtdetail` | 成本结转明细 | `pca.finalaccount.FinalCostcvtDetailVO` |
| `pca_fixreceiverule` | 固定比例接收方规则 | `pca.costalloc.FixReceiveRuleVO` |
| `pca_init` | 项目成本期初 | `pca.pcinit.InitBillVO` |
| `pca_initbuild` | 项目成本期初建账 | `pca.initbuild.InitBuildVO` |
| `pca_initdetail` | 项目成本期初明细 | `pca.pcinit.InitDetailVO` |
| `pca_laborrate` | 人工费率 | `pca.laborrate.LaborRateVO` |
| `pca_laborratechart` | 人工费率版本 | `pca.laborrate.LaborRateChartVO` |
| `pca_ncheckdetail` | 未审核单据明细 | `pca.pcbill.PcNotCheckDetailVO` |
| `pca_pcdetail` | 项目成本明细账 | `pca.detailaccount.PCDetailAccountVO` |
| `pca_prjcbsasset` | 项目资产类别 | `pca.prjcbsasset.PrjCBSAssetVO` |
| `pca_prjcbsassetdetail` | 项目cbs资产类别明细 | `pca.prjcbsasset.PrjCBSAssetDetailVO` |
| `pca_prjcontractdetail` | 项目销售合同明细 | `pca.costconvert.PCAPrjContractDetailVO` |
| `pca_projsettstate` | 项目财务决算状态 | `pca.projsettstate.ProjSettStateVO` |
| `pca_senderasscon` | 发送方维度条件 | `pca.costalloc.SenderAssConVO` |
| `pca_senderrule` | 发送方规则 | `pca.costalloc.SenderRuleVO` |
| `pca_summary` | 项目成本汇总表 | `pca.balanceaccount.PCSummaryVO` |
| `pca_transbill` | 项目成本转移单 | `pca.pcbill.PcTransBillVO` |
| `pca_transdetail` | 项目成本转移单明细 | `pca.pcbill.PcTransDetailVO` |
| `pca_valuedetail` | 业务量明细 | `pca.bizvalueacount.BizvalueDetailVO` |

### pcia 利润中心存货（35 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `pcia_4630bill` | 录入期初单据 | `pcia.m4630.entity.P4630HeadVO` |
| `pcia_4630bill_b` | 录入期初单据明细 | `pcia.m4630.entity.P4630ItemVO` |
| `pcia_4632bill` | 利润中心采购入库单 | `pcia.m4632.entity.P4632HeadVO` |
| `pcia_4632bill_b` | 利润中心采购入库单明细 | `pcia.m4632.entity.P4632ItemVO` |
| `pcia_4633bill` | 产成品入库单 | `pcia.m4633.entity.P4633HeadVO` |
| `pcia_4633bill_b` | 产成品入库单明细 | `pcia.m4633.entity.P4633ItemVO` |
| `pcia_4634bill` | 其他入库单 | `pcia.m4634.entity.P4634HeadVO` |
| `pcia_4634bill_b` | 其他入库单明细 | `pcia.m4634.entity.P4634ItemVO` |
| `pcia_4635bill` | 销售成本结转单 | `pcia.m4635.entity.P4635HeadVO` |
| `pcia_4635bill_b` | 销售成本结转单明细 | `pcia.m4635.entity.P4635ItemVO` |
| `pcia_4636bill` | 材料出库单 | `pcia.m4636.entity.P4636HeadVO` |
| `pcia_4636bill_b` | 材料出库单明细 | `pcia.m4636.entity.P4636ItemVO` |
| `pcia_4637bill` | 其他出库单 | `pcia.m4637.entity.P4637HeadVO` |
| `pcia_4637bill_b` | 其他出库单明细 | `pcia.m4637.entity.P4637ItemVO` |
| `pcia_4639bill` | 入库调整单 | `pcia.m4639.entity.P4639HeadVO` |
| `pcia_4639bill_b` | 入库调整单明细 | `pcia.m4639.entity.P4639ItemVO` |
| `pcia_463abill` | 出库调整单 | `pcia.m463a.entity.P463AHeadVO` |
| `pcia_463abill_b` | 出库调整单明细 | `pcia.m463a.entity.P463AItemVO` |
| `pcia_463ibill` | 调拨入库单 | `pcia.m463i.entity.P463IHeadVO` |
| `pcia_463ibill_b` | 调拨入库单明细 | `pcia.m463i.entity.P463IItemVO` |
| `pcia_463jbill` | 调拨出库单 | `pcia.m463j.entity.P463JHeadVO` |
| `pcia_463jbill_b` | 调拨出库单明细 | `pcia.m463j.entity.P463JItemVO` |
| `pcia_account` | 月末结账表 | `pcia.monthaccount.entity.MonthAccountVO` |
| `pcia_bizrely` | 业务依赖 | `pcia.rely.BizRelyVO` |
| `pcia_cyclerely` | 循环依赖 | `pcia.rely.CycleRelyVO` |
| `pcia_detailledger` | 单据明细实体 | `pcia.detailledger.entity.DetailLedgerVO` |
| `pcia_generalnab` | 存货总账 | `pcia.generalnab.GeneralNABVO` |
| `pcia_hisdetailldg` | 历史单据明细实体 | `pcia.detailledger.entity.HisDetailLedgerVO` |
| `pcia_maxsequence` | 最大审计序列 | `pcia.monthaccount.entity.MaxSequenceVO` |
| `pcia_monthin` | 月入 | `pcia.monthaccount.entity.MonthInVO` |
| `pcia_monthnab` | 存货总账月结存 | `pcia.monthaccount.entity.MonthnabVO` |
| `pcia_monthout` | 月出 | `pcia.monthaccount.entity.MonthOutVO` |
| `pcia_period` | 期间结存标志记录 | `pcia.monthaccount.entity.PeriodVO` |
| `pcia_periodnab` | 期间结存 | `pcia.monthaccount.entity.PeriodnabVO` |
| `pcia_relyorder` | 依赖顺序 | `pcia.rely.RelyOrderVO` |

### pcm 合同合同及费用（41 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `pm_con_payplan` | 付款计划 | `pcm.contrpayplan.ContractPayPlanHeadVO` |
| `pm_contr` | 项目分包合同管理 | `pcm.contract.ContrHeadVO` |
| `pm_contr_alter` | 补充协议 | `pcm.contractalter.ContrAlterHeadVO` |
| `pm_contr_alter_b` | 补充协议明细 | `pcm.contractalter.ContrAlterBodyVO` |
| `pm_contr_bal` | 结算单 | `pcm.contractbalance.ContractBalanceHeadVO` |
| `pm_contr_bal_b` | 结算单明细 | `pcm.contractbalance.ContractBalanceBodyVO` |
| `pm_contr_exepro` | 执行过程 | `pcm.contract.ContrExeProVO` |
| `pm_contr_his` | 合同变更 | `pcm.contract.ContrHistoryVO` |
| `pm_contr_items` | 合同条款 | `pcm.contract.ContrItemsVO` |
| `pm_contr_prepay` | 预付款单 | `pcm.contractprepay.ContractPrepayHeadVO` |
| `pm_contr_sche` | 进度款单 | `pcm.contractschedule.ContractScheduleHeadVO` |
| `pm_contr_sche_b` | 进度款单明细 | `pcm.contractschedule.ContractScheduleBodyVO` |
| `pm_contr_works` | 合同基本 | `pcm.contract.ContrWorksVO` |
| `pm_contracttype` | 合同类型 | `pcm.contracttype.ContractTypeHeadVO` |
| `pm_deduct` | 扣款单 | `pcm.deduct.DeductHeadVO` |
| `pm_deduct_b` | 扣款单明细 | `pcm.deduct.DeductBodyVO` |
| `pm_discontr` | 总价发包合同 | `pcm.discontr.DiscontrHeadVO` |
| `pm_discontralter` | 合同变更 | `pcm.discontr.DiscontrAlterVO` |
| `pm_discontrexepro` | 执行过程 | `pcm.discontr.DiscontrExeproVO` |
| `pm_discontritems` | 合同条款 | `pcm.discontr.DiscontrItemsVO` |
| `pm_discontrpaycon` | 付款协议表体 | `pcm.discontr.DiscontrPayconVO` |
| `pm_feebalance` | 费用结算单 | `pcm.feebalance.FeeBalanceHeadVO` |
| `pm_feebalance_b` | 费用结算单明细 | `pcm.feebalance.FeeBalanceBodyVO` |
| `pm_materialacc` | 材料结算单 | `pcm.materialacc.MaterialaccHeadVO` |
| `pm_materialacc_b` | 甲供材 | `pcm.materialacc.MaterialaccBodyVO` |
| `pm_materialtr` | 转料申请单 | `pcm.materialtransf.MaterialTransfHeadVO` |
| `pm_materialtr_b` | 转料申请单子表 | `pcm.materialtransf.MaterialTransfBodyVO` |
| `pm_mcontr` | 销售合同 | `pcm.marketcontract.ContractHeadVO` |
| `pm_mcontr_alter` | 补充协议 | `pcm.martcontalter.MContr_AlterHeadVO` |
| `pm_mcontr_alter_b` | 补充协议明细 | `pcm.martcontalter.MContr_AlterBodyVO` |
| `pm_mcontr_exepro` | 执行过程 | `pcm.marketcontract.ContrExeProVO` |
| `pm_mcontr_fee` | 合同费用 | `pcm.marketcontract.ContrFeeVO` |
| `pm_mcontr_his` | 变更历史 | `pcm.marketcontract.ContrHistoryVO` |
| `pm_mcontr_inc_plan` | 收款计划 | `pcm.incomeplan.IncomePlanHeadVO` |
| `pm_mcontr_inc_plan_b` | 收款计划子表 | `pcm.incomeplan.IncomePlanBodyVO` |
| `pm_mcontr_income` | 收款协议 | `pcm.marketcontract.ContrIncomeVO` |
| `pm_mcontr_items` | 合同条款 | `pcm.marketcontract.ContrItemsVO` |
| `pm_mcontr_works` | 合同基本 | `pcm.marketcontract.ContrWorksVO` |
| `pm_projectbidresult` | 招标结果 | `pcm.projectbidresult.ProjectBidResultHeadVO` |
| `pm_projectbidresult_b` | 招标结果子表 | `pcm.projectbidresult.ProjectBidResultBodyVO` |
| `pm_secondmaterial` | 乙供材 | `pcm.materialacc.SecondMaterialBodyVO` |

### pcto 利润中心交易（12 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `pcto_presetin` | 利润中心待结算调入单主实体 | `pcto.m465n.entity.PreSettleInHeadVO` |
| `pcto_presetin_b` | 利润中心待结算调入单子实体 | `pcto.m465n.entity.PreSettleInItemVO` |
| `pcto_presetout` | 利润中心待结算调出单主实体 | `pcto.m465m.entity.PreSettleOutHeadVO` |
| `pcto_presetout_b` | 利润中心待结算调出单子实体 | `pcto.m465m.entity.PreSettleOutItemVO` |
| `pcto_settlelist` | 利润中心结算清单 | `pcto.m465f.entity.SettleListHeadVO` |
| `pcto_settlelist_b` | 利润中心结算清单明细 | `pcto.m465f.entity.SettleListItemVO` |
| `pcto_settlelistin` | 利润中心结算清单调入主实体 | `pcto.m465f.entity.SettleListInHeadVO` |
| `pcto_settlelistin_b` | 利润中心结算清单调入子实体 | `pcto.m465f.entity.SettleListInItemVO` |
| `pcto_settlelistout` | 利润中心结算清单调出主实体 | `pcto.m465f.entity.SettleListOutHeadVO` |
| `pcto_settlelistout_b` | 利润中心结算清单调出子实体 | `pcto.m465f.entity.SettleListOutItemVO` |
| `pcto_settlerule` | 利润中心结算规则主表 | `pcto.settlerule.entity.PCTOSettleRuleHVO` |
| `pcto_settlerule_b` | 利润中心结算规则子表 | `pcto.settlerule.entity.PCTOSettleRuleBVO` |

### ps 付款排程（18 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `ps_minorrule` | 次要规则 | `ps.rule.MinorRuleVO` |
| `ps_paydetail` | 付款执行 | `ps.pay.PaydetailPFVO` |
| `ps_paydetail` | 付款明细（单独） | `ps.pay.PaydetailVO` |
| `ps_paydetail` | 付款计划执行 | `ps.paybill.PayBillVO` |
| `ps_paydetail` | 付款明细 (执行) | `ps.pay.PaydetailVO` |
| `ps_period` | 计划期间 | `ps.period.PeriodVO` |
| `ps_plan` | 计划汇总主表 | `ps.plan.PlanVO` |
| `ps_plan_b` | 计划汇总明细表 | `ps.plan.PlanBVO` |
| `ps_plan_b` | 汇总明细上级审批 | `ps.plan.PlanSVO` |
| `ps_plan_b` | 计划汇总明细表（批量） | `ps.plan.PlanBVO` |
| `ps_plandetail` | 计划明细 | `ps.plan.PlandetailVO` |
| `ps_plandetail` | 计划明细 (批量model) | `ps.plan.PlandetailBatchVO` |
| `ps_plandetail` | 计划明细核准 | `ps.plan.PlanSanctionVO` |
| `ps_plandetail_dyn` | 动态统计 | `ps.plan.PlandetailDSVO` |
| `ps_plantofund` | 付款计划与下拨单关系表 | `ps.plantofund.PlantoFundVO` |
| `ps_primaryrule` | 首要规则 | `ps.rule.PrimaryRuleVO` |
| `ps_rule` | 自动排程规则设置 | `ps.rule.RuleVO` |
| `ps_splitflow` | 拆分流水 | `ps.splitflow.SplitFlowVO` |

### resa 利润中心会计（77 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `resa_accattrdetail` | 接收维度明细 | `resa.corule.AccAttrDetail` |
| `resa_allocresult` | 分摊结果 | `resa.codata.AllocResultVO` |
| `resa_allocrule` | 分摊规则 | `resa.corule.AllocRuleVO` |
| `resa_assignasoa` | 分配关系定义 | `resa.assignasoa.AssignAsoaVO` |
| `resa_assignasoadetail` | 分配关系明细 | `resa.assignasoa.AssignasoaDetailVO` |
| `resa_avgreceivedetail` | 均摊接收方明细 | `resa.corule.AvgReceiveDetailVO` |
| `resa_avgreceiverule` | 均摊接收方规则 | `resa.corule.AvgReceiveRuleVO` |
| `resa_balance` | 责任会计汇总余额 | `resa.bal.BalanceVO` |
| `resa_bizindex` | 业务量指标 | `resa.bizindex.BizIndexVO` |
| `resa_bizindexclass` | 业务量指标分类 | `resa.bizindex.BizIndexClassVO` |
| `resa_bizindexentry` | 业务量明细 | `resa.bizindex.BizIndexEntryVO` |
| `resa_bizindexvalue` | 业务量 | `resa.bizindex.BizIndexValueVO` |
| `resa_codynbill` | 动因数据 | `resa.codata.CodynBillVO` |
| `resa_codynfac` | 成本动因 | `resa.codynfac.CodynFacVO` |
| `resa_codynobj` | 成本分摊对象 | `resa.codynobj.CodynobjVO` |
| `resa_coexception` | 分摊异常 | `resa.codata.CoExceptionVO` |
| `resa_coexestatus` | 分摊执行状态 | `resa.codata.CoexeStatusVO` |
| `resa_commonvoucher` | 常用凭证 | `resa.commonvoucher.ResaCommonVoucherVO` |
| `resa_commonvouchertype` | 常用凭证类别 | `resa.commonvoucher.ResaCommonVoucherTypeVO` |
| `resa_copath` | 分摊路径 | `resa.codata.CoPathVO` |
| `resa_coruleassigned` | 规则分配关系 | `resa.corule.CoruleAssignedVO` |
| `resa_coruleclass` | 分摊规则分类 | `resa.corule.CoRuleClassVO` |
| `resa_cosenderrule` | 发送方规则 | `resa.corule.CoSenderRuleVO` |
| `resa_costbill` | 来源数据 | `resa.codata.CostBill` |
| `resa_covouchersts` | 分摊凭证生成状态 | `resa.codata.CoVoucherStsVO` |
| `resa_covouchertem` | 分摊凭证模板 | `resa.corule.CoVoucherTemVO` |
| `resa_defaultmergescheme` | 默认合并方案 | `resa.respvoucher.DefaultMergeSchemeVO` |
| `resa_dimcombine` | 辅助维度组合 | `resa.dim.DimcombineVO` |
| `resa_dimfieldset` | 维度组合字段设置 | `resa.dim.DimFieldSetVO` |
| `resa_dimfreevalue` | 辅助核算 | `resa.dim.DimTypeValueEntry` |
| `resa_docfree1` | 辅助项目 | `resa.docfree.辅助核算` |
| `resa_drawratedetail` | 金额规则明细 | `resa.feedraw.DrawRateDetailVO` |
| `resa_drawraterule` | 计提金额规则 | `resa.feedraw.DrawRateRuleVO` |
| `resa_drawrule` | 费用计提规则 | `resa.feedraw.DrawRuleVO` |
| `resa_drawruleassitem` | 计提规则维度 | `resa.feedraw.DrawRuleAssitemVO` |
| `resa_drawruledetail` | 计提规则明细 | `resa.feedraw.DrawRuleDetailVO` |
| `resa_drawrulevoucher` | 计提凭证 | `resa.feedraw.DrawRuleVoucherVO` |
| `resa_dynreceiverule` | 动因比例接收方规则 | `resa.corule.DynReceiveRuleVO` |
| `resa_exceptfactors` | 例外要素 | `resa.respvoucher.ExceptFactorsVO` |
| `resa_extattrconfig` | 扩展属性设置 | `resa.rapub.ExtAttrConfigVO` |
| `resa_feedrawassign` | 计提规则分配表 | `resa.feedraw.FeeDrawRuleassignVO` |
| `resa_feedrawstatus` | 计提执行状态 | `resa.feedraw.FeeDrawStatusVO` |
| `resa_feevoucherstatus` | 计提凭证状态 | `resa.feedraw.FeeVoucherStatusVO` |
| `resa_fiptype` | 影响因素单据关联 | `resa.innersettle.InnersettleFipTypeVO` |
| `resa_fixreceivedetail` | 固定比例接收方明细 | `resa.corule.FixReceiveDetailVO` |
| `resa_fixreceiverule` | 固定比例接收方规则 | `resa.corule.FixReceiveRuleVO` |
| `resa_fixsendrule` | 固定金额发送方规则 | `resa.corule.FixSendRuleVO` |
| `resa_indexdimension` | 业务指标维度 | `resa.bizindex.IndexDimensionVO` |
| `resa_initassdetail` | 期初辅助核算 | `resa.initbalance.InitAssDetailVO` |
| `resa_innerassprice` | 内部考核价 | `resa.innerassprice.InnerassPriceVO` |
| `resa_innersettlebill` | 内部结算单 | `resa.innersettle.InnerSettleBillVO` |
| `resa_innersettledemand` | 需方内部结算单 | `resa.innersettle.InnerSettleDemandVO` |
| `resa_innersettledemanddetail` | 需方内部结算单明细 | `resa.innersettle.InnerSettleDemandDetailVO` |
| `resa_innersettledetail` | 内部结算单明细 | `resa.innersettle.InnerSettleDetailVO` |
| `resa_innersettletypeset` | 内部结算交易类型设置 | `resa.innersettle.InnerSettleTypeSetVO` |
| `resa_innetlefip` | 影响因素 | `resa.innersettle.InnersettleFipVO` |
| `resa_istranstype` | 内部结算单交易类型扩展属性 | `resa.innersettletranstype.ISTransTypeVO` |
| `resa_mergescheme` | 责任凭证合并方案 | `resa.respvoucher.MergeSchemeVO` |
| `resa_nocheckbill` | 未审核凭证 | `resa.ranocheckdetail.RaNoCheckBillVO` |
| `resa_pricetype` | 价格分类 | `resa.innersettle.PriceTypeVO` |
| `resa_pricetypefactor` | 价格分类影响因素 | `resa.innersettle.PriceTypeFactorVO` |
| `resa_reportinit` | 报表初始化 | `resa.reportinit.ReportInitVO` |
| `resa_repqryobj` | 报表初始化查询对象 | `resa.reportinit.RepQryObjVO` |
| `resa_respdetail` | 责任凭证分录 | `resa.respvoucher.RespDetailVO` |
| `resa_respvoucher` | 责任凭证 | `resa.respvoucher.RespVoucherVO` |
| `resa_respvouchertype` | 责任凭证类别 | `resa.respvouchertype.RespVoucherTypeVO` |
| `resa_rootsrc` | 分摊分录来源 | `resa.respvoucher.RootSrcVO` |
| `resa_rtdetail` | 实时凭证分录 | `resa.respvoucher.RTDetailVO` |
| `resa_rtvoucher` | 实时凭证 | `resa.respvoucher.RTVoucherVO` |
| `resa_rulecodynfac` | 分摊规则使用动因 | `resa.corule.RuleCodynFacVO` |
| `resa_rulecodynfacdetail` | 规则动因明细 | `resa.corule.RuleCodynfacDetailVO` |
| `resa_senderasscon` | 发送方维度条件 | `resa.corule.SenderAssConVO` |
| `resa_settleaccount` | 结账 | `resa.settleaccount.SettleAccountVO` |
| `resa_settleprice` | 内部结算价格 | `resa.innersettle.ProductPriceVO` |
| `resa_summary` | 利润中心汇总表 | `resa.rasummary.RaSummaryVO` |
| `resa_transferdef` | 损益结转定义 | `resa.transfer.TransferDefVO` |
| `resa_transscopedef` | 损益结转范围定义 | `resa.transfer.TransferScopeDefVO` |

### sca 标准成本（22 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `sca_bom` | 成本Bom | `sca.costbom.entity.CostBomHeadVO` |
| `sca_bom_activity` | 成本BOM作业子项明细 | `sca.costbom.entity.CostBomActivityVO` |
| `sca_bom_errmsg` | 参照生成错误信息 | `sca.costbom.entity.RefBuildErrMsgVO` |
| `sca_bom_extra` | 成本BOM多产出产品子项明细 | `sca.costbom.entity.CostBomExtraVO` |
| `sca_bom_fee` | 成本BOM费用子项明细 | `sca.costbom.entity.CostBomFeeVO` |
| `sca_bom_stuff` | 成本BOM材料子项明细 | `sca.costbom.entity.CostBomStuffItemVO` |
| `sca_bomref_fee` | 费用 | `sca.costbom.entity.FeeRefBuildVO` |
| `sca_bomref_martactv` | 材料作业 | `sca.costbom.entity.MatrRefBuildVO` |
| `sca_costrevert` | 标准成本还原 | `sca.costrevert.entity.StdCostRevertHeadVO` |
| `sca_costrevert_b` | 标准成本还原明细 | `sca.costrevert.entity.StdCostRevertItemVO` |
| `sca_cyclinenode` | 循环节点 | `sca.stdcostlevel.CyclineNodeVO` |
| `sca_pricesourcerelation` | 价格来源对应关系 | `sca.stdcostcalc.PriceSourceRelationVO` |
| `sca_pricestrategy` | 取价策略 | `sca.costbom.entity.PriceStrategyVO` |
| `sca_readprodcost` | 读取完工成本表 | `sca.costbom.entity.ReadProdCostVO` |
| `sca_stdactcost` | 标准作业成本 | `sca.stdcostcalc.StdActCostHeadVO` |
| `sca_stdactcost_b` | 标准作业成本明细 | `sca.stdcostcalc.StdActCostItemVO` |
| `sca_stdcost` | 标准成本查询 (按产品结构) | `sca.stdcoststruct.entity.StdCostQueryByStructVO` |
| `sca_stdcost` | 标准产品成本 | `sca.stdcostcalc.StdProdCostHeadVO` |
| `sca_stdcost_b` | 标准产品成本明细 | `sca.stdcostcalc.StdProdCostItemVO` |
| `sca_stdcostanalyse` | 标准成本分析 | `sca.stdcostanalyse.entity.StandardCostResultVO` |
| `sca_stdcostlevel` | 标准成本计算 | `sca.stdcostlevel.StdCostLevelVO` |
| `sca_unitedeputydetachdef` | 联副产品分离方法定义 | `sca.unitedeputydetachdef.entity.UniteDeputyDetachDefVO` |

### sf 资金调度（25 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `sf_allocate_b` | 下拨单子实体 | `sf.allocate.AllocateBVO` |
| `sf_allocate_h` | 下拨单 | `sf.allocate.AllocateVO` |
| `sf_allocateagree_b` | 下拨核准单子实体 | `sf.allocateagree.AllocateAgreeBVO` |
| `sf_allocateagree_h` | 下拨核准单 | `sf.allocateagree.AllocateAgreeVO` |
| `sf_allocateapply_b` | 下拨申请单子实体 | `sf.allocateapply.AllocateApplyBVO` |
| `sf_allocateapply_h` | 下拨申请单 | `sf.allocateapply.AllocateApplyVO` |
| `sf_allocatelog_b` | 下拨日志子实体 | `sf.allocatelog.AllocateLogBVO` |
| `sf_allocatelog_h` | 自动下拨日志 | `sf.allocatelog.AllocateLogVO` |
| `sf_allocatereceipt` | 下拨单回单 | `sf.allocatereceipt.AllocateReceiptVO` |
| `sf_allocaterule_b` | 下拨规则子实体 | `sf.allocaterule.AllocateRuleBVO` |
| `sf_allocaterule_h` | 下拨规则 | `sf.allocaterule.AllocateRuleVO` |
| `sf_delivery_b` | 上收单子实体 | `sf.delivery.DeliveryBVO` |
| `sf_delivery_h` | 上收单 | `sf.delivery.DeliveryVO` |
| `sf_deliveryapply_b` | 上收申请单子实体 | `sf.deliveryapply.DeliveryApplyBVO` |
| `sf_deliveryapply_h` | 上收申请单 | `sf.deliveryapply.DeliveryApplyVO` |
| `sf_deliverylog_b` | 上收日志子实体 | `sf.deliverylog.DeliveryLogBVO` |
| `sf_deliverylog_h` | 自动上收日志 | `sf.deliverylog.DeliveryLogVO` |
| `sf_deliveryreceipt` | 上收回单 | `sf.deliveryreceipt.DeliveryReceiptVO` |
| `sf_deliveryrule_b` | 上收规则子实体 | `sf.deliveryrule.DeliveryRuleBVO` |
| `sf_deliveryrule_h` | 上收规则 | `sf.deliveryrule.DeliveryRuleVO` |
| `sf_fundtransfer_b` | 调拨单子实体 | `sf.fundtransfer.FundTransferBVO` |
| `sf_fundtransfer_h` | 资金调拨单 | `sf.fundtransfer.FundTransferVO` |
| `sf_fundtransferapply_b` | 调拨申请子实体 | `sf.fundtransferapply.FundTransferApplyBVO` |
| `sf_fundtransferapply_h` | 调拨申请单 | `sf.fundtransferapply.FundTransferApplyVO` |
| `sf_fundtransferreceipt` | 调拨回单 | `sf.fundtransferreceipt.FundtransferReceiptVO` |

### tam 账户管理（12 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `tam_applybill` | 开户申请 | `tam.account.apply.ApplyBillVO` |
| `tam_applybill` | 销户申请主表 | `tam.account.destroy.DestroyApplyVO` |
| `tam_applybill_b` | 开户申请子表 | `tam.account.apply.ApplyBillSubVO` |
| `tam_applybill_b` | 销户申请子表 | `tam.account.destroy.DestroyApplySubVO` |
| `tam_frozenbill` | 解冻通知书 | `tam.account.receipt.DeFroReceiptVO` |
| `tam_frozenbill` | 解冻办理 | `tam.account.defrozen.DeFrozenApplyVO` |
| `tam_frozenbill` | 冻结通知书 | `tam.account.receipt.FrozenReceiptVO` |
| `tam_frozenbill` | 冻结办理 | `tam.account.frozen.FrozenApplyVO` |
| `tam_iapplybill` | 销户办理 | `tam.account.destroy.InnerDestroyVO` |
| `tam_iapplybill` | 开户办理 | `tam.account.apply.InnerApplyVO` |
| `tam_iapplybill` | 销户通知书 | `tam.account.receipt.InnerDesReceiptVO` |
| `tam_iapplybill` | 开户通知书 | `tam.account.receipt.InnerOpenReceiptVO` |

### tbb 计划平台（37 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `ntb_id_bdcontrast` | 业务系统字段对照表 | `tb.obj.BdContrastVO` |
| `ntb_id_ctrlTactics` | 预算控制规则策略 | `tb.obj.CtrlTacticsVO` |
| `ntb_id_sysreg` | 业务系统注册表 | `tb.obj.SysRegVO` |
| `tb_adjustbill` | 预算调整单主表 | `tb.adjbill.AdjustBillVO` |
| `tb_adjustbill_b` | 预算调整单子表 | `tb.adjbill.AdjustBillBVO` |
| `tb_budgetsub` | 预算科目 | `tb.dimdocpub.BudgetSubVO` |
| `tb_budgetsubuse` | 预算科目分配 | `tb.dimdocpub.BudgetSubUseVO` |
| `tb_busirule` | 业务规则 | `nc.votbb.mc.businessrule` |
| `tb_busirule` | 预算控制规则 | `nc.votbb.controlrule.controlrule` |
| `tb_concube` | 对标目录 | `tb.form.query.TbConstrastCube` |
| `tb_concube_ent` | 对标主体 | `tb.form.query.TbContrastCubeEnt` |
| `tb_concube_mea` | 对标指标 | `tb.form.query.TbContrastCubeMea` |
| `tb_contrast_ent` | 对标主体VO | `tb.form.query.TbContrastEnt` |
| `tb_cubedef` | 应用模型 | `mdm.cube.CubeDef` |
| `tb_cuberule` | 模型规则 | `mdm.cuberule.CubeRule` |
| `tb_dataattr` | 业务方案 | `tb.dimdocpub.DataAttrVO` |
| `tb_defplanperiod` | 自定义计划期间 | `tb.dimdocpub.DefPlanPeriodVO` |
| `tb_dimdef` | 维度定义 | `mdm.dim.DimDef` |
| `tb_dimhier` | 维度结构 | `mdm.dim.DimHierarchy` |
| `tb_dimlevel` | 维度层 | `mdm.dim.DimLevel` |
| `tb_dimprop` | 维度属性 | `mdm.dim.DimProp` |
| `tb_dimpropmap` | 维度属性映射 | `mdm.dim.DimPropMap` |
| `tb_dimtable` | 维度档案 | `mdm.dim.DimTable` |
| `tb_keyindex` | 关键指标定义 | `nc.ms.tb.zior.vo.KeyIndexVO` |
| `tb_limitdef` | 多维数据集 | `tb.limit.LimitDefVO` |
| `tb_limitmember` | 数据成员 | `tb.limit.LimitMemberVO` |
| `tb_mbrreadstruct` | 维度数据结构 | `mdm.dim.MemberReadSqlStruct` |
| `tb_md_task` | 任务管理 | `tb.task.MdTask` |
| `tb_md_taskdef` | 任务模板 | `tb.task.MdTaskDef` |
| `tb_md_workbook` | 套表管理 | `nc.votbb.billmanage.billmanage` |
| `tb_measure_extp` | 指标成员属性扩展 | `tb.dimdocpub.MeasureExtp` |
| `tb_perm_rule` | 数据权限 | `tb.limit.TbPermVO` |
| `tb_project` | 中建项目 | `tb.dimdocpub.ProjectVO` |
| `tb_rule_member` | 规则成员 | `tb.rule.DimRuleMemberVO` |
| `tb_tasknavig` | 预算任务向导 | `tb.ext.task.TbExtTaskNavigate` |
| `tb_version` | 预算版本 | `tb.dimdocpub.BudgetVersionVO` |
| `tbb_CubeDimUsage` | 模型维度 | `tb.cube.CubeDimUsage` |

### tmpub 资金基础设置（26 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `bd_accid` | 内部账户 | `tam.account.accid.AccidVO` |
| `bd_accid_temp` | 内部账户临时表 | `tam.account.accid.AccidTempVO` |
| `fi_head_d` | 提前利率明细 | `fi.rateconfig.RateHeadVO` |
| `fi_impawn` | 担保物权设置 | `fi.impawn.ImpawnVO` |
| `fi_over_d` | 逾期利率明细 | `fi.rateconfig.RateOverVO` |
| `fi_period_d` | 期间利率明细 | `fi.rateconfig.RatePeriodVO` |
| `fi_rate_d` | 利率明细 | `fi.rateconfig.RateItemVO` |
| `fi_ratechange_d` | 利率变更 | `fi.rateconfig.RateAlterVO` |
| `fi_ratecode` | 利率编码 | `fi.rateconfig.RateCodeVO` |
| `fi_ration_d` | 定额利率明细 | `fi.rateconfig.RateRationVO` |
| `fts_agentacccfg` | 代理结算账户设置主表 | `fts.agentacccfg.AgentAccCfgVO` |
| `fts_agentacccfg_b` | 代理结算账户设置子表 | `fts.agentacccfg.AgentAccCfgBVO` |
| `tmpub_ElecSign` | 电子签章回单 | `tmpub.security.ElecSignVO` |
| `tmpub_calog` | CA日志记录实体 | `tmpub.security.log.CaLogVO` |
| `tmpub_calog_temp` | CA签名日志最新记录实体 | `tmpub.security.log.CaLogTmpVO` |
| `tmpub_cctype` | 授信类别 | `tmpub.cctype.CCTypeVO` |
| `tmpub_chargercpt_b` | 手续费回单子实体 | `tmpub.chargercpt.ChargeRcptBVO` |
| `tmpub_chargercpt_h` | 手续费回单 | `tmpub.chargercpt.ChargeRcptVO` |
| `tmpub_chargerecord` | 手续费项目档案 | `tmpub.chargerecord.ChargeRecordVO` |
| `tmpub_docitemmap` | 单据计划项目对照 | `tmpub.planitem.DocItemMapVO` |
| `tmpub_icctype` | 内部授信类别 | `tmpub.icctype.ICCTypeVO` |
| `tmpub_printrecord` | 打印记录 | `pub.PrintrecordVO` |
| `tmpub_settledate` | 结息日 | `tmpub.settledate.SettleDateVO` |
| `tmpub_settledate_d` | 结息日明细 | `tmpub.settledate.SettleDateDetailVO` |
| `tmpub_taxsetting` | 合同税费设置 | `tmpub.taxsetting.ContTaxSettingVO` |
| `v_fi_custsupbankdoc` | 客户、供应商和银行档案视图 | `cdm.cumandoc.customerSupplierBankdoc` |

### ufoc 合并报表（72 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `iufo_adjust_dxrela` | 调整方案引用抵销模板 | `hbbb.adjustscheme.AdjustSchemeRelaDXRelationVO` |
| `iufo_adjust_sort` | 报表调整方案分类 | `hbbb.adjustscheme.AdjustSchemeSortVO` |
| `iufo_adjustscheme` | 报表调整方案 | `hbbb.adjustscheme.AdjustSchemeVO` |
| `iufo_comvouch_body` | 常用凭证明细记录 | `hbbb.commonvouch.CommonVouchBodyVO` |
| `iufo_comvouch_head` | 常用凭证表头 | `hbbb.commonvouch.CommonVouchHeadVO` |
| `iufo_comvouch_sort` | 常用凭证的分类 | `hbbb.commonvouch.CommonVouchSortVO` |
| `iufo_dxrela_body` | 模板公式 | `hbbb.dxrelation.DXRelationBodyVO` |
| `iufo_dxrela_diff` | 抵销差额规则 | `hbbb.dxrelation.DXRelaDiffRuleVO` |
| `iufo_dxrela_head` | 调整及抵销模板 | `hbbb.dxrelation.DXRelationHeadVO` |
| `iufo_dxrela_scheme` | 抵销方案引用模板 | `hbbb.dxscheme.DXRelaInSchemeVO` |
| `iufo_dxrela_sort` | 模板分组信息 | `hbbb.dxrelation.DXRelaSortVO` |
| `iufo_dxscheme` | 抵销方案 | `hbbb.dxscheme.DXSchemeVO` |
| `iufo_dxscheme_sort` | 抵销方案分类 | `hbbb.dxscheme.DXSchemeSortVO` |
| `iufo_dxtype` | 抵销分录类别 | `hbbb.dxtype.DXTypeVO` |
| `iufo_hbaccchart` | 合并科目表 | `hbbb.account.HBAccChartVO` |
| `iufo_hbaccount` | 合并科目 | `hbbb.account.HBAccountVO` |
| `iufo_hbaccountprop` | 合并科目金额属性 | `hbbb.account.HBAccountPropVO` |
| `iufo_hbflowdef` | 合并监控流 | `hbbb.hbflow.HBFlowDefVO` |
| `iufo_hbsch_others` | 合并方案引用其它方案 | `hbbb.hbscheme.HBSchemeOthersVO` |
| `iufo_hbsch_report` | 合并方案引用报表 | `hbbb.hbscheme.HBSchemeReportVO` |
| `iufo_hbscheme` | 合并方案 | `hbbb.hbscheme.HBSchemeVO` |
| `iufo_hbstep` | 合并监控步骤 | `hbbb.hbflow.HBStepVO` |
| `iufo_measaccmap` | 指标科目映射 | `hbbb.account.MeasureAccountMapVO` |
| `iufo_meetdata_body` | 对账结果明细 | `hbbb.meetaccount.MeetResultBodyVO` |
| `iufo_meetdata_head` | 对账结果头信息 | `hbbb.meetaccount.MeetResultHeadVO` |
| `iufo_pre_step` | 前置步骤 | `hbbb.hbflow.PreStepVO` |
| `iufo_step_res` | 配置资源 | `hbbb.hbflow.StepResourceVO` |
| `iufo_step_status` | 合并步骤状态 | `hbbb.hbflow.HBStepStatusVO` |
| `iufo_vouch_body` | 凭证明细 | `hbbb.vouch.VouchBodyVO` |
| `iufo_vouch_head` | 凭证头 | `hbbb.vouch.VouchHeadVO` |
| `ufoc_adjgennerresult` | 成本转权益法调整凭证生成结果 | `ufoc.adjgennerresult.AdjgennerResultVO` |
| `ufoc_adjreport` | 调整报表 | `ufoc.adjreport.AdjReportVO` |
| `ufoc_adjtemprela` | 包含调整模板 | `ufoc.adjvouchrule.AdjTempRelaVO` |
| `ufoc_adjvouchrule` | 调整规则 | `ufoc.adjvouchrule.AdjvouchRuleVO` |
| `ufoc_aloneid` | Aloneid | `ufoc.aloneid.AloneIDVO` |
| `ufoc_avgrate` | 平均及交易日汇率 | `ufoc.avgrateinfo.AvgRateVO` |
| `ufoc_batchadjvouchrule` | 批量调整规则 | `ufoc.batchadjvouchrule.BatchAdjvouchruleVO` |
| `ufoc_commit` | 合并报表报送信息 | `hbbb.commit.UFOCCommitVO` |
| `ufoc_commitactselrep` | 合并报表报送活动选择报表状态 | `hbbb.commit.UFOCCommitActionSelRepVO` |
| `ufoc_conadjrule` | 包含调整规则 | `ufoc.batchadjvouchrule.ConAdjruleVO` |
| `ufoc_conbalance` | 折算差额 | `ufoc.convert.ConvertBalanceVO` |
| `ufoc_convertrule` | 折算规则 | `ufoc.conver.ConvertRuleVO` |
| `ufoc_convertrulesort` | 折算规则分类 | `ufoc.convertrule_sort.ConvertRuleSortVO` |
| `ufoc_cvtruleorg` | 折算规则组织表 | `ufoc.convert.CvtruleorgVO` |
| `ufoc_dayrateproject` | 交易日汇率项目 | `ufoc.convert.DayrateProjectVO` |
| `ufoc_defaultinvestset` | 默认股权投资设置 | `hbbb.hbflow.HBDefaultInvestSetVO` |
| `ufoc_draftmeainfo` | 底稿指标信息 | `ufoc.workdrafttemp.MeasureInfoVO` |
| `ufoc_dxrela_scheme` | 抵销模板对应方案 | `hbbb.dxrelation.DXRelaSchemeVO` |
| `ufoc_dxschdetail` | 引用抵销分录 | `ufoc.dxscheme.DxschDetailVO` |
| `ufoc_dxscheme_body` | 引用抵销模板 | `ufoc.dxscheme.DxSchemeSubVO` |
| `ufoc_dxtypeseq` | 抵销类别顺序 | `ufoc.workdrafttemp.DXTypeSeqVO` |
| `ufoc_hbcheckmap` | 合并方案映射检查 | `hbbb.hbscheme.HBSchemeCheckMapVO` |
| `ufoc_hbflowdefaultkeyval` | 合并流默认关键字值 | `hbbb.hbflow.HBFlowDefaultKeyValVO` |
| `ufoc_hbflowexec` | 合并流执行 | `hbbb.hbflow.HBFlowExecVO` |
| `ufoc_hbreport` | 合并报表报告 | `hbbb.hbreport.UnionReportVO` |
| `ufoc_keyval` | 关键字值 | `hbbb.hbflow.KeyValVO` |
| `ufoc_measpromap` | 项目指标映射 | `ufoc.unionproject.MeasProjectVO` |
| `ufoc_meetdata` | 对帐数据表 | `hbbb.meetdata.MeetdataVO` |
| `ufoc_meetdatasub` | 对账数据明细表 | `hbbb.meetdata.MeetdatasubVO` |
| `ufoc_project` | 合并报表项目 | `ufoc.unionproject.ProjectVO` |
| `ufoc_projectclass` | 合并报表项目分类 | `ufoc.unionreportproject.ProjectClassVO` |
| `ufoc_rateset` | 汇率规则 | `ufoc.ratesetinfo.RateSetVO` |
| `ufoc_rep_cmmtrec` | 合并报表报表数据报送记录 | `hbbb.commit.UFOCRepDataCommitRecordVO` |
| `ufoc_rep_commit` | 合并报表报表报送信息 | `hbbb.commit.UFOCRepCommitVO` |
| `ufoc_rep_state` | 合并报表报表数据状态 | `hbbb.commit.UFOCRepDataStateVO` |
| `ufoc_ruleadjorg` | 调整单位 | `ufoc.adjvouchrule.RuleAdjOrg` |
| `ufoc_ruleinvestrela` | 投资关系 | `ufoc.adjvouchrule.RuleInvestrelaVO` |
| `ufoc_schemekey` | 合并方案关键字 | `ufoc.hbschemekey.SchemeKeyVO` |
| `ufoc_task_cmmtrec` | 合并报表报送记录 | `hbbb.commit.UFOCTaskCommitRecordVO` |
| `ufoc_task_commit` | 合并报表任务报送信息 | `hbbb.commit.UFOCTaskCommitVO` |
| `ufoc_workdftdir` | 工作底稿目录 | `ufoc.workdrafttmpdir.WorkDraftTmpDirVO` |
| `ufoc_workdrafttemp` | 工作底稿模板 | `ufoc.workdrafttemp.WorkDraftTempVO` |

### ufoe 企业报表（95 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `HRPsnTraceVO` | 人员数据追踪 | `iufo.hr.trace.HRPsnTraceVO` |
| `bi_smart_def` | 语义模型 | `smart.SmartDefVO` |
| `iufo_Entity` | 指标主数据 | `iufo.measure.MeasPubData` |
| `iufo_Entity` | 指标主数据 | `iufo.measure.MeasPubData` |
| `iufo_MailSendTarget` | 发布对象 | `iufo.mailrule.MailSendTargetVO` |
| `iufo_account_set` | 账表一致性配置 | `ufoe.accountset.AccountSetVO` |
| `iufo_actiontype` | 业务动作类型 | `iufo.action.ActionType` |
| `iufo_anarep` | 分析报表 | `iufo.anareport.AnaReportVO` |
| `iufo_anarep_dir` | 分析报表分类 | `iufo.anareport.AnaReportDirVO` |
| `iufo_anatypes` | 订阅选择分析类型 | `iufo.measubscribe.AnaTypesVO` |
| `iufo_approveactselrep` | 审批活动选择报表状态 | `iufo.approve.ApproveActionSelRepVO` |
| `iufo_approveflow` | 审批流 | `iufo.approve.ApproveFlowVO` |
| `iufo_approveset` | 审批流设置 | `iufo.approve.ApproveSetVO` |
| `iufo_balcond` | 舍位条件 | `iufo.balance.BalanceCondVO` |
| `iufo_batchrule` | 批量规则 | `iufo.batchrule.BatchRuleVO` |
| `iufo_batchrulesort` | 批量规则目录 | `iufo.batchrule.BatchRuleSortVO` |
| `iufo_check_dir` | 审核方案分类 | `iufo.checkdir.CheckDirVO` |
| `iufo_check_formula` | 审核公式 | `iufo.check.CheckFormulaVO` |
| `iufo_check_schema` | 审核方案 | `iufo.check.CheckSchemaVO` |
| `iufo_commit` | 报送信息 | `iufo.commit.CommitVO` |
| `iufo_commitactselrep` | 报送活动选择报表状态 | `iufo.commit.CommitActionSelRepVO` |
| `iufo_commitsubscribe` | 报送订阅规则 | `iufo.commitsubscribe.CommitSubscribeVO` |
| `iufo_commitsubscribesort` | 报送订阅规则分类 | `iufo.commitsubscribe.CommitSubscribeSortVO` |
| `iufo_configlist` | 列表定制VO | `iufo.query.ConfigListVO` |
| `iufo_datasource` | 数据源 | `iufo.datasource.DataSourceVO` |
| `iufo_dataversion` | IUFO数据版本 | `iufo.verctrl.DataVersionVO` |
| `iufo_defaultscheme` | 默认打印方案 | `iufo.task.DefaultPrintSchemeVO` |
| `iufo_dis_result` | 分布式传输结果 | `iufo.distribute.DisTransLogVO` |
| `iufo_distri_detail` | distridetail | `iufo.distribute.DistributeDetailVO` |
| `iufo_distri_list` | distrilist | `iufo.distribute.DistributeListVO` |
| `iufo_hastenmsgtype` | 任务催报方式 | `iufo.task.HastenMsgTypeVO` |
| `iufo_hr_datadic` | HR数据字典 | `iufo.hr.hrstatcond.HRDataDictionaryVO` |
| `iufo_hr_datadicpower` | HR数据字典权限 | `iufo.hr.hrdatadic.HRDataDicPowerVO` |
| `iufo_hr_hrdatadicsort` | HR数据字典分类 | `iufo.hr.hrdatadic.HRDataDicSortVO` |
| `iufo_hr_scheme` | HR数据方案 | `iufo.hr.scheme.HRSchemeVO` |
| `iufo_hr_scitem` | 统计条件明细统计项 | `iufo.hr.hrstatcond.HRStatItemVO` |
| `iufo_hr_scsort` | 统计条件分类 | `iufo.hr.hrstatcond.HRStatCondSortVO` |
| `iufo_hr_statcond` | 统计条件 | `iufo.hr.hrstatcond.HRStatCondVO` |
| `iufo_hr_statrela` | HR统计条件关联记录 | `iufo.hr.hrstatcond.HRStatRelaVO` |
| `iufo_jiuqi_file` | 上传文件信息 | `iufo.jiuqi.NetUpFileInfoVO` |
| `iufo_jiuqi_map` | 久其指标对照 | `iufo.jiuqi.NetMapVO` |
| `iufo_jiuqi_map` | 久其单位映射 | `iufo.jiuqi.NetMapVO` |
| `iufo_key_comb` | 关键字组合 | `iufo.KeyGroupVO` |
| `iufo_keyvalue` | 关键字值 | `iufo.batchrule.KeyValueVO` |
| `iufo_keyword` | 关键字 | `iufo.keydef.KeyVO` |
| `iufo_mailrule` | 邮件规则 | `iufo.mailrule.IUfoMailRuleVO` |
| `iufo_mailrulesort` | 邮件规则分类 | `iufo.mailrule.IUfoMailRuleSortVO` |
| `iufo_meascsel` | 排列切换值 | `iufo.measubscribe.MeaSCSelVO` |
| `iufo_meassel` | 订阅选择指标 | `iufo.measubscribe.MeasSelVO` |
| `iufo_measubscribe` | 指标订阅规则 | `iufo.measubscribe.MeaSubscribeVO` |
| `iufo_measubscribesort` | 指标订阅规则分类 | `iufo.measubscribe.MeaSubscribeSortVO` |
| `iufo_monitor` | monitor | `iufo.monitor.MonitorVO` |
| `iufo_querycond` | 通用查询条件 | `iufo.query.IUfoQueryCondVO` |
| `iufo_querykeycond` | 关键字值查询条件 | `iufo.querycond.KeyQueryCondVO` |
| `iufo_rep_cmmtrec` | 报表数据报送记录 | `iufo.commit.RepDataCommitRecordVO` |
| `iufo_rep_state` | 报表数据状态 | `iufo.commit.RepDataStateVO` |
| `iufo_rep_state` | 报表数据状态 | `iufo.commit.RepDataStateVO` |
| `iufo_repdataapprove` | 报表数据审批 | `iufo.approve.RepDataApproveVO` |
| `iufo_repdataauth` | 报表数据权限 | `iufo.repdataauth.RepDataAuthRecordVO` |
| `iufo_report` | 采集表信息 | `iuforeport.rep.ReportVO` |
| `iufo_report` | 报表表样 | `iufo.ufoereport.UfoeReportVO` |
| `iufo_report_dir` | 报表目录 | `iuforeport.rep.ReportDirVO` |
| `iufo_report_show` | 采集表展示信息 | `iuforeport.rep.ReportShowVO` |
| `iufo_schedule` | IUFO计划 | `iufo.schedule.IUfoScheduleVO` |
| `iufo_schedule_action` | IUFO计划活动 | `iufo.schedule.IUfoScheduleActionVO` |
| `iufo_schedulesort` | IUFO计划目录 | `iufo.schedule.IUfoScheduleSortVO` |
| `iufo_singlekeyval` | SingleKeyVal | `iufo.mailrule.SingleKeyValVO` |
| `iufo_task` | 任务 | `iufo.task.TaskVO` |
| `iufo_task_cmmtrec` | 任务报送记录 | `iufo.commit.TaskCommitRecordVO` |
| `iufo_task_commit` | 任务报送信息 | `iufo.commit.TaskCommitVO` |
| `iufo_taskapprove` | 任务审批 | `iufo.task.TaskApproveVO` |
| `iufo_taskassign` | 任务分配记录 | `iufo.task.TaskAssignVO` |
| `iufo_taskdefault` | 任务默认值 | `iufo.task.TaskDefaultVO` |
| `iufo_taskmsgsel` | 任务消息模板选择 | `iufo.task.TaskMsgSelVO` |
| `iufo_taskprintscheme` | 打印方案 | `iufo.task.TaskPrintSchemeVO` |
| `iufo_taskreferprintscheme` | 任务引用打印方案 | `iufo.task.TaskReferPrintSchemeVO` |
| `iufo_taskreport` | 任务引用报表 | `iufo.task.TaskReportVO` |
| `iufo_taskscheme` | 任务引用方案 | `iufo.task.TaskSchemeVO` |
| `iufo_tasksort` | 任务分类 | `iufo.task.TaskSortVO` |
| `iufo_total_scheme` | 汇总方案 | `iufo.total.TotalSchemeVO` |
| `iufo_type_dir` | 分类目录 | `iufo.pub.TypeDirVO` |
| `iufo_unitdsinfo` | 单位数据源信息 | `iufo.batchrule.ShowUnitDSInfoVO` |
| `iufo_userprintset` | 用户打印设置 | `iufo.print.UserPrintSetVO` |
| `ufoe_Entity` | 汇总结果 | `ufoe.totalresult.Entity` |
| `ufoe_FailRepRecord` | 发送失败报表记录 | `iufo.monitor.repsub.FailRepRecordVO` |
| `ufoe_MailSendDetail` | 邮件发送监控详情 | `iufo.mailrule.MailSendDetailVO` |
| `ufoe_PsnFmlDetailInfoVO` | 公式详细信息 | `iufo.personalformula.PsnFmlDetailInfoVO` |
| `ufoe_SuccRepRecord` | 成功报表记录 | `iufo.monitor.repsub.SuccRepRecordVO` |
| `ufoe_checkexeresult` | 审核执行结果 | `iufo.checkexecute.CheckExeResultVO` |
| `ufoe_finalreport_file` | 管理报告 | `iufo.reptemplate.FinalReportFileVO` |
| `ufoe_query_finalreportfile` | 管理报告查询结果 | `iufo.reptemplate.FinalRepFileResultVO` |
| `ufoe_queryresult` | 报表数据查询结果 | `iufo.repdataquery.RepDataQueryResultVO` |
| `ufoe_rep_formula_info` | 个性化公式信息 | `iufo.personalformula.RepFormulaInfoVO` |
| `ufoe_reptemplate_ds` | 报表管理报告数据源 | `iufo.reptemplate.RepTemplateDSVO` |
| `ufoe_reptemplate_file` | 管理报告模版 | `iufo.reptemplate.RepTemplateFileVO` |

### xbrl xbrl（10 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `xbrl_InstanceRep` | 实例引用的报表 | `xbrl.instancerep.InstanceRepVO` |
| `xbrl_insschema` | 实例方案 | `xbrl.insschema.InstanceSchemaVO` |
| `xbrl_insschrep` | 实例方案报表 | `xbrl.insschema.InsSchemaRepVO` |
| `xbrl_instance` | 实例文件 | `xbrl.instance.InstanceVO` |
| `xbrl_orgmem` | XBRL_组织机构体系成员 | `xbrl.xbrlorgmem.XbrlOrgMemVO` |
| `xbrl_orgmemcodename` | XBRL_组织机构体系成员含编码名称 | `xbrl.corg.XbrlOrgStruMemberWithCodeNameVO` |
| `xbrl_orgstruct` | XBRL_组织机构体系 | `xbrl.xbrlorgstru.XbrlOrgStruVO` |
| `xbrl_rep_mapping` | 报表映射 | `xbrl.mapping.ReportMappingVO` |
| `xbrl_tax_mng` | 分类标准 | `xbrl.taxomanagement.TaxoManagementVO` |
| `xbrl_vldrule` | 编报规则 | `xbrl.validate.ValidationRuleVO` |

## 资产管理（10 模块，363 表）

### aim 资产信息管理（35 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `eom_meas_items` | 测量项目 | `am.measureitems.MeasureitemsVO` |
| `eom_measure_point` | 测量点 | `am.measurepoint.MeaspointHeadVO` |
| `eom_measure_point_b` | 测量点明细 | `am.measurepoint.MeaspointBodyVO` |
| `pam_equip` | 设备卡片 | `aim.equip.EquipHeadVO` |
| `pam_equip` | 子设备 | `aim.equip.SubEquipVO` |
| `pam_equip_image` | 设备图片 | `aim.equip.EquipImageVO` |
| `pam_equip_trantype` | 卡片交易类型扩展 | `aim.equipex.EquipTypeExVO` |
| `pam_inspect` | 检验申报单 | `aim.inspect.InspectHeadVO` |
| `pam_inspect_b` | 检验申报单表体 | `aim.inspect.InspectBodyVO` |
| `pam_inspection_road` | 检修路线 | `aim.inspectionroad.InspectionRoadHeadVO` |
| `pam_inspection_road_b` | 检修路线子表 | `aim.inspectionroad.InspectionRoadBodyVO` |
| `pam_iso_create` | 隔离模板建立子表 | `aim.isolatetemp.IsoCreateBodyVO` |
| `pam_iso_reback` | 隔离模板恢复子表 | `aim.isolatetemp.IsoRebackBodyVO` |
| `pam_isolate_temp` | 隔离模板 | `aim.isolatetemp.IsoTempHeadVO` |
| `pam_map_coordinate` | 地图覆盖物坐标 | `aim.equipmap.CoordinateVO` |
| `pam_map_location` | 地图覆盖物 | `aim.equipmap.LocationHeadVO` |
| `pam_map_location_type` | 资产地图覆盖物类型 | `aim.equipmap.EquipMapTypeVO` |
| `pam_purchaseplan` | 资产配置申请 | `aim.purchaseplan.PurchaseplanHeadVO` |
| `pam_purchaseplan_b` | 资产配置申请单子表 | `aim.purchaseplan.PurchaseplanBodyVO` |
| `pam_purchaseplan_c` | 调剂分配 | `aim.purchaseplan.PurchaseReliefVO` |
| `pam_record` | 检验记录 | `aim.record.RecordHeadVO` |
| `pam_record_b` | 检验记录表体 | `aim.record.RecordBodyVO` |
| `pam_safety_job` | 安全工作包 | `aim.safetyjob.SafetyJobHeadVO` |
| `pam_safety_job_b` | 安全工作包子表 | `aim.safetyjob.SafetyJobBodyVO` |
| `pam_spare_part` | 零部件 | `aim.equip.SparePartVO` |
| `pam_srcdist` | 设备来源表头 | `aim.srcdist.SrcDistHeadVo` |
| `pam_srcdist_b` | 设备来源表体 | `aim.srcdist.SrcDistBodyVo` |
| `pam_techvalues` | 技术参数值表 | `aim.equip.TechValueVo` |
| `pam_warcontract` | 保修合同 | `aim.warcontract.WarContractHeadVO` |
| `pam_warcontract_b` | 合同基本 | `aim.warcontract.WarContractBodyVO` |
| `pam_warcontract_e` | 合同费用 | `aim.warcontract.WarContractExpenseVO` |
| `pam_warcontract_i` | 合同条款 | `aim.warcontract.WarContractItemVO` |
| `pam_warcontract_p` | 执行过程 | `aim.warcontract.WarContractProcessVO` |
| `pam_warcontract_r` | 保修记录 | `aim.warcontract.WarContractRecordVO` |
| `pam_warcontract_v` | 变更历史 | `aim.warcontract.WarContractVersionVO` |

### ali 资产租入管理（28 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `ali_cont_alter` | 合同变更单 | `ali.contract.alter.ContractInAlterHeadVO` |
| `ali_cont_alter_b` | 合同变更单表体 | `ali.contract.alter.ContractInAlterBodyVO` |
| `ali_contract` | 租入合同 | `ali.contract.leasecont.ContractInHeadVO` |
| `ali_contract_b` | 合同基本信息 | `ali.contract.leasecont.ContractInBodyVO` |
| `ali_contract_eq` | 合同设备明细 | `ali.contract.leasecont.ContractInEquipVO` |
| `ali_contract_ex` | 合同费用 | `ali.contract.leasecont.ContractInExpenseVO` |
| `ali_contract_ext` | 租入合同交易类型扩展 | `ali.contract.leasecont.ContractInExtVO` |
| `ali_contract_i` | 合同条款 | `ali.contract.leasecont.ContractInItemVO` |
| `ali_contract_p` | 执行过程 | `ali.contract.leasecont.ContractInProcessVO` |
| `ali_expense` | 租入费用单 | `ali.rent.expense.LeaseInExpenseHeadVO` |
| `ali_expense_b` | 租入费用单子表 | `ali.rent.expense.LeaseInExpenseBodyVO` |
| `ali_lease_in` | 租入单 | `ali.lease.leasein.LeaseInHeadVO` |
| `ali_lease_in_b` | 租入明细 | `ali.lease.leasein.LeaseInBodyVO` |
| `ali_rent_calc` | 租入租金计算单 | `ali.rent.calculate.RentInCalcHeadVO` |
| `ali_rent_calc_b` | 合同明细 | `ali.rent.calculate.RentInContractVO` |
| `ali_rent_calc_c` | 租金明细 | `ali.rent.calculate.RentInDetailVO` |
| `ali_rent_settle` | 结算单 | `ali.rent.settle.RentInSettleHeadVO` |
| `ali_rent_settle_b` | 结算单表体 | `ali.rent.settle.RentInSettleBodyVO` |
| `ali_restore` | 租入归还单 | `ali.lease.restore.LeaseInRestoreHeadVO` |
| `ali_restore_b` | 租入归还单表体 | `ali.lease.restore.LeaseInRestoreBodyVO` |
| `ali_stoprent` | 租入停租单 | `ali.lease.offhire.LeaseInStopRentHeadVO` |
| `ali_stoprent_b` | 租入停租单子表 | `ali.lease.offhire.LeaseInStopRentBodyVO` |
| `ali_temp_settle` | 临时租入结算单 | `ali.settle.TempSettleHeadVO` |
| `ali_temp_settle_b` | 临时租入结算单子表 | `ali.settle.TempSettleBodyVO` |
| `ali_temporary` | 临时租入单 | `ali.leasein.TempLeaseInHeadVO` |
| `ali_temporary_b` | 临时租入单子表 | `ali.leasein.TempLeaseInBodyVO` |
| `ali_workload` | 租入工作量记录 | `ali.lease.workload.LeaseInWorkloadHeadVO` |
| `ali_workload_b` | 明细 | `ali.lease.workload.LeaseInWorkloadBodyVO` |

### alo 资产租出管理（24 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `alo_cont_alter` | 合同变更单 | `alo.contract.alter.ContractAlterHeadVO` |
| `alo_cont_alter_b` | 合同变更单表体 | `alo.contract.alter.ContractAlterBodyVO` |
| `alo_contract` | 租出合同 | `alo.contract.leasecont.ContractOutHeadVO` |
| `alo_contract_b` | 合同基本信息 | `alo.contract.leasecont.ContractOutBodyVO` |
| `alo_contract_e` | 合同费用 | `alo.contract.leasecont.ContractOutExpenseVO` |
| `alo_contract_eq` | 合同设备明细 | `alo.contract.leasecont.ContractOutEquipVO` |
| `alo_contract_ext` | 合同交易类型扩展 | `alo.contract.leasecont.ContractOutExtVO` |
| `alo_contract_i` | 合同条款 | `alo.contract.leasecont.ContractOutItemVO` |
| `alo_contract_p` | 执行过程 | `alo.contract.leasecont.ContractOutProcessVO` |
| `alo_expense` | 租出费用单 | `alo.rent.expense.LeaseExpenseHeadVO` |
| `alo_expense_b` | 租出费用单子表 | `alo.rent.expense.LeaseExpenseBodyVO` |
| `alo_lease_out` | 租出单 | `alo.lease.leaseout.LeaseoutHeadVO` |
| `alo_lease_out_b` | 租出明细 | `alo.lease.leaseout.LeaseoutBodyVO` |
| `alo_rent_calc` | 租出租金计算单 | `alo.rent.calculate.RentOutCalcHeadVO` |
| `alo_rent_calc_b` | 合同明细 | `alo.rent.calculate.RentOutContractVO` |
| `alo_rent_calc_c` | 租金明细 | `alo.rent.calculate.RentOutDetailVO` |
| `alo_rent_settle` | 结算单 | `alo.rent.settle.RentOutSettleHeadVO` |
| `alo_rent_settle_b` | 结算单表体 | `alo.rent.settle.RentOutSettleBodyVO` |
| `alo_restore` | 租出归还单 | `alo.lease.restore.LeaseRestoreHeadVO` |
| `alo_restore_b` | 租出归还单表体 | `alo.lease.restore.LeaseRestoreBodyVO` |
| `alo_stoprent` | 停租单 | `alo.lease.offhire.LeaseStopRentHeadVO` |
| `alo_stoprent_b` | 停租单子表 | `alo.lease.offhire.LeaseStopRentBodyVO` |
| `alo_workload` | 租出工作量记录 | `alo.lease.workload.LeaseWorkloadHeadVO` |
| `alo_workload_b` | 明细 | `alo.lease.workload.LeaseWorkloadBodyVO` |

### ampub 基础设置（43 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `alo_equipcoopset` | 协同设置 | `am.equipcoopset.EquipCoopSetVO` |
| `am_messagenote` | 消息条目 | `am.messagenote.MessageNoteVO` |
| `ampub_cooperset` | 档案协同 | `am.cooperationset.CooperationSetVO` |
| `ewm_dispose_means` | 更换备件处理方法 | `am.disposemeans.DisposemeansVO` |
| `ewm_priority` | 工单优先级 | `am.wopriority.WoPriorityVO` |
| `ewm_team` | 班组 | `am.team.TeamVO` |
| `ewm_team_b` | 班组子表 | `am.team.TeamBodyVO` |
| `ewm_wo_status` | 工单状态 | `am.wostatus.WostatusVO` |
| `ewm_worktype` | 工作类型 | `am.worktype.WorktypeVO` |
| `fa_reason` | 原因 | `am.newreason.ReasonVO` |
| `pam_addreducestyle` | 增减方式 | `am.addreducestyle.AddreduceStyleVO` |
| `pam_cal_item` | 租金计算项目 | `am.calculateitem.RentCalItemVO` |
| `pam_cal_means` | 租金计算方法 | `am.calculatemeans.CaculateMeansVO` |
| `pam_cal_quotiety` | 租金计算系数 | `am.calculatequotiety.CalculateQuotietyVO` |
| `pam_capital_source` | 资金来源 | `am.capitalsource.CapitalSourceVO` |
| `pam_craft` | 工种 | `am.craft.CraftVO` |
| `pam_expensetype` | 费用项目 | `am.expensetype.ExpenseTypeVO` |
| `pam_fa_category` | 设备资产类别对照 | `am.categoryfa.CategoryFaVO` |
| `pam_failure_detect` | 故障发现途径 | `am.failuredetect.FailuredetectVO` |
| `pam_failure_reason` | 故障原因 | `am.failurereason.FailurereasonVO` |
| `pam_failure_symptom` | 故障现象 | `am.failuresymptom.FailuresymptomVO` |
| `pam_failure_tree` | 故障树 | `am.failuretree.FailuretreeVO` |
| `pam_failure_type` | 故障类别 | `am.failuretype.FailuretypeVO` |
| `pam_location` | 位置 | `am.location.LocationVO` |
| `pam_nextstep` | 后续业务校验 | `nc.impl.am.nextstep.NextStepVO` |
| `pam_ownerunitorg` | 货主业务委托关系 | `am.ownerunitorg.OwnerUnitOrgVO` |
| `pam_precaution` | 危险与安全措施 | `am.precaution.PrecautionVO` |
| `pam_priority` | 设备关键程度 | `am.priority.PriorityVO` |
| `pam_reasonrelation` | 多故障原因实体 | `am.failurereasonrelation.FailureReasonRelation` |
| `pam_service_step` | 维修措施 | `am.servicestep.ServicestepVO` |
| `pam_specialty` | 专业 | `am.specialty.SpecialtyVO` |
| `pam_std_job` | 标准工作包 | `am.stdjob.StdJobHeadVO` |
| `pam_std_job_materiel` | 物料附卡 | `am.stdjob.StdJobMaterialVO` |
| `pam_std_job_task` | 作业方案 | `am.stdjob.StdJobTaskVO` |
| `pam_std_job_tool` | 工具附卡 | `am.stdjob.StdJobToolVO` |
| `pam_std_job_type` | 工种附卡 | `am.stdjob.StdJobTypeVO` |
| `pam_tools` | 工具 | `am.tools.ToolsVO` |
| `pam_transi` | 交易规则表头 | `am.transi.TransiHeadVO` |
| `pam_transi_b` | 可用状态页签 | `am.transi.StatusToDoVO` |
| `pam_transi_b` | 变化状态页签 | `am.transi.StatusAfterVO` |
| `pam_usedunitorg` | 使用权委托关系 | `am.usedunitorg.UsedUnitOrgVO` |
| `rm_compensationstd` | 损坏赔偿标准 | `ampub.compensationstd.CompensationStdVO` |
| `rm_maintainstd` | 维修标准 | `ampub.maintainstd.MaintainStdVO` |

### aum 资产使用管理（53 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `pam_alter` | 变动单 | `aum.alter.AlterBillHeadVO` |
| `pam_alter_b` | 变动子表 | `aum.alter.AlterBillBodyVO` |
| `pam_alter_sheet` | 变动明细表 | `aum.alter.AlterSheetVO` |
| `pam_assign` | 资产领用 | `aum.assign.used.AssignHeadVO` |
| `pam_assign` | 领用归还 | `aum.assign.restore.ReturnHeadVO` |
| `pam_assign_apply` | 领用申请 | `aum.assign.apply.AssignApplyHeadVO` |
| `pam_assign_apply_b` | 领用申请子表 | `aum.assign.apply.AssignApplyBodyVO` |
| `pam_assign_b` | 领用表体 | `aum.assign.used.AssignBodyVO` |
| `pam_assign_b` | 领用归还子表 | `aum.assign.restore.ReturnBodyVO` |
| `pam_bill` | 安装调试 | `aum.install.InstallHeadVO` |
| `pam_bill_b` | 安装调试表体 | `aum.install.InstallBodyVO` |
| `pam_borrow` | 资产借用 | `aum.borrow.used.BorrowHeadVO` |
| `pam_borrow` | 借用归还 | `aum.borrow.restore.ReturnHeadVO` |
| `pam_borrow_apply` | 借用申请 | `aum.borrow.apply.BorrowApplyHeadVO` |
| `pam_borrow_apply_b` | 借用申请子表 | `aum.borrow.apply.BorrowApplyBodyVO` |
| `pam_borrow_b` | 借用单子表 | `aum.borrow.used.BorrowBodyVO` |
| `pam_borrow_b` | 借用归还单子表 | `aum.borrow.restore.ReturnBodyVO` |
| `pam_compensation` | 保险索赔 | `aum.compensation.CompensationHeadVO` |
| `pam_compensation_b` | 保险索赔子表 | `aum.compensation.CompensationBodyVO` |
| `pam_deploy_apply` | 调入申请 | `aum.deploy.apply.DeployApplyHeadVO` |
| `pam_deploy_apply_b` | 调拨申请子表 | `aum.deploy.apply.DeployApplyBodyVO` |
| `pam_diffalter` | 差异调整 | `aum.diffalter.DiffAlterHeadVO` |
| `pam_diffalter_b` | 差异调整子表 | `aum.diffalter.DiffAlterBodyVO` |
| `pam_freeze` | 资产封存 | `aum.freeze.FreezeHeadVO` |
| `pam_freeze_b` | 资产封存表体 | `aum.freeze.FreezeBodyVO` |
| `pam_insurance` | 资产投保 | `aum.insur.insurance.InsuranceHeadVO` |
| `pam_insurance_b` | 保险单子表 | `aum.insur.insurance.InsuranceBodyVO` |
| `pam_inventory` | 资产盘点 | `aum.inventory.InventoryHeadVO` |
| `pam_inventory_b` | 资产盘点表体 | `aum.inventory.InventoryBodyVO` |
| `pam_loss` | 资产盘亏 | `aum.loss.LossHeadVO` |
| `pam_loss_b` | 资产盘亏表体 | `aum.loss.LossBodyVO` |
| `pam_mortgage` | 资产抵押 | `aum.mortgage.MortgageHeadVO` |
| `pam_mortgage_b` | 抵押单表体 | `aum.mortgage.MortgageBodyVO` |
| `pam_profit` | 资产盘盈 | `aum.profit.ProfitHeadVO` |
| `pam_profit_b` | 资产盘盈表体 | `aum.profit.ProfitBodyVO` |
| `pam_redeploy_in` | 所有权调入 | `aum.deploy.in.DeployInHeadVO` |
| `pam_redeploy_in` | 使用权调入 | `aum.deploy.usedin.DeployUsedInHeadVO` |
| `pam_redeploy_in_b` | 所有权调入表体 | `aum.deploy.in.DeployInBodyVO` |
| `pam_redeploy_in_b` | 使用权调入子表 | `aum.deploy.usedin.DeployUsedInBodyVO` |
| `pam_redeploy_out` | 所有权调出 | `aum.deploy.out.DeployOutHeadVO` |
| `pam_redeploy_out` | 使用权调出 | `aum.deploy.usedout.DeployUsedOutHeadVO` |
| `pam_redeploy_out_b` | 所有权调出表体 | `aum.deploy.out.DeployOutBodyVO` |
| `pam_redeploy_out_b` | 使用权调出子表 | `aum.deploy.usedout.DeployUsedOutBodyVO` |
| `pam_reduce` | 资产报废 | `aum.disused.DisusedHeadVO` |
| `pam_reduce` | 资产捐赠 | `aum.donate.DonateHeadVO` |
| `pam_reduce` | 资产处置 | `aum.sale.SaleHeadVO` |
| `pam_reduce` | 资产闲置 | `aum.unused.UnusedHeadVO` |
| `pam_reduce_b` | 报废单明细 | `aum.disused.DisusedBodyVO` |
| `pam_reduce_b` | 捐赠单明细 | `aum.donate.DonateBodyVO` |
| `pam_reduce_b` | 处置单表体 | `aum.sale.SaleBodyVO` |
| `pam_reduce_b` | 资产闲置表体 | `aum.unused.UnusedBodyVO` |
| `pam_thaw` | 资产启封 | `aum.thaw.ThawHeadVO` |
| `pam_thaw_b` | 资产启封表体 | `aum.thaw.ThawBodyVO` |

### emm 维护管理（23 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `emm_excepthandle` | 巡检异常处理 | `emm.exceptionhandle.ExceptionHandleVO` |
| `emm_inspect_track` | 巡检轨迹 | `emm.monitor.InspectTrackVO` |
| `emm_inspection` | 巡检记录 | `emm.inspectrecord.InspectionHeadVO` |
| `emm_inspection_b` | 巡检记录子表 | `emm.inspectrecord.InspectionBodyVO` |
| `emm_pcexception` | 点检异常处理 | `emm.pcexception.PCExceptionVO` |
| `emm_pcplan` | 点检计划 | `emm.pcplan.PCPlanHeadVO` |
| `emm_pcplan_b` | 点检计划子表 | `emm.pcplan.PCPlanBodyVO` |
| `emm_pcresult` | 点检结果定义 | `emm.pcresult.PCResultVO` |
| `emm_pcstd` | 点检标准 | `emm.pcstd.PCStdHeadVO` |
| `emm_pcstd_b` | 点检标准子表 | `emm.pcstd.PCStdBodyVO` |
| `emm_pcstd_lk` | 关联设备 | `emm.pcstd.PCStdBodyLKVO` |
| `emm_pm` | 预防性维护 | `emm.premaintain.PMHeadVO` |
| `emm_pm_result` | 预防性维护绩效频率 | `emm.premaintain.PMResultVO` |
| `emm_pm_stdjob` | 预防性维护工作包 | `emm.premaintain.PMStdJobVO` |
| `emm_pm_workobj` | 预防性维护作业对象 | `emm.premaintain.PMWorkObjVO` |
| `emm_pointcheck` | 点检 | `emm.dailypc.DailyPCHeadVO` |
| `emm_pointcheck_b` | 点检子表 | `emm.dailypc.DailyPCBodyVO` |
| `emm_pointchecktype` | 点检类别 | `emm.pctype.PointCheckTypeVO` |
| `emm_route` | 巡检规则 | `emm.route.RouteHeadVO` |
| `emm_routeinspectstd` | 巡检标准 | `emm.inspectstd.RouteInspStdHeadVO` |
| `emm_routeinspectstd_b` | 巡检标准表体 | `emm.inspectstd.RouteInspStdBodyVO` |
| `emm_rt_detail` | 路线明细 | `emm.route.RouteDetailVO` |
| `emm_rt_summary` | 路线概述 | `emm.route.RouteSummaryVO` |

### ewm 维修管理（61 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `emm_repair_plan` | 维修计划 | `emm.repairplan.RepairPlanHeadVO` |
| `emm_repair_plan_b` | 维修计划明细 | `emm.repairplan.RepairPlanBodyVO` |
| `emm_repair_plan_exes` | 计划其他费用 | `emm.repairplan.RepairPlanExesVO` |
| `emm_repair_plan_inv` | 计划物料 | `emm.repairplan.RepairPlanInvVO` |
| `emm_repair_plan_obj` | 作业对象 | `emm.repairplan.RepairPlanTaskObjVO` |
| `emm_repair_plan_psn` | 计划人员 | `emm.repairplan.RepairPlanPsnVO` |
| `emm_repair_plan_task` | 作业方案 | `emm.repairplan.RepairPlanTaskVO` |
| `emm_repair_plan_tool` | 计划工具 | `emm.repairplan.RepairPlanToolVO` |
| `ewm_costallocation` | 工单成本分摊 | `ewm.costallocation.CostallocationHeadVO` |
| `ewm_costallocation_b` | 工单成本分摊明细 | `ewm.costallocation.CostallocationBodyVO` |
| `ewm_detail_task` | 计划编制任务 | `ewm.detailtask.DetailTaskVO` |
| `ewm_isolation` | 隔离单 | `ewm.isolation.IsolationHeadVO` |
| `ewm_isolation_create` | 隔离单建立子表 | `ewm.isolation.IsolationCreateBodyVO` |
| `ewm_isolation_history` | 隔离单执行过程 | `ewm.isolation.IsolationHisBodyVO` |
| `ewm_isolation_reback` | 隔离单恢复子表 | `ewm.isolation.IsolationRebackBodyVO` |
| `ewm_mtcon` | 维修合同 | `ewm.maintaincon.MaintainConHeadVO` |
| `ewm_mtcon_base` | 合同基本 | `ewm.maintaincon.MaintainConBaseVO` |
| `ewm_mtcon_execute` | 执行过程 | `ewm.maintaincon.MaintainConExecVO` |
| `ewm_mtcon_expenses` | 合同费用 | `ewm.maintaincon.MaintainConExpensesVO` |
| `ewm_mtcon_his` | 变更历史 | `ewm.maintaincon.MaintainConHisVO` |
| `ewm_mtcon_log` | 合同日志 | `ewm.maintaincon.MaintainConLogVO` |
| `ewm_mtcon_pay` | 支付条款 | `ewm.maintaincon.MaintainConPayVO` |
| `ewm_mtcon_terms` | 合同条款 | `ewm.maintaincon.MaintainConTermsVO` |
| `ewm_perm_delay` | 工作延期 | `ewm.permit.PermitDelayBodyVO` |
| `ewm_perm_equiptrialopr` | 设备试运行 | `ewm.permit.PermitEquipTrialoprBodyVO` |
| `ewm_perm_history` | 许可历史 | `ewm.permit.PermitHistoryBodyVO` |
| `ewm_perm_prec` | 安全措施 | `ewm.permit.PermitPrecBodyVO` |
| `ewm_perm_prinalter` | 工作负责人变更 | `ewm.permit.PermitPrinAlterBodyVO` |
| `ewm_perm_workeralter` | 工作人员变更 | `ewm.permit.PermitWorkerAlterBodyVO` |
| `ewm_permit` | 工作许可 | `ewm.permit.PermitHeadVO` |
| `ewm_permitstatus` | 许可状态 | `ewm.permitstatus.PermitStatusVO` |
| `ewm_permprecauttype` | 许可安全措施类别 | `ewm.permprecauttype.PermPrecautTypeVO` |
| `ewm_permtranstype` | 许可交易类型扩展 | `ewm.permtranstype.PermTranstypeHeadVO` |
| `ewm_permtranstype_b` | 许可交易类型扩展子表 | `ewm.permtranstype.PermTranstypeBodyVO` |
| `ewm_plan_type` | 计划类型 | `ewm.planstype.PlanTypeVO` |
| `ewm_planning_task` | 任务发布 | `ewm.planningtask.PlanningTaskVO` |
| `ewm_supperadd_inv` | 追加物料申请 | `ewm.supperaddinv.SupperaddInvHeadVO` |
| `ewm_supperadd_inv_b` | 追加物料申请子表 | `ewm.supperaddinv.SupperaddInvBodyVO` |
| `ewm_transtype` | 工单交易类型扩展 | `ewm.transtype.WOTranstypeExtendVO` |
| `ewm_wo` | 工单 | `ewm.workorder.WorkOrderHeadVO` |
| `ewm_wo` | 工单结构 | `ewm.workorder.WOChildVO` |
| `ewm_wo` | 子工单 | `ewm.workorder.WOChildrenVO` |
| `ewm_wo_actual_exes` | 实际其它费用 | `ewm.workorder.WOActualOtherExesVO` |
| `ewm_wo_actual_inv` | 实际物料 | `ewm.workorder.WOActualInvVO` |
| `ewm_wo_actual_psn` | 实际人员 | `ewm.workorder.WOActualPsnVO` |
| `ewm_wo_actual_tool` | 实际工具 | `ewm.workorder.WOActualToolVO` |
| `ewm_wo_his` | 状态历史 | `ewm.workorder.WOHisVO` |
| `ewm_wo_log` | 工单日志 | `ewm.workorder.WOLogVO` |
| `ewm_wo_part` | 更换备件处理 | `ewm.workorder.WOPartVO` |
| `ewm_wo_permit` | 工作许可 | `ewm.workorder.WOPermitVO` |
| `ewm_wo_plan_exes` | 计划其它费用 | `ewm.workorder.WOPlanOtherExesVO` |
| `ewm_wo_plan_inv` | 计划物料 | `ewm.workorder.WOPlanInVVO` |
| `ewm_wo_plan_psn` | 计划人员 | `ewm.workorder.WOPlanPsnVO` |
| `ewm_wo_plan_tool` | 计划工具 | `ewm.workorder.WOPlanToolVO` |
| `ewm_wo_precaution` | 危险预控 | `ewm.workorder.WOPrecautionVO` |
| `ewm_wo_task` | 作业方案 | `ewm.workorder.WOTaskVO` |
| `ewm_wo_taskobj` | 作业对象 | `ewm.workorder.WOTaskObjVO` |
| `ewm_work_apply` | 工作申请 | `ewm.workapply.WorkApplyVO` |
| `ewm_work_apply_b` | 工作申请子表 | `ewm.workapply.WorkApplyBodyVO` |
| `ewm_worklog` | 工作日志 | `ewm.worklog.WorklogHeadVO` |
| `ewm_worklog_b` | 工作日志子表 | `ewm.worklog.WorklogBodyVO` |

### rlm 周转材租入管理（42 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `rlm_adjust` | 周转材租入调整单 | `rlm.adjust.AdjustHeadVO` |
| `rlm_adjust_b` | 调整单子表 | `rlm.adjust.AdjustBodyVO` |
| `rlm_balancepay` | 租赁结算单 | `rlm.balancepay.BalancePayHeadVO` |
| `rlm_balancepay_adjust` | 调整明细子表 | `rlm.balancepay.BalancePayAdjustVO` |
| `rlm_balancepay_b` | 租赁结算单子表 | `rlm.balancepay.BalancePayBodyVO` |
| `rlm_balancepay_damage` | 损坏赔偿明细子表 | `rlm.balancepay.BalancePayDamageVO` |
| `rlm_balancepay_discard` | 报废赔偿明细子表 | `rlm.balancepay.BalancePayDiscardVO` |
| `rlm_balancepay_load` | 装卸明细子表 | `rlm.balancepay.BalancePayLoadVO` |
| `rlm_balancepay_lost` | 遗失赔偿明细子表 | `rlm.balancepay.BalancePayLostVO` |
| `rlm_balancepay_maintain` | 维修明细子表 | `rlm.balancepay.BalancePayMaintainVO` |
| `rlm_balancepay_s` | 租赁结算单停租租金明细子表 | `rlm.balancepay.BalancePayStopRentVO` |
| `rlm_balancepay_transport` | 运输明细子表 | `rlm.balancepay.BalancePayTransportVO` |
| `rlm_compen_b` | 周转材租入赔偿单子表 | `rlm.compensation.CompensationBodyVO` |
| `rlm_compensation` | 周转材租入赔偿单 | `rlm.compensation.CompensationHeadVO` |
| `rlm_contract` | 周转材租入合同 | `rlm.contract.ContractHeadVO` |
| `rlm_contract_b` | 合同基本 | `rlm.contract.ContractBasicVO` |
| `rlm_contract_c` | 合同费用 | `rlm.contract.ContractChargementVO` |
| `rlm_contract_d` | 损坏赔偿标准 | `rlm.contract.ContractDamageCompenStdVO` |
| `rlm_contract_e` | 合同条款 | `rlm.contract.ContractItemVO` |
| `rlm_contract_ext` | 周转材租入合同交易类型扩展 | `rlm.contract.ContractInExtVO` |
| `rlm_contract_h` | 合同变更 | `rlm.contract.ContractHistoryVO` |
| `rlm_contract_p` | 执行过程 | `rlm.contract.ContractProcessVO` |
| `rlm_contract_r` | 维修标准 | `rlm.contract.ContractRepairStdVO` |
| `rlm_contract_s` | 租赁明细 | `rlm.contract.ContractRentDetailVO` |
| `rlm_entrance` | 周转材租入进场单 | `rlm.entrance.EntranceHeadVO` |
| `rlm_entrance_b` | 周转材租入进场单子表 | `rlm.entrance.EntranceBodyVO` |
| `rlm_entrance_c` | 周转材租入运输装卸费 | `rlm.entrance.TransportPay` |
| `rlm_exit` | 周转材租入退场单 | `rlm.exit.ExitHeadVO` |
| `rlm_exit_b` | 周转材租入合同归还 | `rlm.exit.ContractRestore` |
| `rlm_exit_c` | 周转材租入实际归还 | `rlm.exit.ActualRestore` |
| `rlm_exit_d` | 周转材租入调整清单 | `rlm.exit.Adjust` |
| `rlm_exit_e` | 周转材租入维修清单 | `rlm.exit.Maintain` |
| `rlm_exit_f` | 周转材租入损坏赔偿清单 | `rlm.exit.Compensation` |
| `rlm_exit_g` | 周转材租入运输装卸费用 | `rlm.exit.Pay` |
| `rlm_maintain` | 周转材租入维修单 | `rlm.maintain.MaintainHeadVO` |
| `rlm_maintain_b` | 周转材租入维修单子表 | `rlm.maintain.MaintainBodyVO` |
| `rlm_rentpay` | 应付租金计算单 | `rlm.rentpay.RentPayHeadVO` |
| `rlm_rentpay_b` | 合同租金 | `rlm.rentpay.RentPayBodyVO` |
| `rlm_rentpay_d` | 合同租金明细 | `rlm.rentpay.RentPayDetailVO` |
| `rlm_rentpay_l` | 合同行租金 | `rlm.rentpay.RentPayListVO` |
| `rlm_stoprent` | 周转材租入停租单 | `rlm.stoprent.StopRentHeadVO` |
| `rlm_stoprent_b` | 周转材租入停租单子表 | `rlm.stoprent.StopRentBodyVO` |

### rom 周转材租出管理（42 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `rom_accept` | 周转材租出归还单 | `rom.accept.AcceptHeadVO` |
| `rom_accept_b` | 周转材租出合同归还 | `rom.accept.ContractRestore` |
| `rom_accept_c` | 周转材租出实际归还 | `rom.accept.ActualRestore` |
| `rom_accept_d` | 周转材租出调整清单 | `rom.accept.Adjust` |
| `rom_accept_e` | 周转材租出维修清单 | `rom.accept.Maintain` |
| `rom_accept_f` | 周转材租出赔偿清单 | `rom.accept.Compensation` |
| `rom_accept_g` | 周转材租出运输装卸费用 | `rom.accept.Pay` |
| `rom_adjust` | 周转材租出调整单 | `rom.adjust.AdjustHeadVO` |
| `rom_adjust_b` | 调整单子表 | `rom.adjust.AdjustBodyVO` |
| `rom_balancerec` | 租赁结算单 | `rom.balancerec.BalanceRecHeadVO` |
| `rom_balancerec_adjust` | 调整明细子表 | `rom.balancerec.BalanceRecAdjustVO` |
| `rom_balancerec_b` | 租赁结算单子表 | `rom.balancerec.BalanceRecBodyVO` |
| `rom_balancerec_damage` | 损坏赔偿明细子表 | `rom.balancerec.BalanceRecDamageVO` |
| `rom_balancerec_discard` | 报废赔偿明细子表 | `rom.balancerec.BalanceRecDiscardVO` |
| `rom_balancerec_load` | 装卸明细子表 | `rom.balancerec.BalanceRecLoadVO` |
| `rom_balancerec_lost` | 遗失赔偿明细子表 | `rom.balancerec.BalanceRecLostVO` |
| `rom_balancerec_maintain` | 维修明细子表 | `rom.balancerec.BalanceRecMaintainVO` |
| `rom_balancerec_s` | 租赁结算单停租租金明细子表 | `rom.balancerec.BalanceRecStopRentVO` |
| `rom_balancerec_transport` | 运输明细子表 | `rom.balancerec.BalanceRecTransportVO` |
| `rom_compen_b` | 周转材租出赔偿单子表 | `rom.compensation.CompensationBodyVO` |
| `rom_compensation` | 周转材租出赔偿单 | `rom.compensation.CompensationHeadVO` |
| `rom_contract` | 周转材租出合同 | `rom.contract.ContractHeadVO` |
| `rom_contract_b` | 合同基本 | `rom.contract.ContractBasicVO` |
| `rom_contract_c` | 合同费用 | `rom.contract.ContractChargementVO` |
| `rom_contract_d` | 损坏赔偿标准 | `rom.contract.ContractDamageCompenStdVO` |
| `rom_contract_e` | 合同条款 | `rom.contract.ContractItemVO` |
| `rom_contract_ext` | 周转材租出合同交易类型扩展 | `rom.contract.ContractOutExtVO` |
| `rom_contract_h` | 变更历史 | `rom.contract.ContractHistoryVO` |
| `rom_contract_p` | 执行过程 | `rom.contract.ContractProcessVO` |
| `rom_contract_r` | 维修标准 | `rom.contract.ContractRepairStdVO` |
| `rom_contract_s` | 租赁明细 | `rom.contract.ContractRentDetailVO` |
| `rom_delivery` | 周转材租出租出单 | `rom.delivery.DeliveryHeadVO` |
| `rom_delivery_b` | 周转材租出合同明细 | `rom.delivery.DeliveryBodyVO` |
| `rom_delivery_c` | 周转材租出运输装卸费 | `rom.delivery.TransportPay` |
| `rom_maintain` | 周转材租出维修单 | `rom.maintain.MaintainHeadVO` |
| `rom_maintain_b` | 周转材租出维修单子表 | `rom.maintain.MaintainBodyVO` |
| `rom_rentreceive` | 应收租金计算单 | `rom.rentreceive.RentReceiveHeadVO` |
| `rom_rentreceive_b` | 合同租金 | `rom.rentreceive.RentReceiveBodyVO` |
| `rom_rentreceive_d` | 合同租金明细 | `rom.rentreceive.RentReceiveDetailVO` |
| `rom_rentreceive_l` | 合同行租金 | `rom.rentreceive.RentReceiveListVO` |
| `rom_stoprent` | 周转材租出停租单 | `rom.stoprent.StopRentHeadVO` |
| `rom_stoprent_b` | 周转材租出停租单子表 | `rom.stoprent.StopRentBodyVO` |

### rum 易耗品管理（12 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `rum_assign` | 易耗品领用单 | `rum.assign.AssignHeadVO` |
| `rum_assign` | 领用归还单 | `rum.assign.restore.AssignReturnHeadVO` |
| `rum_assign_b` | 易耗品领用单子表 | `rum.assign.AssignBodyVO` |
| `rum_assign_b` | 领用归还单子表 | `rum.assign.restore.AssignReturnBodyVO` |
| `rum_borrow` | 易耗品借用单 | `rum.borrow.BorrowHeadVO` |
| `rum_borrow` | 易耗品借用归还单 | `rum.borrow.restore.RestoreHeadVO` |
| `rum_borrow_b` | 易耗品借用单子表 | `rum.borrow.BorrowBodyVO` |
| `rum_borrow_b` | 易耗品借用归还单子表 | `rum.borrow.restore.RestoreBodyVO` |
| `rum_disused` | 易耗品报废单 | `rum.disused.DisusedHeadVO` |
| `rum_disused_b` | 报废单子表 | `rum.disused.DisusedBodyVO` |
| `rum_maintain` | 易耗品维修单 | `rum.maintain.MaintainHeadVO` |
| `rum_maintain_b` | 维修单子表 | `rum.maintain.MaintainBodyVO` |

## 人力资源（17 模块，538 表）

### hrbm 社保福利（14 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `bd_defdoc` | 社保项目分类 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bm_bmclass` | 险种 | `bm.bmclass.BmClassVO` |
| `bm_classitem` | 险种项目 | `bm.bmclass.BmClassItemVO` |
| `bm_data` | 社保数据 | `bm.data.BmDataVO` |
| `bm_datapool` | 费用分摊 | `bm.amo.DataPoolVO` |
| `bm_datapool_b` | 费用分摊子表 | `bm.amo.DataPoolBVO` |
| `bm_dataround` | 社保数据舍位方式 | `bm.data.BmDataroundVO` |
| `bm_detailrule` | 缴交地规则子表 | `bm.locationrule.DetailRule` |
| `bm_item` | 公共险种项目 | `bm.item.BmItemVO` |
| `bm_locationrule` | 缴交地规则 | `bm.locationrule.LocationRule` |
| `bm_period` | 险种期间 | `bm.period.BmPeriodVO` |
| `bm_periodscheme` | 险种期间方案 | `bm.period.BmPeriodSchemeVO` |
| `bm_periodstate` | 险种期间 | `bm.period.BmPeriodstateVO` |
| `bm_ruleitem` | 缴交地规则项目 | `hrbm.bm_ruleitem.BmRuleitem` |

### hrc 继任与发展管理（23 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `bd_defdoc` | 就绪状态 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 退出原因 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 培养方式 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 条件类型 (自定义档案) | `bd.defdoc.DefdocVO` |
| `hrc_cand_appraise` | 考核评价 | `hrc.candplan.CandAppraiseVO` |
| `hrc_cand_plan` | 继任计划 | `hrc.candplan.CandplanVO` |
| `hrc_cand_psn` | 继任候选人 | `hrc.candplan.CandplanpsnVO` |
| `hrc_cand_psn` | 继任候选人 | `hrc.candplan.CandpsnVO` |
| `hrc_cand_train` | 培养及跟踪 | `hrc.candplan.CandTrainVO` |
| `hrc_cand_type` | 继任计划分类 | `hrc.candplan.CandplanTypeVO` |
| `hrc_grid` | 单元格设置 | `hrc.ninegrid.GridOpVO` |
| `hrc_gridgap` | 间隔设置 | `hrc.ninegrid.GrapVO` |
| `hrc_gridop` | 九宫图设置 | `hrc.ninegrid.NineGridOpVO` |
| `hrc_talent` | 人才梯队 | `hrc.talent.TalentVO` |
| `hrc_talent_train` | 培养计划 | `hrc.talent.TalentTrainVO` |
| `hrc_talent_type` | 人才梯队组 | `hrc.talenttype.TalentTypeVO` |
| `hrc_talentbill` | 梯队人选单据 | `hrc.talentbill.TalentBillVO` |
| `hrc_talentcapa` | 能力素质要求 | `hrc.talent.TalentCapaVO` |
| `hrc_talentopt` | 入选条件 | `hrc.talent.TalentOptVO` |
| `hrc_talentpsn` | 梯队人选 | `hrc.talentbill.TalentBillPsnVO` |
| `hrc_talentpsn` | 梯队人员 | `hrc.talentpsn.TalentPsnVO` |
| `hrc_talnpsn_ass` | 考核信息 | `hrc.talentpsn.TalentAppraiseVO` |
| `hrc_talnpsn_tn` | 培养及跟踪 | `hrc.talentpsn.TalentPsnTrainVO` |

### hrcm 人员合同管理（13 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `bd_defdoc` | 用人单位解除合同原因 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 解除协议原因 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 终止合同原因 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 终止协议原因 (自定义档案) | `bd.defdoc.DefdocVO` |
| `hi_psndoc_ctrt` | 劳动合同 | `hrcm.hrcm_center.CtrtVO` |
| `hi_psnjob` | 人员工作记录 | `hrcm.hrcm_center.PsnjobVO` |
| `hrcm_agreement` | 岗位协议 | `hrcm.agreement.PostContVO` |
| `hrcm_agreement` | 保密协议 | `hrcm.agreement.SecrerycontVO` |
| `hrcm_agreement` | 培训协议 | `hrcm.agreement.TrainContVO` |
| `hrcm_agreement` | 协议信息 | `hrcm.agreement.AgreementVO` |
| `hrcm_contopinion` | 合同续签意见征询 | `hrcm.contopinion.ContopinionVO` |
| `hrcm_conttype_state` | 合同类型状态 | `hrcm.make.ConttypeStateVO` |
| `hrcm_workdispute` | 劳动争议 | `hrcm.disputed.WorkdisputeVO` |

### hrcp 能力素质管理（9 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `hrcp_capa_model` | 职务能力素质模型 | `cp.cpmodel.CPJobModelVO` |
| `hrcp_capa_model` | 岗位能力素质模型 | `cp.cpmodel.CPPostModelVO` |
| `hrcp_capa_model` | 基准岗位能力素质模型 | `cp.cpmodel.CPStdPostModelVO` |
| `hrcp_capa_model` | 岗位序列能力素质模型 | `cp.cpmodel.CPPostseriModelVO` |
| `hrcp_eva_act` | 评价活动 | `cp.evaact.EvaActVO` |
| `hrcp_eva_detail` | 评价活动明细 | `cp.evaact.EvaDetailVO` |
| `hrcp_eva_indi` | 评价指标 | `cp.evaact.EvaIndiVO` |
| `hrcp_eva_psn` | 评价人员 | `cp.evaact.EvaPsnVO` |
| `hrcp_match_rule` | 匹配规则 | `cp.matchrule.MatchRuleVO` |

### hrhi 人员信息（90 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `bd_defdoc` | 劳动者解除合同原因 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 婚姻状况 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 民族 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 健康状况 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 个人身份 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 户口性质 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 用工形式 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 学校专业 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 学历 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 学位 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 专业类别 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 政治面貌代码 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 党、派代码 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 政治面貌异常类别 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 语种 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 语种熟练程度 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 职业资格 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 职业资格等级 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 专业技术职务 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 培训方式 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 培训类型 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 考评等级 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 学习方式 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 与本人关系 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 职称等级 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 奖励级别 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 异动原因 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 入离职途径 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 任职方式 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 免职方式 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 进出状态 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 流动类别 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 流动原因 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 来往单位性质 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 来往单位所属类别 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 来往单位隶属关系 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 出国目的代码 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 任职类型 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 进入来源 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 减员途径 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 解除协议原因档案 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 功能项 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 组织信息项 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 人员信息项 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_psndoc` | 人员基本信息 | `hi.psndoc.PsndocVO` |
| `hi_entryapply` | 入职申请 | `hi.entrymng.EntryapplyVO` |
| `hi_keypsn_group` | 关键人员组 | `hi.psndoc.KeyPsnGrpVO` |
| `hi_psndoc_abroad` | 出国境情况 | `hi.psndoc.AbroadVO` |
| `hi_psndoc_ass` | 员工考核信息 | `hi.psndoc.AssVO` |
| `hi_psndoc_bad` | 黑名单档案 | `hi.blacklist.BlacklistVO` |
| `hi_psndoc_bminfo` | 社保信息 | `hi.psndoc.BminfoVO` |
| `hi_psndoc_capa` | 员工能力素质 | `hi.psndoc.CapaVO` |
| `hi_psndoc_cert` | 身份证件 | `hi.psndoc.CertVO` |
| `hi_psndoc_ctrt` | 合同信息 | `hi.psndoc.CtrtVO` |
| `hi_psndoc_edu` | 学历信息 | `hi.psndoc.EduVO` |
| `hi_psndoc_enc` | 奖励情况 | `hi.psndoc.EncVO` |
| `hi_psndoc_enterqualcert` | 企业内部资质证书 | `hi.psndoc.EnterQualCertVO` |
| `hi_psndoc_family` | 家庭信息 | `hi.psndoc.FamilyVO` |
| `hi_psndoc_keypsn` | 关键人员历史信息 | `hi.psndoc.KeyPsnVO` |
| `hi_psndoc_langability` | 语言能力 | `hi.psndoc.LangAbilityVO` |
| `hi_psndoc_linkman` | 紧急联系人 | `hi.psndoc.LinkmanVO` |
| `hi_psndoc_nationduty` | 职业资格 | `hi.psndoc.NationDutyVO` |
| `hi_psndoc_othercert` | 其它证书 | `hi.psndoc.OtherCertVO` |
| `hi_psndoc_partylog` | 参加党派记录 | `hi.psndoc.PartyLogVO` |
| `hi_psndoc_psnchg` | 流动情况 | `hi.psndoc.PsnChgVO` |
| `hi_psndoc_pun` | 惩罚信息 | `hi.psndoc.PunVO` |
| `hi_psndoc_qulify` | 企业内部任职资格 | `hi.psndoc.QulifyVO` |
| `hi_psndoc_retire` | 离退待遇 | `hi.psndoc.RetireVO` |
| `hi_psndoc_speitem` | 专业技术 | `hi.psndoc.SpeItemVO` |
| `hi_psndoc_title` | 职称信息 | `hi.psndoc.TitleVO` |
| `hi_psndoc_train` | 人员教育培训 | `hi.psndoc.TrainVO` |
| `hi_psndoc_traincertfile` | 培训证书 | `hi.psndoc.TrainCertfileVO` |
| `hi_psndoc_trial` | 试用情况 | `hi.psndoc.TrialVO` |
| `hi_psndoc_wainfo` | 薪资信息 | `hi.psndoc.WainfoVO` |
| `hi_psndoc_work` | 履历记录 | `hi.psndoc.WorkVO` |
| `hi_psnjob` | 工作记录 | `hi.psndoc.PsnJobVO` |
| `hi_psnjob` | 兼职记录 | `hi.psndoc.PartTimeVO` |
| `hi_psnorg` | 组织关系 | `hi.psndoc.PsnOrgVO` |
| `hi_seqcontrol` | 逐级管控明细 | `hi.seqcontrol.SeqcontrolVO` |
| `hr_fte` | 全时当量 | `hi.fte.FteVO` |
| `hr_fte_rule` | 全时当量规则 | `hi.FteRuleVO` |
| `hr_rpt_auth` | 报表权限表 | `hi.repdef.RepAuthVO` |
| `hr_rpt_def` | 报表定义表 | `hi.repdef.RepDefVO` |
| `hr_rpt_filter` | 人员卡片取数条件 | `hi.repdef.RptFilterVO` |
| `hr_rpt_list_field` | 花名册显示字段 | `hi.repdef.RptListFieldVO` |
| `hr_rpt_list_sort` | 花名册排序字段 | `hi.repdef.RptListSortVO` |
| `hr_trnstype` | 异动类型 | `hi.trnstype.TrnstypeVO` |
| `hr_trnstype_flow` | 异动类型关联流程 | `hi.trnstype.TrnstypeFlowVO` |
| `hrcm_contmodel` | 合同模板 | `hrcm.templet.ContmodelVO` |
| `hrcm_termtype` | 合同期限类型 | `hr.termtype.TermTypeVO` |

### hrjf 组织机构管理（70 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `bd_defdoc` | 职责类型 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 接触对象 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 监督类型 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 职务称谓 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 职业 (自定义档案) | `bd.defdoc.DefdocVO` |
| `hr_relation_dept` | 部门委托关系 | `hr.managescope.HrRelationDeptVO` |
| `hr_relation_org` | 组织委托关系 | `hr.managescope.HrRelationOrgVO` |
| `hr_relation_psn` | 人员委托关系 | `hr.managescope.HrRelationPsnVO` |
| `om_booklet` | 说明书 | `om.booklet.BookletVO` |
| `om_depthistory` | 部门变更历史 | `om.hrdept.DeptHistoryVO` |
| `om_deptother` | 部门辅助信息 | `om.hrdept.DeptOtherVO` |
| `om_job` | 职务 | `om.job.JobVO` |
| `om_jobaim` | 职务工作目标 | `om.job.JobAimVO` |
| `om_jobcapa` | 职务能力素质指标 | `om.job.JobCapaVO` |
| `om_jobcontent` | 职务工作职责 | `om.job.JobContentVO` |
| `om_jobgrade` | 职级 | `om.job.JobGradeVO` |
| `om_jobgrade` | 职级 | `om.job.JobGradeVO` |
| `om_joblevel` | 职级 | `om.joblevelsys.JobLevelVO` |
| `om_joblevelsys` | 职级类别 | `om.joblevelsys.JobLevelSysVO` |
| `om_jobrank` | 职等 | `om.jobrank.JobRankVO` |
| `om_jobright` | 职务工作权限 | `om.job.JobRightVO` |
| `om_jobtype` | 职务类别 | `om.job.JobTypeVO` |
| `om_levelrelation` | 职级职等 | `om.joblevelsys.SubLevelRelationVO` |
| `om_levelrelation` | 职级职等 | `om.joblevelsys.SubLevelRelationVO` |
| `om_levelrelation` | 职级关系 | `om.joblevelsys.LevelRelationVO` |
| `om_levelrelation` | 职级职等 | `om.joblevelsys.SubLevelRelationVO` |
| `om_levelrelation` | 职级职等 | `om.joblevelsys.SubLevelRelationVO` |
| `om_levelrelation` | 职级职等 | `om.joblevelsys.SubLevelRelationVO` |
| `om_post` | 岗位基本信息 | `om.post.PostVO` |
| `om_post` | 基准岗位 | `om.post.PostStdVO` |
| `om_postbeftrain` | 岗前培训 | `om.post.PostBeftrainVO` |
| `om_postbeftrain` | 岗前培训 | `om.post.PostBeftrainVO` |
| `om_postcandidate` | 岗位继任人选 | `om.candidate.CandidateVO` |
| `om_postcapa` | 岗位能力素质指标 | `om.post.PostCapaVO` |
| `om_postcapa` | 岗位能力素质指标 | `om.post.PostCapaVO` |
| `om_postcont` | 岗位接触情况 | `om.post.PostContVO` |
| `om_postcont` | 岗位接触情况 | `om.post.PostContVO` |
| `om_postdevpro` | 岗位发展计划 | `om.post.PostDevproVO` |
| `om_postdevpro` | 岗位发展计划 | `om.post.PostDevproVO` |
| `om_postequipment` | 岗位办公设备 | `om.post.PostEquipmentVO` |
| `om_postequipment` | 岗位办公设备 | `om.post.PostEquipmentVO` |
| `om_postgoal` | 岗位工作目标 | `om.post.PostGoalVO` |
| `om_postgoal` | 岗位工作目标 | `om.post.PostGoalVO` |
| `om_posthistory` | 岗位变更历史 | `om.post.PostHistoryVO` |
| `om_postneed` | 岗位素质指标 | `om.post.PostNeedVO` |
| `om_postneed` | 岗位素质指标 | `om.post.PostNeedVO` |
| `om_postpower` | 岗位工作权限 | `om.post.PostPowerVO` |
| `om_postpower` | 岗位工作权限 | `om.post.PostPowerVO` |
| `om_postresp` | 岗位职责 | `om.post.PostRespVO` |
| `om_postresp` | 岗位职责 | `om.post.PostRespVO` |
| `om_postseries` | 岗位序列 | `om.post.PostSeriesVO` |
| `om_postsuperv` | 岗位监督 | `om.post.PostSupervVO` |
| `om_postsuperv` | 岗位监督 | `om.post.PostSupervVO` |
| `om_posttraining` | 在岗培训 | `om.post.PostTrainingVO` |
| `om_posttraining` | 在岗培训 | `om.post.PostTrainingVO` |
| `om_rankrelation` | 职等关系 | `om.joblevelsys.RankRelationVO` |
| `org_adminorg` | 行政组织 | `om.orginfo.HRAdminOrgVO` |
| `org_adminorg_v` | 行政组织版本信息 | `om.orginfo.HRAdminVersionVO` |
| `org_corp` | 公司HR | `om.orginfo.HRCorpVO` |
| `org_corp_v` | 公司版本信息HR | `om.orginfo.HRCorpVersionVO` |
| `org_dept` | HR部门 | `om.hrdept.HRDeptVO` |
| `org_dept_v` | HR部门版本信息 | `om.hrdept.HRDeptVersionVO` |
| `org_deptstru_v` | HR部门结构版本信息 | `om.hrdept.HRDeptStruVersionVO` |
| `org_deptstrumem_v` | HR部门结构成员版本信息 | `om.hrdept.HRDeptStruMemberVersionVO` |
| `org_hrorg` | 人力资源组织 | `om.orginfo.HRHROrgVO` |
| `org_hrorg_v` | 人力资源组织版本信息 | `om.orginfo.HRHROrgVersionVO` |
| `org_orgmanager` | 部门主管 | `om.hrdept.DeptManager` |
| `org_orgmanager` | 组织主管HR | `om.orginfo.HROrgManagerVO` |
| `org_orgs` | 组织信息HR | `om.orginfo.HROrgVO` |
| `org_orgs_v` | 组织版本信息HR | `om.orginfo.HROrgVersionVO` |

### hrjq 任职资格管理（23 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `bd_defdoc` | 任职级别 (自定义档案) | `bd.defdoc.DefdocVO` |
| `hi_psndoc` | 企业内部任职资格 | `jq.job.JqQulifyVO` |
| `hr_indi_cppe` | 任职指标 | `jq.indi.JQIndiVO` |
| `hr_indi_grade` | 任职指标等级 | `jq.indi.JQIndiGradeVO` |
| `hr_indi_type` | 任职指标类型 | `jq.indi.JQIndiTypeVO` |
| `hrjq_actpower` | 认证活动权限 | `jq.active.ActPowerVO` |
| `hrjq_authenact` | 认证活动 | `jq.active.AuthenActVO` |
| `hrjq_authenpsn` | 参评人员 | `jq.active.AuthenPsnVO` |
| `hrjq_authenreg` | 认证报名 | `jq.authenreg.AuthenRegVO` |
| `hrjq_authenscp` | 认证发布范围 | `jq.active.AuthenScpVO` |
| `hrjq_complain` | 认证申诉 | `jq.complain.ComplainVO` |
| `hrjq_filebill` | 材料填报单 | `jq.authenreg.FileBillVO` |
| `hrjq_filedetail` | 材料填报明细 | `jq.authenreg.FileDetailVO` |
| `hrjq_jobevastd` | 任职评价标准 | `jq.job.JobEvaStdVO` |
| `hrjq_joblevel` | 任职级别 | `jq.job.JobLevelVO` |
| `hrjq_jobtype` | 任职类别 | `jq.job.JobTypeVO` |
| `hrjq_judge` | 委员名单 | `jq.jury.JudgeVO` |
| `hrjq_judgelist` | 评委名单 | `jq.active.JudgeListVO` |
| `hrjq_jury` | 评审委员会 | `jq.jury.JuryVO` |
| `hrjq_record` | 认证结果 | `jq.record.RecordVO` |
| `hrjq_reviewform` | 任职资格评审单 | `jq.reviewform.ReviewFormVO` |
| `hrjq_reviewitem` | 任职资格评审项 | `jq.reviewform.ReviewItemVO` |
| `hrjq_reviewlv` | 审定级别 | `jq.jury.ReviewLvVO` |

### hrma hrma（1 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `hr_signin` | 移动签到 | `ma.signin.SigninVO` |

### hrp 人力资本规划（34 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `bd_defdoc` | 竞争对手 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 数据调查地区 (自定义档案) | `bd.defdoc.DefdocVO` |
| `hrp_IOModel` | 投入产出模型预测 | `hrp.forecast.IOModelVO` |
| `hrp_budget_amount` | 部门年度预算项目预算额 | `hrp.budgetmgt.BudgetAmountVO` |
| `hrp_budget_amount` | 单位年度预算项目预算额 | `hrp.budgetmgt.BudgetAmountVO` |
| `hrp_budget_amount` | 单位月度预算项目预算额 | `hrp.budgetmgt.BudgetAmountVO` |
| `hrp_budget_corpperiod` | 单位月度预算 | `hrp.waorgbudget.BudCorpmonthVO` |
| `hrp_budget_corpyear` | 单位预算 | `hrp.waorgbudget.BudCorpyearVO` |
| `hrp_budget_deptperiod` | 部门月度预算计划 | `hrp.wadeptbudget.BudDeptperiodVO` |
| `hrp_budget_deptyear` | 部门预算 | `hrp.wadeptbudget.BudDeptyearVO` |
| `hrp_budget_item` | 预算项目 | `hrp.budgetitem.BudgetItemVO` |
| `hrp_budget_item` | 预算项目档案 | `hrp.budgetitem.BudgetItemDocVO` |
| `hrp_budget_power` | 规划预算范围 | `hrp.budgetpower.BudgetPower` |
| `hrp_budget_reg` | 人员类别占编注册 | `hrp.budgetset.BudgetPsnTypeRegVO` |
| `hrp_deptbudget` | 部门编制 | `hrp.psndeptbudget.DeptBudgetVO` |
| `hrp_dimension` | 编制维度 | `hrp.budgetdimension.DimensionVO` |
| `hrp_dimension` | 编制维度档案 | `hrp.budgetdimensiondoc.DimensionDocVO` |
| `hrp_dimensiondef` | 编制维度子表 | `hrp.budgetdimension.DimensionDefVO` |
| `hrp_dimensiondef` | 编制维度档案子表 | `hrp.budgetdimensiondoc.DimensionDefDocVO` |
| `hrp_dimensioninfo` | 数据调查维度信息 | `hrp.research.DimensionInfoVO` |
| `hrp_itempower` | 预算项目权限 | `hrp.itempower.ItemPowerVO` |
| `hrp_orgbudget` | 单位编制 | `hrp.psnorgbudget.OrgBudgetVO` |
| `hrp_orgbudget_sub` | 组织分类编制 | `hrp.psnorgbudget.OrgBudgetSubVO` |
| `hrp_postbudget` | 岗位编制 | `hrp.psndeptbudget.PostBudgetVO` |
| `hrp_ratiomodel` | 人员配比模型预测 | `hrp.forecast.RatioModelVO` |
| `hrp_ratiomodelinfo` | 人员配比模型信息 | `hrp.forecast.RatioModelInfoVO` |
| `hrp_research` | 数据调查表 | `hrp.research.ResearchVO` |
| `hrp_researchinfo` | 数据调查项信息 | `hrp.research.ResearchInfoVO` |
| `hrp_researchitem` | 数据调查项目 | `hrp.researchitem.ResearchItemVO` |
| `hrp_totalmodel` | 人员总量预测 | `hrp.forecast.ForecastTotalVO` |
| `hrp_year` | 编制年度 | `hrp.budgetyear.BudgetYearVO` |
| `om_budget_type` | 编制分类 | `hrp.budgetset.BudgetTypeVO` |
| `om_orgbudget_power` | 组织编制设置权限 | `hrp.budgetset.OrgBudgetPowerVO` |
| `wa_budget_amount` | 部门月度预算项目预算额 | `hrp.budgetmgt.BudgetAmountVO` |

### hrpe 绩效管理（38 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `PE_SCO_EXTR` | 考核结果-加减分项 | `pe.scheme.evaobject.EvaResExtrScoreVO` |
| `bd_defdoc` | 考核人类别 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 加减分项目 (自定义档案) | `bd.defdoc.DefdocVO` |
| `hr_cppe_grade` | 评分规则等级 | `pe.bd.scorule.ScoRuleItemVO` |
| `hr_cppe_rule` | 评分规则 | `pe.bd.scorule.ScoRuleVO` |
| `hr_indi_cppe` | 绩效指标 | `pe.bd.indicator.IndicatorVO` |
| `hr_indi_type` | 指标类型 | `pe.bd.indicator.IndicatorTypeVO` |
| `pe_accredit_role` | 方案权限-角色 | `pe.scheme.def.SchEvaRoleVO` |
| `pe_accredit_user` | 方案权限-用户 | `pe.scheme.def.SchEvaUserVO` |
| `pe_collect_data` | 绩效数据采集表 | `pe.eva.CollectDataVO` |
| `pe_com_feedback` | 申诉反馈 | `pe.feedback.CommFeedbackVO` |
| `pe_com_interview` | 绩效面谈记录 | `pe.interview.CommInterviewVO` |
| `pe_com_sumup` | 绩效总结 | `pe.commsumup.CommSumupVO` |
| `pe_eva_appraiser` | 考核流程 | `pe.scheme.evaobject.AppraiserVO` |
| `pe_eva_appraiser_p` | 考核流程 | `pe.scheme.def.AppraiserPreVO` |
| `pe_eva_aprgau` | 填报审核流程 | `pe.scheme.evaobject.AprGauVO` |
| `pe_eva_aprgau_p` | 填报审核流程 | `pe.scheme.def.AprGauPreVO` |
| `pe_eva_aprrst` | 结果审核流程 | `pe.scheme.evaobject.AprRstVO` |
| `pe_eva_aprrst_p` | 结果审核流程 | `pe.scheme.def.AprRstPreVO` |
| `pe_eva_dist` | 强制分布 | `pe.scheme.dist.ForceDistVO` |
| `pe_eva_gatherlist` | 汇总清单 | `pe.scheme.def.EvaGatherListVO` |
| `pe_eva_gauge` | 考核量表 | `pe.scheme.def.EvaGaugeVO` |
| `pe_eva_group` | 对象组 | `pe.scheme.def.EvaGroupVO` |
| `pe_eva_objappindi` | 考核人考核指标 | `pe.scheme.evaobject.EvaObjAppIndiVO` |
| `pe_eva_object` | 考核对象 | `pe.scheme.evaobject.EvaObjectVO` |
| `pe_eva_report` | 进展报告 | `pe.report.ProgressReportVO` |
| `pe_eva_report_line` | 进展报告明细 | `pe.report.ProgressReportLineVO` |
| `pe_gauge` | 公共量表 | `pe.scheme.gauge.GaugeVO` |
| `pe_gauge_indi` | 量表指标 | `pe.scheme.gauge.GaugeIndiVO` |
| `pe_gauge_inditype` | 考核对象量表指标类型 | `pe.scheme.gauge.GaugeIndiTypeVO` |
| `pe_grade` | 考核等级 | `pe.bd.scograde.ScoreGradeVO` |
| `pe_grade_item` | 考核等级明细 | `pe.bd.scograde.ScoreGradeItemVO` |
| `pe_indi_getdata_set` | 指标跨方案取数设置 | `pe.scheme.gauge.GetDataSetVO` |
| `pe_keyevent` | 关键事件 | `pe.keyevent.KeyEventVO` |
| `pe_period` | 绩效期间明细 | `pe.bd.period.PeriodVO` |
| `pe_periodschema` | 绩效期间方案 | `pe.bd.period.PeriodSchemaVO` |
| `pe_relation` | 相对关系 | `pe.bd.RelationVO` |
| `pe_sch_eva` | 绩效方案 | `pe.scheme.def.SchEvaVO` |

### hrpub 基础设置（37 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `bd_defdoc` | 劳动者解除合同原因 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 证书等级 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_refinfo` | 参照信息 | `bd.ref.RefInfoVO` |
| `hr_cindex` | 能力素质指标 | `hr.competencyindex.CompetencyindexVO` |
| `hr_cindex_grade` | 能力素质指标等级 | `hr.competencyindex.CompetencyindexGradeVO` |
| `hr_cindex_type` | 能力素质指标类别 | `hr.competencyindex.CompetencyindexTypeVO` |
| `hr_coderule` | 编码规则 | `hr.certificatefile.CodeRuleVO` |
| `hr_cppe_grade` | 能力素质等级 | `cp.graderule.GradeVO` |
| `hr_cppe_rule` | 能力素质等级组 | `cp.graderule.GradeRuleVO` |
| `hr_ctffile` | 证书档案 | `hr.certificatefile.CtfFileVO` |
| `hr_ctfkind` | 证书类型 | `hr.certificatefile.CtfKindVO` |
| `hr_ctftype` | 证书类别 | `hr.certificate.CtfTypeVO` |
| `hr_dataintface_b` | 数据接口子表 | `hr.datainterface.FormatItemVO` |
| `hr_dataio_intface` | 数据接口格式 | `hr.datainterface.HrIntfaceVO` |
| `hr_formconfig` | 自定义表单 | `hr.tools.formconfig.FormConfigEntityVO` |
| `hr_globalcountry` | 国家地区 | `hr.globalapp.GlobalCountry` |
| `hr_ifsettop` | 标志行设置 | `hr.datainterface.IfsettopVO` |
| `hr_impl` | 开发接口实现 | `hr.devitf.DevItfImplVO` |
| `hr_impl_set` | 接口实现设置 | `hr.devitf.DevItfSetVO` |
| `hr_indi_cppe` | 能力素质指标 | `cp.cpindi.CPIndiVO` |
| `hr_indi_grade` | 能力素质指标等级 | `cp.cpindi.CPIndiGradeVO` |
| `hr_indi_type` | 能力素质指标类型 | `cp.cpinditype.CPIndiTypeVO` |
| `hr_infoitem_map` | 信息项对应 | `hr.infoset.InfoItemMapVO` |
| `hr_infoset` | 信息集 | `hr.infoset.InfoSetVO` |
| `hr_infoset_item` | 信息项 | `hr.infoset.InfoItemVO` |
| `hr_infoset_map` | 信息集对应 | `hr.infoset.InfoSetMapVO` |
| `hr_infoset_sort` | 信息集分类 | `hr.infoset.InfoSortVO` |
| `hr_itf` | 开发接口定义 | `hr.devitf.DevItfDefVO` |
| `hr_notice_item` | 通知模板项目 | `hr.notice.NoticeItemVO` |
| `hr_notice_receiver` | 消息默认接收人 | `hr.notice.NoticeReceiverVO` |
| `hr_notice_sort` | 通知模板类别 | `hr.notice.NoticeSortVO` |
| `hr_notice_templet` | 通知模板 | `hr.notice.NoticeTempletVO` |
| `hr_psnclinfoset` | 人员类别信息集设置子表 | `hr.psnclrule.PsnclinfosetVO` |
| `hr_psnclrule` | 人员类别规则设置主表 | `hr.psnclrule.PsnclruleVO` |
| `hr_trankunit` | 证书授予单位 | `hr.certificatefile.TrankUnitVO` |
| `hrcm_contmodel` | 合同模板 | `hrcm.templet.ContmodelVO` |
| `hrcm_termtype` | 合同期限类型 | `hr.termtype.TermTypeVO` |

### hrrm 招聘管理（55 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `bd_defdoc` | 人才类别 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 工作类型 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 测评阶段 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 测评结论 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 入职事项 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 招聘费用项目 (自定义档案) | `bd.defdoc.DefdocVO` |
| `rm_active` | 招聘活动 | `rm.active.ActiveVO` |
| `rm_channel` | 招聘渠道 | `rm.channel.ChannelVO` |
| `rm_channeltype` | 渠道类别 | `rm.channeltype.ChanneltypeVO` |
| `rm_checkin` | 报到管理 | `rm.checkin.CheckinVO` |
| `rm_checkinitem` | 报到事项 | `rm.checkin.CheckinItemVO` |
| `rm_cpmodel` | 职位能力素质 | `rm.job.RMCPModelVO` |
| `rm_demand` | 招聘需求 | `rm.demand.DemandVO` |
| `rm_email` | 收取简历邮箱 | `rm.email.ResumeEmailVO` |
| `rm_email_jobrule` | 邮箱职位规则 | `rm.email.` |
| `rm_email_loginfo` | 解析日志 | `rm.email.ResumeEmailLogVO` |
| `rm_evagrade` | 面试评价等级 | `rm.evaitem.EvaGradeVO` |
| `rm_evaitem` | 面试评价项目 | `rm.evaitem.EvaItemVO` |
| `rm_evatype` | 面试评价类别 | `rm.evaitem.EvaTypeVO` |
| `rm_fee` | 招聘费用 | `rm.active.ActiveFeeVO` |
| `rm_hire` | 录用管理 | `rm.hire.HireVO` |
| `rm_hire_body` | 录用子表 | `rm.hire.HireItemVO` |
| `rm_innerjob` | 内聘职位申请单 | `rm.innerjob.InnerJobVO` |
| `rm_insideplace` | 内聘发布地方 | `rm.publish.InsidePlaceVO` |
| `rm_interview` | 面试管理 | `rm.interview.InterviewVO` |
| `rm_intorule` | 人员转入规则 | `rm.intorule.IntoRuleVO` |
| `rm_intoruleitem` | 人员转入规则子表 | `rm.intorule.IntoRuleItemVO` |
| `rm_ivinter` | 协同面试官 | `rm.interview.IVInterviewerVO` |
| `rm_ivitem` | 面试评价项目 | `rm.interview.EvaluateItemVO` |
| `rm_ivplan` | 面试安排 | `rm.interview.InterviewPlanVO` |
| `rm_ivplan` | 面试安排 | `rm.interview.IVPlanVO` |
| `rm_job` | 招聘职位 | `rm.job.RMJobVO` |
| `rm_job_scheme` | 职位面试方案 | `rm.job.RMJobSchemeVO` |
| `rm_jobinfo` | 招聘活动职位 | `rm.active.ActiveJobVO` |
| `rm_jobinfo` | 招聘需求职位 | `rm.demand.DemandJobVO` |
| `rm_jobrule` | 简历抓取规则 | `rm.jobrule.RMJobRuleVO` |
| `rm_jobtype` | 招聘职位类别 | `rm.job.RMJobTypeVO` |
| `rm_psndoc` | 应聘人员信息 | `rm.psndoc.RMPsndocVO` |
| `rm_psndoc_cp` | 应聘人员能力素质 | `rm.psndoc.RMPsnCPVO` |
| `rm_psndoc_edu` | 应聘人员教育背景 | `rm.psndoc.RMEduVO` |
| `rm_psndoc_enc` | 应聘人员奖励情况 | `rm.psndoc.RMEncVO` |
| `rm_psndoc_eva` | 应聘人员测评记录 | `rm.psndoc.RMEvaVO` |
| `rm_psndoc_family` | 应聘人员家庭情况 | `rm.psndoc.RMFamilyVO` |
| `rm_psndoc_invest` | 应聘人员背景调查 | `rm.psndoc.RMInvestVO` |
| `rm_psndoc_job` | 应聘职位 | `rm.psndoc.RMPsnJobVO` |
| `rm_psndoc_lagability` | 应聘人员语言能力 | `rm.psndoc.RMLagabilityVO` |
| `rm_psndoc_part` | 应聘人员社会兼职 | `rm.psndoc.RMPartVO` |
| `rm_psndoc_project` | 应聘人员项目经历 | `rm.psndoc.RMProjectVO` |
| `rm_psndoc_spe` | 应聘人员专业技术情况 | `rm.psndoc.RMSpetechVO` |
| `rm_psndoc_train` | 应聘人员培训经历 | `rm.psndoc.RMTrainVO` |
| `rm_psndoc_work` | 应聘人员工作经历 | `rm.psndoc.RMPsnWorkVO` |
| `rm_publish` | 职位发布 | `rm.publish.PublishJobVO` |
| `rm_publishplace` | 发布地方 | `rm.publish.PublishPlaceVO` |
| `rm_webinfo` | 招聘网站 | `rm.webinfo.WebInfoVO` |
| `rm_weblog` | 上传下载记录 | `rm.weblog.WebLogVO` |

### hrrpt HR分析报表（4 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `bi_smart_def` | HR语义模型 | `smart.SmartDefVO` |
| `hr_freereport` | HR自由报表 | `hr.rpt.HRFreerepVO` |
| `hr_freereport_dir` | HR自由报表目录 | `hr.rpt.HRFreerepDirVO` |
| `md_module` | 元数据模块实体 | `nc.vohrrpt.mdmodule.mdModule` |

### hrss HR自助（3 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `SM_PUB_FILESYSTEM` | 文档节点 (自助) | `hrss.pub.FileNodeVO` |
| `hrss_psnmap` | 人力地图 | `hrss.pub.psnmap.PsnMapVO` |
| `hrss_setalter` | 自助信息变更记录 | `hrss.hi.setalter.HrssSetalterVO` |

### hrta 时间管理（63 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `bd_defdoc` | 考勤地点 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 班别模板分类 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 班别分类 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 签卡原因 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 临时卡号 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_teamcalendar` | 班组工作日历 | `ta.teamcalendar.TeamCalendarVO` |
| `bd_teamcalholiday` | 班组工作日历假日关联 | `ta.teamcalendar.TeamCalHoliday` |
| `bd_teamcalwt` | 班组工作日历工作时段 | `ta.teamcalendar.TeamWorkTimeVO` |
| `hrta_cardinfo` | 刷/签卡信息 | `nc.vohrta.onlyforviewdata.CardInfo` |
| `tbm_awayb` | 出差申请单子表 | `ta.away.AwaybVO` |
| `tbm_awayh` | 出差申请单主表 | `ta.away.AwayhVO` |
| `tbm_awayoff` | 销差申请单 | `ta.awayoff.AwayOffVO` |
| `tbm_awayreg` | 出差登记 | `ta.away.AwayRegVO` |
| `tbm_changeshiftb` | 调班申请单子表 | `ta.changeshift.ChangeShiftbVO` |
| `tbm_changeshifth` | 调班申请单主表 | `ta.changeshift.ChangeShifthVO` |
| `tbm_changeshiftreg` | 调班登记 | `ta.changeshift.ChangeShiftRegVO` |
| `tbm_daystat` | 考勤日报 | `ta.daystat.DayStatVO` |
| `tbm_daystatb` | 日报子表 | `ta.daystat.DayStatbVO` |
| `tbm_freefld` | 日月报预留字段 | `ta.item.FreeFldVO` |
| `tbm_holidayrule` | 假日规则 | `ta.holidayrule.HolidayRuleVO` |
| `tbm_importdata` | 刷卡数据导入 | `ta.importdata.ImportDataVO` |
| `tbm_item` | 考勤日月报项目 | `ta.item.ItemVO` |
| `tbm_itemcopy` | 考勤日月报项目实体部分 | `ta.item.ItemCopyVO` |
| `tbm_lateearly` | 手工考勤数据 | `ta.lateearly.LateEarlyVO` |
| `tbm_leaveb` | 休假申请单子表 | `ta.leave.LeavebVO` |
| `tbm_leavebalance` | 假期计算 | `ta.leavebalance.LeaveBalanceVO` |
| `tbm_leaveh` | 休假申请单 | `ta.leave.LeavehVO` |
| `tbm_leaveoff` | 销假申请单 | `ta.leaveoff.LeaveoffVO` |
| `tbm_leavereg` | 休假登记 | `ta.leave.LeaveRegVO` |
| `tbm_machineset` | 考勤机 | `ta.machineset.MachineVO` |
| `tbm_monthdetail` | 月报明细 | `ta.monthdetail.MonthDetailVO` |
| `tbm_monthstat` | 考勤月报 | `ta.monthstat.MonthStatVO` |
| `tbm_monthstatb` | 月报子表 | `ta.monthstat.MonthStatbVO` |
| `tbm_monthwork` | 月报出勤数据表 | `ta.monthstat.MonthWorkVO` |
| `tbm_overtimeb` | 加班申请单子表 | `ta.overtime.OvertimebVO` |
| `tbm_overtimegen` | 加班生成记录 | `ta.overtime.OvertimeGenVO` |
| `tbm_overtimeh` | 加班申请单主表 | `ta.overtime.OvertimehVO` |
| `tbm_overtimereg` | 加班登记 | `ta.overtime.OvertimeRegVO` |
| `tbm_period` | 考勤期间 | `ta.period.PeriodVO` |
| `tbm_psncalendar` | 员工工作日历 | `ta.psncalendar.PsnCalendarVO` |
| `tbm_psncalholiday` | 人员假日关联 | `ta.psncalendar.PsnCalHoliday` |
| `tbm_psncalwt` | 人员工作时间段 | `ta.psncalendar.PsnWorkTimeVO` |
| `tbm_psndoc` | 考勤档案 | `ta.psndoc.TBMPsndocVO` |
| `tbm_region` | 考勤区域 | `ta.timeregion.RegionVO` |
| `tbm_regionorg` | 关联业务单元 | `ta.timeregion.RegionOrgVO` |
| `tbm_regionset` | 范围设置 | `ta.timeregion.RegionSettingVO` |
| `tbm_shutdownreg` | 停工待料 | `ta.shutdown.ShutdownRegVO` |
| `tbm_signb` | 签卡申请单子表 | `ta.signcard.SignbVO` |
| `tbm_signh` | 签卡申请单主表 | `ta.signcard.SignhVO` |
| `tbm_signreg` | 签卡登记 | `ta.signcard.SignRegVO` |
| `tbm_syscard` | 系统签卡表 | `ta.syscard.SysCardVO` |
| `tbm_tempcard` | 临时卡 | `ta.tempcard.TempCardVO` |
| `tbm_timedata` | 机器考勤数据 | `ta.dataprocess.TimeDataVO` |
| `tbm_timeitem` | 出差类别 | `ta.timeitem.AwayTypeVO` |
| `tbm_timeitem` | 休假类别 | `ta.timeitem.LeaveTypeVO` |
| `tbm_timeitem` | 加班类别 | `ta.timeitem.OverTimeTypeVO` |
| `tbm_timeitem` | 停工待料类别 | `ta.timeitem.ShutDownTypeVO` |
| `tbm_timeitemcopy` | 出差类别copy | `ta.timeitem.AwayTypeCopyVO` |
| `tbm_timeitemcopy` | 休假类别copy | `ta.timeitem.LeaveTypeCopyVO` |
| `tbm_timeitemcopy` | 加班类别copy | `ta.timeitem.OverTimeTypeCopyVO` |
| `tbm_timeitemcopy` | 停工待料类别copy | `ta.timeitem.ShutDownTypeCopyVO` |
| `tbm_timerule` | 考勤规则 | `ta.timerule.TimeRuleVO` |
| `tbm_vieworder` | 显示设置 | `ta.vieworder.ViewOrderVO` |

### hrtrn 人员变动管理（6 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `hi_partapply` | 兼职申请单 | `trn.partmng.PartApplyVO` |
| `hi_psntranster` | 人员调动 | `trn.transfer.PsntransterVO` |
| `hi_reg_itemset` | 转正项目定义 | `trn.regitem.TrnRegItemVO` |
| `hi_regapply` | 转正申请 | `trn.regmng.RegapplyVO` |
| `hi_stapply` | 调配/离职申请单 | `trn.transmng.StapplyVO` |
| `hi_stbill_itemset` | 调配、离职项目定义 | `trn.transitem.TrnTransItemVO` |

### hrwa 薪酬管理（55 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `bd_defdoc` | 薪资变动原因 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 薪资项目分类 (自定义档案) | `bd.defdoc.DefdocVO` |
| `hi_psndoc_wa` | 员工调薪计算结果表 | `wa.paydata.PsndocWaVO` |
| `hi_psndoc_wadoc` | 薪资变动情况 | `hi.wadoc.PsndocWadocVO` |
| `hr_vochag_default` | VO交换处理默认值 | `wa.conversion.VochagDefaultVO` |
| `wa_amobase` | 计提基数 | `wa.amoscheme.AmobaseVO` |
| `wa_amocond` | 分摊条件 | `wa.amoscheme.AmoCondVO` |
| `wa_amofactor` | 影响因素 | `wa.amoscheme.AmoFactorVO` |
| `wa_amoscheme` | 分摊方案 | `wa.amoscheme.AmoSchemeVO` |
| `wa_assigncls` | 分配薪资类别 | `wa.category.AssignclsVO` |
| `wa_class_fiorg` | 方案财务关联 | `wa.category.WaFiorgVO` |
| `wa_class_print` | 薪资方案打印模板 | `wa.classprint.WaClassPrintVO` |
| `wa_classitem` | 薪资发放项目 | `wa.classitem.WaClassItemVO` |
| `wa_clectitem_b` | 汇总子项目 | `wa.taxrptitem.ClectItemBVO` |
| `wa_collectitem` | 汇总项 | `wa.taxrptitem.CollectItemVO` |
| `wa_data` | 薪资发放表 | `wa.paydata.DataVO` |
| `wa_data` | 薪资档案 | `wa.payfile.PayfileVO` |
| `wa_data` | 薪资发放数据 | `wa.payslip.WaDataVO` |
| `wa_datapool` | 薪资分摊 | `wa.datainterface.DataPoolVO` |
| `wa_datapool_b` | 薪资分摊子表 | `wa.datainterface.DataPoolBVO` |
| `wa_datas` | 薪资个别调整表 | `wa.paydata.DataSVO` |
| `wa_grade` | 薪资标准类别表 | `wa.grade.WaGradeVO` |
| `wa_inludeclass` | 薪资方案父子关系表 | `wa.category.WaInludeclassVO` |
| `wa_item` | 公共薪资项目 | `wa.item.WaItemVO` |
| `wa_itempower` | 薪资项目权限 | `wa.itempower.ItemPowerVO` |
| `wa_payroll` | 薪资发放申请单 | `wa.payroll.PayrollVO` |
| `wa_payroll` | 发放申请单子表 | `wa.payroll.PayrollBVO` |
| `wa_payslip` | 薪资条 | `wa.payslip.PayslipVO` |
| `wa_payslip_item` | 薪资条项目明细 | `wa.payslip.PayslipItemVO` |
| `wa_period` | 薪资期间 | `wa.period.PeriodVO` |
| `wa_periodscheme` | 薪资期间方案 | `wa.period.PeriodSchemeVO` |
| `wa_periodstate` | 薪资结账表 | `wa.periodsate.WaPeriodstateVO` |
| `wa_prmlv` | 薪资级别表 | `wa.grade.WaPrmlvVO` |
| `wa_psnappaprove` | 定调资申请单 | `wa.adjust.PsnappaproveVO` |
| `wa_psnappaprove_b` | 定调资申请单子表 | `wa.adjust.PsnappaproveBVO` |
| `wa_psnhi` | 薪资员工信息属性表 | `wa.grade.WaPsnhiVO` |
| `wa_psntax` | 扣缴个人所得税报告表 | `wa.psntax.PsntaxVO` |
| `wa_rangetable` | 计薪规则 | `hrwa.warangetable.WaRangetable` |
| `wa_redata` | 薪资补发 | `wa.repay.ReDataVO` |
| `wa_refcategory` | 参照种类 | `hrwa.refcategory.RefCategory` |
| `wa_seclv` | 薪资档别表 | `wa.grade.WaSeclvVO` |
| `wa_tax` | 所得税申报 | `wa.tax.WaTaxVO` |
| `wa_tax_relat` | 个税项目设置 | `wa.psntax.TaxRelatVO` |
| `wa_taxbase` | 税率表计税基数 | `wa.taxrate.TaxBaseVO` |
| `wa_taxforecast` | 个税测算结果 | `wa.taxforecast.TaxForecastVO` |
| `wa_taxgroup` | 合并计税组 | `wa.taxgroup.WaTaxGroupVO` |
| `wa_taxgrpmember` | 合并计税组成员 | `wa.taxgroup.WaTaxGrpMemberVO` |
| `wa_taxitem` | 所得税项目设置 | `wa.psntax.TaxItemVO` |
| `wa_taxrpt` | 个税申报表 | `wa.taxreport.TaxReportVO` |
| `wa_taxrptitem` | 个税申报项目 | `wa.taxrptitem.TaxRptItemVO` |
| `wa_taxtable` | 税率表子表 | `wa.taxrate.TaxTableVO` |
| `wa_unitctg` | 汇总薪资类别 | `wa.unitclass.UnitClassVO` |
| `wa_waclass` | 薪资方案 | `wa.category.WaClassVO` |
| `wa_wageform` | 薪资规则表主表 | `wa.rule.WageformVO` |
| `wa_wageformdet` | 薪资规则表子表 | `wa.rule.WageformdetVO` |

## 项目管理（14 模块，167 表）

### pbm 预算管理（13 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `pm_budget` | 项目成本预算 | `pbm.budget.BudgetHeadVO` |
| `pm_budget_exe` | 预算执行单明细 | `pbm.budgetexe.BudgetExeBodyVO` |
| `pm_budgetadd` | 项目预算调整 | `pbm.budgetadd.BudgetAddHeadVO` |
| `pm_budgetadd_b` | 项目预算追加明细 | `pbm.budgetadd.BudgetAddBodyVO` |
| `pm_budgetbegining` | 预算执行期初 | `pbm.budgetbegining.BudgetBeginingHeadVO` |
| `pm_budgetbegining_b` | 预算执行期初子表 | `pbm.budgetbegining.BudgetBeginingBodyVO` |
| `pm_budgetcbs` | CBS预算明细 | `pbm.budget.BudgetCBSBodyVO` |
| `pm_budgetfactor` | 核算要素预算明细 | `pbm.budget.BudgetFactorBodyVO` |
| `pm_mater_stock_log` | 项目物资备料日志表 | `pbm.materialstocklog.MaterialStockLogVO` |
| `pm_procostcard` | 项目费用记录卡 | `pbm.procostcard.ProCostCardHeadVO` |
| `pm_procostcard_b` | 项目费用记录卡子表 | `pbm.procostcard.ProCostCardBodyVO` |
| `pmbd_budgetctrl` | 预算控制设置 | `pbm.budgetctrl.BudgetCtrlHeadVO` |
| `pmbd_budgetctrl_b` | 预算控制设置子表 | `pbm.budgetctrl.BudgetCtrlBodyVO` |

### pd 工程基础数据（33 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `bd_teamcalendar` | 轮班生成维护 | `pd.shiftdetail.entity.TeamCalendarVO` |
| `mm_mpoqs` | 单据交易类型配置 | `pd.mpobjqryscheme.entity.MpoqsHeadVO` |
| `mm_mpoqs_b` | 单据交易类型配置表体明细 | `pd.mpobjqryscheme.entity.MpoqsBodyVO` |
| `pd_meainstrucl` | 计量器具级别 | `pd.pd0318.entity.MscVO` |
| `pd_meastool` | 计量器具维护 | `pd.pd0320.entity.MeasToolVO` |
| `pd_mooper` | 订单作业方式定义 | `pd.mooper.entity.MooperVO` |
| `pd_mpobj` | 计划对象信息 | `pd.mpplatform.entity.MPObj` |
| `pd_mpoqstree` | 单据交易类型配置树 | `pd.mpobjqryscheme.entity.MpoqsTreeVO` |
| `pd_orgpdrate` | 工厂生产比例 | `pd.orgproductionrate.entity.OrgProductionRateVO` |
| `pd_orgpdrate_b` | 工厂生产比例明细 | `pd.orgproductionrate.entity.OrgProductionRateDetailVO` |
| `pd_pb` | 生产批次档案 | `pd.pd0332.entity.PbVO` |
| `pd_plantemplate` | 计划模板定义 | `pd.pd0304.PlanTemplateVO` |
| `pd_plantype` | 计划类型设置 | `pd.pd0306.PlanTypeVO` |
| `pd_ppresp` | 岗位设置 | `pd.basedoc.ppresp.entity.PPRespHeadVO` |
| `pd_ppresp_b` | 岗位设置子表 | `pd.basedoc.ppresp.entity.PPRespItemVO` |
| `pd_ppresp_t` | 岗位设置附表 | `pd.basedoc.ppresp.entity.PPRespTVO` |
| `pd_pr` | 计划委托关系 | `pd.planrelation.entity.PlanRelationVO` |
| `pd_pr_marbasclass` | 计划委托关系物料分类明细 | `pd.planrelation.entity.PRMarBasClassVO` |
| `pd_pr_stockorg` | 计划委托关系库存组织明细 | `pd.planrelation.entity.PRStockOrgVO` |
| `pd_prodlinereldef` | 生产线关系定义 | `pd.prodlinereldef.entity.ProdLineRelDefHVO` |
| `pd_prodlinereldef_b` | 生产线关系明细 | `pd.prodlinereldef.entity.ProdLineRelDefBVO` |
| `pd_shift` | 轮班生成维护条件 | `pd.shiftdetail.entity.TeamCalendarHeadVO` |
| `pd_shiftdef` | 轮班制度定义 | `pd.shiftdef.entity.LbdyHeadVO` |
| `pd_shiftdef_b` | 轮班制度定义明细 | `pd.shiftdef.entity.LbdyItemVO` |
| `pd_wk` | 工作中心生产档案 | `pd.pd0404.entity.WkVO` |
| `pd_wk_prodinv` | 物料生产线 | `pd.pd0408.entity.MaterProHeadVO` |
| `pd_wk_prodinv` | 物料生产线明细 | `pd.pd0408.entity.MaterProBodyVO` |
| `pd_wk_prodinv` | 生产线物料 | `pd.pd0404.entity.WkProdinvVO` |
| `pd_wk_repltime` | 换产时间 | `pd.pd0404.entity.WkRepltimeVO` |
| `pd_wk_subst` | 替代工作中心 | `pd.pd0404.entity.WkSubstVO` |
| `pd_wk_wip` | 工作中心线上仓 | `pd.pd0404.entity.WkWipVO` |
| `pd_wkg` | 工作中心组 | `pd.wk.wkg.entity.WkgHeadVO` |
| `pd_wkg_mar` | 物料及物料分类 | `pd.wk.wkg.entity.WkgItemMarVO` |

### phm 前期管理（5 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `pm_approveresult` | 批复结果 | `phm.approveresult.ApproveResultHeadVO` |
| `pm_feasiblity` | 可行性研究报告 | `phm.feasiblityreport.FeasiblityReportHeadVO` |
| `pm_permitregister` | 许可登记 | `phm.permitregister.PermitregisterHeadVO` |
| `pm_projectproposal` | 项目建议书 | `phm.projectproposal.ProjectProposalHeadVO` |
| `pm_projectregister` | 项目登记 | `phm.projectregister.ProjectRegisterHeadVO` |

### pim 立项管理（4 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `bd_project` | 项目 (项目管理) | `pim.project.ProjectHeadVO` |
| `bd_project_b` | 项目 | `pim.project.ProjectBodyVO` |
| `pm_projectbuild` | 立项审批 | `ppm.projectbuild.ProjectBuildHeadVO` |
| `pm_projectproduct` | 项目产出物 | `pim.projectproduct.ProjectProductVO` |

### pma 决算及转固（8 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `pm_finalflag` | 决算标志 | `pbm.finalflag.FinalFlagVO` |
| `pm_proadapt` | 产出物价值调整单 | `ppm.productadapt.ProAdaptHeadVO` |
| `pm_proadapt_b` | 产出物价值调整单子表 | `ppm.productadapt.ProAdaptBodyVO` |
| `pm_projectfinal` | 项目决算单 | `pbm.projectfinal.ProjectFinalHeadVO` |
| `pm_projectfinal_b` | 决算单明细 | `pbm.projectfinal.ProjectFinalBodyVO` |
| `pm_projectfinish` | 项目结项单 | `ppm.projectfinish.ProjectFinishHeadVO` |
| `pm_protranfacard` | 产出物交付单 | `ppm.producttranfacard.ProTranFaHeadVO` |
| `pm_protranfacard_b` | 产出物交付单子表 | `ppm.producttranfacard.ProTranFaBodyVO` |

### pmbd 基础设置（20 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `bd_projectclass` | 项目类型 (项目管理) | `pmbd.projecttype.ProjectTypeHeadVO` |
| `bd_projectclass_b` | 项目类型子表 | `pmbd.projecttype.ProjectTypeBodyVO` |
| `pm_acceptcheck` | 检查项 | `pmbd.acceptcheck.AcceptCheckVO` |
| `pm_acceptchecktype` | 检查项分类 | `pmbd.acceptchecktype.AcceptCheckTypeVO` |
| `pm_checkdatalist` | 资料清单 | `pmbd.datalist.CheckDataListVO` |
| `pm_checkreq` | 检查项 | `pmbd.checkrequest.CheckReqVO` |
| `pm_checkrequest` | 检查标准 | `pmbd.checkrequest.CheckReqHeadVO` |
| `pm_checkstandardclassify` | 检查标准分类 | `pmbd.checkstandardclassify.CheckstandardclassifyVO` |
| `pm_datalist` | 资料清单 | `pmbd.checkrequest.DataListVO` |
| `pm_eps` | 企业项目结构 (项目管理) | `pmbd.eps.EpsVO` |
| `pm_outcometype` | 产出物类型 | `pmbd.outcometype.OutcomeTypeVO` |
| `pm_projectstate` | 项目状态 | `pmbd.projectstate.ProjectStateVO` |
| `pm_servprice` | 外包服务价目表 | `pmbd.servprice.ServPriceHeadVO` |
| `pm_servprice_b` | 服务价表明细 | `pmbd.servprice.ServPriceBodyVO` |
| `pm_tansirule` | 状态转换规则 | `pmbd.pmtransirule.TransiRuleHeadVO` |
| `pm_tansirule_cha` | 状态变化设置 | `pmbd.pmtransirule.TransiRuleChaVO` |
| `pm_tansirule_msg` | 消息接收设置 | `pmbd.pmtransirule.TransiRuleMsgVO` |
| `pm_tansirule_sel` | 项目状态选择 | `pmbd.pmtransirule.TransiRuleSelVO` |
| `pm_transtype` | 交易类型扩展 | `pm.transtype.TransTypeExtendVO` |
| `pmbd_messagenote` | 消息条目 | `pmbd.pmmessagenote.MessageNoteVO` |

### pmcost 成本管理（3 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `pm_costtransfer` | 成本转移单 | `pmcost.costtransfer.CostTransferHeadVO` |
| `pm_transin` | 转入项目 | `pmcost.costtransfer.TransinProVO` |
| `pm_transout` | 转出项目 | `pmcost.costtransfer.TransoutProVO` |

### pmf 竣工管理（7 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `pm_check_goal` | 验收资料清单 | `ppm.projectcheck.DataGoalVO` |
| `pm_check_head` | 项目验收报告 | `ppm.projectcheck.ProjectCheckHeadVO` |
| `pm_check_issue` | 问题整改情况 | `ppm.projectcheck.LeaveIssueVO` |
| `pm_check_item` | 验收检查项 | `ppm.projectcheck.CheckItemVO` |
| `pm_check_trans` | 项目产出物 | `ppm.projectcheck.ProductTransferVO` |
| `pm_checker` | 验收人 | `ppm.projectcheck.CheckerVO` |
| `pm_checkobject` | 验收对象 | `ppm.projectcheck.CheckObjectVO` |

### pmfile 文档管理（3 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `pm_billdoc` | 单据归档设置 | `pmfile.billdocsetting.BillDocSettingVO` |
| `pm_doccenter` | 文档中心 | `pmfile.documentcenter.DocumentCenterVO` |
| `pm_doctype` | 文档分类 | `pmfile.documenttype.DocumentTypeVO` |

### pminv 投资计划（3 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `pm_yearplan` | 年度投资计划 | `pbm.yearplan.YearPlanHeadVO` |
| `pm_yearplan_b` | 年度投资计划明细 | `pbm.yearplan.YearPlanBodyVO` |
| `pm_yearplanpromap` | 年度计划与项目关联表 | `pbm.yearplan.YearPlanProMapHeadVO` |

### pmr 物资及服务（7 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `pm_mateplanadd` | 物资及服务需求追加单/调价单 | `pbm.materialplanadd.MaterialPlanAddHeadVO` |
| `pm_mateplanadd_b` | 物资及服务需求追加单子表 | `pbm.materialplanadd.MaterialPlanAddBodyVO` |
| `pm_mater_plan` | 物资及服务需求单 | `pbm.materialplan.MaterialPlanHeadVO` |
| `pm_mater_plan_b` | 物资及服务需求单子表 | `pbm.materialplan.MaterialPlanBodyVO` |
| `pm_mater_stock` | 物资备料表 | `pbm.materialstock.MaterialStockVO` |
| `pm_materialnumctrl` | 物资控制设置 | `pbm.materialnumctrl.MaterialnumctrlVO` |
| `pm_materialservmap` | 物资服务对照表 | `pmbd.materialservmap.MaterialServMapVO` |

### pmsch 进度管理（19 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `pm_compworkfill` | 指标填报 | `ppm.compworkfill.CompWorkFillHeadVO` |
| `pm_compworkfill_b` | 指标填报子表 | `ppm.compworkfill.CompWorkFillBodyVO` |
| `pm_indexplan` | 指标计划 | `ppm.indexplan.IndexPlanHeadVO` |
| `pm_indexplan_b` | 指标计划明细 | `ppm.indexplan.IndexPlanBodyVO` |
| `pm_indextemplet` | 指标模板 | `pmbd.indextemplet.IndexTempletHeadVO` |
| `pm_indextemplet_b` | 指标模板明细 | `pmbd.indextemplet.IndexTempletBodyVO` |
| `pm_measureindex` | 计量指标 | `pmbd.measureindex.MeasureIndexVO` |
| `pm_milestone` | 关键里程碑 | `pmbd.keymilestone.MilestoneVO` |
| `pm_statefill` | 状态报告单 | `ppm.statefill.StateFillHeadVO` |
| `pm_statefill_b` | 状态报告单子表 | `ppm.statefill.StateFillBodyVO` |
| `pm_taskschedule` | 任务进度填报单 | `ppm.schedulefill.TaskScheduleHeadVO` |
| `pm_taskschedule_b` | 进度执行工作台子表 | `ppm.schedulefill.TaskScheduleBodyVO` |
| `pm_wbs` | 计划工作台 | `ppm.wbs.WbsHeadVO` |
| `pm_wbs_prefix` | 前置任务 | `ppm.wbs.WbsPrefixVO` |
| `pm_wbs_statedrive` | 状态驱动 | `ppm.wbs.StatusDriveVO` |
| `pm_wbst_prefix_bs` | 前置任务 | `pmbd.wbstemplet.WbsPrefixVO` |
| `pm_wbst_statdrv_bs` | 状态驱动 | `pmbd.wbstemplet.StatusDriveVO` |
| `pm_wbstemplet` | WBS模板 | `pmbd.wbstemplet.WbsTempletHeadVO` |
| `pm_wbstemplet_b` | WBS模板任务 | `pmbd.wbstemplet.WbsTempletBodyVO` |

### pmsite 现场管理（8 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `pm_alter` | 变更单 | `ppm.alter.AlterHeadVO` |
| `pm_alter_b` | 变更单子表 | `ppm.alter.AlterBodyVO` |
| `pm_alterlevel` | 变更级别 | `pmbd.alterlevel.AlterLevelVO` |
| `pm_repeatwork` | 复工单 | `ppm.repeatwork.RepeatWorkHeadVO` |
| `pm_startreport` | 开工单 | `ppm.startreport.StartReportHeadVO` |
| `pm_startreport_b` | 开工单子表 | `ppm.startreport.StartReportBodyVO` |
| `pm_stopwork` | 停工单 | `ppm.stopwork.StopWorkHeadVO` |
| `pmbd_altercategory` | 变更类别 | `pmbd.altercategory.AlterCategoryVO` |

### pqm 项目质量管理（34 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `pm_assessclass` | 评核项分类 | `pqm.assessmentclass.AssessclassmentVO` |
| `pm_compevaluate` | 综合评核单 | `pqm.compevaluate.CompEvaluateHeadVO` |
| `pm_compevaluate_b` | 综合评核单表体权重方案 | `pqm.compevaluate.CompEvaluateEvaluatePlanVO` |
| `pm_compevaluate_c` | 质量评核 | `pqm.compevaluate.CompEvaluateQualityEvaluateVO` |
| `pm_evaluateitem` | 评核项 | `pqm.evaluateitem.EvaluateItemVO` |
| `pm_evaluateplan` | 权重方案 | `pqm.evaluateplan.EvaluatePlanHeadVO` |
| `pm_evaluateplan_b` | 权重方案表体 | `pqm.evaluateplan.EvaluatePlanBodyVO` |
| `pm_proaccept` | 问题验收单 | `pqm.problemaccept.ProblemAcceptHeadVO` |
| `pm_proaccept_dut` | 表体-问题责任 | `pqm.problemaccept.ProblemDutyVO` |
| `pm_proaccept_res` | 表体-处理结果 | `pqm.problemaccept.ResultVO` |
| `pm_problem` | 问题记录 | `pqm.problem.ProblemHeadVO` |
| `pm_problem_a` | 原因分析 | `pqm.problem.ProblemReasonBodyVO` |
| `pm_problem_f` | 问题特征 | `pqm.problem.ProblemFeatureBodyVO` |
| `pm_problemreason` | 问题原因 | `pqm.problemreason.ProblemReasonVO` |
| `pm_qcplan` | 质检计划单 | `pqm.qualityplan.QualityPlanHeadVO` |
| `pm_qcplan_b` | 质检计划表体 | `pqm.qualityplan.QualityPlanBodyVO` |
| `pm_qcrecord` | 质检记录 | `pqm.qualityrecord.QualityRecordHeadVO` |
| `pm_qctype` | 质检类型 | `pqm.qualitychecktype.QualityCheckTypeVO` |
| `pm_qualcheck_item` | 检查项 | `pqm.qualitypatrol.QualCheckItemVO` |
| `pm_qualissue` | 问题整改 | `pqm.qualitypatrol.QualIssueVO` |
| `pm_qualityevaluate` | 质量评核单 | `pqm.qualityevaluate.QualityEvaluateHeadVO` |
| `pm_qualityevaluate_b` | 质量评核单表体 | `pqm.qualityevaluate.QualityEvaluateBodyVO` |
| `pm_qualitypatrol` | 质量巡查 | `pqm.qualitypatrol.QualityPatrolHeadVO` |
| `pm_qualpatroler` | 检查人 | `pqm.qualitypatrol.QualPatrolerVO` |
| `pm_scoredef` | 评分结论 | `pqm.scoredefinition.ScoreDefinitionVO` |
| `pm_scoresection` | 评分规则 | `pqm.scoresection.ScoreSectionHeadVO` |
| `pm_scoresection_b` | 评分规则表体 | `pqm.scoresection.ScoreSectionBodyVO` |
| `pm_scorestandard` | 评核标准 | `pqm.scorestandard.ScoreStandardHeadVO` |
| `pm_scorestandard_b` | 评核标准表体 | `pqm.scorestandard.ScoreStandardBodyVO` |
| `pm_scorestandardclass` | 评核标准分类 | `pqm.scorestandardclass.ScorestandardclassVO` |
| `pm_securitypatrol` | 安全巡查 | `pqm.securitypatrol.SecurityPatrolHeadVO` |
| `pm_sp_checkItem` | 检查项 | `pqm.securitypatrol.CheckItemVO` |
| `pm_sp_checker` | 检查人 | `pqm.securitypatrol.CheckerVO` |
| `pm_sp_issue` | 问题整改 | `pqm.securitypatrol.IssueVO` |

## 基础平台（22 模块，979 表）

### baseapp baseapp（168 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `bd_address` | 地址簿 | `bd.address.AddressVO` |
| `bd_billtype` | 单据类型 | `pub.billtype.BilltypeVO` |
| `bd_countryzone` | 国家地区 | `bd.countryzone.CountryZoneVO` |
| `bd_defdoc` | 自定义档案 | `bd.defdoc.DefdocVO` |
| `bd_defdoclist` | 自定义档案列表 | `bd.defdoc.DefdoclistVO` |
| `bd_errorlog` | 异常日志 | `bd.errorlog.ErrorLogVO` |
| `bd_errormsg` | 异常信息 | `bd.errorlog.ErrorMsgVO` |
| `bd_formatdoc` | 数据格式 | `bd.format.FormatDocVO` |
| `bd_industry` | 行业目录 | `bd.industry.IndustryVO` |
| `bd_linkman` | 联系人 | `bd.linkman.LinkmanVO` |
| `bd_mode_all` | 全部管控模式 | `bd.config.BDModeVO` |
| `bd_mode_selected` | 当前管控模式 | `bd.config.BDModeSelectedVO` |
| `bd_psncl` | 人员类别 | `bd.psn.PsnClVO` |
| `bd_psndoc` | 人员基本信息 | `bd.psn.PsndocVO` |
| `bd_psnidtype` | 证件类别 | `bd.psnid.PsnIdtypeVO` |
| `bd_psnjob` | 人员工作信息 | `bd.psn.PsnjobVO` |
| `bd_region` | 行政区划 | `bd.region.RegionVO` |
| `bd_timezone` | 时区 | `bd.timezone.TimezoneVO` |
| `bd_uniquerule` | 档案配置_档案唯一性规则 | `bd.config.BDUniqueruleVO` |
| `bd_uniquerule_item` | 档案配置_档案唯一性规则属性项 | `bd.config.BDUniqueruleItemVO` |
| `bd_urc_validator` | 档案配置_档案唯一性规则校验器工厂 | `bd.config.BDUniqueruleValidatorVO` |
| `bd_userdefitem` | 用户定义属性 | `bd.userdefrule.UserdefitemVO` |
| `bd_userdefrule` | 用户定义属性组 | `bd.userdefrule.UserdefruleVO` |
| `bd_userdefruleref` | 用户定义属性组引用 | `bd.userdefrule.UserdefrulerefVO` |
| `dap_dapsystem` | 模块信息 | `sm.funcreg.ModuleVO` |
| `md_class` | 实体 | `nc.md.model.impl.BusinessEntity` |
| `md_property` | 实体属性 | `nc.md.persist.designer.vo.PropertyVO` |
| `om_job` | 人力资源管理_职务 | `org.JobVO` |
| `om_jobtype` | 人力资源管理_职务类别 | `org.JobTypeVO` |
| `om_post` | 人力资源管理_岗位 | `org.PostVO` |
| `om_postseries` | 人力资源管理_岗位序列 | `org.PostSeriesVO` |
| `org_associateattr` | 组织关系_组织关系类型_业务属性 | `org.orgmodel.AssociateAttrVO` |
| `org_associatedef` | 组织关系_组织关系类型_默认值属性 | `org.orgmodel.AssociateDefVO` |
| `org_associateent` | 组织关系_组织关系类型_关联实体 | `org.orgmodel.AssociateEntityVO` |
| `org_associaterule` | 组织关系_组织关系类型_关系规则 | `org.orgmodel.AssociateRuleVO` |
| `org_brsmember` | 组织结构_业务汇报关系成员 | `corg.BusiReportStruMemberVO` |
| `org_brsmember` | 组织结构_业务汇报关系成员含编码名称 | `corg.BusiReportStruMemberWithCodeNameVO` |
| `org_busireportstru` | 组织结构_业务汇报关系 | `corg.BusiReportStruVO` |
| `org_datavalidator` | 组织_组织数据校验服务 | `org.orgmodel.OrgDataValidatorVO` |
| `org_dept` | 组织_部门 | `org.DeptVO` |
| `org_dept_v` | 组织_部门版本信息 | `vorg.DeptVersionVO` |
| `org_deptstru_v` | 组织结构_部门结构版本信息 | `vorg.DeptStruVersionVO` |
| `org_deptstrumem_v` | 组织结构_部门结构成员版本信息 | `vorg.DeptStruMemberVersionVO` |
| `org_group` | 组织_集团 | `org.GroupVO` |
| `org_memberorg` | 成员组织 | `corg.MemberOrgVO` |
| `org_operate` | 组织关系_操作 | `org.orgmodel.OperateVO` |
| `org_orgmanager` | 组织其它_组织主管 | `org.OrgManagerVO` |
| `org_orgs` | 组织 | `org.OrgVO` |
| `org_orgs_v` | 组织_版本信息 | `vorg.OrgVersionVO` |
| `org_orgtype` | 组织其它_组织类型 | `org.orgmodel.OrgTypeVO` |
| `org_ot_rule` | 组织关系_组织类型规则 | `org.orgmodel.OrgTypeRuleVO` |
| `org_ot_ruletype` | 组织关系_组织类型间规则类型 | `org.orgmodel.OrgTypeRuleTypeVO` |
| `org_relation` | 组织关系 | `org.orgmodel.OrgRelationVO` |
| `org_relation_attr` | 组织关系_关系业务属性 | `org.orgmodel.OrgRelationAttrVO` |
| `org_relationtype` | 组织关系_组织关系类型 | `org.orgmodel.OrgRelationTypeVO` |
| `org_relvalidator` | 组织关系_组织关系类型_数据校验 | `org.orgmodel.OrgRelationValidatorVO` |
| `org_rtypelefttype` | 组织关系_组织关系类型_归属类型 | `org.orgmodel.OrgRelationTypeLeftTypeVO` |
| `org_uagroup` | 组织其它_用户可管理的集团 | `org.UserAdminGroupVO` |
| `orgtype_busiregion` | 组织关系_组织类型业务范围 | `org.orgmodel.OrgTypeBusiRegionVO` |
| `pub_addr_gpdetail` | 通讯薄组明细表 | `nc.message.addressbook.vo.VOAddrGpDetail` |
| `pub_addr_group` | 通讯薄组信息表 | `nc.message.addressbook.vo.VOAddrGroup` |
| `pub_addr_rule` | 通讯薄规则表 | `nc.message.addressbook.vo.VOAddrRule` |
| `pub_addr_rulepar` | 规则参数表 | `nc.message.addressbook.vo.VOAddrRulePar` |
| `pub_alertmessage` | 预警消息 | `pub.pa.AlertmessageVO` |
| `pub_alertregistry` | 预警条目与后台任务 | `pub.pa.AlertregistryVO` |
| `pub_alertruntime` | 预警监控与后台任务监控 | `nc.bs.pub.taskcenter.AlertRuntimeInfo` |
| `pub_alerttype` | 预警类型 | `pub.pa.AlerttypeVO` |
| `pub_bcr_elem` | 编码规则元素 | `nc.pub.billcode.vo.BillCodeElemVO` |
| `pub_bcr_entity` | 编码映射 | `nc.pub.billcode.vo.CodeEntityVO` |
| `pub_bcr_nbcr` | 编码对象 | `nc.pub.billcode.vo.NeedBCRVO` |
| `pub_bcr_rulebase` | 编码规则基本信息 | `nc.pub.billcode.vo.BillCodeBaseVO` |
| `pub_eventlistener` | 业务插件实体 | `uap.businessevent.EventListenerVO` |
| `pub_eventtype` | 事件类型 | `uap.businessevent.EventTypeVO` |
| `pub_hotkeyregister` | 快捷键注册实体 | `pub.hotkey.HotkeyRegisterVO` |
| `pub_messagetemplate` | 消息模板 | `nc.bs.pub.messageTemplate.vo.MessageTemplateVO` |
| `pub_messagetemplate_b` | 消息模板子项 | `nc.bs.pub.messageTemplate.vo.MessageTemplateBVO` |
| `pub_msglabeldef` | 消息标签定义 | `nc.message.vo.MessageLabelDefVO` |
| `pub_msgres_rcv` | 接收人存储表 | `nc.buzimsg.vo.MsgresRcvVO` |
| `pub_msgres_rcvconf` | 消息源接收人配置 | `nc.buzimsg.vo.MsgresRcvConfVO` |
| `pub_msgres_reg` | 消息源类型注册 | `nc.buzimsg.vo.MsgresRegVO` |
| `pub_msgres_sfdfrcv` | 自定义接收人 | `nc.buzimsg.vo.SelfDefReceiverVO` |
| `pub_msgres_tmpconf` | 消息源消息模板配置 | `nc.buzimsg.vo.MsgresTempConfVO` |
| `pub_msgtemp` | 消息模板 | `nc.message.templet.vo.MsgtempletVO` |
| `pub_msgtemp_type` | 消息模板分类 | `nc.message.templet.vo.MsgtmptypeVO` |
| `pub_msgtemp_var` | 消息模板自定义函数 | `nc.message.templet.vo.MsgtempvarVO` |
| `pub_query_sysfunc` | 查询模板系统函数 | `querytemplate.sysfunc.SysFuncVO` |
| `pub_sysinit` | 参数设置 | `pub.para.SysInitVO` |
| `pub_sysinittemp` | 参数模板设置 | `pub.paratemp.SysinittempVO` |
| `pub_workingtasklog` | 预警日志与后台任务日志 | `nc.bs.pub.taskcenter.WorkingLogVO` |
| `sm_admin_resource` | 可管理资源 | `uap.rbac.authres.AdminResourceVO` |
| `sm_bdchange_reg` | 基本档案变动注册表 | `uap.rbac.bdchange.BDChangeRegVO` |
| `sm_bdchangesysfunc_reg` | 基本档案变动系统函数注册表 | `uap.rbac.bdchange.BDChangeSysFuncRegVO` |
| `sm_busiactive_btn` | 业务活动按钮关联实体 | `sm.funcreg.BusiActiveRelationVO` |
| `sm_busiactive_perm` | 业务活动权限 | `uap.rbac.busiactive.BusiActivePermVO` |
| `sm_busiactivereg` | 业务活动实体 | `sm.funcreg.BusiActiveVO` |
| `sm_busilog_default` | 业务日志 | `nc.bs.busilog.vo.BusinessLogVO` |
| `sm_butnregister` | 按钮注册实体 | `sm.funcreg.ButtonRegVO` |
| `sm_ctpermdetail` | 创建者权限明细 | `uap.rbac.CtPermDetailVO` |
| `sm_datapermquery` | 数据权限查询 | `uap.rbac.query.DataPermissionQueryVO` |
| `sm_document_category` | 文档分类表 | `nc.document.pub.vo.FileCategoryVO` |
| `sm_document_file` | 文档信息表 | `nc.document.pub.vo.NCFileVO` |
| `sm_document_version` | 文档版本 | `nc.document.pub.vo.FileVersionVO` |
| `sm_dpprofile_reg` | 数据权限分表记录 | `uap.rbac.DataPermProfileRegVO` |
| `sm_func_type` | 功能类型 | `uap.rbac.FuncTypeVO` |
| `sm_funcperm_query` | 功能权限查询 | `uap.funcpermquery.FuncPermQueryVO` |
| `sm_funcregister` | 功能实体 | `sm.funcreg.FuncRegisterVO` |
| `sm_keydata` | 关键数据 | `uap.rbac.keyfuncdata.KeyDataVO` |
| `sm_keyfunc` | 关键功能 | `uap.rbac.keyfuncdata.KeyFuncVO` |
| `sm_log_allsys_treenode` | OperateLogTreeCreatorSettingVO | `nc.bs.pub.logconfig.vo.OperateLogTreeCreatorSettingVO` |
| `sm_log_busilogrule` | 业务日志配置规则 | `nc.bs.sm.busilog.BusiLogRuleVO` |
| `sm_log_mode` | 日志配置 | `nc.bs.sm.logconfig.LogModeVO` |
| `sm_log_operatelog` | 上机日志 | `nc.bs.sm.operatelog.vo.OperateLogVO` |
| `sm_log_operatelogrule` | 上机日志配置规则 | `nc.bs.sm.logconfig.vo.OperatelogRuleVO` |
| `sm_log_operation` | 日志操作 | `nc.bs.sm.logoperation.vo.LogOperationVO` |
| `sm_log_unloading` | 卸出记录 | `nc.bs.sm.unloadinglog.vo.UnloadingLogVO` |
| `sm_menuitemreg` | 菜单项实体 | `sm.funcreg.MenuItemVO` |
| `sm_menuregister` | 菜单注册实体 | `sm.funcreg.MenuRegisterVO` |
| `sm_metadata_rule` | 元数据规则 | `uap.rbac.rule.MetaDataRuleVO` |
| `sm_msg_attachment` | 消息附件 | `nc.message.vo.AttachmentVO` |
| `sm_msg_content` | 消息发送实体 | `nc.message.vo.MessageVO` |
| `sm_msg_property` | 消息实体属性 | `nc.message.vo.MessagePropertyVO` |
| `sm_pageregister` | 页签实体 | `sm.funcreg.PageVO` |
| `sm_paramregister` | 参数实体 | `sm.funcreg.ParamRegVO` |
| `sm_perm_data` | 数据权限分配实体 | `uap.rbac.DataPermConfigVO` |
| `sm_perm_func` | 功能权限分配实体 | `uap.rbac.FuncPermConfigVO` |
| `sm_perm_scenario` | 权限使用场景 | `uap.rbac.PermScenarioVO` |
| `sm_permission_res` | 权限资源 | `uap.rbac.permissionresource.PermissionResourceVO` |
| `sm_permission_rule` | 权限规则 | `uap.rbac.rule.PermissionRuleVO` |
| `sm_power_function` | 功能权限分配对象 | `uap.rbac.power.FunctionPowerVO` |
| `sm_res_operation` | 资源操作 | `uap.rbac.OperationVO` |
| `sm_resp_func` | 职责功能 | `uap.rbac.RespFuncVO` |
| `sm_responsibility` | 职责 | `uap.rbac.ResponsibilityVO` |
| `sm_role` | 角色 | `uap.rbac.role.RoleVO` |
| `sm_role_exclude` | 角色互斥对象 | `uap.rbac.role.RoleExcludeVO` |
| `sm_role_group` | 角色组 | `uap.rbac.role.RoleGroupVO` |
| `sm_roleperm_pf` | 角色权限变更申请单 | `uap.rbac.pf.RolePermissionPFVO` |
| `sm_rporgsub_pf` | 角色权限变更申请单组织子表 | `uap.rbac.pf.RolePermOrgSubPFVO` |
| `sm_rpsub_resppf` | 角色权限变更申请单职责子表 | `uap.rbac.pf.RolePermRespSubPFVO` |
| `sm_rule` | 权限规则 | `uap.rbac.rule.RbacRuleVO` |
| `sm_rule_ref` | 规则引用档案 | `uap.rbac.rule.RuleRefDocVO` |
| `sm_rule_type` | 规则类型 | `uap.rbac.rule.PermissionRuleTypeVO` |
| `sm_specialpermission` | 特殊权限配置 | `uap.rbac.specialpermission.SpecialPermissionVO` |
| `sm_subject_org` | 授权实体主组织 | `uap.rbac.SubjectOrgVO` |
| `sm_sysfunc_rbac` | 系统函数数据权限重算 | `uap.rbac.rule.SysFuncRBACVO` |
| `sm_sysfunc_rule` | 系统函数规则 | `uap.rbac.rule.SysFuncRuleVO` |
| `sm_uppf_orgsub` | 用户权限申请-组织申请 | `uap.rbac.pf.UserOrgPermissionSubPFVO` |
| `sm_uppf_respsub` | 用户权限申请-职责申请 | `uap.rbac.pf.UserRespPermissionSubPFVO` |
| `sm_uppf_rolesub` | 用户权限申-角色申请 | `uap.rbac.pf.UserRolePermissionSubPFVO` |
| `sm_ur_display` | 用户角色权限显示 | `uap.rbac.UserRolePermDisplayVO` |
| `sm_user` | 用户 | `sm.UserVO` |
| `sm_user_defaultpwd` | 用户默认密码 | `sm.UserDefaultPasswordVO` |
| `sm_user_group` | 用户用户组 | `uap.rbac.UserAndGroupVO` |
| `sm_user_mainorg` | 组织其它_用户主组织 | `org.orgmodel.UserMainOrgVO` |
| `sm_user_role` | 用户角色 | `uap.rbac.UserRoleVO` |
| `sm_user_toprocessed` | 待处理用户 | `uap.rbac.UserToBeProcessedVO` |
| `sm_usergroup` | 用户组 | `uap.rbac.UserGroupVO` |
| `sm_userperm_pf` | 用户权限申请单 | `uap.rbac.pf.UserPermissionPFVO` |
| `sm_userpermquery` | 用户功能权限查询 | `uap.rbac.query.UserPermissionQueryVO` |
| `sm_userpwdlog` | 用户密码重置记录 | `uap.rbac.UserPasswordLogVO` |
| `uap_AdminRoleGroupDisp` | 可授权角色组 | `uap.rbac.authres.AdminRoleGroupDisplayValueObject` |
| `uap_AdminUserGroupDisp` | 可授权用户组 | `uap.rbac.authres.AdminUserGroupDisplayValueObject` |
| `uap_DataPermission` | 数据权限授权对象 | `uap.rbac.DataPermissionDisplayObject` |
| `uap_FuncPermQueryResult` | 功能权限查询结果对象 | `uap.rbac.query.FuncPermQueryResultVO` |
| `uap_ImportablePostVO` | 引入职责 | `corg.ImportablePostVO` |
| `uap_VBillParam` | 参数修改申请单主表 | `uap.paramsys.VBillParamVO` |
| `uap_busifuncitem` | 业务功能项 | `uap.rbac.BusiFuncItemVO` |
| `uap_importentity` | 引入数据实体 | `corg.ImportableVO` |
| `uap_vParaminfo` | 参数修改申请单子表 | `uap.paramsys.VParaminfoVO` |

### iaudit 标准接口（6 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `BD_AuditTable` | 审计表 | `bd.audit.AuditTableVO` |
| `BD_AuditTableDetail` | 审计明细 | `bd.audit.AuditTableDetailVO` |
| `BD_auditModule` | 审计模块 | `bd.audit.AuditModuleVO` |
| `bd_AuditAss` | 辅助核算顺序 | `bd.audit.AuditassVO` |
| `bd_Auditdef` | 用户审计选项记录 | `bd.audit.AuditdefVO` |
| `bd_auditmessage` | 审计报告 | `bd.audit.AuditassMessageVO` |

### ncwebpub ncwebpub（1 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `ncmppub_portal` | MP审批工作台适配注册类 | `pub.mp.MPPortalBillClassVO` |

### pubapp pubapp（9 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `pub_bscomponent` | 组件 | `nc.impl.pubapp.plugin.BsComponentVO` |
| `pub_bsexpoint` | 扩展点 | `nc.impl.pubapp.plugin.ExtendPointVO` |
| `pub_bsplugins` | 插件注册信息 | `nc.impl.pubapp.plugin.RegistryVO` |
| `pub_pluginitem` | 业务规则扩展 | `pubapp.plugin.RuleExtendItemVO` |
| `pub_printalter` | 申请记录 | `uapbd.printnumber.PrintAlterVO` |
| `pub_printlimit` | 打印次数设置 | `uapbd.printlimit.PrintLimitVO` |
| `pub_printlog` | 打印日志 | `uapbd.printnumber.PrintLogVO` |
| `pub_printnumber` | 打印次数 | `uapbd.printnumber.PrintNumberVO` |
| `pub_printpara` | 打印参数 | `uapbd.printlimit.PrintParaVO` |

### riaaam riaaam（6 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `aam_appasset` | 应用资产实体 | `ncaam.appasset.AppAssetVO` |
| `aam_appassetversion` | 应用资产实体版本 | `ncaam.appasset.AppAssetVersionVO` |
| `aam_assettype` | 应用资产类型 | `ncaam.appassettype.AppAssetTypeVO` |
| `aam_countryzone` | 国家地区实体 | `ncaam.countryzone.CountryZoneVO` |
| `aam_developer` | 开发者实体 | `ncaam.developer.DeveloperVO` |
| `aam_developorg` | 研发机构 | `ncaam.developorg.DevelopOrgVO` |

### riaadp riaadp（15 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `adp_busirespack` | 业务资源包 | `uap.distribution.restrans.BusinessResourcePackVO` |
| `adp_receiptpack` | 回执包 | `uap.distribution.restrans.ReceiptPackVO` |
| `adp_resnotified` | 资源事件通知配置 | `uap.distribution.restype.ResNotifiedConfigVO` |
| `adp_resprop` | 传输资源属性 | `uap.distribution.restype.ResPropertiesVO` |
| `adp_restypecatalog` | 资源类型目录 | `uap.distribution.restype.ResourceTypeCatalogVO` |
| `adp_restyperelate` | 资源类型关系 | `uap.distribution.restype.ResourceTypeRelationVO` |
| `adp_restyperule` | 资源类型规则 | `uap.distribution.restype.ResourceTypeRule` |
| `adp_restypregister` | 传输资源注册信息 | `uap.distribution.restype.ResourceTypeRegisterVO` |
| `adp_schtranstask` | 自动传输任务 | `uap.distribution.schedtranstask.SchedTransTaskVO` |
| `adp_taskexeclist` | 任务执行方列表 | `uap.distribution.schedtranstask.TaskExecutorVO` |
| `adp_taskrecelist` | 资源接收方列表 | `uap.distribution.schedtranstask.TaskReceiverVO` |
| `adp_tasktimeconf` | 任务部署时间属性 | `uap.distribution.schedtranstask.TaskTimeConfigVO` |
| `adp_tasktranscnt` | 传输内容对象 | `uap.distribution.schedtranstask.TaskTransContentVO` |
| `adp_transres` | 传输资源 | `uap.distribution.restrans.TransResourceVO` |
| `adp_transtaskexec` | 传输任务执行 | `uap.distribution.restrans.TransTaskExecutionVO` |

### riaam 权限管理（1 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `sm_user` | 用户 | `sm.UserVO` |

### riacc 客户化配置（3 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `pub_systemplateuser` | 模板分配用户报表 | `riacc.systemplateuser.systemplateuser` |
| `pub_template` | 模板 | `riacc.template.template` |
| `pub_usersystemplate` | 用户分配模板报表 | `riacc.usersystemplate.systemplateuser` |

### riadc 开发配置工具（6 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `pub_psn_matrix` | 资源类型和层次类型的对照关系 | `pub.personalization.PersonalizationMatrixVO` |
| `pub_psn_reg` | 个性化配置 | `pub.personalization.PersonalizationSetDataVO` |
| `pub_psn_resource` | 资源类型 | `pub.personalization.ResourceVO` |
| `sm_busi_navigation` | 业务导航树表 | `sm.flowdesktop.BusiNavigationVO` |
| `sm_busiworkflow` | 流程导航 | `sm.flowdesktop.BusiFlowVO` |
| `sm_busiworkflow_cell` | 业务流程图元 | `sm.flowdesktop.BusiFlowCellVO` |

### riaorg 组织管理（148 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `org_acb_accchart` | 账簿_财务核算账簿_关联科目 | `org.AccountingBookAccchartVO` |
| `org_accountingbook` | 账簿_财务核算账簿 | `org.AccountingBookVO` |
| `org_admin_dept` | 业务人员来源主表 | `relation.AdminDeptVO` |
| `org_adminorg` | 组织_业务单元_行政组织 | `org.AdminOrgVO` |
| `org_adminorg_v` | 组织_业务单元_行政组织版本信息 | `vorg.AdminOrgVersionVO` |
| `org_adminorgstru_v` | 组织结构_行政组织结构版本信息 | `vorg.AdminOrgStruVersionVO` |
| `org_admorgmember_v` | 组织结构_行政组织结构成员版本信息 | `vorg.AdminOrgStruMemberVersionVO` |
| `org_aos_v` | 组织结构_行政组织体系版本信息 | `om.aos.AOSVersionVO` |
| `org_aosmember` | 组织结构_行政组织体系成员 | `om.aos.AOSMemberVO` |
| `org_aosmember_v` | 组织结构_行政组织体系成员版本信息 | `om.aos.AOSMemberVersionVO` |
| `org_assetorg` | 组织_业务单元_资产组织 | `org.AssetOrgVO` |
| `org_assetorg_v` | 组织_业务单元_资产组织版本信息 | `vorg.AssetOrgVersionVO` |
| `org_assetstatstru` | 资产统计体系 | `corg.AssetStatStruVO` |
| `org_assmember` | 资产统计体系成员 | `corg.AssetStatStruMemberVO` |
| `org_assmember` | 资产统计体系成员含编码名称 | `corg.AssetStatStruMemberWithCodeNameVO` |
| `org_authtaxcate` | 组织_税务组织_委托税种 | `org.AuthTaxCateVO` |
| `org_bcsmember` | 组织结构_账簿合并体系成员 | `corg.BookCombineStruMemberVO` |
| `org_bcsmember` | 组织结构_账簿合并体系成员 | `corg.BookCombineStruMemberWithCodeNameVO` |
| `org_bcsmember_v` | 组织结构_账簿合并体系成员_多版本 | `vorg.BookCombineStruMemberVersionVO` |
| `org_bookcombinestru` | 组织结构_账簿合并体系 | `corg.BookCombineStruVO` |
| `org_bookcombinestru_v` | 组织结构_账簿合并体系_多版本 | `vorg.BookCombineStruVersionVO` |
| `org_bookorgrel` | 账簿_账簿组织关联信息 | `org.BookOrgRelVO` |
| `org_bos_v` | 组织结构_预算组织体系版本信息 | `vorg.BudgetOrgStruVersionVO` |
| `org_bosmember` | 组织结构_预算组织体系成员 | `corg.BudgetOrgStruMemberVO` |
| `org_bosmember` | 组织结构_预算组织体系成员含编码名称 | `corg.BudgetOrgStruMemberWithCodeNameVO` |
| `org_bosmember_v` | 组织结构_预算组织体系成员版本信息 | `vorg.BudgetOrgStruMemberVersionVO` |
| `org_bssmember` | 组织结构_预算统计体系成员 | `corg.BudgetStatStruMemberVO` |
| `org_bssmember` | 组织结构_预算统计体系成员 | `corg.BudgetStatStruMemberWithCodeNameVO` |
| `org_bssmember_v` | 组织结构_预算统计成员版本信息 | `vorg.BudgetStatStruMemberVersionVO` |
| `org_budgetorgstru` | 组织结构_预算组织体系 | `corg.BudgetOrgStruVO` |
| `org_busi_func` | 业务人员来源子表 | `relation.BusiFuncVO` |
| `org_ccr_financeorg` | 组织_信用控制域财务组织关联信息 | `corg.CreditCtlRegionFinanceOrgVO` |
| `org_checkitem` | 月结检查项 | `org.closeaccbook.CheckItemVO` |
| `org_checktype` | 月结检查项类别 | `org.closeaccbook.CheckTypeVO` |
| `org_closeacc` | 账簿_组织批量关账 | `org.BatchCloseAccBookVO` |
| `org_closeacc` | 账簿_组织关账 | `org.CloseAccBookVO` |
| `org_corp` | 组织_业务单元_公司 | `org.CorpVO` |
| `org_corp_v` | 组织_业务单元_公司版本信息 | `vorg.CorpVersionVO` |
| `org_costregion` | 组织_成本域 | `corg.CostRegionVO` |
| `org_cr_stockorg` | 组织_成本域库存组织关联信息 | `corg.CostRegionStockOrgVO` |
| `org_cr_stockstore` | 组织_成本域库存组织仓库关联信息 | `corg.CostRegionStockStoreVO` |
| `org_crectlregion` | 组织_信用控制域 | `corg.CreditCtlRegionVO` |
| `org_dept` | 组织_部门 | `org.DeptVO` |
| `org_dept_v` | 组织_部门版本信息 | `vorg.DeptVersionVO` |
| `org_factory` | 组织_业务单元_工厂 | `org.FactoryVO` |
| `org_factory_v` | 组织_业务单元_工厂版本信息 | `vorg.FactoryVersionVO` |
| `org_financeorg` | 组织_业务单元_财务组织 | `org.FinanceOrgVO` |
| `org_financeorg_v` | 组织_业务单元_财务组织版本信息 | `vorg.FinanceOrgVersionVO` |
| `org_financeorgtree` | 组织_树型财务组织 | `org.FinanceOrgTreeVO` |
| `org_financestatstru` | 组织结构_财务统计体系 | `corg.FinanceStatStruVO` |
| `org_financestatstrumember` | 财务统计体系成员 | `corg.FinanceStatStruMemberVO` |
| `org_financestatstrumember` | 财务统计体系含编码名称 | `corg.FinanceStatStruMemberWithCodeNameVO` |
| `org_finorgmember_v` | 组织结构_财务组织结构成员版本信息 | `vorg.FinanceOrgStruMemberVersionVO` |
| `org_finorgstru_v` | 组织结构_财务组织结构版本信息 | `vorg.FinanceOrgStruVersionVO` |
| `org_fms_v` | 组织结构_资金管理体系版本信息 | `vorg.FundManaSystemVersionVO` |
| `org_fmsmember` | 组织结构_资金管理体系成员 | `corg.FundManaSystemMemberVO` |
| `org_fmsmember` | 组织结构_资金管理体系成员含编码名称 | `corg.FundManaSystemMemberWithCodeNameVO` |
| `org_fmsmember_v` | 组织结构_资金管理体系成员版本信息 | `vorg.FundManaSystemMemberVersionVO` |
| `org_fundmanasystem` | 组织结构_资金管理体系 | `corg.FundManaSystemVO` |
| `org_fundorg` | 组织_业务单元_资金组织 | `org.FundOrgVO` |
| `org_fundorg_v` | 组织_业务单元_资金组织版本信息 | `vorg.FundOrgVersionVO` |
| `org_funrelation` | 组织职能映射关系 | `relation.FuncRelationVO` |
| `org_group` | 组织_集团 | `org.GroupVO` |
| `org_grouprelchart` | 组织_集团_政策科目表 | `org.GroupRelChartVO` |
| `org_groupsynctrans` | 集团同步传输资源 | `org.distribution.GroupSyncTransResVO` |
| `org_hrorg` | 组织_业务单元_人力资源组织 | `org.HROrgVO` |
| `org_hrorg_v` | 组织_业务单元_人力资源组织版本信息 | `vorg.HROrgVersionVO` |
| `org_hrorgmember_v` | 组织结构_人力资源组织结构成员版本信息 | `vorg.HROrgStruMemberVersionVO` |
| `org_hrorgstru_v` | 组织结构_人力资源组织结构版本信息 | `vorg.HROrgStruVersionVO` |
| `org_itemorg` | 组织_业务单元_项目组织 | `org.ItemOrgVO` |
| `org_itemorg_v` | 组织_业务单元_项目组织版本信息 | `vorg.ItemOrgVersionVO` |
| `org_liabilitybook` | 账簿_责任核算账簿 | `org.LiabilityBookVO` |
| `org_liacenmember_v` | 组织结构_利润中心体系成员版本信息 | `vorg.LiabilityCenterStruMemberVersionVO` |
| `org_liacenstru_v` | 组织结构_利润中心体系版本信息 | `vorg.LiabilityCenterStruVersionVO` |
| `org_liacenter` | 组织_业务单元_利润中心 | `org.LiabilityCenterVO` |
| `org_liacenter_v` | 组织_业务单元_利润中心版本信息 | `vorg.LiabilityCenterVersionVO` |
| `org_maintainorg` | 组织_业务单元_维修组织 | `org.MaintainOrgVO` |
| `org_maintainorg_v` | 组织_业务单元_维修组织版本信息 | `vorg.MaintainOrgVersionVO` |
| `org_moduleperiod` | 组织其它_组织模块启用期间 | `org.OrgModulePeriodVO` |
| `org_obsdept` | 组织结构_项目组织分解结构 | `corg.OBSDeptVO` |
| `org_obspsn` | 组织结构_项目人员信息 | `corg.OBSPsnVO` |
| `org_orgs` | 组织 | `org.OrgVO` |
| `org_orgs_v` | 组织_版本信息 | `vorg.OrgVersionVO` |
| `org_paytaxcate` | 组织_税务组织_缴纳税种 | `org.PayTaxCateVO` |
| `org_planbudget` | 组织_业务单元_预算组织 | `org.PlanBudgetVO` |
| `org_planbudget_v` | 组织_业务单元_预算组织版本信息 | `vorg.PlanBudgetVersionVO` |
| `org_plancenter` | 组织_业务单元_计划中心 | `org.PlanCenterVO` |
| `org_plancenter_v` | 组织_业务单元_计划中心版本信息 | `vorg.PlanCenterVersionVO` |
| `org_ppsmember` | 组织结构_采购计划体系成员 | `corg.PurPlanStruMemberVO` |
| `org_ppsmember` | 组织结构_采购计划体系成员含编码名称 | `corg.PurPlanStruMemberWithCodeNameVO` |
| `org_purchaseorg` | 组织_业务单元_采购组织 | `org.PurchaseOrgVO` |
| `org_purchaseorg_v` | 组织_业务单元_采购组织版本信息 | `vorg.PurchaseOrgVersionVO` |
| `org_purplanstru` | 组织结构_采购计划体系 | `corg.PurPlanStruVO` |
| `org_qccenter` | 组织_业务单元_质检中心 | `org.QcCenterVO` |
| `org_qccenter_v` | 组织_业务单元_质检中心版本信息 | `vorg.QcCenterVersionVO` |
| `org_rcsmember` | 组织结构_报表合并体系成员 | `corg.ReportCombineStruMemberVO` |
| `org_rcsmember` | 组织结构_报表合并体系成员含编码名称 | `corg.ReportCombineStruMemberWithCodeNameVO` |
| `org_rcsmember_v` | 组织结构_报表合并体系成员_多版本 | `vorg.ReportCombineStruMemberVersionVO` |
| `org_reportcombinestru` | 组织结构_报表合并体系 | `corg.ReportCombineStruVO` |
| `org_reportcombinestru_v` | 组织结构_报表合并体系_多版本 | `vorg.ReportCombineStruVersionVO` |
| `org_reportmanastru` | 组织结构_报表组织体系 | `corg.ReportManaStruVO` |
| `org_reportmanastru_v` | 组织结构_报表组织体系版本信息 | `vorg.ReportManaStruVersionVO` |
| `org_reportmanastrumember_v` | 组织结构-报表组织体系成员版本信息 | `vorg.ReportManaStruMemberVersionVO` |
| `org_reportorg` | 组织_业务单元_报表组织 | `org.ReportOrgVO` |
| `org_reportorg_v` | 组织_业务单元_报表组织版本信息 | `vorg.ReportOrgVersionVO` |
| `org_rmsmember` | 组织结构_报表组织体系成员 | `corg.ReportManaStruMemberVO` |
| `org_rmsmember` | 组织结构_报表组织体系成员含编码名称 | `corg.ReportManaStruMemberWithCodeNameVO` |
| `org_saleappendstru` | 组织结构_分销补货体系 | `corg.SaleAppendStruVO` |
| `org_salesorg` | 组织_业务单元_销售组织 | `org.SalesOrgVO` |
| `org_salesorg_v` | 组织_业务单元_销售组织版本信息 | `vorg.SalesOrgVersionVO` |
| `org_sas_prodline` | 组织结构_分销补货体系产品线信息 | `corg.SaleAppendStruProdLineVO` |
| `org_sasmember` | 组织结构_分销补货体系成员 | `corg.SaleAppendStruMemberVO` |
| `org_setofbook` | 账簿_账簿类型 | `org.SetOfBookVO` |
| `org_sssmember` | 组织结构_库存统计体系成员 | `corg.StockStatStruMemberVO` |
| `org_stockinvest` | 组织结构_股权投资关系 | `corg.StockInvestRelaVO` |
| `org_stockinvestscheme` | 股权投资多方案 | `vorg.StockInvestSchemeVO` |
| `org_stockorg` | 组织_业务单元_库存组织 | `org.StockOrgVO` |
| `org_stockorg_v` | 组织_业务单元_库存组织版本信息 | `vorg.StockOrgVersionVO` |
| `org_stockstatstru` | 组织结构_库存统计体系 | `corg.StockStatStruVO` |
| `org_trafficorg` | 组织_业务单元_物流组织 | `org.TrafficOrgVO` |
| `org_trafficorg_v` | 组织_业务单元_物流组织版本信息 | `vorg.TrafficOrgVersionVO` |
| `org_vat` | 组织其它_VAT注册码 | `org.OrgVatVO` |
| `org_view` | 组织结构视图 | `org.orgview.OrgViewVO` |
| `org_view_admin` | 结构视图－行政视图 | `org.orgview.OrgViewOrgSubVO` |
| `org_view_assetstat` | 组织视图_资产统计体系 | `org.orgview.OrgViewAssetStatStruSubVO` |
| `org_view_bookcombine` | 组织视图_账簿合并体系 | `org.orgview.OrgViewBookCombineSubVO` |
| `org_view_budgetstru` | 组织视图-预算组织体系 | `org.orgview.OrgViewBudgetStruSubVO` |
| `org_view_costreg` | 组织视图-成本域视图 | `org.orgview.OrgViewCostRegionSubVO` |
| `org_view_finance` | 组织视图-财务组织视图 | `org.orgview.OrgViewFinanceSubVO` |
| `org_view_financestat` | 组织视图_财务统计体系 | `org.orgview.OrgViewFinanceStatStruSubVO` |
| `org_view_liability` | 组织视图-责任组织结构 | `org.orgview.OrgViewLiabilitySubVO` |
| `org_view_purplanstru` | 组织视图-采购计划体系 | `org.orgview.OrgViewPurPlanStruSubVO` |
| `org_view_report` | 组织视图-报表管理体系 | `org.orgview.OrgViewReportSubVO` |
| `org_view_reportcombine` | 组织视图_报表合并体系 | `org.orgview.OrgViewReportCombineSubVO` |
| `org_view_simple` | 组织视图-简单视图 | `org.orgview.OrgViewBaseSubVO` |
| `org_view_stockstat` | 组织视图-库存统计体系 | `org.orgview.OrgViewStockStatisticSubVO` |
| `org_vstl_admin` | 行政组织视图样式 | `uap.rbac.orgview.AdminGraphStyleVO` |
| `org_vstl_costreg` | 成本域视图样式 | `uap.rbac.orgview.CostRegionGraphStyle` |
| `org_vstl_creditreg` | 信用控制域视图样式 | `uap.rbac.orgview.CreditCTLRegionGraphStyleVO` |
| `org_vstl_finance` | 财务组织视图样式 | `uap.rbac.orgview.FinanceGraphStyleVO` |
| `org_vstl_liability` | 责任组织结构视图样式 | `uap.rbac.orgview.LiabilityGraphStyleVO` |
| `org_vstl_purplan` | 采购计划体系样式视图 | `uap.rbac.orgview.PurPlanGraphStyleVO` |
| `org_vstl_report` | 报表管理体系视图样式 | `uap.rbac.orgview.ReportGraphStyleVO` |
| `org_vstl_simple` | 简单组织机构图样式 | `uap.rbac.orgview.BaseGraphStyleVO` |
| `org_vstl_stockstat` | 库存统计体系视图样式 | `uap.rbac.orgview.StockStatGraphStyleVO` |
| `uap_closeaccmodule` | 账簿_组织关账模块期间 | `org.CloseAccModuleVO` |
| `uap_dataSourceName` | 数据源 | `uap.datasource` |
| `uap_structureorg` | 体系组织 | `corg.StructureOrgVO` |

### riart 运行框架（36 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `bd_billtype` | 交易类型 | `pub.billtype.BilltypeVO` |
| `bd_busitype` | 业务流程 | `pf.pub.BusitypeVO` |
| `pub_besidebusicomp` | 侧边栏业务组件 | `pub.beside.BesideBusiCompVO` |
| `pub_besidecomp` | 侧边栏组件 | `pub.beside.BesideCompVO` |
| `pub_besidecompparam` | 组件参数 | `pub.beside.BesideCompParamVO` |
| `pub_besidecompparamRef` | 组件参数参照 | `pub.beside.BesideCompParamRefVO` |
| `pub_besidecomptype` | 侧边栏组件类型 | `pub.beside.BesideCompTypeVO` |
| `pub_besidepage` | 侧边栏页签 | `pub.beside.BesidePageVO` |
| `pub_besidepagecomp` | 页签关联组件 | `pub.beside.BesidePageCompVO` |
| `pub_billaction` | 单据动作 | `pub.pfflow.BillactionVO` |
| `pub_billitfdef` | 单据接口定义 | `pf.change.BillItfDefVO` |
| `pub_billtemplet` | 单据模板 | `pub.bill.BillTempletVO` |
| `pub_comppersonalized` | 组件个性化 | `pub.besidecomppersonalized.CompPersonalizedVO` |
| `pub_datatemplet` | 数据模板 | `pub.datatemplet.DataTempletVO` |
| `pub_generalrule` | 常用规则 | `riart.rule.GeneralRuleVO` |
| `pub_guideline` | 查询指标 | `uap.guideline.GuidelineVO` |
| `pub_guideline_f` | 指标公式 | `uap.guideline.GuidelineFormulaVO` |
| `pub_print_template` | 输出模板 | `pub.print.PrintTemplateVO` |
| `pub_query_condition` | 查询条件 | `pub.query.md.MDQueryConditionVO` |
| `pub_query_templet` | 查询模板 | `pub.query.md.MDQueryTempletVO` |
| `pub_queryscheme` | 查询方案 | `querytemplate.queryscheme.QuerySchemeVO` |
| `pub_systemplate` | 模板分配 | `pub.pftemplate.SystemplateVO` |
| `pub_systemplate_base` | 模板分配基准表 | `pub.pftemplate.SystemplateBaseVO` |
| `pub_vochange` | 单据交换规则 | `pf.change.ExchangeVO` |
| `pub_wf_def` | 流程定义 | `wfengine.definition.WorkflowDefinitionVO` |
| `pub_wf_instance` | 流程实例 | `pf.flowinstance.FlowInstanceVO` |
| `pub_wf_messagemeta` | 流程消息元信息 | `pf.msg.MessageMetaVO` |
| `pub_wfgroup` | 流程用户组 | `pub.workflowusergroup.WFUserGroupVO` |
| `pub_workflowagent` | 流程代理人 | `pub.workflowpsn.WorkflowagentVO` |
| `pub_workflowgadget` | 流程组件 | `wfengine.core.application.WorkflowgadgetVO` |
| `pub_workflownote` | 历史信息 | `uap.historymsg.HistorymsgVO` |
| `pub_workflownote` | 工作项 | `pf.worknote.WorkNoteVO` |
| `pub_writebackfield` | 回写字段 | `pub.pfflow06.FieldMappingVO` |
| `sm_individual_property` | 个性化属性 | `nc.individuation.vo.IndividualPropertyVO` |
| `sm_individual_register` | 个性化注册 | `nc.individuation.register.vo.IndividualRegisterVO` |
| `uap_uitabext` | uif2页签扩展实体 | `bd.uitabextend.UITabExtVO` |

### riawf 流程平台（1 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `pub_wf_parameter` | 流程参数 | `uap.workflowpara.WorkFlowParaVO` |

### uapbd 基础数据（409 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `BD_CodeEditor` | 标签模板 | `bd.barcode.design.CodeEditorVO` |
| `ic_barcodeparse` | 条形码解析 | `ic.barcodeparse.BarCodeParseVO` |
| `bd_aassign` | 作业分配 | `bd.aassign.entity.BDAAssignVO` |
| `bd_accasoa` | 会计科目 | `bd.account.AccAsoaVO` |
| `bd_accasoahistory` | 科目关联信息历史 | `bd.account.history.AccAsoaHistoryVO` |
| `bd_accass` | 辅助核算 | `bd.account.AccAssVO` |
| `bd_accasshistory` | 辅助核算历史 | `bd.account.history.AccAssHistoryVO` |
| `bd_accassitem` | 会计辅助核算项目 | `bd.accassitem.AccAssItemVO` |
| `bd_accchart` | 科目表 | `bd.accchart.AccChartVO` |
| `bd_accctrlasoa` | 科目控制规则关联科目 | `bd.accctrlrule.AccCtrlAsoaVO` |
| `bd_accctrlorg` | 可细化组织 | `bd.accctrlrule.AccCtrlOrgVO` |
| `bd_accctrlrule` | 科目控制规则 | `bd.accctrlrule.AccCtrlRuleVO` |
| `bd_accfieldctrl` | 科目属性控制策略 | `bd.accfieldctrlstrategy.AccFieldCtrlVO` |
| `bd_accfieldcttemp` | 科目属性控制模板 | `uapbd.accfieldctrltemp.AccFieldCtrlTempVO` |
| `bd_acchalfyear` | 会计半年 | `bd.period.AccHalfYearVO` |
| `bd_accobligate` | 预留规则 | `bd.accchart.AccObligateVO` |
| `bd_account` | 会计科目基本信息 | `bd.account.AccountVO` |
| `bd_account_dist` | 科目分布式数据状态 | `bd.account.distribution.AccDistDataStatuVO` |
| `bd_accountmap` | 科目对照 | `bd.accountmap.AccountMapVO` |
| `bd_accperiod` | 会计期间档案 | `bd.period.AccperiodVO` |
| `bd_accperiodmonth` | 会计月份 | `bd.period2.AccperiodmonthVO` |
| `bd_accperiodquart` | 会计季度 | `bd.period3.AccperiodquartVO` |
| `bd_accperiodscheme` | 会计期间方案 | `bd.period.AccperiodschemeVO` |
| `bd_accplychart` | 政策性科目表集团关联 | `bd.accchart.AccPlyChartVO` |
| `bd_accsystem` | 科目体系 | `bd.accsystem.AccSystemVO` |
| `bd_acctype` | 科目类型 | `bd.accsystem.AccTypeVO` |
| `bd_act` | 作业档案 | `bd.aassign.entity.BDActVO` |
| `bd_activity` | 作业档案 | `bd.bdactivity.entity.BDActivityVO` |
| `bd_addressdoc` | 地点档案 | `bd.cust.addressdoc.AddressDocVO` |
| `bd_addrlinkman` | 地点联系人信息 | `bd.cust.addressdoc.AddrLinkManVO` |
| `bd_adjustrate` | 期间汇率 | `bd.currinfo.AdjustrateVO` |
| `bd_agentstore` | 代储关系 | `bd.stordoc.AgentstoreVO` |
| `bd_ansylog` | 异步删除日志 | `bd.ansylog.AnsyDelLogVO` |
| `bd_areacl` | 地区分类 | `bd.cust.areaclass.AreaclassVO` |
| `bd_assign_rule` | 分配规则 | `bd.assign.AssignruleVO` |
| `bd_assign_tab` | 档案分配页签 | `bd.assign.AssigntabVO` |
| `bd_assign_temp` | 分配默认值模板 | `bd.assign.AssigntempVO` |
| `bd_asslinenum` | 人行联行信息 | `bd.asslinenum.AssLineNumVO` |
| `bd_avgrate` | 平均汇率 | `bd.currinfo.AvgRateVO` |
| `bd_balatype` | 结算方式 | `bd.balatype.BalaTypeVO` |
| `bd_bankaccbas` | 银行账户 | `bd.bankaccount.BankAccbasVO` |
| `bd_bankaccbas` | 个人银行账户信息 | `bd.bankaccount.BankAccbasVO` |
| `bd_bankaccbas` | 客商银行账户信息 | `bd.bankaccount.BankAccbasVO` |
| `bd_bankaccsub` | 银行账户子户 | `bd.bankaccount.BankAccSubVO` |
| `bd_bankaccsub` | 个人银行账户子户 | `bd.bankaccount.BankAccSubVO` |
| `bd_bankaccsub` | 客商银行账户子户 | `bd.bankaccount.BankAccSubVO` |
| `bd_bankaccuse` | 子户使用权 | `bd.bankaccount.BankAccUseVO` |
| `bd_bankaccuse` | 个人使用权 | `bd.bankaccount.BankAccUseVO` |
| `bd_bankaccuse` | 客商银行账户使用权 | `bd.bankaccount.BankAccUseVO` |
| `bd_bankdoc` | 银行档案 | `bd.bankdoc.BankdocVO` |
| `bd_banklinkman` | 银行联系人 | `bd.bankdoc.BankLinkmanVO` |
| `bd_banktype` | 银行类别 | `bd.banktype.BankTypeVO` |
| `bd_batchupdateattr` | 批改属性 | `bd.pub.batchupdate.BatchUpdateAttrVO` |
| `bd_batchupdaterule` | 规则 | `bd.pub.batchupdaterule.BatchUpdateRuleVO` |
| `bd_batchupdatetab` | 批改页签 | `bd.pub.batchupdate.BatchUpdateTabVO` |
| `bd_batchupruleteam` | 批改规则组 | `bd.pub.batchupdaterule.BatchUpdateRuleTeamVO` |
| `bd_bizeventlog` | 业务事件日志 | `bd.pub.bizeventlog.BizeventlogVO` |
| `bd_bmrt` | BOM/工艺匹配规则 | `bd.vermatch.entity.BomMatchRtVO` |
| `bd_bom` | 物料清单 | `bd.bom.bom0202.entity.BomVO` |
| `bd_bom_activity` | 物料作业量 | `bd.bom.bom0202.entity.BomActivityVO` |
| `bd_bom_b` | 物料清单明细 | `bd.bom.bom0202.entity.BomItemVO` |
| `bd_bom_bsrc` | 物料清单子项物料来源表 | `bd.bom.bom0202.entity.BomItemSourceVO` |
| `bd_bom_loss` | 物料清单子项阶梯损耗 | `bd.bom.bom0202.entity.BomLossVO` |
| `bd_bom_outputs` | 物料清单多产出 | `bd.bom.bom0202.entity.BomOutputsVO` |
| `bd_bom_position` | 物料清单子项组装位置 | `bd.bom.bom0202.entity.BomPosVO` |
| `bd_bom_repl` | 物料清单子项替代料 | `bd.bom.bom0202.entity.BomReplVO` |
| `bd_bom_select` | 选择条件 | `bd.bom.bom0202.entity.BomSelectVO` |
| `bd_bom_useorg` | 使用组织 | `bd.bom.bom0202.entity.BomUseOrgVO` |
| `bd_bom_wip` | 物料清单子项线上仓 | `bd.bom.bom0202.entity.BomWipVO` |
| `bd_bomcopy` | BOM复制对话框 | `bd.bom.bom0214.entity.BomcopyVO` |
| `bd_branddoc` | 品牌档案 | `bd.material.branddoc.BrandDocVO` |
| `bd_caprt` | 产能休息时间段 | `bd.shift.CapRTVO` |
| `bd_capwt` | 产能工作时间段 | `bd.shift.CapWTVO` |
| `bd_cashaccount` | 现金账户 | `bd.cashaccount.CashAccountVO` |
| `bd_cashflow` | 现金流量项目 | `bd.cashflow.CashflowVO` |
| `bd_cashflowuse` | 现金流量权用权 | `bd.cashflow.CashflowUseVO` |
| `bd_cbsassign` | CBS分配关系 | `bd.cbs.CBSAssignVO` |
| `bd_cbsdefault` | 组织默认CBS | `bd.cbs.CBSDefaultVO` |
| `bd_cbsnode` | 成本分解结构成员 | `bd.cbs.CBSNodeVO` |
| `bd_cfadjitemset` | 现金流量项目调整项设置 | `bd.cashflow.CfAdjItemSetVO` |
| `bd_cfgbom` | 配置BOM表头 | `bd.bom.bom0204.CfgBomVO` |
| `bd_channeltype` | 渠道类型 | `bd.cust.channeltype.ChannelTypeVO` |
| `bd_commondoc` | 常用数据档案注册表 | `uap.favoritedata.doc.CommonDocVO` |
| `bd_contractbusitype` | 合同业务类型 | `ecmbd.ecmcontractmanage.ContractBusiType` |
| `bd_costmode` | 物料计价方式初始设置 | `bd.materialcostmode.CostModeVO` |
| `bd_costobjtype` | 成本对象类型 | `bd.costobjtype.entity.CostObjTypeVO` |
| `bd_countryzone` | 国家地区 | `bd.countryzone.CountryZoneVO` |
| `bd_crossbusiattr` | 属性 | `crosscheckrule.BusinessAttrVO` |
| `bd_crossbusimap` | 对象属性档案类型映射 | `crosscheckrule.CrossBusiMapVO` |
| `bd_crossrestdata` | 约束数据 | `crosscheckrule.RestraintDataVO` |
| `fipub_RuleHead` | 交叉校验规则 | `fipub.crosscheckrule.RuleHeadVO` |
| `fipub_RuleItem` | 规则子项 | `fipub.crosscheckrule.RuleItemVO` |
| `bd_crossrulerest` | 档案约束关系 | `crosscheckrule.RestraintVO` |
| `fipub_RuleBind` | 规则绑定明细 | `fipub.crosscheckrule.RuleBindVO` |
| `bd_currinfo` | 外币汇率 | `bd.currinfo.CurrinfoVO` |
| `bd_currrate` | 日汇率 | `bd.currinfo.CurrrateVO` |
| `bd_currtype` | 币种 | `bd.currtype.CurrtypeVO` |
| `bd_cust_supplier` | 客商 | `bd.cust.CustSupplierVO` |
| `bd_custaddress` | 客户收货地址 | `bd.cust.custaddress.CustaddressVO` |
| `bd_custaddressref` | 客户地址簿引用 | `bd.cust.custaddress.CustaddressrefVO` |
| `bd_custaxes` | 客户税类 | `bd.cust.custaxes.CusTaxesVO` |
| `bd_custbank` | 客户银行帐号 | `bd.cust.CustbankVO` |
| `bd_custbank` | 客商银行账户 | `bd.cust.CustbankVO` |
| `bd_custbank` | 供应商银行账号 | `bd.cust.CustbankVO` |
| `bd_custclass` | 客户基本分类 | `bd.cust.custclass.CustClassVO` |
| `bd_custcreditctl` | 客户信用控制 | `bd.cust.creditctl.CustCreditCtlVO` |
| `bd_custfinance` | 客户财务信息 | `bd.cust.finance.CustFinanceVO` |
| `bd_custlinkman` | 客户联系人 | `bd.cust.CustlinkmanVO` |
| `bd_custmaterial` | 客户物料码 | `uapbd.custmaterial.CustMaterialVO` |
| `bd_custmatersub` | 客户物料码子表 | `uapbd.custom.CustomVO` |
| `bd_custmerge` | 客户合并信息 | `bd.cust.merge.CustmergeVO` |
| `bd_customer` | 客户基本信息 | `bd.cust.CustomerVO` |
| `bd_customer_pf` | 客户申请单 | `bd.cust.pf.CustomerPfVO` |
| `bd_custorg` | 客户组织分配关系 | `bd.cust.custorg.CustOrgVO` |
| `bd_custsale` | 客户销售信息 | `bd.cust.saleinfo.CustsaleVO` |
| `bd_custsaleclass` | 客户销售分类 | `bd.cust.custsaleclass.CustSaleClassVO` |
| `bd_custstructure` | 客户层次结构 | `bd.cust.CuststructureVO` |
| `bd_custtaxtypes` | 客户国家税类 | `bd.cust.CustCountrytaxesVO` |
| `bd_custupgrade` | 客户升级 | `bd.cust.upgrade.CustUpgradeVO` |
| `bd_custvat` | 客户VAT | `bd.cust.CustvatVO` |
| `bd_defdoc` | 假日类别 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 假日类别 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 补助项目 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 客商性质 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 123124 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 部门（车间） (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 地区代码 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 信用等级 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 工种 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 资金类型 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 生产厂商 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 产地 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 养护原因 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 药品养护分类 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 产品系列 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 运输工具 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 费用类型 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 客户级别 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 客户等级 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 中标类型 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | dd项目 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 特征 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 经销商情况分类 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 生产厂商情况分类 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 预审方式 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 卖方单据 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 付款方式 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 验收地点 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 认证质量体系 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 药品验收分类 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 项目 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 药品资质 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 药品证照名称 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 药品分类 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 配送时段 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 实体属性 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 部门级别 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 总账账簿属性 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 业务属性 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 药品复核分类 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 单位类型 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 单位级别 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 经济类型 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 经济行业 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 银行交易代码 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 银行摘要 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 报检状态 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_defdoc` | 供应商资料类型 (自定义档案) | `bd.defdoc.DefdocVO` |
| `bd_distrestrans_log` | 分布式档案传输明细 | `nc.bs.bd.pub.distribution.BDDistResTransLogVO` |
| `bd_distributeres` | 分布式资源扩展配置 | `nc.bs.bd.pub.distribution.DistributeResVO` |
| `bd_distributeres_b` | 分布式资源扩展配置子表 | `nc.bs.bd.pub.distribution.DistributeResBodyVO` |
| `bd_distributeres_log` | 分布式扩展配置日志表 | `nc.bs.bd.pub.distribution.DistributeResLogVO` |
| `bd_distsystemset` | 分布式节点扩展配置表 | `bd.distribute.BDDistSystemSetExtVO` |
| `bd_disttokenctrl` | 令牌资源控制表 | `bd.distribute.BDDistTokenCtrlVO` |
| `bd_disttokenctrl_b` | 令牌资源控制子表配置 | `bd.distribute.BDDistTokenCtrlBodyVO` |
| `bd_disttokenset` | 分布式令牌控制配置表 | `bd.distribute.BDDistTokenSetVO` |
| `bd_disttokenset_b` | 分布式令牌控制配置子表 | `bd.distribute.BDDistTokenSetBodyVO` |
| `bd_doccheck` | 多级管控切换校验 | `bd.doccheck.BDoccheckVO` |
| `bd_doccheckcl` | 多级管控切换检查类别 | `bd.doccheck.DocCheckClassVO` |
| `bd_elemrelation` | 核算要素与物料对照表 | `bd.elemrelation.entity.ElemRelationVO` |
| `bd_elemrelation_b` | 核算要素对应物料分类 | `bd.elemrelation.entity.ElemRelationMarClassVO` |
| `bd_elemrelation_bb` | 核算要素对应物料 | `bd.elemrelation.entity.ElemRelationMarVO` |
| `bd_elemrelation_h` | 核算要素与物料对照主表 | `bd.elemrelation.entity.ElemRelationHeadVO` |
| `bd_ematerial` | 物料加密 | `bd.ematerial.entity.EMaterialVO` |
| `bd_exratescheme` | 外币汇率方案 | `bd.exratescheme.ExrateSchemeVO` |
| `bd_fclass` | 特征类 | `bd.feature.fclass.entity.FclassHeadVO` |
| `bd_fclass_b` | 特征类明细 | `bd.feature.fclass.entity.FclassBodyVO` |
| `bd_feature` | 特征 | `bd.feature.feature.entity.FeatureHeadVO` |
| `bd_feature_b` | 特征明细 | `bd.feature.feature.entity.FeatureItemVO` |
| `bd_featurecode` | 特征码规则 | `bd.feature.featurecode.entity.SkuHeadVO` |
| `bd_featurecode_b` | 特征码规则明细 | `bd.feature.featurecode.entity.SkuBodyVO` |
| `bd_featurecode_sn` | 上次流水号记录 | `bd.feature.featurecode.entity.SkuSNVO` |
| `bd_ffile` | 特征码档案 | `bd.feature.ffile.entity.FFileHeadVO` |
| `bd_ffile_b` | 特征码档案明细 | `bd.feature.ffile.entity.FFileBodyVO` |
| `bd_fprice` | 特征价目表 | `bd.feature.fprice.entity.FPriceHeadVO` |
| `bd_fprice_b` | 特征价目表明细 | `bd.feature.fprice.entity.FPriceItemVO` |
| `bd_freecustom` | 散户 | `bd.freecustom.FreeCustomVO` |
| `bd_frelation` | 约束关系定义 | `bd.feature.frelation.entity.FrelationHeadVO` |
| `bd_frelation_b` | 约束关系明细 | `bd.feature.frelation.entity.FrelationBodyVO` |
| `bd_fundplan` | 资金计划项目 | `bd.fundplan.FundPlanVO` |
| `bd_fundplanUse` | 资金计划项目使用权 | `bd.fundplan.FundPlanUseVO` |
| `bd_goodscode` | 海关商品编码 | `bd.goodscode.GoodscodeVO` |
| `bd_goodstaxes` | 海关商品税率 | `bd.goodscode.GoodstaxesItemVO` |
| `bd_holiday` | 假日 | `bd.holiday.HolidayVO` |
| `bd_income` | 收款协议 | `bd.income.IncomeVO` |
| `bd_incomech` | 收款账期 | `bd.income.IncomeChVO` |
| `bd_incomeperiod` | 收款时点 | `bd.incomeperiod.IncomePeriodVO` |
| `bd_incoterm` | 贸易术语 | `bd.incoterm.IncotermVO` |
| `bd_inoutbusiclass` | 收支项目 | `bd.inoutbusiclass.InoutBusiClassVO` |
| `bd_inoutuse` | 收支项目使用权 | `bd.inoutbusiclass.InoutUseVO` |
| `bd_mandate` | 托收协议 | `bd.mandate.MandateVO` |
| `bd_marassistant` | 辅助属性 | `bd.material.marassistant.MarAssistantVO` |
| `bd_marasstframe` | 辅助属性结构 | `bd.material.marasstframe.MarAsstFrameVO` |
| `bd_marasstrange` | 辅助属性值域 | `bd.material.marassistant.MarAsstRangeVO` |
| `bd_marasstrst` | 约束关系 | `bd.material.marasstrst.MarAsstrstVO` |
| `bd_marasstrstval` | 约束关系子表 | `bd.material.marasstrst.MarAsstrstValVO` |
| `bd_marbasclass` | 物料基本分类 | `bd.material.marbasclass.MarBasClassVO` |
| `bd_marcostclass` | 物料成本分类 | `bd.material.marcostclass.MarCostClassVO` |
| `bd_marorg` | 物料组织分配关系 | `bd.material.marorg.MarOrgVO` |
| `bd_marpuclass` | 物料采购分类 | `bd.material.marpuclass.MarPuClassVO` |
| `bd_marsaleclass` | 物料销售分类 | `bd.material.marsaleclass.MarSaleClassVO` |
| `bd_mategrade` | 物料分类等级 | `bd.supplier.supplyabilityset.MaterialgradeVO` |
| `bd_material` | 物料基本信息（多版本） | `bd.material.MaterialVO` |
| `bd_material_pf` | 物料申请单 | `bd.material.pf.MaterialPfVO` |
| `bd_material_v` | 物料基本信息 | `bd.material.MaterialVersionVO` |
| `bd_materialbindle` | 捆绑件 | `bd.material.sale.MaterialBindleVO` |
| `bd_materialconvert` | 辅计量管理 | `bd.material.MaterialConvertVO` |
| `bd_materialcost` | 物料成本信息 | `bd.material.cost.MaterialCostVO` |
| `bd_materialcostmod` | 计价方式信息 | `bd.material.cost.MaterialCostmodeVO` |
| `bd_materialfi` | 物料财务信息 | `bd.material.fi.MaterialFiVO` |
| `bd_materialpfc` | 物料利润中心信息 | `bd.material.pfc.MaterialPfcVO` |
| `bd_materialpfcc` | 物料利润中心成本域信息 | `bd.material.pfcc.MaterialPFCCVO` |
| `bd_materialpfccsub` | 物料利润中心成本域子表信息 | `bd.material.pfcc.MaterialPFCCSubVO` |
| `bd_materialpfcsub` | 物料利润中心子表信息 | `bd.material.pfc.MaterialPfcSubVO` |
| `bd_materialplan` | 物料计划信息 | `bd.material.plan.MaterialPlanVO` |
| `bd_materialprod` | 物料生产信息 | `bd.material.prod.MaterialProdVO` |
| `bd_materialpu` | 物料采购信息 | `bd.material.pu.MaterialPuVO` |
| `bd_materialrepl` | 替换件 | `bd.material.stock.MaterialReplVO` |
| `bd_materialsale` | 物料销售信息 | `bd.material.sale.MaterialSaleVO` |
| `bd_materialstock` | 物料库存信息 | `bd.material.stock.MaterialStockVO` |
| `bd_materialtaxtype` | 物料税类信息 | `bd.material.MaterialTaxTypeVO` |
| `bd_materialwarh` | 物料仓库信息 | `bd.material.stock.MaterialWarhVO` |
| `bd_mattaxes` | 物料税类 | `bd.material.mattaxes.MatTaxesVO` |
| `bd_measdoc` | 计量单位 | `bd.material.measdoc.MeasdocVO` |
| `bd_mode_all` | 全部管控模式 | `bd.config.BDModeVO` |
| `bd_mode_selected` | 当前管控模式 | `bd.config.BDModeSelectedVO` |
| `bd_netbankinftp` | 网银信息模板 | `bd.netbanktemplate.NetbankinftpVO` |
| `bd_notetype` | 票据类型 | `bd.notetype.NotetypeVO` |
| `bd_payment` | 付款协议 | `bd.payment.PaymentVO` |
| `bd_paymentch` | 付款账期 | `bd.payment.PaymentChVO` |
| `bd_payperiod` | 付款时点 | `bd.payperiod.PayPeriodVO` |
| `bd_periodmapping` | 会计期间方案映射 | `bd.periodmapping.PeriodmappingVO` |
| `bd_periodmappingdetail` | 会计期间方案映射详细信息 | `bd.periodmapping.PeriodmappingdetailVO` |
| `bd_planstrategy` | 计划策略 | `mmbd.pst.entity.PlanStrategyVO` |
| `bd_planstrategy` | 计划策略 | `mmbd.pst.entity.PlanStrategyVO` |
| `bd_planstrategygroup` | 计划策略组 | `mmbd.psg.entity.PlanStrategyGroupVO` |
| `bd_planstrategygroup` | 计划策略组 | `mmbd.psg.entity.PlanStrategyGroupVO` |
| `bd_planstrategygroup_b` | 计划策略组明细 | `mmbd.psg.entity.PlanStrategyGroupBVO` |
| `bd_planstrategygroup_b` | 计划策略组明细 | `mmbd.psg.entity.PlanStrategyGroupBVO` |
| `bd_priceaccuracy` | 单价精度 | `bd.currtype.PriceAccuracyVO` |
| `bd_prodline` | 产品线 | `bd.prodline.ProdLineVO` |
| `bd_project` | 项目 | `pmpub.project.ProjectHeadVO` |
| `bd_project_b` | 项目 | `pmpub.project.ProjectBodyVO` |
| `bd_projectclass` | 项目类型 | `pmpub.projecttype.ProjectTypeHeadVO` |
| `bd_projectclass_b` | 项目类型子表 | `pmpub.projecttype.ProjectTypeBodyVO` |
| `bd_psnbankacc` | 个人银行账户 | `bd.psnbankacc.PsnBankaccVO` |
| `bd_psndoc` | 人员基本信息 | `bd.psn.PsndocVO` |
| `bd_psnjob` | 人员工作信息 | `bd.psn.PsnjobVO` |
| `bd_querybom` | BOM正向查询 | `bd.bom.query.BomQueryHeadVO` |
| `bd_querybom_b` | BOM正向查询明细 | `bd.bom.query.BomQueryBodyVO` |
| `bd_querybomcond` | BOM查询条件 | `bd.bom.bom1204.BomQueryCondVO` |
| `bd_rack` | 货位 | `bd.rack.RackVO` |
| `bd_rateschema` | 现金折扣方案 | `bd.rate.RateSchemaVO` |
| `bd_rateschemach` | 现金折扣方案子表 | `bd.rate.RateChVO` |
| `bd_repitemmapping` | 报表项目映射 | `bd.reportitemmapping.RepItemMappingVO` |
| `bd_replacebom` | 批量替换表头 | `bd.bom.bom0212.entity.BomReplaceVO` |
| `bd_replacebomitem` | 批量替换表体 | `bd.bom.bom0212.entity.BomReplaceItemVO` |
| `bd_reportitem` | DI报表项目 | `bd.reportitem.ReportItemVO` |
| `bd_reportsystem` | 报表项目体系 | `bd.reportsystem.ReportSystemVO` |
| `bd_rt` | 休息时间段 | `bd.shift.RTVO` |
| `bd_shift` | 班次 | `bd.shift.ShiftVO` |
| `bd_shifttype` | 班次类别 | `bd.shift.ShiftTypeVO` |
| `bd_stordoc` | 仓库 | `bd.stordoc.StordocVO` |
| `bd_supabclass` | 供货能力分类 | `bd.supplier.supplyabilityclass.SupplyAbilityClassVO` |
| `bd_supabilityset` | 供应商供货能力分类设置 | `bd.supplier.supplyabilityset.SupplyabilitysetVO` |
| `bd_supaddress` | 供应商发货地址 | `bd.supplier.supaddress.SupAddressVO` |
| `bd_supaddressref` | 供应商地址簿引用 | `bd.supplier.supaddress.SupAddressRefVO` |
| `bd_supcountrytaxes` | 供应商国家税类 | `bd.supplier.SupCountryTaxesVO` |
| `bd_supfinance` | 供应商财务信息 | `bd.supplier.finance.SupFinanceVO` |
| `bd_suplinkman` | 供应商联系人 | `bd.supplier.SupLinkmanVO` |
| `bd_supmerge` | 供应商合并信息 | `bd.supplier.merge.SupmergeVO` |
| `bd_suporg` | 供应商组织分配关系 | `bd.supplier.suporg.SupOrgVO` |
| `bd_supplier` | 供应商基本信息 | `bd.supplier.SupplierVO` |
| `bd_supplier_grade` | 等级信息 | `bd.supplier.suppliergradesys.SupplierGradeVO` |
| `bd_supplier_grade_sys` | 供应商等级体系设置 | `bd.supplier.suppliergradesys.SupplierGradeSysVO` |
| `bd_supplier_pf` | 供应商申请单 | `bd.supplier.pf.SupplierPfVO` |
| `bd_supplierclass` | 供应商基本分类 | `bd.supplier.supplierclass.SupplierclassVO` |
| `bd_supqualidoc` | 供应商资质档案 | `bd.supplier.supqualidoc.SupQualiDocVO` |
| `bd_supqualilevel` | 资质等级 | `bd.supplier.supqualidoc.SupQualiLevelVO` |
| `bd_supqualitype` | 供应商资质分类 | `bd.supplier.supqualitype.SupQualiTypeVO` |
| `bd_supstock` | 供应商采购信息 | `bd.supplier.stock.SupStockVO` |
| `bd_supstructure` | 供应商层次结构 | `uapbd.supstructure.SupStructureVO` |
| `bd_suptaxes` | 供应商税类 | `bd.supplier.suptaxes.SupTaxesVO` |
| `bd_supupgrade` | 供应商升级 | `bd.supplier.SupUpgradeVO` |
| `bd_supvat` | 供应商VAT | `bd.supplier.SupvatVO` |
| `bd_taxcode` | 增值税税码税率 | `bd.taxcode.TaxcodeVO` |
| `bd_taxrate` | 税率 | `bd.taxcode.TaxrateVO` |
| `bd_taxregion` | 税收地区 | `bd.taxregion.TaxregionVO` |
| `bd_taxregionb` | 税收行政地区 | `bd.taxregion.TaxregionBVO` |
| `bd_team` | 班组定义维护表信息 | `bd.team.team01.entity.TeamHeadVO` |
| `bd_team_b` | 班组定义维护明细表信息 | `bd.team.team01.entity.TeamItemVO` |
| `bd_templetitem` | 网银信息模板字段 | `bd.netbanktemplate.TempletitemVO` |
| `bd_transactioncode` | 交易代码 | `bd.transactioncode.TransactioncodeVO` |
| `bd_transporttype` | 运输方式 | `bd.transporttype.TransportTypeVO` |
| `bd_uniquerule` | 档案配置_档案唯一性规则 | `bd.config.BDUniqueruleVO` |
| `bd_uniquerule_item` | 档案配置_档案唯一性规则属性项 | `bd.config.BDUniqueruleItemVO` |
| `bd_urc_validator` | 档案配置_档案唯一性规则校验器工厂 | `bd.config.BDUniqueruleValidatorVO` |
| `bd_usedaccbook` | 被使用的核算账簿 | `bd.accchart.UsedAccBookVO` |
| `bd_vouchertype` | 凭证类别 | `bd.vouchertype.VoucherTypeVO` |
| `bd_wk` | 工作中心 | `bd.wk.wk0104.entity.BDWkVO` |
| `bd_wk_feed` | 投料点维护 | `bd.wk.wk0106.entity.TwVO` |
| `bd_wkclass` | 工作中心分类 | `bd.wk.wk0102.entity.WkClassVO` |
| `bd_workcalendar` | 工作日历 | `bd.workcalendar.WorkCalendarVO` |
| `bd_workcalendardate` | 日期信息 | `bd.workcalendar.WorkCalendarDateVO` |
| `bd_workcalendrule` | 工作日历规则 | `bd.workcalendrule.WorkCalendarRuleVO` |
| `bd_workcalendyear` | 年度信息 | `bd.workcalendar.WorkCalendarYearVO` |
| `bd_wt` | 工作时间段 | `bd.shift.WTVO` |
| `cabd_campaign` | 营销活动 | `cabd.mkma.mkmacampaign.mkmacampaign.CampaignVO` |
| `cabd_matters` | 营销事项 | `cabd.mkma.mkmaplan.mkmamatters.MattersVO` |
| `ct_expset` | 合同费用定义 | `ct.expset.entity.ExpsetVO` |
| `ct_pricetemplet` | 价格模板 | `ct.pricetemplet.entity.PriceTempletHeadVO` |
| `ct_pricetemplet_b` | 价格模板项 | `ct.pricetemplet.entity.PriceTempletItemVO` |
| `ct_termset` | 合同条款 | `ct.term.entity.TermVO` |
| `ct_termtype` | 合同条款类型 | `ct.termtype.entity.TermTypeVO` |
| `far_reportitem` | 报表项目 | `far.baseinfo.ReportItemVO` |
| `fi_recpaytype` | 收付款类型 | `fibd.RecpaytypeVO` |
| `ic_setpart` | 成套件 | `ic.setpart.entity.SetPartHVO` |
| `ic_setpart_b` | 成套件子件明细 | `ic.setpart.entity.SetPartBVO` |
| `mm_bom_material` | BOM物料树节点 | `bd.bom.bom0202.entity.BomMaterialTreeVO` |
| `org_closeacc` | 账簿_组织批量关账 | `org.BatchCloseAccBookVO` |
| `org_closeacc` | 账簿_组织关账 | `org.CloseAccBookVO` |
| `org_liactcostrg` | 利润中心成本域 | `org.liactcostrg.LiactCostrgVO` |
| `org_morgstru` | 组织结构_维修组织体系 | `ambd.morgstru.MaintainOrgStruVO` |
| `org_morgstru_v` | 组织结构_维修组织体系版本 | `ambd.morgstru.MaintainOrgStruVersionVO` |
| `org_morgstrumember` | 组织结构_维修组织体系带编码名称 | `ambd.morgstru.MaintainOrgStruWithCodeNameVO` |
| `org_morgstrumember` | 组织结构_维修组织体系成员 | `ambd.morgstru.MaintainOrgStruMemberVO` |
| `org_morgstrumember_v` | 组织结构_维修组织体系成员版本 | `ambd.morgstru.MaintainOrgStruMemberVersionVO` |
| `org_productionplan` | 生产计划体系 | `org.productionplan.ProductionPlanVO` |
| `org_produpmember` | 生产计划体系成员 | `org.productionplan.ProduPMemberVO` |
| `org_produpmember` | 生产计划体系成员含编码名称 | `org.productionplan.ProduPMemberWithCodeNameVO` |
| `pam_cate_param` | 设备类别技术参数 | `am.category.CateParamVO` |
| `pam_category` | 设备类别 | `am.category.CategoryVO` |
| `pam_status` | 设备状态 | `am.status.StatusVO` |
| `pd_meainstrucl` | 计量器具级别 | `pd.pd0318.entity.MscVO` |
| `pd_meastool` | 计量器具维护 | `pd.pd0320.entity.MeasToolVO` |
| `pd_rc` | 标准工序 | `bd.rt.rt0004.entity.RcVO` |
| `pd_rt` | 工艺路线主表 | `bd.rt.rt0008.entity.RtHeadVO` |
| `pd_rt_activity` | 工序作业档案 | `bd.rt.rt0008.entity.RtActivityVO` |
| `pd_rt_assorg` | 分配组织 | `bd.rt.rt0008.entity.AssOrgVO` |
| `pd_rt_b` | 工序信息 | `bd.rt.rt0008.entity.RtItemVO` |
| `pd_rt_opac` | 工序耗料 | `bd.rt.rt0008.entity.RtOpacVO` |
| `pd_rttemplate` | 工艺路线模板主表 | `bd.rt.rt0006.entity.RtTemplateHeadVO` |
| `pd_rttemplate_b` | 工艺路线模板子表 | `bd.rt.rt0006.entity.RtTemplateItemVO` |
| `pm_eps` | 企业项目结构 | `pmpub.eps.EpsVO` |
| `pm_wbs` | 项目任务 | `pmpub.wbs.WbsVO` |
| `pub_printinfo` | 打印申请信息 | `uapbd.printpf.PrintProposeInfoVO` |
| `pub_printpf` | 打印申请单 | `uapbd.printpf.PrintCtrlPfVO` |
| `qc_checkbasis` | 检测依据 | `qc.checkbasis.entity.BasisHeaderVO` |
| `qc_checkbasis_b` | 检测依据子表 | `qc.checkbasis.entity.BasisItemVO` |
| `qc_checkitem` | 检验项目 | `qc.checkitem.entity.CheckItemVO` |
| `qc_rejecttype` | 质量不合格类型 | `scmf.qc.rejecttype.entity.RejectTypeVO` |
| `qc_rejecttype_b` | 质量不合格类型关联检验项目明细 | `nc.voqc.qc_rejecttype_b.qc_rejecttype_b` |
| `resa_ccdepts` | 包含部门 | `resa.costcenter.CCDeptVO` |
| `resa_ccgroupdetail` | 包含成本中心 | `resa.costcentergroup.CCGroupdetailVO` |
| `resa_ccworkcenter` | 包含工作中心 | `resa.costcenter.CCWorkCenterVO` |
| `resa_controlarea` | 管控范围 | `resa.controlarea.ControlAreaVO` |
| `resa_costcenter` | 成本中心 | `resa.costcenter.CostCenterVO` |
| `resa_costcentergroup` | 成本中心组 | `resa.costcentergroup.CostCenterGroup` |
| `resa_elementsystem` | 责任会计_要素体系 | `resa.elementsystem.ElementSystemVO` |
| `resa_elementtype` | 责任会计_要素类型 | `resa.elementsystem.ElementTypeVO` |
| `resa_facaccrelate` | 要素科目对照关系 | `resa.factor.FacAccRelateVO` |
| `resa_facasoahistory` | 要素关联信息历史 | `resa.factor.history.FactorAsoaHistoryVO` |
| `resa_facasshistory` | 辅助核算历史 | `resa.factor.history.FactorAssHistoryVO` |
| `resa_facctrlorg` | 可细化组织 | `resa.factor.FacctrlorgVO` |
| `resa_factor` | 核算要素 | `resa.factor.FactorVO` |
| `resa_factorasoa` | 要素关联信息 | `resa.factor.FactorAsoaVO` |
| `resa_factorass` | 关联辅助核算 | `resa.factor.FactorAssVO` |
| `resa_factorchart` | 要素表 | `resa.factor.FactorChartVO` |
| `resa_factorctrlca` | 可细化管控范围 | `resa.factor.FactorCtrlOrg` |
| `resa_factorctrlgroup` | 可细化集团 | `resa.factor.FactorCtrlGroup` |
| `resa_factorgroup` | 核算要素组 | `resa.factor.FactorGroupVO` |
| `resa_factorsingroup` | 要素组内要素 | `resa.factor.FactorsInGroupVO` |
| `resa_policychar` | 政策性要素表关联集团 | `resa.factor.PolicycharGroupVO` |
| `resa_sosinca` | 责任会计_包含工厂 | `resa.controlarea.SOsInCAVO` |
| `scm_dealfashion` | 处理方式 | `scmf.qc.dealfashion.entity.DealFashionVO` |
| `scm_qualitylevel_b` | 质量等级 | `scmf.qc.qualitylevel.entity.QualityLevelItemVO` |
| `scm_qualitylevel_h` | 质量等级组 | `scmf.qc.qualitylevel.entity.QualityLevelHeadVO` |
| `srmsm_marbasclsext` | 物料基本分类供应商扩展 | `bd.marbasclsext.entity.MarBasClsExtVO` |
| `srmsm_marbasclsext_b` | 物料基本分类供应商扩展资质明细 | `bd.marbasclsext.entity.MarBasClsExtBVO` |
| `srmsm_supplierext_a` | 供货能力分类 | `bd.supplierext.entity.SupplierExtAVO` |
| `srmsm_supplierext_h` | 供应商扩展信息 | `bd.supplierext.entity.SupplierExtHVO` |
| `srmsm_supplierext_i` | 资料 | `bd.supplierext.entity.SupplierExtIVO` |
| `srmsm_supplierext_p` | 产品 | `bd.supplierext.entity.SupplierExtPVO` |
| `srmsm_supplierext_q` | 资质 | `bd.supplierext.entity.SupplierExtQVO` |
| `txm_taxkind` | 税种 | `txm.taxpub.TaxKindVO` |
| `txm_taxrate` | 税率 | `txm.taxpub.TaxrateVO` |
| `uap_closeaccmodule` | 账簿_组织关账模块期间 | `org.CloseAccModuleVO` |
| `uap_notused` | 常用数据 | `uap.favoritedata.FavoriteDataVO` |
| `vrm_vendormater` | 供应商物料关系 | `scmf.vrm.vm.entity.VendorMaterBVO` |

### uapbs uapbs（12 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `adp_cleantranslogconfig` | 传输日志卸载配置 | `uap.distribution.cleantranslogconfig.CleanTransLogConfigVO` |
| `adp_cleantranslogrecord` | 卸载传输日志记录 | `uap.distribution.cleantranslogconfig.CleanTransLogRecordVO` |
| `adp_groupsattrib` | 集团属性 | `uap.distribution.syscatalog.GroupsAttributeVO` |
| `adp_listenerreg` | 系统监听注册 | `uap.vo.distribution.event.ListenerRegisterVO` |
| `adp_message` | 传输消息 | `uap.vo.distribution.message.TransMessageVO` |
| `adp_pkgloginfo` | 包管理日志信息 | `uap.distribution.ADPPkgLogVO` |
| `adp_receiverrule` | 接收规则 | `uap.distribution.syscatalog.ReceiverRuleVO` |
| `adp_syscatalog` | 分布系统目录 | `uap.distribution.syscatalog.SysCatalogVO` |
| `adp_t_activity` | 传输活动 | `uap.distribution.datatrans.TransActivityVO` |
| `adp_t_pack` | 传输包 | `uap.distribution.datatrans.TransPackVO` |
| `adp_t_session` | 传输会话 | `uap.distribution.datatrans.TransSessionVO` |
| `pub_multilang` | 语种信息 | `ml.LanguageVO` |

### uapportal 门户集成（1 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `pt_ssoprop` | 单点登陆配置 | `nc.uap.portal.vo.PtSsopropVO` |

### ufds 数据方案（18 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `bd_datatype` | DI数据类型 | `bd.datatype.DataTypeVO` |
| `bd_di_crossitem` | 整合方案交叉表设置选择项 | `bd.intdata.dicrossitem.DICrossSetItemVO` |
| `bd_di_datasource` | 数据整合数据来源 | `bd.intdata.scheme.DIDataSourceVO` |
| `bd_di_dim` | 数据整合维度 | `bd.intdata.scheme.DIDimensionVO` |
| `bd_di_mea` | 数据整合度量 | `bd.intdata.scheme.DIMeasureVO` |
| `bd_di_orderitem` | 财务数据方案预览排序项 | `bd.intdata.diorderitem.DIOrderItemVO` |
| `bd_di_reclassify` | 重分类规则 | `bd.intdata.scheme.DIReclassifyRuleVO` |
| `bd_di_scheme` | 财务数据方案 | `bd.intdata.scheme.DISchemeVO` |
| `bd_di_schemesort` | 整合方案分类 | `bd.intdata.scheme.DISchemeSortVO` |
| `iufo_accitem_map` | 辅助核算对照 | `iufo.v5fetchdata.comm.AccassItemMapVO` |
| `iufo_anarep` | 分析报表 | `iufo.anareport.AnaReportVO` |
| `iufo_anarep_dir` | 分析报表分类 | `iufo.anareport.AnaReportDirVO` |
| `iufo_attr_map` | 档案属性映射 | `iufo.v5fetchdata.comm.AttributeMapVO` |
| `iufo_docdim` | 报表档案映射维度 | `iufo.docmapping.DIDocDimVO` |
| `iufo_docdim_v5` | V5档案映射维度 | `iufo.v5.docmapping.V5DIDocDimVO` |
| `iufo_docmapping` | 报表档案映射 | `iufo.docmapping.DIDocMappingVO` |
| `iufo_docmapping_V5` | V5档案映射 | `iufo.v5.docmapping.V5DIDocMappingVO` |
| `iufo_v5_schemamap` | v5_schemamap | `bd.intdata.v5.scheme.V5SchemaMap` |

### ufesbexpress ufesbexpress（10 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `eip_eis` | EIS消息 | `eip.eis.EISVO` |
| `xx_auxiregister` | 辅助信息详细信息 | `pfxx.auxiliary.AuxiregisterVO` |
| `xx_bdcontra` | 基础数据对照 | `pfxx.bdconstra.BDConstraVO` |
| `xx_bdcontra_b` | 基础数据详细对照 | `pfxx.bdconstra.BDContraDtlVO` |
| `xx_exsystem` | 外部系统信息 | `pfxx.exsystem.ExsystemVO` |
| `xx_exsystemdoc` | 基础档案翻译器信息 | `pfxx.exsystem.ExsystemDocVO` |
| `xx_idcontrast` | ID对照表 | `pfxx.idcontrast.IDContrastVO` |
| `xx_translator` | 翻译器 | `pfxx.translator.TranslatorVO` |
| `xx_xlog` | 详细日志 | `pfxx.xlog.XlogVO` |
| `xx_xsysregister` | 辅助信息基本信息 | `pfxx.auxiliary.XsysregisterVO` |

### webbd 基础数据管理（51 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `cp_appscategory` | 协同功能节点分类 | `nc.uap.cpb.org.vos.CpAppsCategoryVO` |
| `cp_appsnode` | 协同功能节点 | `nc.uap.cpb.org.vos.CpAppsNodeVO` |
| `cp_appstype` | 协同功能节点类型 | `nc.uap.cpb.org.vos.CpAppsTypeVO` |
| `cp_datacopy` | 协同同步数据插件 | `nc.uap.cpb.systools.datacopy.CpDataCopyVo` |
| `cp_datacopyconfig` | 数据同步配置 | `nc.uap.cpb.systools.datcopy.CpDataCopyConfigVo` |
| `cp_device` | 设备 | `nc.uap.cpb.org.vos.CpDeviceVO` |
| `cp_dsconfig` | 数据源配置 | `nc.uap.cpb.org.vos.CpDsConfigVO` |
| `cp_eventlistener` | 协同业务插件实体 | `uap.lfw.bd.event.CpEventListenerVO` |
| `cp_eventtype` | 协同事件类型 | `uap.lfw.bd.event.CpEventTypeVO` |
| `cp_faq` | 快速问答 | `nc.uap.cpb.rightlayer.vo.FaqVO` |
| `cp_filelock` | 协同正文锁 | `uap.wap.bd.file.CpFileLockVO` |
| `cp_freenode` | 功能白名单 | `nc.uap.cpb.org.vos.CpFreenodeVO` |
| `cp_ldapimportcfg` | 协同LDAP数据导入配置 | `nc.uap.cpb.systools.ncimport.ldap.CpLdapImportcfg` |
| `cp_menucategory` | 菜单分组 | `nc.uap.cpb.org.vos.CpMenuCategoryVO` |
| `cp_menuitem` | 协同菜单项 | `nc.uap.cpb.org.vos.CpMenuItemVO` |
| `cp_module` | 模块 | `nc.uap.cpb.org.vos.CpModuleVO` |
| `cp_orgaccredit` | 组织授权权 | `nc.uap.cpb.org.vos.CpOrgAccreditVO` |
| `cp_orgs` | 协同组织 | `nc.uap.cpb.org.orgs.CpOrgVO` |
| `cp_psndoc` | 协同人员基本信息 | `nc.uap.cpb.psn.CpPsndocVO` |
| `cp_psnjob` | 协同人员工作信息 | `nc.uap.cpb.psn.CpPsnJobVO` |
| `cp_relappsnode` | 相关功能 | `nc.uap.cpb.rightlayer.vo.RelappsnodeVO` |
| `cp_res` | 协同权限资源 | `uap.lfw.bd.resource.CpFuncResourceVO` |
| `cp_resaccredit` | 功能权限资源授权权 | `nc.uap.cpb.org.vos.CpResAccreditVO` |
| `cp_resource` | 协同资源 | `nc.uap.cpb.org.vos.CpResourceVO` |
| `cp_resp_func` | 协同职责功能节点 | `nc.uap.cpb.org.vos.CpRespFuncVO` |
| `cp_resp_res` | 协同职责资源 | `nc.uap.cpb.org.vos.CpRespResVO` |
| `cp_responsibility` | 协同职责 | `nc.uap.cpb.org.vos.CpResponsibilityVO` |
| `cp_role` | 协同角色 | `nc.uap.cpb.org.vos.CpRoleVO` |
| `cp_rolefunnode` | 协同角色功能节点 | `nc.uap.cpb.org.vos.CpRoleFunnodeVO` |
| `cp_rolegroup` | 协同角色组 | `nc.uap.cpb.org.vos.CpRoleGroupVO` |
| `cp_roleorg` | 协同角色组织 | `nc.uap.cpb.org.vos.CpRoleOrgVO` |
| `cp_roleres` | 协同角色资源 | `nc.uap.cpb.org.vos.CpRoleResVO` |
| `cp_roleresp` | 协同角色职责 | `nc.uap.cpb.org.vos.CpRoleRespVO` |
| `cp_subfunc` | 子功能 | `nc.uap.cpb.org.vos.CpSubFuncVO` |
| `cp_sysinit` | web参数设置 | `nc.uap.cpb.org.vos.CpSysinitVO` |
| `cp_sysinittemp` | 参数模板设置 | `nc.uap.cpb.org.vos.CpSysinittempVO` |
| `cp_templatedept` | 模板部门关系表 | `nc.uap.cpb.templaterela.vo.CpTemplateDeptVO` |
| `cp_templateorg` | 模板组织关系表 | `nc.uap.cpb.templaterela.vo.CpTemplateOrgVO` |
| `cp_templaterole` | 模板角色关系表 | `nc.uap.cpb.templaterela.vo.CpTemplateRoleVO` |
| `cp_templateuser` | 模板用户关系表 | `nc.uap.cpb.templaterela.vo.CpTemplateUserVO` |
| `cp_user` | 协同用户 | `nc.uap.cpb.org.vos.CpUserVO` |
| `cp_usergroup` | 协同用户组 | `nc.uap.cpb.org.vos.CpUserGroupVO` |
| `cp_usergrouprole` | 用户组角色 | `nc.uap.cpb.org.vos.CpUserGroupRoleVO` |
| `cp_usergroupuser` | 用户组用户 | `nc.uap.cpb.org.vos.CpUserGroupUserVO` |
| `cp_userrole` | 协同用户角色 | `nc.uap.cpb.org.vos.CpUserRoleVO` |
| `cp_userrole` | 协同用户角色 | `nc.uap.cpb.org.vos.CpUserRoleVO` |
| `cpb_business_log` | 协同业务日志 | `nc.uap.cpb.log.datalog.DataLogVO` |
| `cpb_funcoper_log` | 协同操作日志 | `nc.uap.cpb.log.operatorlog.CpOperatorLogVO` |
| `cpb_login_log` | 协同登录日志 | `nc.uap.cpb.log.loginlog.LoginLogVO` |
| `pt_extension` | 协同扩展 | `nc.uap.portal.plugins.model.PtExtension` |
| `pt_extpoint` | 协同扩展点 | `nc.uap.portal.plugins.model.PtExtensionPoint` |

### webdbl 自由表单（19 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `cp_doc` | 协同公共对象 | `uap.lfw.dbl.vo.CpDocVO` |
| `cp_doc_attr` | 协同公共对象属性 | `uap.lfw.dbl.vo.CpDocAttributeVO` |
| `cp_doc_effect` | 协同公共对象影响关系 | `uap.lfw.dbl.vo.CpDocEffectVO` |
| `cp_doc_list` | 协同公共对象明细 | `uap.lfw.dbl.vo.CpDocListVO` |
| `cp_doc_objrel` | 协同公共对象实例关联 | `uap.lfw.dbl.vo.CpDocObjRelateVO` |
| `cp_doc_sysattr` | 协同公共对象系统属性 | `uap.lfw.dbl.vo.CpDocSysAttrVO` |
| `cp_doc_sysattrtype` | 协同公共对象特性分类 | `uap.lfw.dbl.vo.CpDocSysAttrTypeVO` |
| `cp_doc_type` | 协同公共对象类型 | `uap.lfw.dbl.vo.CpDocTypeVO` |
| `webdbl_BizInfMapVO` | 接口关系 | `uap.lfw.md.vo.BizInfMapVO` |
| `webdbl_MDEnumType` | 枚举对象 | `uap.lfw.md.vo.MDEnumTypeVO` |
| `webdbl_enumvalue` | 枚举值 | `uap.lfw.md.vo.MDEnumValueVO` |
| `webdbl_mutexInfo` | 特性互斥表 | `uap.lfw.dbl.vo.mutexInfoVO` |
| `webdbl_sysmutexinfo` | 系统特性互斥 | `uap.lfw.dbl.vo.SysmutexinfoVO` |
| `webdbl_sysrelyinfo` | 系统特性依赖 | `uap.lfw.dbl.vo.SysrelyinfoVO` |
| `webdbl_uitemp` | 模板关系 | `uap.lfw.dbl.vo.UiTempRelVO` |
| `wfm_formdef` | 表单定义 | `uap.wap.dbl.vo.WfmFormDefVO` |
| `wfm_formtemplate` | 表单模板 | `uap.wap.dbl.vo.WfmFormTemplateVO` |
| `wfm_formtype` | 表单分类 | `uap.wap.dbl.vo.WfmFormTypeVO` |
| `wfm_freeform` | 自由表单 | `nc.uap.wfm.formhistory.WfmFreeFormVO` |

### webimp 客户化应用配置（44 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `cp_gz_condition` | 协同规则条件 | `nc.uap.ctrl.tpl.gz.base.CpGzConditionVO` |
| `cp_gz_template` | 协同规则模板 | `nc.uap.ctrl.tpl.gz.base.CpGzTemplateVO` |
| `cp_print_condition` | 协同打印条件 | `nc.uap.ctrl.tpl.print.base.CpPrintConditionVO` |
| `cp_print_template` | 协同打印模板 | `nc.uap.ctrl.tpl.print.base.CpPrintTemplateVO` |
| `cp_query_condition` | 协同查询条件 | `nc.uap.ctrl.tpl.qry.base.CpQueryConditionVO` |
| `cp_query_template` | 协同查询模板 | `nc.uap.ctrl.tpl.qry.base.CpQueryTemplateVO` |
| `cp_queryscheme` | 协同查询方案 | `nc.uap.ctrl.tpl.qry.base.QuerySchemeVO` |
| `cp_rulescheme` | 协同规则方案 | `nc.uap.ctrl.tpl.gz.RuleSchemeVO` |
| `cp_scancfg` | 高拍仪属性 | `nc.uap.ctrl.scan.ScanConfigVO` |
| `uapcp_Ekey` | EKey | `nc.uap.portal.ctrl.office.data.sign.EkeyVO` |
| `uapcp_OfficeFile` | Office文件 | `nc.uap.portal.ctrl.office.data.OfficeFileVO` |
| `uapcp_OfficeFileUser` | 文档用户关联表 | `nc.uap.portal.ctrl.office.data.OfficeFileUserVO` |
| `uapcp_auditlog` | 印章审计日志 | `nc.uap.portal.ctrl.office.data.sign.AuditlogVO` |
| `uapcp_ekeyUser` | EKey用户 | `nc.uap.portal.ctrl.office.data.sign.EkeyUserVo` |
| `uapcp_serversign` | 服务器印章 | `nc.uap.portal.ctrl.office.data.sign.ServersignVO` |
| `uapcp_signlog` | 签章日志 | `nc.uap.portal.ctrl.office.data.sign.SignlogVO` |
| `uapcp_usersigns` | 印章用户 | `nc.uap.portal.ctrl.office.data.sign.UsersignsVO` |
| `wfm_addsignuser` | 加签用户 | `nc.uap.wfm.vo.WfmAddSignUserVO` |
| `wfm_approveresult` | 审批结果 | `nc.uap.wfm.vo.ApproveResult` |
| `wfm_attachpurview` | 流程附件显示项属性 | `nc.uap.wfm.vo.WfmAttachPurviewVO` |
| `wfm_beforeaddsign` | 前加签 | `nc.uap.wfm.vo.WfmBeforeAddSignVO` |
| `wfm_commonword` | 常用语 | `nc.uap.wfm.vo.WfmCommonWordVO` |
| `wfm_fieldrelation` | 字段映射关系 | `nc.uap.wfm.vo.WfmFieldRelationVO` |
| `wfm_fieldsetting` | 字段控制元素 | `nc.uap.wfm.vo.WfmFieldSettingVO` |
| `wfm_fieldsettingrule` | 字段控制规则 | `nc.uap.wfm.vo.WfmFieldSettingRuleVO` |
| `wfm_flowagent` | 流程代理 | `nc.uap.wfm.vo.WfmFlowAgentVO` |
| `wfm_flwcat` | 流程大类 | `nc.uap.wfm.vo.WfmFlwCatVO` |
| `wfm_flwtype` | 流程类型 | `nc.uap.wfm.vo.WfmFlwTypeVO` |
| `wfm_frmnumelem` | 制单号规则元素 | `nc.uap.wfm.vo.WfmFrmNumElemVO` |
| `wfm_frmnumrule` | 制单号规则 | `nc.uap.wfm.vo.WfmFrmNumRuleVO` |
| `wfm_message` | 流程消息 | `nc.uap.wfm.vo.WfmMessageVO` |
| `wfm_prodef` | 流程定义 | `nc.uap.wfm.vo.WfmProdefVO` |
| `wfm_proins` | 流程实例 | `nc.uap.wfm.vo.WfmProInsVO` |
| `wfm_proinsstate` | 流程实例监控 | `nc.uap.wfm.vo.WfmProInsStateVO` |
| `wfm_selffunc` | 自定义函数 | `nc.uap.wfm.vo.WfmSelfFunVO` |
| `wfm_serialcode` | 流水号 | `nc.uap.wfm.vo.WfmSerialCodeVO` |
| `wfm_stepopinion` | 阶段意见 | `nc.uap.wfm.vo.WfmStepOpinionVO` |
| `wfm_supervise` | 流程督办 | `nc.uap.wfm.vo.WfmSuperviseVO` |
| `wfm_task` | 任务实例 | `nc.uap.wfm.vo.WfmTaskVO` |
| `wfm_tasktabcol` | 任务表头 | `nc.uap.wfm.vo.WfmTaskTabColVO` |
| `wfm_urgency` | 催办 | `nc.uap.wfm.vo.WfmUrgencyVO` |
| `wfm_vacation` | 休息日 | `nc.uap.wfm.vo.WfmVacationVO` |
| `wfm_virtualrole` | 虚拟角色 | `nc.uap.wfm.vo.WfmVirtualRoleVO` |
| `wfm_weekend` | 周末 | `nc.uap.wfm.vo.WfmWeekendVO` |

### webrt 运行引擎（1 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `uw_formula` | 公式实体 | `nc.uap.lfw.core.formular.FormulaVO` |

### websm 系统管理（14 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `pt_content` | 静态内容 | `nc.uap.portal.vo.PtContentVO` |
| `pt_display` | 小组件显示实体 | `nc.uap.portal.vo.PtDisplayVO` |
| `pt_displaycate` | 小组件分组 | `nc.uap.portal.vo.PtDisplaycateVO` |
| `pt_module` | 门户模块 | `nc.uap.portal.vo.PtModuleVO` |
| `pt_pagedept` | 布局部门关系表 | `nc.portal.portlet.vo.PtPageDeptVO` |
| `pt_pageorg` | 布局组织关系表 | `nc.portal.portlet.vo.PtPageOrgVO` |
| `pt_pagerole` | 布局角色关系表 | `nc.portal.portlet.vo.PtPageRoleVO` |
| `pt_pageuser` | 布局用户关系表 | `nc.portal.portlet.vo.PtPageUserVO` |
| `pt_portalpage` | 页面布局管理 | `nc.uap.portal.vo.PtPageVO` |
| `pt_portlet` | Portlet实体 | `nc.uap.portal.vo.PtPortletVO` |
| `pt_preference` | portlet配置实体 | `nc.uap.portal.vo.PtPreferenceVO` |
| `pt_regularitem` | 我的常用 | `nc.uap.portal.vo.PtRegularItemVO` |
| `uw_template` | 个性化模板 | `nc.uap.lfw.stylemgr.vo.UwTemplateVO` |
| `uw_view` | 个性化view | `nc.uap.lfw.stylemgr.vo.UwViewVO` |

## 协同办公（14 模块，172 表）

### oaar 活动报名管理（9 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `bd_defdoc` | 活动类别 (自定义档案) | `bd.defdoc.DefdocVO` |
| `oaar_acceptor` | 收件人 | `oa.oaar.activity.AcceptorVO` |
| `oaar_activity` | 活动 | `oa.oaar.activity.ActivityVO` |
| `oaar_acttype` | 活动分类 | `oa.oaar.activity.ActTypeVO` |
| `oaar_attend` | 活动人员报名情况 | `oa.oaar.activity.AttendVO` |
| `oaar_invitation` | 邀请 | `oa.oaar.activity.InvitationVO` |
| `oaar_notice` | 活动通知设置 | `oa.oaar.activity.NoticeVO` |
| `oaar_signup` | 活动报名 | `oa.oaar.activity.SignUpVO` |
| `oaar_signupform` | 报名表 | `oa.oaar.activity.SignupFormVO` |

### oacm 合同文本管理（16 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `oa_defdoc` | 合同分类 (自定义档案) | `bd.defdoc.DefdocVO` |
| `oacm_ContractApplyDoc` | 合同会签单 | `oa.oacm.contractapplydoc.ContractApplyDocVO` |
| `oacm_MaterialVO` | 物料子表 | `oa.oacm.contractapplydoc.MaterialVO` |
| `oacm_Materialinfo` | 合同物料信息 | `oa.oacm.contractinfodoc.Materialinfo` |
| `oacm_PayplanVO` | 付款计划子表 | `oa.oacm.contractapplydoc.PayplanVO` |
| `oacm_Payplaninfo` | 付款计划信息 | `oa.oacm.contractinfodoc.Payplaninfo` |
| `oacm_RecvplanVO` | 收款计划子表 | `oa.oacm.contractapplydoc.RecvplanVO` |
| `oacm_Recvplaninfo` | 收款计划信息 | `oa.oacm.contractinfodoc.Recvplaninfo` |
| `oacm_contractchanges` | 合同变动情况 | `oa.oacm.contractinfodoc.ContractChangesVO` |
| `oacm_contractexecuteinfo` | 合同收付款情况 | `oacm.contractexecuteinfo.ContractExecuteInfoVO` |
| `oacm_contractinfodoc` | 合同文本 | `oa.oacm.contractinfodoc.ContractInfoDocVO` |
| `oacm_contractstatus` | 合同状态 | `oa.oacm.contractstatus.ContractStatusVO` |
| `oacm_contracttemplate` | 合同模板 | `oa.oacm.contracttemplate.ContractTemplateVO` |
| `oacm_contracttype` | 合同类型 | `oa.oacm.contracttype.ContractTypeVO` |
| `oacm_relatedcontractdetail` | 关联合同明细 | `oa.oacm.relatedcontracts.RelatedContractDetailVO` |
| `oacm_relatedcontracts` | 关联合同 | `oa.oacm.relatedcontracts.RelatedContractsVO` |

### oaco 沟通与协作（29 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `oaco_associateform` | 关联表单 | `oa.oaco.basecomp.associateform.AssociateFormVO` |
| `oaco_associatetype` | 关联类型 | `oa.oaco.basecomp.associateform.AssociateTypeVO` |
| `oaco_contact` | 通讯录 | `oa.oaco.adl.ContactVO` |
| `oaco_formtype` | 表单类型 | `oa.oaco.basecomp.associateform.FormTypeVO` |
| `oaco_group` | 企业分组 | `oa.oaco.adl.EGroupVO` |
| `oaco_grpprsn` | 企业分组人员 | `oa.oaco.adl.EGroupPersonVO` |
| `oaco_imparaset` | IM工具开发参数设置 | `oa.oaco.im.IMParaSetVO` |
| `oaco_maskfield` | 字段显示设置 | `oa.oaco.adl.MaskFieldVO` |
| `oaco_msgstore` | 消息 | `oa.oaco.pub.msg.MessageStoreVO` |
| `oaco_oaShareType` | 分享类型 | `oa.oaco.basecomp.share.ShareTypeVO` |
| `oaco_oamessage` | 协同消息 | `oa.oaco.oamessage.OaMessageVO` |
| `oaco_orgsyn` | IM组织同步 | `oa.oaco.im.OrgsynVO` |
| `oaco_paraset` | 参数设置 | `oa.oaco.pub.ParaSetVO` |
| `oaco_person` | 协同人员基本信息 | `oa.oaco.adl.PersonVO` |
| `oaco_personsyn` | IM人员同步 | `oa.oaco.im.PersonsynVO` |
| `oaco_pgroup` | 个人分组 | `oa.oaco.adl.PersonGroupVO` |
| `oaco_pgrpprsn` | 个人分组人员 | `oa.oaco.adl.PrivateGroupPersonVO` |
| `oaco_privateorg` | 私有组织 | `oa.oaco.adl.PrivateOrgVO` |
| `oaco_pubfreeform` | 协同自由表单 | `oa.oaco.basecomp.freeform.PubFreeformVO` |
| `oaco_remindtime` | 提醒时段 | `oa.oaco.scheduler.RemindtimeVO` |
| `oaco_scheduleragent` | 日程代理 | `oa.oaco.scheduler.SchedulerAgentVO` |
| `oaco_schedulercache` | 日程缓存 | `oa.oaco.scheduler.SchedulerCacheVO` |
| `oaco_schedulerevent` | 日程事件 | `oa.oaco.scheduler.SchedulerEventVO` |
| `oaco_schedulerrecur` | 日程重复周期 | `oa.oaco.scheduler.SchedulerRecurVO` |
| `oaco_schedulertab` | 日程业务页签 | `oa.oaco.scheduler.SchedulerTabVO` |
| `oaco_schedulertype` | 日程类型 | `oa.oaco.scheduler.SchedulerTypeVO` |
| `oaco_scopeset` | 范围设置 | `oa.oaco.basecomp.scopeset.ScopeSetVO` |
| `oaco_sharemap` | 分享映射 | `oa.oaco.basecomp.share.ShareMapVO` |
| `oaco_ttnode` | 类型树节点 | `oa.oaco.adl.TypeTreeNodeVO` |

### oaff 协同表单（12 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `oaff_TradeTemplate` | 行业模板 | `oa.oaff.tradetemplate.TradeTemplateVO` |
| `oaff_customcomp` | 自定义控件 | `oa.oaff.customcomp.CustomCompVO` |
| `oaff_customwidget` | 自定义控件（可更改） | `oaff.customwidget.CustomWidgetVO` |
| `oaff_enummd` | displayname | `oa.oaff.oatemplate.EnumMdVO` |
| `oaff_oaformtemplate` | 协同表单模板 | `oaff.oaformtemplate.OaFormTemplateVO` |
| `oaff_oafreeform` | 协同表单 | `oaff.oafreeformcategory.OaFreeformVO` |
| `oaff_oafreeformcategory` | 协同表单分类 | `oaff.oafreeform.OaFreeformCatVO` |
| `oaff_oafreeformmd` | 协同表单元数据 | `oaff.oafreeformmd.OaFreeformMdVO` |
| `oaff_syscharacter` | 协同表单系统特性 | `oaff.syscharacter.SysCharacterVO` |
| `oaff_syscharmutex` | 系统特性互斥 | `oaff.syscharacter.SysCharMutexVO` |
| `oaff_syscharrely` | 系统特性依赖 | `oaff.syscharacter.SysCharRelyVO` |
| `oaff_tradetemptype` | 行业模板类型 | `oaff.tradetemptype.TradetemptypeVO` |

### oainf 信息发布（10 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `oainf_blogpara` | 微博设置参数 | `oa.oainf.blog.BlogSetParaVO` |
| `oainf_blogset` | 信息分享微博设置 | `oa.oainf.blog.BlogSetVO` |
| `oainf_blogshare` | 微博分享历史 | `oa.oainf.info.BlogShareVO` |
| `oainf_citmlpt` | 栏目信息模板 | `oa.oainf.column.CInfoTemplateVO` |
| `oainf_column` | 栏目 | `oa.oainf.column.ColumnVO` |
| `oainf_comment` | 信息评论 | `oa.oainf.info.InfoCommentVO` |
| `oainf_image` | 信息图片 | `oa.oainf.info.InfoImageVO` |
| `oainf_info` | 信息 | `oa.oainf.info.InfoVO` |
| `oainf_itmplt` | 信息模板 | `oa.oainf.tmplt.InfotemplateVO` |
| `oainf_pvcount` | 信息浏览次数 | `oainf.oainfpvcount.OAInfoPVCountVO` |

### oakm 文档管理（10 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `oa_defdoc` | 档案分类 | `bd.defdoc.DefdocVO` |
| `oakm_LimitScope` | 范围权限 | `nc.bs.oa.oakm.limitscope.LimitScopeVO` |
| `oakm_archivefile` | 归档文件 | `oakm.archivefilemanagement.ArchiveFile` |
| `oakm_archivefileCat` | 归档文件分类 | `oakm.archivefilemanagement.ArchiveFileCat` |
| `oakm_archivefileborrowapply` | 归档文件借阅信息 | `oakm.archivefilemanagement.ArchiveFileBorrowApply` |
| `oakm_archivefileinfo` | 归档标签 | `oakm.archivefilemanagement.ArchiveFileInfo` |
| `oakm_archivefilenode` | 归档文档节点 | `oakm.archivefilemanagement.ArchiveFileNode` |
| `oakm_archivetargetmap` | 归档配置 | `oakm.archivefilemanagement.ArchiveTargetMap` |
| `oakm_filenode` | 文档节点 | `oa.oakm.FileNodeVO` |
| `oakm_psndiskset` | 个人网盘容量设置 | `oa.oakm.PersonalDiskSizeSetVO` |

### oamc 电子邮件（10 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `oamail_account` | 邮箱帐号 | `oamail.account.AccountVO` |
| `oamail_accountmail` | 账户邮件关联 | `oamail.accountmail.AccountMailVO` |
| `oamail_folder` | 文件夹 | `oamail.folder.FolderVO` |
| `oamail_mail` | 邮件 | `oamail.mail.MailVO` |
| `oamail_mail_content` | 邮件正文 | `oamail.mail.MailContentVO` |
| `oamail_mail_file` | 邮件附件 | `oamail.mail.MailFileVO` |
| `oamail_mail_user` | 邮件收件人 | `oamail.mail.MailUserVO` |
| `oamail_user` | 通讯录 | `oamail.user.UserVO` |
| `oamail_userandgroup` | 通讯录分组关系 | `oamail.userandgroup.UserandGroupVO` |
| `oamail_usergroup` | 通讯录分组 | `oamail.usergroup.UserGroupVO` |

### oamt 会议管理（14 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `oa_defdoc` | 会议类别NEW (自定义档案) | `bd.defdoc.DefdocVO` |
| `oa_defdoc` | 会议级别NEW (自定义档案) | `bd.defdoc.DefdocVO` |
| `oa_defdoc` | 会议室分类 (自定义档案) | `bd.defdoc.DefdocVO` |
| `oamt_GuestDoc` | 参会人 | `oa.oamt.mtapp.GuestDocVO` |
| `oamt_MeetingTopicDoc` | 会议的议题 | `oa.oamt.mtapp.MeetingTopicDocVO` |
| `oamt_MeetingTopics` | 会议的议题 | `oa.oamt.mtapp.MeetingTopicsVO` |
| `oamt_guests` | 参会人 | `oa.oamt.mtapp.GuestsVO` |
| `oamt_mnt` | 会议通知模板 | `oa.oamt.mtapp.MeetingNoticeTemplateVO` |
| `oamt_mtapp` | 会议申请 | `oa.oamt.mtapp.MeetingApplyVO` |
| `oamt_mtappdoc` | 会议申请单 | `oa.oamt.mtapp.MeetingApplyDocVo` |
| `oamt_mtr` | 会议室 | `oa.oamt.meetingroom.MeetingRoomVO` |
| `oamt_mtrparaset` | 会议室参数设置 | `oa.oamt.meetingroom.MtrParaSetVO` |
| `oamt_mtsummary` | 会议纪要 | `oa.oamt.mtsummary.MeetingSummaryVO` |
| `oamt_topic` | 会议议题 | `oa.oamt.meetingtopic.MeetingTopicVO` |

### oaod 公文管理（25 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `oa_defdoc` | 保密期限 (自定义档案) | `bd.defdoc.DefdocVO` |
| `oa_defdoc` | 紧急程度 (自定义档案) | `bd.defdoc.DefdocVO` |
| `oa_defdoc` | 密级 (自定义档案) | `bd.defdoc.DefdocVO` |
| `oa_defdoc` | 文件分类 (自定义档案) | `bd.defdoc.DefdocVO` |
| `oa_defdoc` | 行文方向 (自定义档案) | `bd.defdoc.DefdocVO` |
| `oaod_SwapReceiptDoc` | 公文交换签收单 | `oa.oaod.swapmanage.SwapReceiptDocVO` |
| `oaod_amanu` | 文书设置 | `oa.oaod.amanu.AmanuVO` |
| `oaod_dispatchunit` | 外部单位 | `oa.oaod.dispatchunit.DispatchUnitVO` |
| `oaod_doctemplate` | 公文模板 | `oa.oaod.doctemplate.DocTemplateVO` |
| `oaod_odorgrelation` | 公文组织管理关系 | `oa.oaod.odorgrelation.ODOrgRelationVO` |
| `oaod_officialdoctype` | 公文类型 | `oa.oaod.officialdoctype.OfficialDocTypeVO` |
| `oaod_organization` | 机构 | `oa.oaod.orggroup.OrganizationVO` |
| `oaod_orggroup` | 机构组 | `oa.oaod.orggroup.OrgGroupVO` |
| `oaod_receiptdealbusiauth` | 收文处理单业务权限 | `oa.oaod.receiptdealdocbusiauth.ReceiptDealBusiAuthVO` |
| `oaod_receiptdealdoc` | 收文处理单 | `oa.oaod.receiptdealdoc.ReceiptDealDocVO` |
| `oaod_receiptdealdocdetails` | 收文办理明细 | `oa.oaod.receiptdealdoc.ReceiptDealDocDetailsVO` |
| `oaod_receiptregdoc` | 收文登记单 | `oa.oaod.receiptregdoc.ReceiptRegDocVO` |
| `oaod_receiptregdocbusiauth` | 公文登记单业务授权 | `oa.oaod.receiptregdocbusiauth.ReceiptRegDocBusiAuthVO` |
| `oaod_sdbusinessauth` | 发文单业务操作授权 | `oa.oaod.senddoc.SDBusinessAuthVO` |
| `oaod_sddispense` | 分发单 | `oa.oaod.senddoc.SDDispenseVO` |
| `oaod_sdserial` | 发文文号流水号 | `oa.oaod.sdw.SDSerialVO` |
| `oaod_sdword` | 发文文号 | `oa.oaod.sdw.SDWordVO` |
| `oaod_senddoc` | 发文单 | `oa.oaod.senddoc.SendDocVO` |
| `oaod_swapdoc` | 公文交换发送单 | `oa.oaod.swapmanage.SwapDocVO` |
| `oaod_swapdocdetail` | 公文交换明细 | `oa.oaod.swapmanage.SwapDocDetailVO` |

### oaos 办公用品管理（10 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `oa_defdoc` | 办公用品 (自定义档案) | `bd.defdoc.DefdocVO` |
| `oaos_apply` | 用品申请单 | `oa.oaos.officesupplies.ApplyVO` |
| `oaos_applydet` | 用品申请明细 | `oa.oaos.officesupplies.ApplyDetVO` |
| `oaos_box` | 暂存箱 | `oa.oaos.officesupplies.BoxVO` |
| `oaos_grant` | 办公用品发放单 | `oa.oaos.officesupplies.GrantVO` |
| `oaos_grantdet` | 办公用品发放明细 | `oa.oaos.officesupplies.GrantDetVO` |
| `oaos_inventory` | 用品库存变更 | `oa.oaos.officesupplies.InventoryVO` |
| `oaos_osimg` | 办公用品图片 | `oa.oaos.officesupplies.OSImageVO` |
| `oaos_set` | 用品设置 | `oa.oaos.officesupplies.SetVO` |
| `oaos_supplies` | 办公用品信息 | `oa.oaos.officesupplies.SuppliesVO` |

### oapo 个人办公（9 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `oapo_alertconfig` | 任务提醒设置 | `oa.oapo.task.AlertConfigVO` |
| `oapo_cowarers` | 协办 | `oa.oapo.task.Cowarers` |
| `oapo_reportline` | 汇报线 | `oa.oapo.oaworkdiary.ReportLineVO` |
| `oapo_reportrecord` | 汇报记录 | `oa.oapo.task.ReportRecordVO` |
| `oapo_takurgeinfo` | 催办信息 | `oa.oapo.task.TaskUrgeInfoVO` |
| `oapo_task` | 协作任务 | `oa.oapo.task.TaskVO` |
| `oapo_taskreport` | 任务汇报 | `oa.oapo.task.TaskReportVO` |
| `oapo_viewer` | 查看 | `oa.oapo.task.Viewer` |
| `oapo_workreport` | 工作汇报 | `oa.oapo.oaworkdiary.WorkReportVO` |

### oapp 协同工作（5 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `oapp_flownode` | 流程节点 | `oa.oapp.ppfreeflow.FlowNodeVO` |
| `oapp_flownodeuser` | 流程节点用户 | `oa.oapp.ppfreeflow.FlowNodeUserVO` |
| `oapp_freeflowdoc` | 协同工作文单 | `oa.oapp.ppfreeflow.FreeFlowDocVO` |
| `oapp_freeflowtemplate` | 协同工作模板 | `oa.oapp.ppfreeflow.FreeFlowTemplateVO` |
| `oapp_set` | 发送范围设置 | `oa.oapp.ppfreeflow.SetVO` |

### oapub 协同基础设置（7 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `oa_defdoc` | 主题词 (自定义档案) | `bd.defdoc.DefdocVO` |
| `oapub_archivebstype` | 归档业务类型 | `oapub.ArchiveBusinessTypeVO` |
| `oapub_docauth` | 单据权限 | `oa.oapub.docauth.DocAuthVO` |
| `oapub_docauthdefine` | 单据权限定义 | `oa.oapub.docauthdefine.DocAuthDefineVO` |
| `oapub_docauthdefineproperty` | 单据权限属性定义 | `oa.oapub.docauthdefine.DocAuthDefinePropertyVO` |
| `oapub_notification` | 通知 | `oa.oapub.notification.NotificationVO` |
| `oapub_oainfoexter` | 信息对外实体 | `oa.oapub.OAINFExterVO` |

### oavsm 车辆管理（6 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `oa_defdoc` | 车辆类型 (自定义档案) | `bd.defdoc.DefdocVO` |
| `oavsm_apply` | 车辆申请 | `oa.oavsm.vehicle.ApplyVO` |
| `oavsm_category` | 车辆分类 | `oa.oavsm.vehicle.CategoryVO` |
| `oavsm_driver` | 驾驶员 | `oa.oavsm.vehicle.DriverVO` |
| `oavsm_set` | 设置 | `oa.oavsm.vehicle.SetVO` |
| `oavsm_vehicle` | 车辆信息 | `oa.oavsm.vehicle.VehicleVO` |

## 外贸管理（8 模块，116 表）

### ent 转口管理（19 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `ent_contract` | 转口合同主实体 | `ent.m6020.entity.ContractHVO` |
| `ent_contract_b` | 转口合同子实体 | `ent.m6020.entity.ContractBVO` |
| `ent_contract_cmsn` | 佣金协议 | `ent.m6020.entity.ContractCMSNVO` |
| `ent_contract_doc` | 单证信息 | `ent.m6020.entity.ContractDOCVO` |
| `ent_contract_fee` | 代垫费用 | `ent.m6020.entity.ContractFEEVO` |
| `ent_contract_lc` | 信用证 | `ent.m6020.entity.ContractLCVO` |
| `ent_contract_recplan` | 收款计划 | `ent.m6020.entity.ContractRecPlanVO` |
| `ent_detail` | 转口明细单主实体 | `ent.m6030.entity.DetailHVO` |
| `ent_detail_b` | 转口明细子实体 | `ent.m6030.entity.DetailBVO` |
| `ent_detail_cl` | 装箱单 | `ent.m6030.entity.DetailCLVO` |
| `ent_detail_cmsn` | 暗佣信息 | `ent.m6030.entity.DetailCMSNVO` |
| `ent_detail_doc` | 单证清单 | `ent.m6030.entity.DetailDOCVO` |
| `ent_detail_fee` | 代垫费用 | `ent.m6030.entity.DetailFEEVO` |
| `ent_detail_match` | 库存拣配明细 | `ent.m6030.entity.DetailMatchVO` |
| `ent_invoice` | 转口发票主实体 | `ent.m6090.entity.ENTInvoiceHVO` |
| `ent_invoice_b` | 转口发票子实体 | `ent.m6090.entity.ENTInvoiceBVO` |
| `ent_invoice_fee` | 代垫费用 | `ent.m6090.entity.ENTInvoiceFeeVO` |
| `ent_invoice_set` | 结算信息 | `ent.m6090.entity.ENTInvoiceSTVO` |
| `ent_m6020trantype` | 转口合同交易类型 | `ent.m6020trantype.entity.M6020TranTypeVO` |

### et 自营出口（47 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `et_Entity` | 佣金协议交易类型 | `nc.voet.m5710trantype.Entity` |
| `et_adjinvoice` | 调整发票主实体 | `et.m5760.entity.AdjInvoiceHVO` |
| `et_adjinvoice_b` | 调整发票子实体 | `et.m5760.entity.AdjInvoiceBVO` |
| `et_cmsndetail` | 暗佣明细 | `nc.voet.et_commissiondetail.et_cmsndetail` |
| `et_commsion` | 佣金协议主实体 | `et.m5710.entry.ComsionHVO` |
| `et_comsion_cust` | 客户范围 | `et.m5710.entry.ComsionCustVO` |
| `et_comsion_mar` | 计佣物料 | `et.m5710.entry.ComsionMarVO` |
| `et_contract` | 出口合同主实体 | `et.m5720.entity.ContractHVO` |
| `et_contract_b` | 出口合同子实体 | `et.m5720.entity.ContractBVO` |
| `et_contract_cmsn` | 佣金协议 | `et.m5720.entity.ContractCMSNVO` |
| `et_contract_doc` | 单证清单 | `et.m5720.entity.ContractDOCVO` |
| `et_contract_fee` | 代垫费用 | `et.m5720.entity.ContractFEEVO` |
| `et_contract_lc` | 信用证 | `et.m5720.entity.ContractLCVO` |
| `et_contract_recplan` | 收款计划 | `et.m5720.entity.ContractRecPlanVO` |
| `et_customedoc` | 报关单证主实体 | `et.m5740.entity.CustomeDocHVO` |
| `et_customedoc_b` | 报关单证子实体 | `et.m5740.entity.CustomeDocBVO` |
| `et_customedoc_cl` | 装船明细子实体 | `et.m5740.entity.CustomeDocCLVO` |
| `et_customedoc_pt` | 许可证 | `et.m5740.entity.CustomeDocPTVO` |
| `et_detail` | 出口明细主实体 | `et.m5730.entity.DetailHVO` |
| `et_detail_b` | 出口明细子实体 | `et.m5730.entity.DetailBVO` |
| `et_detail_cl` | 装箱单 | `et.m5730.entity.DetailCLVO` |
| `et_detail_cmsn` | 暗佣信息 | `et.m5730.entity.DetailCMSNVO` |
| `et_detail_doc` | 单证清单 | `et.m5730.entity.DetailDOCVO` |
| `et_detail_fee` | 代垫费用 | `et.m5730.entity.DetailFEEVO` |
| `et_detail_info` | 供应商发货通知 | `et.m5730.entity.DetailInfoVO` |
| `et_detail_match` | 库存拣配明细 | `et.m5730.entity.DetailMatchVO` |
| `et_detail_pt` | 许可证 | `et.m5730.entity.DetailPTVO` |
| `et_inbound` | 出口拣配入库单 | `et.m5730.entity.InBoundVO` |
| `et_invoice` | 出口发票主实体 | `et.m5790.entity.ETInvoiceHVO` |
| `et_invoice_b` | 出口发票子实体 | `et.m5790.entity.ETInvoiceBVO` |
| `et_invoice_fee` | 代垫费用 | `et.m5790.entity.ETInvoiceFeeVO` |
| `et_invoice_set` | 结算信息 | `et.m5790.entity.ETInvoiceSTVO` |
| `et_longpro` | 长期协议维护主实体 | `et.m5715.entity.LongProHVO` |
| `et_longpro_b` | 长期协议维护子实体 | `et.m5715.entity.LongProBVO` |
| `et_longpro_set` | 收款计划 | `et.m5715.entity.LongProSetVO` |
| `et_m5715trantype` | 长期协议交易类型 | `et.m5715trantype.entity.M5715TranTypeVO` |
| `et_m5720trantype` | 出口合同交易类型 | `et.m5720trantype.entity.M5720TranTypeVO` |
| `et_payplan` | 代理出口合同付款计划 | `et.payplan.entity.PayPlanVO` |
| `et_receipt` | 收汇水单主实体 | `et.m5795.entity.ReceiptHVO` |
| `et_receipt_b` | 收汇水单子实体 | `et.m5795.entity.ReceiptBVO` |
| `et_recplan` | 出口合同收款计划 | `et.recplan.entity.RecPlanVO` |
| `et_settledoc` | 结汇单证主实体 | `et.m5750.entity.SettleDocHVO` |
| `et_settledoc_b` | 结汇单证子实体 | `et.m5750.entity.SettleDocBVO` |
| `et_settledoc_cl` | 装箱明细 | `et.m5750.entity.SettleDocCLVO` |
| `et_settledoc_doc` | 单证清单 | `et.m5750.entity.SettleDocDOCVO` |
| `et_settledoc_fee` | 代垫费用 | `et.m5750.entity.SettleDocFEEVO` |
| `et_settledoc_pnt` | 交单信息 | `et.m5750.entity.SettleDocPntVO` |

### etp 代理出口（4 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `etp_agentinv` | 代理发票主实体 | `etp.m5791.entity.AgentInvHVO` |
| `etp_agentinv_b` | 代理发票费用信息 | `etp.m5791.entity.AgentInvBVO` |
| `etp_agentrty` | 出口代理协议主实体 | `etp.m5701.entity.AgentrtyHVO` |
| `etp_agentrty_b` | 出口代理协议子实体 | `etp.m5701.entity.AgentrtyBVO` |

### imag 影像管理（5 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `bd_ImageScanSetup` | 扫描方式主实体 | `imag.ImageScanSetupVO` |
| `bd_ImageScanType` | 扫描方式主实体类型 | `imag.ImageScanTypeVO` |
| `bd_scanconvertor` | 影像扫描字段映射 | `imag.ScanConvertorVO` |
| `imag_imageparam` | ImageParam | `imag.ImageParamVO` |
| `imag_imageplugin` | ImagePlugin | `imag.ImagePluginVO` |

### it 自营进口（23 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `it_contract` | 进口合同主实体 | `it.m5801.entity.ContractHVO` |
| `it_contract_b` | 进口合同子实体 | `it.m5801.entity.ContractBVO` |
| `it_contract_doc` | 随附单证 | `it.m5801.entity.ContractDOCVO` |
| `it_contract_lc` | 信用证 | `it.m5801.entity.ContractLCVO` |
| `it_contract_set` | 付款计划实体 | `it.m5801.entity.ContractSETVO` |
| `it_customs` | 报关情况 | `it.m5804.entity.CustomsVO` |
| `it_detail` | 进口明细主实体 | `it.m5805.entity.DetailHVO` |
| `it_detail_b` | 进口明细子实体 | `it.m5805.entity.DetailBVO` |
| `it_detail_doc` | 单证清单 | `it.m5805.entity.DetailDOCVO` |
| `it_detail_insp` | 审单明细信息 | `it.m5805.entity.DetailInspectVO` |
| `it_detail_pt` | 许可证 | `it.m5805.entity.DetailPTVO` |
| `it_feeinfo` | 费用信息 | `it.feeinfo.entity.FeeInfoVO` |
| `it_goodsflows` | 流向单主实体 | `it.m5810.entity.GoodsFlowsHVO` |
| `it_goodsflows_b` | 流向单子实体 | `it.m5810.entity.GoodsFlowsBVO` |
| `it_goodsflows_qc` | 流向单质检明细 | `it.m5810.entity.GoodsFlowsBBVO` |
| `it_longprotocol` | 长期协议主实体 | `it.m5803.entity.LongProtocolHVO` |
| `it_longprotocol_b` | 长期协议子实体 | `it.m5803.entity.LongProtocolBVO` |
| `it_longprotocol_set` | 付款计划 | `it.m5803.entity.LongProtocolSetVO` |
| `it_m5801trantype` | 进口合同交易类型 | `it.m5801trantype.M5801TranTypeVO` |
| `it_m5803trantype` | 长期协议交易类型主实体 | `it.m5803trantype.entity.M5803TranTypeVO` |
| `it_payinfo` | 进口合同付款信息 | `it.payinfo.entity.PayInfoVO` |
| `it_payplan` | 进口合同付款计划 | `it.payplan.entity.PayPlanVO` |
| `it_recinfo` | 进口合同收款信息 | `it.recinfo.entity.RecInfoVO` |

### itp 代理进口（5 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `itp_agrmnt` | 代理协议主实体 | `itp.m5811.entity.AgenciAgrmntHVO` |
| `itp_agrmnt_b` | 代理协议子实体 | `itp.m5811.entity.AgenciAgrmntBVO` |
| `itp_invoice` | 代理发票主实体 | `itp.m5818.entity.AgncInvoiceHVO` |
| `itp_invoice_fee` | 费用信息 | `itp.m5818.entity.AgeninvoFeeVO` |
| `itp_m5811trantype` | 代理协议交易类型 | `itp.m5811trantype.entity.M5811TranTypeVO` |

### tf 贸易费用（7 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `tf_apfeeinvoice` | 应付费用发票主实体 | `tf.m5910.entity.ApFeeInvoiceHVO` |
| `tf_apfeeinvoice_b` | 应付费用发票子实体 | `tf.m5910.entity.ApFeeInvoiceBVO` |
| `tf_feebill` | 费用单主实体 | `tf.m5920.entity.FeeBillHVO` |
| `tf_feebill_b` | 费用单子实体 | `tf.m5920.entity.FeeBillBVO` |
| `tf_feecheckbill` | 费用对账单主实体 | `tf.m5930.entity.FeeCheckBillHVO` |
| `tf_feecheckbill_b` | 费用对账单子实体 | `tf.m5930.entity.FeeCheckBillBVO` |
| `tf_m5910trantype` | 应付费用发票交易类型 | `tf.m5910trantype.entity.M5910TranTypeVO` |

### yer 网上报账（6 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `SM_PUB_FILESYSTEM` | 文档节点 | `er.filenode.FileNodeVO` |
| `er_expcenter` | 报销中心 | `er.expcenter.model.QuickDeskVO` |
| `pub_workflownote` | 网报流程历史 | `pub.workflownote.WorkflownoteVO` |
| `yer_task` | 网上报销代办任务 | `er.task.YerTaskVO` |
| `yer_yerexpbill` | 报销单据 | `er.yerbill.YerExpBillVo` |
| `yer_yerportalbillclass` | 网报门户注册类 | `er.expportal.YerPortalBillClassVO` |

## 共享服务（3 模块，44 表）

### sscbd 共享服务基础设置（32 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `org_sscbusinessunittype` | 业务分类 | `ssc.task.businessunittype.BusinessUnitTypeVO` |
| `org_sscbusiunitclientage` | 业务分类_单据类型_关系 | `ssc.task.businessunittype.BusiUnitClientageVO` |
| `org_ssclientage` | 共享服务委托关系 | `ssc.task.ssclientage.SSClientageVO` |
| `org_sscorg` | 组织_业务单元_共享服务中心 | `org.ssc.SSCOrgVO` |
| `org_sscorg_v` | 组织_业务单元_共享服务中心版本信息 | `vorg.ssc.SSCOrgVersionVO` |
| `org_ssctype` | 共享服务分类 | `org.ssc.ssclientage.SSCTypeVO` |
| `ssc_BillLandMarkStateVO` | 单据里程碑状态 | `ssc.wf.BillLandMarkStateVO` |
| `ssc_BusiInfo` | 工作流信息组件 | `ssc.wf.BusiInfoVO` |
| `ssc_activetask` | 活动任务池 | `ssc.task.pool.ActiveTaskVO` |
| `ssc_allotrule` | 业务分配规则 | `ssc.task.allotrule.SSCAllotRuleVO` |
| `ssc_allotrule_b` | 任务分配规则明细 | `ssc.task.allotrule.SSCAllotRuleBodyVO` |
| `ssc_billapprovestatus` | 单据审批状态 | `ssc.wf.BillApproveStatus` |
| `ssc_billitemmap` | 单据属性映射 | `ssc.task.base.BillItemMapVO` |
| `ssc_billorg` | 单据所属组织 | `ssc.task.allotrule.SSCBillOrgVO` |
| `ssc_busi_act_op` | 关联操作 | `ssc.task.base.SSCBusiActOpVO` |
| `ssc_busiactivity` | 业务活动 | `ssc.task.base.SSCBusiActVO` |
| `ssc_busigroup` | 业务分组 | `ssc.task.allotrule.SSCBusiGroupVO` |
| `ssc_busioperation` | 业务操作 | `ssc.task.base.SSCBusiOpVO` |
| `ssc_dailyreport` | 任务日表 | `ssc.task.report.DailyReportVO` |
| `ssc_exclusion` | 回避人员 | `ssc.task.pool.ExclusionVO` |
| `ssc_jumpconfiguration` | 跳转配置 | `ssc.task.jumpconfiguration.SSCJumpConfigurationVO` |
| `ssc_laderule` | 任务提取规则 | `ssc.task.laderule.SSCLadeRuleVO` |
| `ssc_laderule_b` | 提取规则明细 | `ssc.task.laderule.SSCLadeRuleBodyVO` |
| `ssc_managelevel` | 管理层级 | `ssc.task.laderule.SSCManageLevelVO` |
| `ssc_monthreport` | 任务月表 | `ssc.task.report.MonthReportVO` |
| `ssc_persontask` | 个人池 | `ssc.task.pool.PersonTaskVO` |
| `ssc_posttask` | 岗位池 | `ssc.task.pool.PostTaskVO` |
| `ssc_ssctask` | 任务 | `ssc.task.task.SSCTaskVO` |
| `ssc_ssctasklog` | 任务日志 | `ssc.task.task.SSCTaskLogVO` |
| `ssc_taskstate` | 任务状态 | `ssc.task.base.SSCTaskStateVO` |
| `ssc_wfbusioperator` | SSC流程组件插件 | `ssc.wf.BusiOperator` |
| `ssc_wflandmarkstate` | 工作流状态里程碑 | `ssc.wf.Landmarkstate` |

### sscwb 作业工作台（2 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `ssc_AssginTpt` | ssc模板配置 | `ssc.ssctptassgin.SscAssginTptVO` |
| `ssc_TptBtn` | ssc模板按钮 | `ssc.ssctptassgin.SscTptBtnVO` |

### sscwo 工单（10 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `pub_FBNtbProp` | 自由表单预算控制属性定义 | `freebill.FBNtbPropVO` |
| `pub_fbntbBudgetSet` | 自由表单预算设置 | `freebill.BudgetSetVO` |
| `pub_ncWebPubBsPlugin` | ncwebpubplugin | `ncwebpub.WebPubBsPluginVO` |
| `pub_riafbAction` | RiaFbAction | `freebill.RiaFbAction` |
| `pub_riatxgb` | 生单 | `freebill.RiatxGBVO` |
| `pub_riawftxsetup` | 特性拓展 | `freebill.RiaWFTxSetupVO` |
| `ssc_fbannexpermissions` | 附件配置 | `ssc.annexconfigure.AnnexPerConfigVO` |
| `ssc_fbbusiaction` | fbbusiaction | `freebill.Fbbusiaction` |
| `ssc_fbtransconfig` | 工单转换配置 | `freebill.transformation.FBTransConfigVO` |
| `ssc_fbtranslog` | 工单转换日志 | `freebill.transformation.FBTransLogVO` |

## 渠道管理（2 模块，26 表）

### cmbd 渠道基础设置（11 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `dcm_chnlmngtype` | 渠道管理分类 | `scmf.dcm.chnlmngtype.entity.ChnlMngTypeVO` |
| `dcm_chnlnode` | 分销渠道节点主实体 | `scmf.dcm.chnlnode.entity.ChnlNodeHVO` |
| `dcm_chnlnodeaddr` | 分销渠道节点子实体 | `scmf.dcm.chnlnode.entity.ChnlNodeAddrBVO` |
| `dcm_chnlprdctlnbrd` | 渠道补货结构分配的产品线及品牌 | `dcm.chnlrplstrct.entity.ChnlPrdctLnBrndVO` |
| `dcm_chnlreqbill` | 渠道申请单 | `scmf.dcm.chnlreqbill.entity.ChannelRequestBillHVO` |
| `dcm_chnlreqbill_b` | 渠道申请单子实体 | `scmf.dcm.chnlreqbill.entity.ChannelRequestBillBVO` |
| `dcm_chnlrplstrct` | 渠道补货结构 | `dcm.chnlrplstrct.entity.ChnlRplStrctVO` |
| `dcm_chnlsellerrel` | 渠道节点与助销员关系定义 | `scmf.dcm.chnlsellerrel.entity.ChnlSellerRelVO` |
| `dcm_chrplstrctmbr` | 渠道补货成员 | `dcm.chnlrplstrct.entity.ChnlRplStrctMbrVO` |
| `dcm_helpsellclass` | 助销员分类 | `scmf.dcm.helpsellclass.entity.HelpSellClassVO` |
| `dcm_helpseller` | 助销员 | `scmf.dcm.helpseller.entity.HelpSellerVO` |

### cmdg 渠道数据采集（15 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `dcm_beginbill` | 渠道期初报送表 | `dcm.chnlbeginsendbill.entity.ChnlBeginBillHVO` |
| `dcm_beginbill_b` | 渠道期初报送表子实体 | `dcm.chnlbeginsendbill.entity.ChnlBeginBillBVO` |
| `dcm_beginsum` | 期初结存 | `dcm.chnlbeginsendbill.entity.ChnlBeginSumVO` |
| `dcm_chnlalartlog` | 渠道报送表预警日志 | `dcm.channelsendbill.entity.ChnlAlartLogVO` |
| `dcm_chnlgatherset` | 渠道采集设置实体 | `dcm.chnlgatherset.entity.ChnlGatherSetVO` |
| `dcm_chnlmarset` | 渠道物料设置 | `dcm.chnlmarset.entity.ChnlMarSetVO` |
| `dcm_chnlsendbill` | 渠道报送表 | `dcm.channelsendbill.entity.ChannelSendBillHVO` |
| `dcm_chnlsendbill_b` | 渠道报送表子实体 | `dcm.channelsendbill.entity.ChannelSendBillBVO` |
| `dcm_chnlsfinvntry` | 渠道物料库存设置 | `dcm.chnlsfinvntry.entity.ChnlsfInvntryVO` |
| `dcm_chnlsumbill` | 渠道报送结存结果表 | `dcm.channelsendbill.entity.ChannelSendBillSumVO` |
| `dcm_chsendtrantype` | 渠道报送表交易类型 | `dcm.channelsendbill.trantype.entity.M4612TranTypeVO` |
| `dcm_csendtypeset` | 渠道采集报送表类型设置 | `dcm.chnlgatherset.entity.ChnlSendTypeSetVO` |
| `dcm_exportset` | 渠道报送表导出设置实体 | `dcm.exportset.entity.ExportSetVO` |
| `dcm_importlinelog` | 导入行错误信息 | `dcm.chnlimportlog.entity.ChnlImportLineLog` |
| `dcm_importlog` | 报送表导入日志 | `dcm.chnlimportlog.entity.ChnlImportLog` |

## 数据分析（9 模块，42 表）

### aeam 分析建模（2 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `bi_cube_def` | 分析主题定义 | `bi.cube.CubeDefVO` |
| `bi_cube_dir` | 分析主题分类 | `bi.cube.CubeDirVO` |

### aedsm aedsm（5 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `bi_link_def` | 语义关联模型定义 | `bi.metalink.MetaLinkDefVO` |
| `bi_link_dir` | 语义关联模型目录 | `bi.metalink.MetaLinkDirVO` |
| `bi_md_column` | 数据仓库元数据列 | `bi.meta.MetaColumn` |
| `bi_md_dir` | 数据仓库元数据分类 | `bi.meta.MetaDir` |
| `bi_md_table` | 数据仓库元数据表 | `bi.meta.MetaTable` |

### aert 数据处理平台运行时（2 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `bi_smart_def` | 语义模型定义 | `smart.SmartDefVO` |
| `bi_smart_dir` | 语义模型分类 | `smart.SmartDirVO` |

### bqrt BQ运行框架（2 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `bi_openbq_serverinfo` | OpenBQ服务器信息 | `uap.bq.openbq.vo.OpenBQServerInfoVO` |
| `bq_permission` | 权限规则 | `uap.vo.bq.pub.security.dataperm.Permission` |

### bqrtdbd bqrtdbd（2 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `bi_dashboard_def` | 仪表板信息 | `uap.vo.bq.dashboard.DashboardInfoVO` |
| `bi_dashboard_dir` | 仪表板分类 | `uap.vo.bq.dashboard.DashboardDirVO` |

### bqrtofr bqrtofr（6 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `bi_anarep_def` | 分析报告定义 | `bap.oba.anarep.AnaRepDefVO` |
| `bi_anarep_dir` | 分析报告分类 | `bap.oba.anarep.AnaRepDirVO` |
| `bi_oba_def` | 数据采集定义 | `bap.oba.ObaDefVO` |
| `bi_oba_dir` | 数据采集分类 | `bap.oba.ObaDirVO` |
| `bi_subscribe_rep_def` | 订阅报告管理定义 | `bap.subscribe.SubscribeRepDefVO` |
| `bi_subscribe_rep_dir` | 订阅报告管理分类 | `bap.subscribe.SubscribeRepDirVO` |

### bqrtpvt bqrtpvt（6 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `bi_calc_def` | 计算规则定义 | `bi.calc.CalcRuleDefVO` |
| `bi_calc_dir` | 计算规则分类 | `bi.calc.CalcRuleDirVO` |
| `bi_pivot_def` | 透视表定义 | `pivot.PivotReportDefVO` |
| `bi_pivot_dir` | 透视表目录 | `pivot.PivotReportDirVO` |
| `bi_subscribe_def` | 订阅中心管理定义 | `bap.subscribe.SubscribeDefVO` |
| `bi_subscribe_dir` | 订阅中心管理分类 | `bap.subscribe.SubscribeDirVO` |

### bqrtufr bqrtufr（16 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `bi_smart_def` | 语义模型-节点 | `smart.SmartDefVO` |
| `iufo_freerep_dir` | 自由报表分类 | `iufo.freereport.FreeReportDirVO` |
| `iufo_freereport` | 自由报表 | `iufo.freereport.FreeReportVO` |
| `iufo_freereport` | 自由报表-节点 | `iufo.freereport.FreeReportVO` |
| `iufo_my_report` | 我的报表关联表 | `report.subscibe.MyReportVo` |
| `iufo_pubcasedefine` | 自由报表方案发布 | `iufo.freereport.PubCaseDefine` |
| `iufo_querycasedefine` | 自由报表查询方案 | `iufo.freereport.QueryCaseDefineVO` |
| `iufo_replib_detail` | 我的报表库采集数据 | `iufo.portal.RepLibraryDetailVO` |
| `iufo_replib_list` | 我的报表库列表数据 | `iufo.portal.RepLibraryListVO` |
| `iufo_replib_sort` | 我的报表库分类 | `iufo.portal.RepLibrarySortVO` |
| `iufo_subscibe_embracer` | 报表订阅任务接受人信息表 | `report.subscibe.SubscibeEmbracerVo` |
| `iufo_subscibe_task` | 订阅任务信息表 | `report.subscibe.SubscibeTaskVo` |
| `iufo_subscibe_task_data` | 任务实例关系表 | `report.subscibe.TaskDataVo` |
| `iufo_task_data_instance` | 任务数据实例表 | `report.subscibe.TaskDataInstanceVo` |
| `iufo_tracedatadispatch` | 业务联查分配 | `nc.pub.smart.tracedata.TraceDataDispatchVO` |
| `iufo_tracedataregister` | 业务联查注册 | `nc.pub.smart.tracedata.TraceDataRegisterVO` |

### bqwebrtpub bqwebrtpub（1 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `bi_openbq_serverinfo` | OpenBQ服务器信息 | `uap.bq.openbq.vo.OpenBQServerInfoVO` |

## 其他（2 模块，61 表）

### eom 运行管理（10 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `eom_failure` | 故障记录 | `eom.failure.FailureHeadVO` |
| `eom_failure_b` | 故障记录子表 | `eom.failure.FailureBodyVO` |
| `eom_halt_reason` | 非计划停机原因 | `eom.haltreason.HaltReasonVO` |
| `eom_intactrpt` | 设备完好上报 | `eom.intactrpt.IntactrptHeadVO` |
| `eom_intactrpt_b` | 设备完好上报明细 | `eom.intactrpt.IntactrptBodyVO` |
| `eom_measure_doc` | 测量记录 | `eom.measuredoc.MeasuredocHeadVO` |
| `eom_measure_doc_b` | 测量记录明细 | `eom.measuredoc.MeasuredocBodyVO` |
| `eom_operation` | 运行记录 | `eom.operation.OperationHeadVO` |
| `eom_operation_b` | 运行记录子表 | `eom.operation.OperationBodyVO` |
| `eom_unintact_equip` | 不完好设备表 | `eom.intactrpt.UnintactEquipVO` |

### qc 质量管理（51 表）

| 表名 | 中文名 | VO 类 |
|------|--------|-------|
| `qc_adjustrule` | 宽严调整规则 | `qc.adjustrule.entity.AdjustRuleHeadVO` |
| `qc_adjustrule_b` | 宽严调整规则明细 | `qc.adjustrule.entity.AdjustRuleItemVO` |
| `qc_apply_info1` | 检验执行明细 | `qc.c001.entity.ApplyChkRunInfoVO` |
| `qc_applybill` | 报检单 | `qc.c001.entity.ApplyHeaderVO` |
| `qc_applybill_b` | 检验项目明细 | `qc.c001.entity.ApplyItemVO` |
| `qc_applybill_s` | 报检点明细 | `qc.c001.entity.ApplySourceItemVO` |
| `qc_applytrans` | 报检单交易类型 | `qc.c001transtype.entity.ApplyTranstypeVO` |
| `qc_certbill` | 质证书 | `qc.c006.entity.CertHeaderVO` |
| `qc_certbill_b` | 质证书明细 | `qc.c006.entity.CertItemVO` |
| `qc_checkbasis` | 检测依据 | `qc.checkbasis.entity.BasisHeaderVO` |
| `qc_checkbasis_b` | 检测依据子表 | `qc.checkbasis.entity.BasisItemVO` |
| `qc_checkbill` | 检验单 | `qc.c002.entity.CheckBillHeaderVO` |
| `qc_checkbill_b` | 检验单明细 | `qc.c002.entity.CheckBillItemVO` |
| `qc_checkitem` | 检验项目 | `qc.checkitem.entity.CheckItemVO` |
| `qc_checkmode` | 取样方式 | `qc.checkmode.entity.CheckModeVO` |
| `qc_checkshape` | 检验品形态 | `qc.checkshape.entity.CheckShapeVO` |
| `qc_checkstandard` | 检验方案 | `qc.checkstandard.entity.CheckStandardHeadVO` |
| `qc_checkstandard_b` | 检验方案表体 | `qc.checkstandard.entity.CheckStandardItemVO` |
| `qc_checkstandard_v` | 检验方案多版本 | `qc.checkstandard_v.entity.ChkStdVerisionHeadVO` |
| `qc_checkstandard_v_b` | 检验方案多版本表体 | `qc.checkstandard_v.entity.ChkStdVerisionItemVO` |
| `qc_checkteam` | 检测室 | `qc.checkteam.entity.CheckTeamHeadVO` |
| `qc_checkteam_b` | 检测室子表 | `qc.checkteam.entity.CheckTeamItemVO` |
| `qc_checkteam_b2` | 检验项目明细 | `qc.checkteam.entity.CheckTeamItem2VO` |
| `qc_checkware` | 检测器具 | `qc.checkware.entity.CheckWareVO` |
| `qc_chkbatch` | 检验批次 | `qc.chkbatch.entity.ChkBatchVO` |
| `qc_chkstdmatch` | 检验方案匹配设置 | `qc.checkstandardmatch.entity.ChkStdMatchVO` |
| `qc_continuebatch` | 质检连续批 | `qc.continuebatch.entity.ContinueBatchHeadVO` |
| `qc_continuebatch_b` | 检验记录 | `qc.continuebatch.entity.ContinueBatchItemVO` |
| `qc_materchktype` | 物料报检类型 | `qc.materchecktype.entity.MaterCheckTypeVO` |
| `qc_passbill` | 紧急放行单 | `qc.c005.entity.PassBillHeaderVO` |
| `qc_passbill_b` | 紧急放行单明细 | `qc.c005.entity.PassBillItemVO` |
| `qc_passbill_sn` | 紧急放行单序列号明细 | `qc.c005.entity.PassBillSnVO` |
| `qc_printscheme` | 打印方案 | `qc.printscheme.entity.PrintSchemeHeadVO` |
| `qc_printscheme_b` | 打印方案明细 | `qc.printscheme.entity.PrintSchemeItemVO` |
| `qc_rejectbill` | 不合格品处理单 | `qc.c004.entity.RejectBillHeadVO` |
| `qc_rejectbill_b` | 不合格品处理单明细 | `qc.c004.entity.RejectBillItemVO` |
| `qc_rejecttype` | 质量不合格类型 | `scmf.qc.rejecttype.entity.RejectTypeVO` |
| `qc_rejecttype_b` | 质量不合格类型关联检验项目明细 | `nc.voqc.qc_rejecttype_b.qc_rejecttype_b` |
| `qc_repairmethod` | 修约方式 | `nc.voqc.qc_repairmethod.qc_repairmethod` |
| `qc_reportbill` | 质检报告 | `qc.c003.entity.ReportHeaderVO` |
| `qc_reportbill_b` | 质检报告明细 | `qc.c003.entity.ReportItemVO` |
| `qc_reporttrans` | 质检报告交易类型 | `qc.transtype.entity.ReportTranstypeVO` |
| `qc_samplebill` | 取样单 | `qc.c007.entity.SamplingHeadVO` |
| `qc_samplebill_b` | 取样单明细 | `qc.c007.entity.SamplingItemVO` |
| `qc_samplebill_bb` | 取样单检验项目表 | `qc.c007.entity.SamplingCheckItemVO` |
| `qc_samplechange` | 取样单vo交换实体 | `qc.c007.entity.SamplingChangeHeadVO` |
| `qc_samplechange_b` | 检验项目明细 | `qc.c007.entity.SamplingChangeItemVO` |
| `qc_sampleplan` | 抽样计划表 | `qc.sampleplan.entity.SamplePlanHeadVO` |
| `qc_sampleplan_b` | 抽样计划表明细 | `qc.sampleplan.entity.SamplePlanItemVO` |
| `qc_schemeassign` | 打印方案分配 | `qc.printscheme.entity.PrintSchemeAssignVO` |
| `qc_standardclass` | 检验方案分类 | `qc.standardclass.entity.StandardClassVO` |

---

## 按表数量排名 Top 20 模块

| 排名 | 模块 | 表数量 |
|------|------|--------|
| 1 | uapbd 基础数据 | 409 |
| 2 | ebpur 电子采购公共 | 183 |
| 3 | gl 总账 | 170 |
| 4 | baseapp baseapp | 168 |
| 5 | ic 库存管理 | 152 |
| 6 | riaorg 组织管理 | 148 |
| 7 | ufoe 企业报表 | 95 |
| 8 | hrhi 人员信息 | 90 |
| 9 | cdm 银行贷款管理 | 86 |
| 10 | cm 成本管理 | 85 |
| 11 | cmp 现金管理 | 78 |
| 12 | resa 利润中心会计 | 77 |
| 13 | ifac 内部存款管理 | 76 |
| 14 | mmpac 生产任务管理公共 | 76 |
| 15 | ufoc 合并报表 | 72 |
| 16 | fa 固定资产 | 71 |
| 17 | hrjf 组织机构管理 | 70 |
| 18 | hrta 时间管理 | 63 |
| 19 | arap 应收应付 | 61 |
| 20 | ewm 维修管理 | 61 |
